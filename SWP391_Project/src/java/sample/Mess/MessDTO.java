/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sample.Mess;

import java.sql.Timestamp;

/**
 *
 * @author Hoang Tam
 */
public class MessDTO {
    private String SPID;
    private String STID;
    private int messID;
    private String messText;
    private String messTitle;
    private Timestamp messDate;
    private int replyForST;

    public MessDTO() {
        this.SPID = "";
        this.STID = "";
        this.messID = 0;
        this.messText = "";
        this.messTitle = "";
        this.messDate = null;
        this.replyForST = 0;
    }

    public MessDTO(int messID, String messText, String messTitle, Timestamp messDate, int replyForST) {
        this.messID = messID;
        this.messText = messText;
        this.messTitle = messTitle;
        this.messDate = messDate;
        this.replyForST = replyForST;
    }

    public MessDTO(String SPID, String STID, int messID, String messText, String messTitle, Timestamp messDate, int relyForST) {
        this.SPID = SPID;
        this.STID = STID;
        this.messID = messID;
        this.messText = messText;
        this.messTitle = messTitle;
        this.messDate = messDate;
        this.replyForST = relyForST;
    }

    public String getSPID() {
        return SPID;
    }

    public void setSPID(String SPID) {
        this.SPID = SPID;
    }

    public String getSTID() {
        return STID;
    }

    public void setSTID(String STID) {
        this.STID = STID;
    }
    

    public int getReplyForST() {
        return replyForST;
    }

    public void setReplyForST(int relyForST) {
        this.replyForST = relyForST;
    }

    

    public int getMessID() {
        return messID;
    }

    public void setMessID(int messID) {
        this.messID = messID;
    }

    public String getMessText() {
        return messText;
    }

    public void setMessText(String messText) {
        this.messText = messText;
    }

    public String getMessTitle() {
        return messTitle;
    }

    public void setMessTitle(String messTitle) {
        this.messTitle = messTitle;
    }

    public Timestamp getMessDate() {
        return messDate;
    }

    public void setMessDate(Timestamp messDate) {
        this.messDate = messDate;
    }
    
}
