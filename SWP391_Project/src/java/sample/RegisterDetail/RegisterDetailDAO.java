/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sample.RegisterDetail;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import sample.Mess.MessDTO;
import sample.utils.DBUtils;

/**
 *
 * @author Hoang Tam
 */
public class RegisterDetailDAO {

    private final String REGISTERBYSTUDENT = "Insert into tblRegisterNarrowDetail (importdate, userID, registerID, status) \n"
            + "VALUES(GETDATE(), ?, ?, 'processing')";
    private final String CHECKREGISTED = "SELECT * FROM tblRegisterNarrowDetail \n"
            + "WHERE userID = ? AND (status = 'accepted' \n"
            + "OR status = 'processing')";
    private final String CHECKREGISTEDREJECT = "SELECT * FROM tblRegisterNarrowDetail \n"
            + "WHERE userID = ? AND status = 'rejected'";
    private final String REGISTERSSTATUSOFSTUDENT = "SELECT RN.semesterID, RN.majorID, RN.narrowID, RND.importdate, RND.status "
            + "FROM tblRegisterNarrow RN INNER JOIN tblRegisterNarrowDetail RND "
            + "ON  RN.registerID = RND.registerID "
            + "WHERE RND.userID = ? ";
    private final String UPDATENARROWFORSTREJECT = "Update tblRegisterNarrowDetail "
            + "SET registerID = ?, \n"
            + "status = 'processing' \n"
            + "WHERE userID = ? ";

    public boolean updateNarrowForSTRJ(RegisterDetailDTO registerST) throws SQLException {
        boolean check = false;
        Connection conn = null;
        PreparedStatement ptm = null;
        try {
            conn = DBUtils.getConnection();
            if (conn != null) {
                ptm = conn.prepareStatement(UPDATENARROWFORSTREJECT);
                ptm.setInt(1, registerST.getRegisterID());
                ptm.setString(2, registerST.getUserID());
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

    public RegisterStatusDTO getRegistedStatus(String userID) throws SQLException {
        RegisterStatusDTO registedStatus = new RegisterStatusDTO();
        Connection conn = null;
        PreparedStatement ptm = null;
        ResultSet rs = null;
        try {
            conn = DBUtils.getConnection();
            if (conn != null) {
                ptm = conn.prepareStatement(REGISTERSSTATUSOFSTUDENT);
                ptm.setString(1, userID);
                rs = ptm.executeQuery();
                if (rs.next()) {
                    String semesterID = rs.getString("semesterID");
                    String majorID = rs.getString("majorID");
                    String narrowID = rs.getString("narrowID");
                    Timestamp registedDate = rs.getTimestamp("importdate");
                    String status = rs.getString("status");
                    registedStatus = new RegisterStatusDTO(semesterID, majorID, narrowID, registedDate, status);
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
        return registedStatus;
    }

    public boolean createRegisterByST(RegisterDetailDTO registerST) throws SQLException {
        boolean check = false;
        Connection conn = null;
        PreparedStatement ptm = null;
        try {
            conn = DBUtils.getConnection();
            if (conn != null) {
                ptm = conn.prepareStatement(REGISTERBYSTUDENT);
                ptm.setString(1, registerST.getUserID());
                ptm.setInt(2, registerST.getRegisterID());
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

    public boolean checkRegisted(String userID) throws SQLException {
        boolean check = false;
        Connection conn = null;
        PreparedStatement ptm = null;
        ResultSet rs = null;
        try {
            conn = DBUtils.getConnection();
            if (conn != null) {
                ptm = conn.prepareStatement(CHECKREGISTED);
                ptm.setString(1, userID);
                rs = ptm.executeQuery();
                if (rs.next()) {
                    check = true;
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
        return check;
    }

    public boolean checkRegistedReject(String userID) throws SQLException {
        boolean check = false;
        Connection conn = null;
        PreparedStatement ptm = null;
        ResultSet rs = null;
        try {
            conn = DBUtils.getConnection();
            if (conn != null) {
                ptm = conn.prepareStatement(CHECKREGISTEDREJECT);
                ptm.setString(1, userID);
                rs = ptm.executeQuery();
                if (rs.next()) {
                    check = true;
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
        return check;
    }
}
