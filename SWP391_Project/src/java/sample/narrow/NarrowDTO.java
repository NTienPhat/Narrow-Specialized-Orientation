/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sample.narrow;

/**
 *
 * @author Hoang Tam
 */
public class NarrowDTO {
    private String narrowID;
    private String narrowName;
    private String linkFLM;
    private String description;
    private String majorID;

    public NarrowDTO() {
        this.narrowID = "";
        this.narrowName = "";
        this.linkFLM = "";
        this.description = "";
        this.majorID = "";
    }

    public NarrowDTO(String narrowID, String narrowName, String linkFLM, String description, String majorID) {
        this.narrowID = narrowID;
        this.narrowName = narrowName;
        this.linkFLM = linkFLM;
        this.description = description;
        this.majorID = majorID;
    }

    public String getNarrowID() {
        return narrowID;
    }

    public void setNarrowID(String narrowID) {
        this.narrowID = narrowID;
    }

    public String getNarrowName() {
        return narrowName;
    }

    public void setNarrowName(String narrowName) {
        this.narrowName = narrowName;
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

    public String getMajorID() {
        return majorID;
    }

    public void setMajorID(String majorID) {
        this.majorID = majorID;
    }
    
}
