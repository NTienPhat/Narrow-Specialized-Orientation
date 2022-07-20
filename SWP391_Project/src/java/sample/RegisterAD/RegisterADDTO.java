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
public class RegisterADDTO {
    private int registerID;
    private String majorID;
    private String narrowID;
    private String semesterID;
    private Timestamp importDate;
    private Timestamp usingDate;
    private int minQuantity;
    private String narrowName;

    public RegisterADDTO() {
        this.registerID = 0;
        this.majorID = "";
        this.narrowID = "";
        this.semesterID = "";
        this.importDate = null;
        this.usingDate = null;
        this.minQuantity = 0;
    }

    public RegisterADDTO(int registerID, String majorID, String narrowID, String semesterID, Timestamp importDate, Timestamp usingDate, int minQuantity) {
        this.registerID = registerID;
        this.majorID = majorID;
        this.narrowID = narrowID;
        this.semesterID = semesterID;
        this.importDate = importDate;
        this.usingDate = usingDate;
        this.minQuantity = minQuantity;
    }

    public RegisterADDTO(int registerID, String majorID, String narrowID, String semesterID, Timestamp importDate, Timestamp usingDate, int minQuantity, String narrowName) {
        this.registerID = registerID;
        this.majorID = majorID;
        this.narrowID = narrowID;
        this.semesterID = semesterID;
        this.importDate = importDate;
        this.usingDate = usingDate;
        this.minQuantity = minQuantity;
        this.narrowName = narrowName;
    }

    public String getNarrowName() {
        return narrowName;
    }

    public void setNarrowName(String narrowName) {
        this.narrowName = narrowName;
    }
    
    public int getRegisterID() {
        return registerID;
    }

    public void setRegisterID(int registerID) {
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

    public Timestamp getImportDate() {
        return importDate;
    }

    public void setImportDate(Timestamp importDate) {
        this.importDate = importDate;
    }

    public Timestamp getUsingDate() {
        return usingDate;
    }

    public void setUsingDate(Timestamp usingDate) {
        this.usingDate = usingDate;
    }

    public int getMinQuantity() {
        return minQuantity;
    }

    public void setMinQuantity(int minQuantity) {
        this.minQuantity = minQuantity;
    }

    
    
}
