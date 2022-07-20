/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sample.narrow;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import sample.major.MajorDTO;
import sample.utils.DBUtils;

/**
 *
 * @author Hoang Tam
 */
public class NarrowDAO {

    private static final String SEARCH = "SELECT narrowID, narrowName, linkFLM, description, majorID"
            + " FROM tblNarrow "
            + "WHERE status = 'true' AND narrowName like ? ";
    private static final String SEARCHBYMAJORID = "SELECT narrowID, narrowName, linkFLM, description, majorID"
            + " FROM tblNarrow "
            + "WHERE status = 'true' AND majorID = ? ";

    private static final String GETNARROW = "SELECT narrowID, narrowName, linkFLM, description, majorID"
            + " FROM tblNarrow "
            + "WHERE status = 'true' AND narrowID = ? ";

    private static final String DELETE = "UPDATE tblNarrow "
            + "SET status = 'false' "
            + "WHERE narrowID =? ";

    private static final String ADDMAJOR = "INSERT INTO tblNarrow"
            + "(narrowID, narrowName, linkFLM, description, majorID, status)"
            + " VALUES(?,?,?,?,?, 'true')";

    private static final String UPDATE = "UPDATE tblNarrow "
            + "SET narrowName = ?, linkFLM = ?, description = ? "
            + " WHERE narrowID = ? ";

    public boolean delete(String narrowID) throws SQLException {
        boolean check = false;
        Connection conn = null;
        PreparedStatement ptm = null;
        try {
            conn = DBUtils.getConnection();
            if (conn != null) {
                ptm = conn.prepareStatement(DELETE);
                ptm.setString(1, narrowID);
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

    public List<NarrowDTO> getListNarrow(String search) throws SQLException {
        List<NarrowDTO> list = new ArrayList<>();
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
                    String narrowID = rs.getString("narrowID");
                    String narrowName = rs.getString("narrowName");
                    String linkFLM = rs.getString("linkFLM");
                    String description = rs.getString("description");
                    String majorID = rs.getString("majorID");
                    list.add(new NarrowDTO(narrowID, narrowName, linkFLM, description, majorID));
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
    public List<NarrowDTO> getListNarrowByMajorID(String search) throws SQLException {
        List<NarrowDTO> list = new ArrayList<>();
        Connection conn = null;
        PreparedStatement ptm = null;
        ResultSet rs = null;
        try {
            conn = DBUtils.getConnection();
            if (conn != null) {
                ptm = conn.prepareStatement(SEARCHBYMAJORID);
                ptm.setString(1,  search );
                rs = ptm.executeQuery();
                while (rs.next()) {
                    String narrowID = rs.getString("narrowID");
                    String narrowName = rs.getString("narrowName");
                    String linkFLM = rs.getString("linkFLM");
                    String description = rs.getString("description");
                    String majorID = rs.getString("majorID");
                    list.add(new NarrowDTO(narrowID, narrowName, linkFLM, description, majorID));
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

    public boolean updateNarrow(NarrowDTO narrow) throws SQLException {
        boolean check = false;
        Connection conn = null;
        PreparedStatement ptm = null;
        try {
            conn = DBUtils.getConnection();
            if (conn != null) {
                ptm = conn.prepareStatement(UPDATE);
                ptm.setNString(1, narrow.getNarrowName());
                ptm.setString(2, narrow.getLinkFLM());
                ptm.setNString(3, narrow.getDescription());
                ptm.setString(4, narrow.getNarrowID());
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

    public NarrowDTO getNarrow(String search) throws SQLException {
        NarrowDTO narrow = null;
        Connection conn = null;
        PreparedStatement ptm = null;
        ResultSet rs = null;
        try {
            conn = DBUtils.getConnection();
            if (conn != null) {
                ptm = conn.prepareStatement(GETNARROW);
                ptm.setString(1, search );
                rs = ptm.executeQuery();
                if (rs.next()) {
                    String narrowID = rs.getString("narrowID");
                    String narrowName = rs.getString("narrowName");
                    String linkFLM = rs.getString("linkFLM");
                    String description = rs.getString("description");
                    String majorID = rs.getString("majorID");
                    narrow = new NarrowDTO(narrowID, narrowName, linkFLM, description, majorID);
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
        return narrow;
    }

    public boolean createNarrow(NarrowDTO narrow) throws SQLException {
        boolean check = false;
        Connection conn = null;
        PreparedStatement ptm = null;
        try {
            conn = DBUtils.getConnection();
            if (conn != null) {
                ptm = conn.prepareStatement(ADDMAJOR);
                ptm.setString(1, narrow.getNarrowID());
                ptm.setString(2, narrow.getNarrowName());
                ptm.setString(3, narrow.getLinkFLM());
                ptm.setString(4, narrow.getDescription());
                ptm.setString(5, narrow.getMajorID());
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
