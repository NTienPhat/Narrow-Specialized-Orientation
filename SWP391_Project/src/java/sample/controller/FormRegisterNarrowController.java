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
import sample.RegisterAD.RegisterADDAO;
import sample.RegisterAD.RegisterADDTO;
import sample.RegisterDetail.RegisterDetailDAO;
import sample.major.MajorDAO;
import sample.major.MajorDTO;
import sample.narrow.NarrowDAO;
import sample.narrow.NarrowDTO;
import sample.student.StudentDAO;
import sample.student.StudentDTO;

/**
 *
 * @author Hoang Tam
 */
@WebServlet(name = "FormRegisterNarrowController", urlPatterns = {"/FormRegisterNarrowController"})
public class FormRegisterNarrowController extends HttpServlet {

    private final String ERROR = "NarrowRegister.jsp";
    private final String SUCCESS = "NarrowRegister.jsp";

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String url = ERROR;
        HttpSession session = request.getSession();
        try {
            StudentDTO student = (StudentDTO) session.getAttribute("LOGIN_USER");
            if (student != null) {
                String userID = student.getUserID();
                RegisterADDAO daoRegister = new RegisterADDAO();
                RegisterDetailDAO daoRegisterDetail = new RegisterDetailDAO();
                boolean checkStudentRegisted = daoRegisterDetail.checkRegisted(userID);
                if (!checkStudentRegisted) {
                    MajorDAO majorDAO = new MajorDAO();
                    MajorDTO major = majorDAO.getMajor(student.getMajorID());
                    String semesterID = student.getSemesterID();
                    List<RegisterADDTO> ListRegister = daoRegister.getListRegiterByTermAndMajor(semesterID, student.getMajorID());
                    if (major != null && ListRegister.size() != 0) {
                        request.setAttribute("MAJOR", major);
                        request.setAttribute("LIST_NARROW", ListRegister);
                        url = SUCCESS;
                    } else {
                        request.setAttribute("ERROR", "Have something wrong please contact with admin!");
                    }
                } else {
                    request.setAttribute("ERROR", "You are registed narrow specialization");

                }
            }
        } catch (Exception e) {
            log("Error at FormRegisterNarrowController: " + e.toString());
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
