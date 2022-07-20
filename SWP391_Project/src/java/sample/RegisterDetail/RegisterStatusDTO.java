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
public class RegisterStatusDTO {
    private String semesterID;
    private String majorID;
    private String narrowID;
    private Timestamp registedDate;
    private String status;

    public RegisterStatusDTO() {
        this.semesterID = "";
        this.majorID = "";
        this.narrowID = "";
        this.registedDate = null;
        this.status = "";
    }

    public RegisterStatusDTO(String semesterID, String majorID, String narrowID, Timestamp registedDate, String status) {
        this.semesterID = semesterID;
        this.majorID = majorID;
        this.narrowID = narrowID;
        this.registedDate = registedDate;
        this.status = status;
    }

    public String getSemesterID() {
        return semesterID;
    }

    public void setSemesterID(String semesterID) {
        this.semesterID = semesterID;
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

    public Timestamp getRegistedDate() {
        return registedDate;
    }

    public void setRegistedDate(Timestamp registedDate) {
        this.registedDate = registedDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
}
