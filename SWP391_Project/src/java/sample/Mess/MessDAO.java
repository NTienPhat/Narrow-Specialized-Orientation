/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sample.Mess;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import sample.RegisterAD.RegisterADDTO;
import sample.major.MajorDTO;
import sample.utils.DBUtils;

/**
 *
 * @author Hoang Tam
 */
public class MessDAO {

    private String CreateMess = "Insert into tblMess (messText, messTitle, messDate, replyForST, status) \n"
            + "VALUES(?, ?, ?, ?, 'true')";
    private String CreateSend = "Insert into tblSend(userID, messID, status) \n"
            + "VALUES(?, ?, 'true')";
    private String CreateReceive = "Insert into tblReceive(userID, messID, status) \n"
            + "VALUES(?, ?, 'true')";
    private String GetRandSP = "SELECT TOP 1 S.userID \n"
            + "FROM   tblSupporter S Inner join tblUser U ON S.userID = U.userID\n"
            + "			WHERE  majorID = ? And U.status = 'true'\n"
            + "			ORDER  BY NEWID()";
    private String GetLastMessID = "SELECT TOP 1 messID FROM tblMess ORDER BY messID DESC";
    private String GETMESS = "SELECT R.userID AS SPID, S.userID AS STID, M.messID, M.messTitle, M.messText, M.messDate, M.replyForST FROM tblReceive R INNER JOIN tblMess M ON R.messID = M.messID INNER JOIN tblSend S ON M.messID = S.messID\n"
            + "		 WHERE R.userID = ? AND M.status = 'true'";
    private String updateReply = "UPDATE tblMess SET status = 'replied' "
            + "WHERE messID = ? ";

    private String GETREPLYOFSTUDENT = "SELECT	M2.messTitle, M2.messText AS question,\n"
            + "M2.messDate AS SendDate, M.messText AS reply ,\n"
            + "M.messDate AS ReplyDate, M2.status \n"
            + "FROM tblReceive R INNER JOIN tblMess M ON R.messID = M.messID\n"
            + "INNER JOIN tblMess M2 ON M.replyForST = M2.messID\n"
            + "WHERE R.userID = ? ";
    private String GETREPLYOFSUPPORTER = "SELECT M2.messTitle, M2.messText AS question,\n"
            + "M2.messDate AS SendDate, M.messText AS reply ,\n"
            + "M.messDate AS ReplyDate, M2.status \n"
            + "FROM tblSend S INNER JOIN tblMess M ON S.messID = M.messID\n"
            + "INNER JOIN tblMess M2 ON M.replyForST = M2.messID\n"
            + "WHERE S.userID = ? ";
    private String GETQUESTIONOFSTUDENT = "SELECT M.messTitle, M.messText AS question, \n"
            + "M.messDate AS SendDate, M.status \n"
            + "FROM tblSend S INNER JOIN tblMess M ON S.messID = M.messID\n"
            + "WHERE S.userID = ? AND M.status = 'true' ";

    public boolean updateReply(int messID) throws SQLException {
        boolean check = false;
        Connection conn = null;
        PreparedStatement ptm = null;
        try {
            conn = DBUtils.getConnection();
            if (conn != null) {
                ptm = conn.prepareStatement(updateReply);
                ptm.setInt(1, messID);
                check = ptm.executeUpdate() > 0;
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (ptm != null) {
                ptm.close();
            }
            if (conn != null) {
                conn.close();
            }
        }
        return check;
    }

    public boolean createMess(MessDTO mess) throws SQLException {
        boolean check = false;
        Connection conn = null;
        PreparedStatement ptm = null;
        try {
            conn = DBUtils.getConnection();
            if (conn != null) {
                ptm = conn.prepareStatement(CreateMess);
                ptm.setString(1, mess.getMessText());
                ptm.setString(2, mess.getMessTitle());
                ptm.setTimestamp(3, mess.getMessDate());
                ptm.setInt(4, mess.getReplyForST());
                check = ptm.executeUpdate() > 0;
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (ptm != null) {
                ptm.close();
            }
            if (conn != null) {
                conn.close();
            }
        }
        return check;
    }

    public boolean createSend(String userID, int messID) throws SQLException {
        boolean check = false;
        Connection conn = null;
        PreparedStatement ptm = null;
        try {
            conn = DBUtils.getConnection();
            if (conn != null) {
                ptm = conn.prepareStatement(CreateSend);
                ptm.setString(1, userID);
                ptm.setInt(2, messID);
                check = ptm.executeUpdate() > 0;
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (ptm != null) {
                ptm.close();
            }
            if (conn != null) {
                conn.close();
            }
        }
        return check;
    }

    public boolean createReceive(String userID, int messID) throws SQLException {
        boolean check = false;
        Connection conn = null;
        PreparedStatement ptm = null;
        try {
            conn = DBUtils.getConnection();
            if (conn != null) {
                ptm = conn.prepareStatement(CreateReceive);
                ptm.setString(1, userID);
                ptm.setInt(2, messID);
                check = ptm.executeUpdate() > 0;
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (ptm != null) {
                ptm.close();
            }
            if (conn != null) {
                conn.close();
            }
        }
        return check;
    }

    public int getLastMessID() throws SQLException {
        int messID = 0;
        Connection conn = null;
        PreparedStatement ptm = null;
        ResultSet rs = null;
        try {
            conn = DBUtils.getConnection();
            if (conn != null) {
                ptm = conn.prepareStatement(GetLastMessID);
                rs = ptm.executeQuery();
                if (rs.next()) {
                    messID = rs.getInt("messID");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (rs != null) {
                rs.close();
            }
            if (ptm != null) {
                ptm.close();
            }
            if (conn != null) {
                conn.close();
            }
        }
        return messID;
    }

    public List<MessDTO> getMess(String userID) throws SQLException {
        List<MessDTO> list = new ArrayList();
        Connection conn = null;
        PreparedStatement ptm = null;
        ResultSet rs = null;
        try {
            conn = DBUtils.getConnection();
            if (conn != null) {
                ptm = conn.prepareStatement(GETMESS);
                ptm.setString(1, userID);
                rs = ptm.executeQuery();
                while (rs.next()) {
                    String SPID = rs.getString("SPID");
                    String STID = rs.getString("STID");
                    int messID = rs.getInt("messID");
                    String messTitle = rs.getString("messTitle");
                    String messText = rs.getString("messText");
                    Timestamp messDate = rs.getTimestamp("messDate");
                    int replyForST = rs.getInt("replyForST");
                    list.add(new MessDTO(SPID, STID, messID, messText, messTitle, messDate, replyForST));
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (rs != null) {
                rs.close();
            }
            if (ptm != null) {
                ptm.close();
            }
            if (conn != null) {
                conn.close();
            }
        }
        return list;
    }

    public List<QADTO> GetReplyOfStudenet(String userID) throws SQLException {
        List<QADTO> list = new ArrayList();
        Connection conn = null;
        PreparedStatement ptm = null;
        ResultSet rs = null;
        try {
            conn = DBUtils.getConnection();
            if (conn != null) {
                ptm = conn.prepareStatement(GETREPLYOFSTUDENT);
                ptm.setString(1, userID);
                rs = ptm.executeQuery();
                while (rs.next()) {
                    String messTitle = rs.getString("messTitle");
                    String question = rs.getString("question");
                    Timestamp sendDate = rs.getTimestamp("SendDate");
                    String reply = rs.getString("reply");
                    Timestamp replyDate = rs.getTimestamp("ReplyDate");
                    String status = rs.getString("status");
                    list.add(new QADTO(messTitle, question, sendDate, reply, replyDate, status));
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (rs != null) {
                rs.close();
            }
            if (ptm != null) {
                ptm.close();
            }
            if (conn != null) {
                conn.close();
            }
        }
        return list;
    }
    public List<QADTO> GetReplyOfSupporter(String userID) throws SQLException {
        List<QADTO> list = new ArrayList();
        Connection conn = null;
        PreparedStatement ptm = null;
        ResultSet rs = null;
        try {
            conn = DBUtils.getConnection();
            if (conn != null) {
                ptm = conn.prepareStatement(GETREPLYOFSUPPORTER);
                ptm.setString(1, userID);
                rs = ptm.executeQuery();
                while (rs.next()) {
                    String messTitle = rs.getString("messTitle");
                    String question = rs.getString("question");
                    Timestamp sendDate = rs.getTimestamp("SendDate");
                    String reply = rs.getString("reply");
                    Timestamp replyDate = rs.getTimestamp("ReplyDate");
                    String status = rs.getString("status");
                    list.add(new QADTO(messTitle, question, sendDate, reply, replyDate, status));
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (rs != null) {
                rs.close();
            }
            if (ptm != null) {
                ptm.close();
            }
            if (conn != null) {
                conn.close();
            }
        }
        return list;
    }

    public List<QADTO> GetQuestionOfStudenet(String userID) throws SQLException {
        List<QADTO> list = new ArrayList();
        Connection conn = null;
        PreparedStatement ptm = null;
        ResultSet rs = null;
        try {
            conn = DBUtils.getConnection();
            if (conn != null) {
                ptm = conn.prepareStatement(GETQUESTIONOFSTUDENT);
                ptm.setString(1, userID);
                rs = ptm.executeQuery();
                while (rs.next()) {
                    String messTitle = rs.getString("messTitle");
                    String question = rs.getString("question");
                    Timestamp sendDate = rs.getTimestamp("SendDate");
                    String status = rs.getString("status");
                    list.add(new QADTO(messTitle, question, sendDate, "", null, status));
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (rs != null) {
                rs.close();
            }
            if (ptm != null) {
                ptm.close();
            }
            if (conn != null) {
                conn.close();
            }
        }
        return list;
    }

    public String getSupporterID(String majorID) throws SQLException {
        Connection conn = null;
        PreparedStatement ptm = null;
        ResultSet rs = null;
        String userID = null;
        try {
            conn = DBUtils.getConnection();
            if (conn != null) {
                ptm = conn.prepareStatement(GetRandSP);
                ptm.setString(1, majorID);
                rs = ptm.executeQuery();
                if (rs.next()) {
                    userID = rs.getString("userID");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (rs != null) {
                rs.close();
            }
            if (ptm != null) {
                ptm.close();
            }
            if (conn != null) {
                conn.close();
            }
        }
        return userID;
    }
}
