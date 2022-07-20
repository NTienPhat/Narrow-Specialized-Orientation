/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sample.RegisterAD;

import java.sql.Timestamp;

/**
 *
 * @author Hoang Tam
 */
public class RegisterADERROR {
    private String registerID;
    private String majorID;
    private String narrowID;
    private String semesterID;
    private String importDate;
    private String usingDate;
    private String minQuantity;

    public RegisterADERROR() {
        this.registerID = "";
        this.majorID = "";
        this.narrowID = "";
        this.semesterID = "";
        this.importDate = "";
        this.usingDate = "";
        this.minQuantity = "";
    }

    public RegisterADERROR(String registerID, String majorID, String narrowID, String semesterID, String importDate, String usingDate, String minQuantity) {
        this.registerID = registerID;
        this.majorID = majorID;
        this.narrowID = narrowID;
        this.semesterID = semesterID;
        this.importDate = importDate;
        this.usingDate = usingDate;
        this.minQuantity = minQuantity;
    }

    public String getRegisterID() {
        return registerID;
    }

    public void setRegisterID(String registerID) {
        this.registerID = registerID;
    }

    public String getMajorID() {
        return majorID;
    }

    public void setMajorID(String majorID) {
        this.majorID = majorID;
    }

    public String getNarrowID() {
        return narrowID;
    }

    public void setNarrowID(String narrowID) {
        this.narrowID = narrowID;
    }

    public String getSemesterID() {
        return semesterID;
    }

    public void setSemesterID(String semesterID) {
        this.semesterID = semesterID;
    }

    public String getImportDate() {
        return importDate;
    }

    public void setImportDate(String importDate) {
        this.importDate = importDate;
    }

    public String getUsingDate() {
        return usingDate;
    }

    public void setUsingDate(String usingDate) {
        this.usingDate = usingDate;
    }

    public String getMinQuantity() {
        return minQuantity;
    }

    public void setMinQuantity(String minQuantity) {
        this.minQuantity = minQuantity;
    }

    
   
    
}
