/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sample.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import sample.supporter.SupporterDAO;
import sample.supporter.SupporterDTO;

/**
 *
 * @author Admin
 */
@WebServlet(name = "SearchSupporterController", urlPatterns = {"/SearchSupporterController"})
public class SearchSupporterController extends HttpServlet {

    private static final String ERROR = "Supporter.jsp";
    private static final String SUCCESS = "Supporter.jsp";
    private static final String SEARCHBYNAME = "name";
    private static final String SEARCHBYID = "id";

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        String url = ERROR;
        try {
            String search = request.getParameter("search");
            String searchBy = request.getParameter("searchby");
            if (search == null) {
                search = "";
            }
            SupporterDAO dao = new SupporterDAO();
            List<SupporterDTO> listSupporters = new ArrayList();
            if (searchBy.equals(SEARCHBYNAME)) {
                listSupporters = dao.getListSupporterts(search);
                request.setAttribute("NAME", "selected");
            } else if (searchBy.equals(SEARCHBYID)) {
                SupporterDTO supporter = dao.getSupporter(search);
                listSupporters.add(supporter);
                request.setAttribute("ID", "selected");
            }
            if (listSupporters.size() > 0) {
                request.setAttribute("LIST_Supporters", listSupporters);
                request.setAttribute("SEARCH", search);
                url = SUCCESS;
            }
        } catch (Exception e) {
            log("Error at SearchController: " + e.toString());
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
