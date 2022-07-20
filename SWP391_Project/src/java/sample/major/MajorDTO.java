/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sample.major;

/**
 *
 * @author Admin
 */
public class MajorDTO {
    private String majorID;
    private String majorName;
    private String linkFLM;
    private String description;

    public MajorDTO() {
    }
    

    public MajorDTO(String majorID, String majorName, String linkFLM, String description) {
        this.majorID = majorID;
        this.majorName = majorName;
        this.linkFLM = linkFLM;
        this.description = description;
    }

    public String getMajorID() {
        return majorID;
    }

    public void setMajorID(String majorID) {
        this.majorID = majorID;
    }

    public String getMajorName() {
        return majorName;
    }

    public void setMajorName(String majorName) {
        this.majorName = majorName;
    }

    public String getLinkFLM() {
        return linkFLM;
    }

    public void setLinkFLM(String linkFLM) {
        this.linkFLM = linkFLM;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
}
