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
@WebServlet(name = "ReplyController", urlPatterns = {"/ReplyController"})
public class ReplyController extends HttpServlet {

    private final static String ERROR = "MainController?action=ViewQuestion";
    private final static String SUCCESS = "MainController?action=ViewQuestion";

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String url = ERROR;
        try {
            String STID = request.getParameter("STID");
            String SPID = request.getParameter("SPID");
            int messID = Integer.parseInt(request.getParameter("messID"));
            String reply = request.getParameter("reply");
            MessERROR error = new MessERROR();
            Timestamp currentDate = Validation.takeCurrentDate();
            boolean checkValid = true;
            if (reply.isEmpty()) {
                checkValid = false;
                error.setMessText("Please fill text before send mess!!");
            }
            if (checkValid) {
                MessDTO mess = new MessDTO(0, reply, "", currentDate, messID);
                MessDAO dao = new MessDAO();
                boolean checkCreateMess = dao.createMess(mess);
                if (checkCreateMess) {
                    int lassMessID = dao.getLastMessID();
                    dao.createSend(SPID, lassMessID);
                    dao.createReceive(STID, lassMessID);
                    dao.updateReply(messID);
                    url = SUCCESS;
                    request.setAttribute("SUCCESS", "Rely successed!");
                }
            }
        } catch (Exception e) {
            log("Error at ReplyController: " + e.toString());
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
