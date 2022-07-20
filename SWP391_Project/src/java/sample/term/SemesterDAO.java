/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sample.term;

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
public class SemesterDAO {

    private static final String SEARCH = "SELECT semesterID, semesterName"
            + " FROM tblSemester "
            + "WHERE status = 'true' AND semesterName like ? ";
    
    private static final String GETSEMESTER = "SELECT semesterID, semesterName"
            + " FROM tblSemester "
            + "WHERE status = 'true' AND semesterID like ? ";
    
    private static final String DELETE = "UPDATE tblSemester "
            + "SET status = 'false' "
            + "WHERE semesterID=? ";
    
    private static final String ADDSEMESTER = "INSERT INTO tblSemester"
            + "(semesterID, semesterName, status)"
            + " VALUES(?,?, 'true')";
    
    private static final String UPDATE = "UPDATE tblSemester "
            + "SET semesterName = ?"
            + " WHERE semesterID = ? ";
    
    public boolean createSemester(SemesterDTO semester) throws SQLException {
        boolean check = false;
        Connection conn = null;
        PreparedStatement ptm = null;
        try {
            conn = DBUtils.getConnection();
            if (conn != null) {
                ptm = conn.prepareStatement(ADDSEMESTER);
                ptm.setString(1, semester.getSemesterID());
                ptm.setString(2, semester.getSemesterName());
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

    public boolean delete(String semesterID) throws SQLException {
        boolean check = false;
        Connection conn = null;
        PreparedStatement ptm = null;
        try {
            conn = DBUtils.getConnection();
            if (conn != null) {
                ptm = conn.prepareStatement(DELETE);
                ptm.setString(1, semesterID);
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

    public SemesterDTO getSemester(String search) throws SQLException {
        SemesterDTO semester = null;
        Connection conn = null;
        PreparedStatement ptm = null;
        ResultSet rs = null;
        try {
            conn = DBUtils.getConnection();
            if (conn != null) {
                ptm = conn.prepareStatement(GETSEMESTER);
                ptm.setString(1, "%" + search + "%");
                rs = ptm.executeQuery();
                if (rs.next()) {
                    String semesterID = rs.getString("semesterID");
                    String semesterName = rs.getString("semesterName");
                    semester = new SemesterDTO(semesterID, semesterName);
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
        return semester;
    }

    public List<SemesterDTO> getListSemester(String search) throws SQLException {
        List<SemesterDTO> list = new ArrayList<>();
        Connection conn = null;
        PreparedStatement ptm = null;
        ResultSet rs = null;
        try {
            conn = DBUtils.getConnection();
            if (conn != null) {
                ptm = conn.prepareStatement(SEARCH);
                ptm.setString(1, "%" + search + "%");
                rs = ptm.executeQuery();
                while (rs.next()) {
                    String semesterID = rs.getString("semesterID");
                    String semesterName = rs.getString("semesterName");
                    list.add(new SemesterDTO(semesterID, semesterName));
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

    public boolean updateSemester(SemesterDTO semester) throws SQLException {
        boolean check = false;
        Connection conn = null;
        PreparedStatement ptm = null;
        try {
            conn = DBUtils.getConnection();
            if (conn != null) {
                ptm = conn.prepareStatement(UPDATE);
                ptm.setNString(1, semester.getSemesterName());
                ptm.setString(2, semester.getSemesterID());
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
