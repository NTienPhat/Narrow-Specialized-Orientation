/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sample.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import sample.Mess.MessDAO;
import sample.Mess.QADTO;
import sample.supporter.SupporterDTO;

/**
 *
 * @author Hoang Tam
 */
@WebServlet(name = "ViewAnswerController", urlPatterns = {"/ViewAnswerController"})
public class ViewAnswerController extends HttpServlet {
    private static final String ERROR = "SupportPage_ViewAnswer.jsp";
    private static final String SUCCESS = "SupportPage_ViewAnswer.jsp";
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String url = ERROR;
        HttpSession session = request.getSession();
        try {
            SupporterDTO supporter = (SupporterDTO) session.getAttribute("LOGIN_USER");
            if(supporter != null){
                MessDAO dao = new MessDAO();
                List<QADTO> list = dao.GetReplyOfSupporter(supporter.getUserID());
                if(list.size() > 0){
                    request.setAttribute("LIST_REPLY", list);
                    url = SUCCESS;
                }else{
                    request.setAttribute("ERROR", "You don't reply any question!");
                }
            }
        } catch (Exception e) {
            log("Error at ViewAnswerController: "+ e.toString());
        }finally{
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
