/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sample.CreatedForm;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import sample.utils.DBUtils;

/**
 *
 * @author Hoang Tam
 */
public class CreatedFormDAO {

    private String GETTOTALSTUDENTOFSEMESTER = "SELECt SM.semesterID, Count(SM.semesterID) AS total "
            + "FROM tblSemester SM Right Join tblStudent ST "
            + "ON SM.semesterID = ST.semesterID "
            + "WHERE SM.semesterID = ? "
            + "GROUP BY SM.semesterID";
    private String GETLISTCREATEDNARROWFORMOFSEMESTER = "SELECT RN.registerID, RN.majorID, RN.narrowID,\n"
            + "RN.importDate, RN.usingDate, COUNT(RND.registerID) AS total\n"
            + "			FROM tblRegisterNarrow RN left JOIN tblRegisterNarrowDetail RND ON RN.registerID = RND.registerID\n"
            + "			WHERE RN.semesterID = ? \n"
            + "			GROUP BY RN.registerID, RN.narrowID, RN.importDate, RN.usingDate, RN.majorID";
    private String UPDATESTATUSVALID = "Update tblRegisterNarrowDetail "
            + "SET status = 'accepted' "
            + "WHERE registerID = ? ";
    private String UPDATESTATUSINVALID = "Update tblRegisterNarrowDetail "
            + "SET status = 'rejected' "
            + "WHERE registerID = ? ";
    private String UPDATENARROWSTUDENTVALID = "Update ST SET ST.narrowID = ? "
            + "FROM tblStudent ST INNER JOIN tblRegisterNarrowDetail RND "
            + "ON ST.userID = RND.userID "
            + "WHERE RND.registerID = ? AND RND.status = 'accepted'";

    public boolean updateValid(int registerID) throws SQLException {
        boolean check = false;
        Connection conn = null;
        PreparedStatement ptm = null;
        try {
            conn = DBUtils.getConnection();
            if (conn != null) {
                ptm = conn.prepareStatement(UPDATESTATUSVALID);
                ptm.setInt(1, registerID);
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

    public boolean updateNarrowStValid(int registerID, String narrowID) throws SQLException {
        boolean check = false;
        Connection conn = null;
        PreparedStatement ptm = null;
        try {
            conn = DBUtils.getConnection();
            if (conn != null) {
                ptm = conn.prepareStatement(UPDATENARROWSTUDENTVALID);
                ptm.setString(1, narrowID);
                ptm.setInt(2, registerID);
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

    public boolean updateInvalid(int registerID) throws SQLException {
        boolean check = false;
        Connection conn = null;
        PreparedStatement ptm = null;
        try {
            conn = DBUtils.getConnection();
            if (conn != null) {
                ptm = conn.prepareStatement(UPDATESTATUSINVALID);
                ptm.setInt(1, registerID);
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

    public List<CreatedFormDTO> getListCreatedNarrowFormBySemester(String semesterID) throws SQLException {
        List<CreatedFormDTO> list = new ArrayList<>();
        Connection conn = null;
        PreparedStatement ptm = null;
        ResultSet rs = null;
        try {
            conn = DBUtils.getConnection();
            if (conn != null) {
                ptm = conn.prepareStatement(GETLISTCREATEDNARROWFORMOFSEMESTER);
                ptm.setString(1, semesterID);
                rs = ptm.executeQuery();
                while (rs.next()) {
                    int registerID = rs.getInt("registerID");
                    String majorID = rs.getString("majorID");
                    String narrowID = rs.getString("narrowID");
                    Timestamp startDate = rs.getTimestamp("importDate");
                    Timestamp usingDate = rs.getTimestamp("usingDate");
                    int totalStudent = rs.getInt("total");
                    list.add(new CreatedFormDTO(registerID, majorID, narrowID, startDate, usingDate, totalStudent));
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

    public int getTotalStudentOfSemester(String semesterID) throws SQLException {
        int totalStudent = 0;
        Connection conn = null;
        PreparedStatement ptm = null;
        ResultSet rs = null;
        try {
            conn = DBUtils.getConnection();
            if (conn != null) {
                ptm = conn.prepareStatement(GETTOTALSTUDENTOFSEMESTER);
                ptm.setString(1, semesterID);
                rs = ptm.executeQuery();
                if (rs.next()) {
                    totalStudent = rs.getInt("total");
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
        return totalStudent;
    }
}
