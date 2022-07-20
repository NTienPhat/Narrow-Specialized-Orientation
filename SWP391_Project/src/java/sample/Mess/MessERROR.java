/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sample.Mess;

/**
 *
 * @author Hoang Tam
 */
public class MessERROR {
    private String messTitle;
    private String messText;

    public MessERROR() {
        this.messTitle = "";
        this.messText = "";
    }

    public MessERROR(String messTitle, String messText) {
        this.messTitle = messTitle;
        this.messText = messText;
    }

    public String getMessTitle() {
        return messTitle;
    }

    public void setMessTitle(String messTitle) {
        this.messTitle = messTitle;
    }

    public String getMessText() {
        return messText;
    }

    public void setMessText(String messText) {
        this.messText = messText;
    }
    
}
