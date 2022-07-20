/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sample.supporter;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import sample.supporter.SupporterDTO;
import sample.utils.DBUtils;

/**
 *
 * @author Admin
 */
public class SupporterDAO {
    private static final String SEARCH = "SELECT us.userID, us.name, us.email, us.phoneNumber, us.address,"
            + " us.roleID, sp.majorID"
            + " FROM tblUser us INNER JOIN tblSupporter sp ON us.userID = sp.userID "
            + "WHERE us.status = 'true' AND us.name like ? ";
    
    private static final String GETSUPPORTER = "SELECT us.userID, us.name, us.email, us.phoneNumber, us.address,"
            + " us.roleID, sp.majorID"
            + " FROM tblUser us INNER JOIN tblSupporter sp ON us.userID = sp.userID "
            + "WHERE us.status = 'true' AND us.userID = ? ";
    
    private static final String DELETE = "UPDATE tblUser "
            + "SET status= 'false' "
            + "WHERE userID=? ";
    
    private static final String ADDUSER = "INSERT INTO tblUser"
            + "(userID, name, email, phoneNumber, address, roleID, status)"
            + " VALUES(?,?,?,?,?,'SP', 'true')";
    
    private static final String ADDSUPPORTER = "INSERT INTO tblSupporter"
            + "(userID, majorID)"
            + " VALUES(?,?)";
    
    private static final String UPDATE = "BEGIN TRANSACTION;\n"
            + "UPDATE tblUser\n"
            + "SET tblUser.name = ?, tbluser.phoneNumber = ?, tbluser.address = ?\n"
            + "FROM tblUser , tblSupporter supporter\n"
            + "WHERE tblUser.userID = supporter.userID\n"
            + "AND tblUser.userID = ? ;\n"
            + "UPDATE tblSupporter\n"
            + "SET tblSupporter.majorID = ?\n"
            + "FROM tblUser , tblSupporter supporter\n"
            + "WHERE tblUser.userID = supporter.userID\n"
            + "AND supporter.userID = ?;\n"
            + "COMMIT;";
    
    public boolean createUser(SupporterDTO supporter) throws SQLException {
        boolean check = false;
        Connection conn = null;
        PreparedStatement ptm = null;
        try {
            conn = DBUtils.getConnection();
            if (conn != null) {
                ptm = conn.prepareStatement(ADDUSER);
                ptm.setString(1, supporter.getUserID());
                ptm.setString(2, supporter.getName());
                ptm.setString(3, supporter.getEmail());
                ptm.setString(4, supporter.getPhoneNumber());
                ptm.setString(5, supporter.getAddress());
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
    
    public boolean createSupporter(SupporterDTO supporter) throws SQLException {
        boolean check = false;
        Connection conn = null;
        PreparedStatement ptm = null;
        try {
            conn = DBUtils.getConnection();
            if (conn != null) {
                ptm = conn.prepareStatement(ADDSUPPORTER);
                ptm.setString(1, supporter.getUserID());
                ptm.setString(2, supporter.getMajorID());
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

    public boolean delete(String userID) throws SQLException {
        boolean check = false;
        Connection conn = null;
        PreparedStatement ptm = null;
        try {
            conn = DBUtils.getConnection();
            if (conn != null) {
                ptm = conn.prepareStatement(DELETE);
                ptm.setString(1, userID);
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

    public List<SupporterDTO> getListSupporterts(String search) throws SQLException {
        List<SupporterDTO> list = new ArrayList<>();
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
                    String userID = rs.getString("userID");
                    String name = rs.getString("name");
                    String email = rs.getString("email");
                    String phoneNumber = rs.getString("phoneNumber");
                    String address = rs.getString("address");
                    String roleID = rs.getString("roleID");
                    String majorID = rs.getString("majorID");
                    list.add(new SupporterDTO(userID, name, email, phoneNumber, address, roleID, majorID));
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

    public SupporterDTO getSupporter(String search) throws SQLException {
        SupporterDTO supporter = null;
        Connection conn = null;
        PreparedStatement ptm = null;
        ResultSet rs = null;
        try {
            conn = DBUtils.getConnection();
            if (conn != null) {
                ptm = conn.prepareStatement(GETSUPPORTER);
                ptm.setString(1, search );
                rs = ptm.executeQuery();
                if (rs.next()) {
                    String userID = rs.getString("userID");
                    String name = rs.getString("name");
                    String email = rs.getString("email");
                    String phoneNumber = rs.getString("phoneNumber");
                    String address = rs.getString("address");
                    String roleID = rs.getString("roleID");
                    String majorID = rs.getString("majorID");
                    supporter = new SupporterDTO(userID, name, email, phoneNumber, address, roleID, majorID);
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
        return supporter;
    }

    public boolean updateSupporter(SupporterDTO supporter) throws SQLException {
        boolean check = false;
        Connection conn = null;
        PreparedStatement ptm = null;
        try {
            conn = DBUtils.getConnection();
            if (conn != null) {
                ptm = conn.prepareStatement(UPDATE);
                ptm.setNString(1, supporter.getName());
                ptm.setString(2, supporter.getPhoneNumber());
                ptm.setNString(3, supporter.getAddress());
                ptm.setString(4, supporter.getUserID());
                ptm.setString(5, supporter.getMajorID());
                ptm.setString(6, supporter.getUserID());
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
