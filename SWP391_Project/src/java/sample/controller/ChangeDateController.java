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
import sample.RegisterAD.RegisterADDAO;
import sample.validation.Validation;

/**
 *
 * @author Hoang Tam
 */
@WebServlet(name = "ChangeDateController", urlPatterns = {"/ChangeDateController"})
public class ChangeDateController extends HttpServlet {

    private final String ERROR = "MainController?action=GetListCreatedNarrow";
    private final String SUCCESS = "MainController?action=GetListCreatedNarrow";

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String url = ERROR;
        try {
            String startDateString = request.getParameter("startDate");
            String endDateString = request.getParameter("endDate");
            Timestamp startDate = Validation.dateStringToTimestamp(startDateString);
            Timestamp endDate = Validation.dateStringToTimestamp(endDateString);
            int registerID = Integer.parseInt(request.getParameter("registerID"));
            RegisterADDAO dao = new RegisterADDAO();
            boolean check = dao.updateDate(startDate, endDate, registerID);
            if (check) {
                url = SUCCESS;
            } else {
                request.setAttribute("ERROR", "Update error!");
            }
        } catch (Exception e) {
            log("Error at ChangeDateController: " + e.toString());
        } finally {
            request.getRequestDispatcher(url).include(request, response);

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
