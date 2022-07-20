/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sample.major;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import sample.utils.DBUtils;

/**
 *
 * @author Admin
 */
public class MajorDAO {

    private static final String SEARCH = "SELECT majorID, majorName, linkFLM, description"
            + " FROM tblMajor "
            + "WHERE status = 'true' AND majorName like ? ";
    
    private static final String GETMAJOR = "SELECT majorID, majorName, linkFLM, description"
            + " FROM tblMajor "
            + "WHERE status = 'true' AND majorID = ? ";
    
    private static final String DELETE = "UPDATE tblMajor "
            + "SET status = 'false' "
            + "WHERE majorID=? ";
    
    private static final String ADDMAJOR = "INSERT INTO tblMajor"
            + "(majorID, majorName, linkFLM, description, status)"
            + " VALUES(?,?,?,?, 'true')";
    
    private static final String UPDATE = "UPDATE tblMajor "
            + "SET majorName = ?, linkFLM = ?, description = ?"
            + " WHERE majorID = ? ";
    
    public boolean delete(String majorID) throws SQLException {
        boolean check = false;
        Connection conn = null;
        PreparedStatement ptm = null;
        try {
            conn = DBUtils.getConnection();
            if (conn != null) {
                ptm = conn.prepareStatement(DELETE);
                ptm.setString(1, majorID);
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

    public List<MajorDTO> getListMajor(String search) throws SQLException {
        List<MajorDTO> list = new ArrayList<>();
        Connection conn = null;
        PreparedStatement ptm = null;
        ResultSet rs = null;
        try {
            conn = DBUtils.getConnection();
            if (conn != null) {
                ptm = conn.prepareStatement(SEARCH);
                ptm.setNString(1, "%" + search + "%");
                rs = ptm.executeQuery();
                while (rs.next()) {
                    String majorID = rs.getString("majorID");
                    String majorName = rs.getString("majorName");
                    String linkFLM = rs.getString("linkFLM");
                    String description = rs.getString("description");
                    list.add(new MajorDTO(majorID, majorName, linkFLM, description));
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

    public boolean updateMajor(MajorDTO major) throws SQLException {
        boolean check = false;
        Connection conn = null;
        PreparedStatement ptm = null;
        try {
            conn = DBUtils.getConnection();
            if (conn != null) {
                ptm = conn.prepareStatement(UPDATE);
                ptm.setNString(1, major.getMajorName());
                ptm.setString(2, major.getLinkFLM());
                ptm.setNString(3, major.getDescription());
                ptm.setString(4, major.getMajorID());
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

    public MajorDTO getMajor(String search) throws SQLException {
        MajorDTO major = null;
        Connection conn = null;
        PreparedStatement ptm = null;
        ResultSet rs = null;
        try {
            conn = DBUtils.getConnection();
            if (conn != null) {
                ptm = conn.prepareStatement(GETMAJOR);
                ptm.setString(1, search );
                rs = ptm.executeQuery();
                if (rs.next()) {
                    String majorID = rs.getString("majorID");
                    String majorName = rs.getString("majorName");
                    String linkFLM = rs.getString("linkFLM");
                    String description = rs.getString("description");
                    major = new MajorDTO(majorID, majorName, linkFLM, description);
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
        return major;
    }

    public boolean createMajor(MajorDTO major) throws SQLException {
        boolean check = false;
        Connection conn = null;
        PreparedStatement ptm = null;
        try {
            conn = DBUtils.getConnection();
            if (conn != null) {
                ptm = conn.prepareStatement(ADDMAJOR);
                ptm.setString(1, major.getMajorID());
                ptm.setString(2, major.getMajorName());
                ptm.setString(3, major.getLinkFLM());
                ptm.setString(4, major.getDescription());
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
    
}
