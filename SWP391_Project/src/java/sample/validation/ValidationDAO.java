/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sample.validation;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import sample.utils.DBUtils;

/**
 *
 * @author Hoang Tam
 */
public class ValidationDAO {

    String GETSEMESTERID = "SELECT semesterID FROM tblSemester WHERE semesterID = ? ";
    String GETMAJORID = "SELECT majorID FROM tblMajor WHERE majorID = ? ";
    String GETNARROWID = "SELECT narrowID FROM tblNarrow WHERE majorID = ? AND narrowID = ? ";
    String GETUSERID = "SELECT userID FROM tblStudent WHERE userID = ? ";
    String GETUSERIDWITHEMAIL = "SELECT userID FROM tblStudent WHERE email = ? ";

    public boolean checkSemesterID(String semesterID) throws SQLException {
        boolean check = false;
        Connection conn = null;
        PreparedStatement ptm = null;
        ResultSet rs = null;
        try {
            conn = DBUtils.getConnection();
            if (conn != null) {
                ptm = conn.prepareStatement(GETSEMESTERID);
                ptm.setString(1, semesterID);
                rs = ptm.executeQuery();
                check = rs.next();
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

    public boolean checkMajorID(String majorID) throws SQLException {
        boolean check = false;
        Connection conn = null;
        PreparedStatement ptm = null;
        ResultSet rs = null;
        try {
            conn = DBUtils.getConnection();
            if (conn != null) {
                ptm = conn.prepareStatement(GETMAJORID);
                ptm.setString(1, majorID);
                rs = ptm.executeQuery();
                check = rs.next();
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

    public boolean checkDuplicateUserID(String userID) throws SQLException {
        boolean check = false;
        Connection conn = null;
        PreparedStatement ptm = null;
        ResultSet rs = null;
        try {
            conn = DBUtils.getConnection();
            if (conn != null) {
                ptm = conn.prepareStatement(GETUSERID);
                ptm.setString(1, userID);
                rs = ptm.executeQuery();
                check = rs.next();
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
    public boolean checkDuplicateEmail(String email) throws SQLException {
        boolean check = false;
        Connection conn = null;
        PreparedStatement ptm = null;
        ResultSet rs = null;
        try {
            conn = DBUtils.getConnection();
            if (conn != null) {
                ptm = conn.prepareStatement(GETUSERIDWITHEMAIL);
                ptm.setString(1, email);
                rs = ptm.executeQuery();
                check = rs.next();
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

    public boolean checkNarrowID(String majorID, String narrowID) throws SQLException {
        boolean check = false;
        Connection conn = null;
        PreparedStatement ptm = null;
        ResultSet rs = null;
        try {
            conn = DBUtils.getConnection();
            if (conn != null) {
                ptm = conn.prepareStatement(GETNARROWID);
                ptm.setString(1, majorID);
                ptm.setString(2, narrowID);
                rs = ptm.executeQuery();
                check = rs.next();
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
