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
import sample.term.SemesterDAO;
import sample.term.SemesterDTO;
import sample.term.SemesterERROR;

/**
 *
 * @author Admin
 */
@WebServlet(name = "UpdateTermController", urlPatterns = {"/UpdateTermController"})
public class UpdateTermController extends HttpServlet {

    private static final String ERROR = "MainController?action=SearchTerm";
    private static final String SUCCESS = "MainController?action=SearchTerm";
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        String url = ERROR;
        try {
            boolean checkVaild = true;
            boolean checkUpdate = false;
            SemesterERROR error = new SemesterERROR();
            String semesterID = request.getParameter("semesterID");
            String semesterName = request.getParameter("semesterName");
            SemesterDAO dao = new SemesterDAO();
            
            if (semesterName.length() > 13 || semesterName.length() < 0) {
                error.setSemesterName("Length name is < 12 characters");
                checkVaild = false;
            }

            if (checkVaild) {
                SemesterDTO semester = new SemesterDTO(semesterID, semesterName);
                checkUpdate = dao.updateSemester(semester);
                if (checkUpdate) {
                    url = SUCCESS;
                    request.setAttribute("SUCCESS", "Update "+ semester.getSemesterID() + " successfully!!");
                }
                request.setAttribute("SEMESTER", semester);
            } else {
                SemesterDTO semester = dao.getSemester(semesterID);
                request.setAttribute("ERROR", error);
                request.setAttribute("SEMESTER", semester);
            }
        } catch (Exception e) {
            log("Error at UpdateSemesterController: " + e.toString());
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
