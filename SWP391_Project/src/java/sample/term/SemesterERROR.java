/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sample.term;

/**
 *
 * @author Admin
 */
public class SemesterERROR {
    private String semesterID;
    private String semesterName;

    public SemesterERROR() {
    }

    public SemesterERROR(String semesterID, String semesterName) {
        this.semesterID = semesterID;
        this.semesterName = semesterName;
    }

    public String getSemesterID() {
        return semesterID;
    }

    public void setSemesterID(String semesterID) {
        this.semesterID = semesterID;
    }

    public String getSemesterName() {
        return semesterName;
    }

    public void setSemesterName(String semesterName) {
        this.semesterName = semesterName;
    }
    
    
}
