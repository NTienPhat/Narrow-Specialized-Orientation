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
import sample.CreatedForm.CreatedFormDAO;
import sample.CreatedForm.CreatedFormDTO;
import sample.term.SemesterDAO;
import sample.term.SemesterDTO;

/**
 *
 * @author Hoang Tam
 */
@WebServlet(name = "GetListCreatedNarrowController", urlPatterns = {"/GetListCreatedNarrowController"})
public class GetListCreatedNarrowController extends HttpServlet {

    private final String ERROR = "CreatedRegisterForm.jsp";
    private final String SUCCESS = "CreatedRegisterForm.jsp";

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String url = ERROR;
        try {
            String semesterID = request.getParameter("semesterID");
            SemesterDAO semesterDao = new SemesterDAO();
            List<SemesterDTO> listSemester = semesterDao.getListSemester("");
            CreatedFormDAO dao = new CreatedFormDAO();
            int totalStudentOfSemester = dao.getTotalStudentOfSemester(semesterID);
            List<CreatedFormDTO> listCreatedForm = dao.getListCreatedNarrowFormBySemester(semesterID);
            request.setAttribute("LIST_SEMESTER", listSemester);
            request.setAttribute("CURRENT_SEMESTER", semesterID);
            if (listCreatedForm.size() > 0) {
                request.setAttribute("LIST_CREATEDFROM", listCreatedForm);
                request.setAttribute("TOTAL_STUDENT", totalStudentOfSemester);
                url = SUCCESS;
            } else {
                request.setAttribute("ERROR_FORMCREATED", "You don't create any form narrow for this semester!");
            }
        } catch (Exception e) {
            log("Error at GetListCreatedNarrowController: " + e.toString());
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
