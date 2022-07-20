/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sample.controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import sample.RegisterDetail.RegisterDetailDAO;
import sample.RegisterDetail.RegisterStatusDTO;
import sample.student.StudentDTO;

/**
 *
 * @author Hoang Tam
 */
@WebServlet(name = "ViewRegistedStatusController", urlPatterns = {"/ViewRegistedStatusController"})
public class ViewRegistedStatusController extends HttpServlet {

    private static final String ERROR = "StudentRegisterStatus.jsp";
    private static final String SUCCESS = "StudentRegisterStatus.jsp";

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String url = ERROR;
        HttpSession session = request.getSession();
        try {
            StudentDTO student =  (StudentDTO) session.getAttribute("LOGIN_USER");
            RegisterDetailDAO dao = new RegisterDetailDAO();
            RegisterStatusDTO registedStatus = dao.getRegistedStatus(student.getUserID());
            if(registedStatus != null){
                request.setAttribute("REGISTED_STATUS", registedStatus);
                url = SUCCESS;
            }else{
                request.setAttribute("ERROR", "You don't register any narrow specification");
            }
        } catch (Exception e) {
            log("Error at ViewRegistedStatusController: " + e.toString());
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
