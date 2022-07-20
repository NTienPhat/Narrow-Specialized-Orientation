/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sample.RegisterDetail;

import java.sql.Timestamp;

/**
 *
 * @author Hoang Tam
 */
public class RegisterDetailDTO {
    private Timestamp importDate;
    private String userID;
    private int registerID;
    private String status;

    public RegisterDetailDTO() {
        this.importDate = null;
        this.userID = "";
        this.registerID = 0;
        this.status = "";
    }

    public RegisterDetailDTO(Timestamp importDate, String userID, int registerID, String status) {
        this.importDate = importDate;
        this.userID = userID;
        this.registerID = registerID;
        this.status = status;
    }

    public Timestamp getImportDate() {
        return importDate;
    }

    public void setImportDate(Timestamp importDate) {
        this.importDate = importDate;
    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public int getRegisterID() {
        return registerID;
    }

    public void setRegisterID(int registerID) {
        this.registerID = registerID;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
}
