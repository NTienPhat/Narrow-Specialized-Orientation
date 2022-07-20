/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sample.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import sample.student.StudentDAO;
import sample.student.StudentDTO;

/**
 *
 * @author Hoang Tam
 */
@WebServlet(name = "SearchStudentController", urlPatterns = {"/SearchStudentController"})
public class SearchStudentController extends HttpServlet {

    private static final String ERROR = "Student.jsp";
    private static final String SUCCESS = "Student.jsp";
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
            List<StudentDTO> listStudents = new ArrayList();
            StudentDAO dao = new StudentDAO();
            if (SEARCHBYNAME.equals(searchBy)) {
                listStudents = dao.getListStudents(search);
                request.setAttribute("NAME", "selected");

            } else if (SEARCHBYID.equals(searchBy)) {
                listStudents.add(dao.getStudent(search));
                request.setAttribute("ID", "selected");

            }
            if (listStudents.size() > 0) {
                request.setAttribute("LIST_Students", listStudents);
                url = SUCCESS;
            }
            request.setAttribute("SEARCH", search);
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
