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
import javax.servlet.http.HttpSession;
import sample.RegisterDetail.RegisterDetailDAO;
import sample.RegisterDetail.RegisterDetailDTO;
import sample.student.StudentDTO;
import sample.validation.Validation;

/**
 *
 * @author Hoang Tam
 */
@WebServlet(name = "RegisterNarrowController", urlPatterns = {"/RegisterNarrowController"})
public class RegisterNarrowController extends HttpServlet {

    private final String ERROR = "MainController?action=FormRegisterNarrow";
    private final String SUCCESS = "MainController?action=FormRegisterNarrow";

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String url = ERROR;
        HttpSession session = request.getSession();
        try {
            StudentDTO student = (StudentDTO) session.getAttribute("LOGIN_USER");
            if (student != null) {
                String userID = student.getUserID();
                int registerID = Integer.parseInt(request.getParameter("narrowRegister"));
                RegisterDetailDTO registerST = new RegisterDetailDTO(null, userID, registerID, "");
                RegisterDetailDAO dao = new RegisterDetailDAO();
                boolean checkReject = dao.checkRegistedReject(userID);
                if (!checkReject) {
                    boolean checkRegister = dao.createRegisterByST(registerST);
                    if (checkRegister) {
                        request.setAttribute("SUCCESS", "Registed success!!");
                        url = SUCCESS;
                    } else {
                        request.setAttribute("ERROR", "Something wrong please contact with admin to support!");
                    }
                } else {
                    boolean checkUpdate = dao.updateNarrowForSTRJ(registerST);
                    if (checkUpdate) {
                        request.setAttribute("SUCCESS", "Registed success!!");
                        url = SUCCESS;
                    } else {
                        request.setAttribute("ERROR", "Something wrong please contact with admin to support!");

                    }
                }
            }
        } catch (Exception e) {
            log("Error at RegisterNarrowController: " + e.toString());
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
