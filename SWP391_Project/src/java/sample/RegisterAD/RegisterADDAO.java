/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sample.RegisterAD;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import sample.student.StudentDTO;
import sample.term.SemesterDTO;
import sample.utils.DBUtils;

/**
 *
 * @author Hoang Tam
 */
public class RegisterADDAO {

    private static final String ADDREGISTERFORM = "Insert into tblRegisterNarrow (majorID, narrowID, \n"
            + "semesterID, importDate, usingDate, minQuantity, status) "
            + "VALUES(?, ?, ?, ?, ?, 20, 'true' )";
    private static final String GETREGISTERFORMBYTERM = "SELECT registerID, majorID, narrowID, semesterID \n"
            + "FROM tblRegisterNarrow \n"
            + "WHERE semesterID = ? AND status = 'true'";
    private static final String GET_REGISTER_FORM_BY_MAJOR_AND_TERM = "SELECT RG.registerID, RG.majorID, RG.semesterID, RG.narrowID, NR.narrowName"
            + " FROM tblRegisterNarrow RG "
            + "INNER JOIN tblNarrow NR "
            + "ON RG.narrowID = NR.narrowID "
            + "WHERE RG.majorID = ? "
            + "AND RG.semesterID = ? "
            + "AND RG.status = 'true' "
            + "AND RG.importDate <= GETDATE() "
            + "AND RG.usingDate  >= GETDATE()";
    private static final String UPDATE_STARTDATE_ENDDATE = "Update tblRegisterNarrow set\n"
            + "importDate = ? ,\n"
            + "usingDate = ? \n"
            + "WHERE registerID = ? ";

    public boolean updateDate(Timestamp startDate, Timestamp endDate, int registerID) throws SQLException {
        boolean check = false;
        Connection conn = null;
        PreparedStatement ptm = null;
        try {
            conn = DBUtils.getConnection();
            if (conn != null) {
                ptm = conn.prepareStatement(UPDATE_STARTDATE_ENDDATE);
                ptm.setTimestamp(1, startDate);
                ptm.setTimestamp(2, endDate);
                ptm.setInt(3, registerID);
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

    public boolean createSemester(RegisterADDTO registerAD) throws SQLException {
        boolean check = false;
        Connection conn = null;
        PreparedStatement ptm = null;
        try {
            conn = DBUtils.getConnection();
            if (conn != null) {
                ptm = conn.prepareStatement(ADDREGISTERFORM);
                ptm.setString(1, registerAD.getMajorID());
                ptm.setString(2, registerAD.getNarrowID());
                ptm.setString(3, registerAD.getSemesterID());
                ptm.setTimestamp(4, registerAD.getImportDate());
                ptm.setTimestamp(5, registerAD.getUsingDate());
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

    public List<RegisterADDTO> getListSemester(String semester) throws SQLException {
        List<RegisterADDTO> list = new ArrayList<>();
        Connection conn = null;
        PreparedStatement ptm = null;
        ResultSet rs = null;
        try {
            conn = DBUtils.getConnection();
            if (conn != null) {
                ptm = conn.prepareStatement(GETREGISTERFORMBYTERM);
                ptm.setString(1, semester);
                rs = ptm.executeQuery();
                while (rs.next()) {
                    int registerID = rs.getInt("registerID");
                    String majorID = rs.getString("majorID");
                    String narrowID = rs.getString("narrowID");
                    String semesterID = rs.getString("semesterID");
                    list.add(new RegisterADDTO(registerID, majorID, narrowID, semesterID, null, null, 0));
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

    public List<RegisterADDTO> getListRegiterByTermAndMajor(String semester, String majorOfST) throws SQLException {
        List<RegisterADDTO> list = new ArrayList<>();
        Connection conn = null;
        PreparedStatement ptm = null;
        ResultSet rs = null;
        try {
            conn = DBUtils.getConnection();
            if (conn != null) {
                ptm = conn.prepareStatement(GET_REGISTER_FORM_BY_MAJOR_AND_TERM);
                ptm.setString(1, majorOfST);
                ptm.setString(2, semester);
                rs = ptm.executeQuery();
                while (rs.next()) {
                    int registerID = rs.getInt("registerID");
                    String majorID = rs.getString("majorID");
                    String narrowID = rs.getString("narrowID");
                    String semesterID = rs.getString("semesterID");
                    String narrowName = rs.getString("narrowName");
                    list.add(new RegisterADDTO(registerID, majorID, narrowID, semesterID, null, null, 0, narrowName));
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

}
