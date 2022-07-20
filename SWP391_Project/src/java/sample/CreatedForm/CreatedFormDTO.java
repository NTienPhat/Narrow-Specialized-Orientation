/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sample.CreatedForm;

import java.sql.Timestamp;

/**
 *
 * @author Hoang Tam
 */
public class CreatedFormDTO {

    private int registerID;
    private String majorID;
    private String narrowID;
    private Timestamp startDate;
    private Timestamp endDate;
    private int totalStudent;

    public CreatedFormDTO() {
        this.registerID = 0;
        this.majorID = "";
        this.narrowID = "";
        this.startDate = null;
        this.endDate = null;
        this.totalStudent = 0;
    }

    public CreatedFormDTO(int registerID, String majorID, String narrowID, Timestamp startDate, Timestamp endDate, int totalStudent) {
        this.registerID = registerID;
        this.majorID = majorID;
        this.narrowID = narrowID;
        this.startDate = startDate;
        this.endDate = endDate;
        this.totalStudent = totalStudent;
    }

    public String getMajorID() {
        return majorID;
    }

    public void setMajorID(String majorID) {
        this.majorID = majorID;
    }

    public int getRegisterID() {
        return registerID;
    }

    public void setRegisterID(int registerID) {
        this.registerID = registerID;
    }

    public String getNarrowID() {
        return narrowID;
    }

    public void setNarrowID(String narrowID) {
        this.narrowID = narrowID;
    }

    public Timestamp getStartDate() {
        return startDate;
    }

    public void setStartDate(Timestamp startDate) {
        this.startDate = startDate;
    }

    public Timestamp getEndDate() {
        return endDate;
    }

    public void setEndDate(Timestamp endDate) {
        this.endDate = endDate;
    }

    public int getTotalStudent() {
        return totalStudent;
    }

    public void setTotalStudent(int totalStudent) {
        this.totalStudent = totalStudent;
    }

}
