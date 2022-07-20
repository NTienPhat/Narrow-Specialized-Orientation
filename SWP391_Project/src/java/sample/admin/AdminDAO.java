/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sample.admin;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import sample.utils.DBUtils;

/**
 *
 * @author Hoang Tam
 */
public class AdminDAO {

    private static final String LOGINGOOGLE = "SELECT userID, name, roleID, phoneNumber, address "
            + "FROM tblUser "
            + "WHERE email=? AND status = 'true' ";

    public AdminDTO checkLoginGoogle(String email) throws SQLException {
        AdminDTO user = null;
        Connection conn = null;
        PreparedStatement ptm = null;
        ResultSet rs = null;
        try {
            conn = DBUtils.getConnection();
            if (conn != null) {
                ptm = conn.prepareStatement(LOGINGOOGLE);
                ptm.setString(1, email);
                rs = ptm.executeQuery();
                if (rs.next()) {
                    String userID = rs.getString("userID");
                    String name = rs.getString("name");
                    String roleID = rs.getString("roleID");
                    String phoneNumber = rs.getString("phoneNumber");
                    String address = rs.getString("address");
                    user = new AdminDTO(userID, name, email, phoneNumber, address, roleID);
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
        return user;
    }
}
