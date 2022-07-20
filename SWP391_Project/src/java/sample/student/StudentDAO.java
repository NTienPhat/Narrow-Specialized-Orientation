/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sample.student;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import sample.utils.DBUtils;

/**
 *
 * @author Hoang Tam
 */
public class StudentDAO {

    private static final String SEARCH = "SELECT us.userID, us.name, us.email, us.phoneNumber, us.address,"
            + " us.roleID, st.semesterID, st.majorID, st.narrowID"
            + " FROM tblUser us INNER JOIN tblStudent st ON us.userID = st.userID "
            + " WHERE us.status = 'true' AND us.name like ? ";
    private static final String GETSTUDENT = " SELECT us.userID, us.name, us.email, us.phoneNumber, us.address,\n"
            + "  us.roleID, st.semesterID, st.majorID, st.narrowID\n"
            + "  FROM tblUser us INNER JOIN tblStudent st ON us.userID = st.userID \n"
            + "  WHERE us.status = 'true' AND us.userID = ? ";

    private static final String DELETE = "UPDATE tblUser "
            + "SET status= 'false' "
            + "WHERE userID=? ";
//   "SELECT productID, productName, image, price, quantity, catagoryID, importDate, usingDate, status "
//            + " FROM tblProduct  "
//            + " WHERE productName like ? AND status = 'true'";
    private static final String ADDUSER = "INSERT INTO tblUser"
            + "(userID, name, email, phoneNumber, address, roleID, status)"
            + " VALUES(?,?,?,?,?,'ST', 'true')";
    private static final String ADDSTUDENT = "INSERT INTO tblStudent"
            + "(userID, semesterID, majorID, narrowID )"
            + " VALUES(?,?,?,?)";
    private static final String UPDATE = "BEGIN TRANSACTION;\n"
            + "UPDATE tblUser\n"
            + "SET tblUser.name = ?, tbluser.phoneNumber = ?, tbluser.address = ?\n"
            + "FROM tblUser , tblStudent student\n"
            + "WHERE tblUser.userID = student.userID\n"
            + "AND tblUser.userID = ? ;\n"
            + "UPDATE tblStudent\n"
            + "SET tblStudent.semesterID = ? , tblStudent.majorID = ?, tblStudent.narrowID = ?\n"
            + "FROM tblUser , tblStudent student\n"
            + "WHERE tblUser.userID = student.userID\n"
            + "AND student.userID = ?;\n"
            + "COMMIT;";

    public List<StudentDTO> getListStudents(String search) throws SQLException {
        List<StudentDTO> list = new ArrayList<>();
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
                    String semesterID = rs.getString("semesterID");
                    String majorID = rs.getString("majorID");
                    String narrowID = rs.getString("narrowID");
                    list.add(new StudentDTO(userID, name, email, phoneNumber, address, roleID, semesterID, majorID, narrowID));
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

    public StudentDTO getStudent(String search) throws SQLException {
        StudentDTO student = null;
        Connection conn = null;
        PreparedStatement ptm = null;
        ResultSet rs = null;
        try {
            conn = DBUtils.getConnection();
            if (conn != null) {
                ptm = conn.prepareStatement(GETSTUDENT);
                ptm.setString(1, search);
                rs = ptm.executeQuery();
                if (rs.next()) {
                    String userID = rs.getString("userID");
                    String name = rs.getString("name");
                    String email = rs.getString("email");
                    String phoneNumber = rs.getString("phoneNumber");
                    String address = rs.getString("address");
                    String roleID = rs.getString("roleID");
                    String semesterID = rs.getString("semesterID");
                    String majorID = rs.getString("majorID");
                    String narrowID = rs.getString("narrowID");
                    student = new StudentDTO(userID, name, email, phoneNumber, address, roleID, semesterID, majorID, narrowID);
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
        return student;
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

    public boolean updateStudent(StudentDTO student) throws SQLException {
        boolean check = false;
        Connection conn = null;
        PreparedStatement ptm = null;
        try {
            conn = DBUtils.getConnection();
            if (conn != null) {
                ptm = conn.prepareStatement(UPDATE);
                ptm.setNString(1, student.getName());
                ptm.setString(2, student.getPhoneNumber());
                ptm.setNString(3, student.getAddress());
                ptm.setString(4, student.getUserID());
                ptm.setString(5, student.getSemesterID());
                ptm.setString(6, student.getMajorID());
                ptm.setString(7, student.getNarrowID());
                ptm.setString(8, student.getUserID());
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
    public boolean createUser(StudentDTO student) throws SQLException {
        boolean check = false;
        Connection conn = null;
        PreparedStatement ptm = null;
        try {
            conn = DBUtils.getConnection();
            if (conn != null) {
                ptm = conn.prepareStatement(ADDUSER);
                ptm.setString(1, student.getUserID());
                ptm.setString(2, student.getName());
                ptm.setString(3, student.getEmail());
                ptm.setString(4, student.getPhoneNumber());
                ptm.setString(5, student.getAddress());
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
    public boolean createStudent(StudentDTO student) throws SQLException {
        boolean check = false;
        Connection conn = null;
        PreparedStatement ptm = null;
        try {
            conn = DBUtils.getConnection();
            if (conn != null) {
                ptm = conn.prepareStatement(ADDSTUDENT);
                ptm.setString(1, student.getUserID());
                ptm.setString(2, student.getSemesterID());
                ptm.setString(3, student.getMajorID());
                ptm.setString(4, student.getNarrowID());
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
