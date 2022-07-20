/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sample.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import sample.student.StudentDAO;
import sample.student.StudentDTO;
import sample.student.StudentERROR;
import sample.validation.Validation;

/**
 *
 * @author Hoang Tam
 */
@WebServlet(name = "AddStudentController", urlPatterns = {"/AddStudentController"})
public class AddStudentController extends HttpServlet {

    private static final String ERROR = "AddStudent.jsp";
    private static final String SUCCESS = "MainController?action=Search&searchby=name";

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String url = ERROR;
        try {
            boolean checkVaild = true;
            boolean checkCreateUser = false;
            boolean checkCreateStudent = false;
            StudentERROR error = new StudentERROR();
            String userID = request.getParameter("userID");
            String name = request.getParameter("name");
            String email = request.getParameter("email");
            String phone = request.getParameter("phoneNumber");
            String address = request.getParameter("address");
            String semesterID = request.getParameter("semesterID");
            String majorID = request.getParameter("majorID");
            String narrowID = request.getParameter("narrowID");
            StudentDAO dao = new StudentDAO();
            if (Validation.checkDuplicateUserID(userID)) {
                error.setUserID("The ID is duplicate!!!");
                checkVaild = false;
            }
            if (!Validation.checkVaildEmail(email)) {
                error.setEmail("The email is ivalid!");
                checkVaild = false;
            }
            if (Validation.checkDuplicateEmail(email)) {
                error.setEmail("The email is duplicated!");
                checkVaild = false;
            }
            if (name.length() < 8 || name.length() > 50) {
                error.setName("Length name is form 8 to 50!");
                checkVaild = false;
            }
            if (!Validation.checkPhone(phone)) {
                error.setPhoneNumber("The phone number is invalid!");
                checkVaild = false;
            }
            if (!Validation.checkSemesterID(semesterID)) {
                error.setSemesterID("Semester ID is invalid!");
                checkVaild = false;
            }
            if (!Validation.checkMajorID(majorID)) {
                error.setMajorID("Major ID is invalid!");
                checkVaild = false;
            } else {
                if (!Validation.checkNarrowID(majorID, narrowID)) {
                    error.setNarrowID("Narrow ID is invalid!");
                    checkVaild = false;
                }
            }
            StudentDTO student = new StudentDTO(userID, name, email, phone, address, userID, semesterID, majorID, narrowID);
            if (checkVaild) {
                checkCreateUser = dao.createUser(student);
                if (checkCreateUser) {
                    checkCreateStudent = dao.createStudent(student);
                    if (checkCreateStudent) {
                        url = SUCCESS;
                        request.setAttribute("SUCCESS", "Create " + student.getUserID() + " successfully!!");
                    }
                }
            } else {
                request.setAttribute("ERROR", error);
                request.setAttribute("STUDENT", student);
            }
        } catch (Exception e) {
            log("Error at UpdateStudentController: " + e.toString());
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
