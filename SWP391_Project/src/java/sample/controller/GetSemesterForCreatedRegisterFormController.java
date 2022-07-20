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
import sample.term.SemesterDAO;
import sample.term.SemesterDTO;

/**
 *
 * @author Hoang Tam
 */
@WebServlet(name = "GetSemesterForCreatedRegisterFormController", urlPatterns = {"/GetSemesterForCreatedRegisterFormController"})
public class GetSemesterForCreatedRegisterFormController extends HttpServlet {

    private final String ERROR = "CreatedRegisterForm.jsp";
    private final String SUCCESS = "CreatedRegisterForm.jsp";

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        String url = ERROR;
        try {
            SemesterDAO dao = new SemesterDAO();
            List<SemesterDTO> listSemester = dao.getListSemester("");
            if(listSemester.size() > 0){
                request.setAttribute("LIST_SEMESTER", listSemester);
                url = SUCCESS;
            }else{
                request.setAttribute("ERROR", "Don't have any semester exist!");
            }
        } catch (Exception e) {
            log("Error at GetSemesterForCreatedRegisterFormController: "  + e.toString());
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
