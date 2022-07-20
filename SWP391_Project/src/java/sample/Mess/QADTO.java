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
public class QADTO {
    private String messTitle;
    private String question;
    private Timestamp sendDate;
    private String reply;
    private Timestamp replyDate;
    private String status;

    public QADTO() {
        this.messTitle = "";
        this.question = "";
        this.sendDate = null;
        this.reply = "";
        this.replyDate = null;
        this.status = "";
    }

    public QADTO(String messTitle, String question, Timestamp sendDate, String reply, Timestamp replyDate, String status) {
        this.messTitle = messTitle;
        this.question = question;
        this.sendDate = sendDate;
        this.reply = reply;
        this.replyDate = replyDate;
        this.status = status;
    }

    public String getMessTitle() {
        return messTitle;
    }

    public void setMessTitle(String messTitle) {
        this.messTitle = messTitle;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public Timestamp getSendDate() {
        return sendDate;
    }

    public void setSendDate(Timestamp sendDate) {
        this.sendDate = sendDate;
    }

    public String getReply() {
        return reply;
    }

    public void setReply(String reply) {
        this.reply = reply;
    }

    public Timestamp getReplyDate() {
        return replyDate;
    }

    public void setReplyDate(Timestamp replyDate) {
        this.replyDate = replyDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
}
