/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sample.student;

/**
 *
 * @author Hoang Tam
 */
public class StudentERROR {
    private String  userID;
    private String  name;
    private String  email;
    private String  phoneNumber;
    private String  address;
    private String  roleID;
    private String  semesterID;
    private String  majorID;
    private String  narrowID;

    public StudentERROR() {
    }

    public StudentERROR(String userID, String name, String email, String phoneNumber, String address, String roleID, String semesterID, String majorID, String narrowID) {
        this.userID = userID;
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.roleID = roleID;
        this.semesterID = semesterID;
        this.majorID = majorID;
        this.narrowID = narrowID;
    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getRoleID() {
        return roleID;
    }

    public void setRoleID(String roleID) {
        this.roleID = roleID;
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
    
}
