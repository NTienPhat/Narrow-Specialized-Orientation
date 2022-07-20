/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sample.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Timestamp;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import sample.Mess.MessDAO;
import sample.Mess.MessDTO;
import sample.Mess.MessERROR;
import sample.validation.Validation;

/**
 *
 * @author Hoang Tam
 */
@WebServlet(name = "SendMessController", urlPatterns = {"/SendMessController"})
public class SendMessController extends HttpServlet {

    private final String ERROR = "SendApplication.jsp";
    private final String SUCCESS = "SendApplication.jsp";

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String url = ERROR;
        try {
            String userID = request.getParameter("userID");
            String majorID = request.getParameter("majorID");
            String messTitle = request.getParameter("title");
            String messText = request.getParameter("text");
            MessERROR error = new MessERROR();
            Timestamp messDate = Validation.takeCurrentDate();
            boolean checkValid = true;
            if(messText.isEmpty()){
                checkValid = false;
                error.setMessText("Please fill text before send mess!!");
            }
            if(messTitle.isEmpty()){
                checkValid = false;
                error.setMessTitle("Please fill title before send mess!!");
            }
            if(checkValid){
                MessDTO mess = new MessDTO(0, messText, messTitle, messDate, 0);
                MessDAO dao = new MessDAO();
                boolean checkCreatMess = dao.createMess(mess);
                if(checkCreatMess){
                    int messID = dao.getLastMessID();
                    dao.createSend(userID, messID);
                    String supporterID = dao.getSupporterID(majorID);
                    dao.createReceive(supporterID, messID);
                    url = SUCCESS;
                    request.setAttribute("SUCCESS", "Send the question success!!");
                }
            }else{
                request.setAttribute("ERROR", error);
            }
        } catch (Exception e) {
            log("Error at SendMessController: "+ e.toString());
        } finally {
            request.getRequestDispatcher(url).forward(request, response);
        }
    }

// <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
