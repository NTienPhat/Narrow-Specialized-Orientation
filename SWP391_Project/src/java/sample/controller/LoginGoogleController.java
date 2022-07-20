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
import javax.servlet.http.HttpSession;
import sample.admin.AdminDAO;
import sample.admin.AdminDTO;
import sample.google.GooglePojo;
import sample.student.StudentDAO;
import sample.student.StudentDTO;
import sample.supporter.SupporterDAO;
import sample.supporter.SupporterDTO;
import sample.utils.GoogleUtils;

/**
 *
 * @author Hoang Tam
 */
@WebServlet(name = "LoginGoogleController", urlPatterns = {"/login-google"})
public class LoginGoogleController extends HttpServlet {

    private static final String ERROR = "Login.jsp";
    private static final long serialVersionUID = 1L;
    private static final String AD = "AD";
    private static final String ADMIN_PAGE = "adminPage.jsp";
    private static final String ST = "ST";
    private static final String STUDENT_PAGE = "StudentPage.jsp";
    private static final String SP = "SP";
    private static final String SUPPORT_PAGE = "MainController?action=ViewQuestion";

    public LoginGoogleController() {
        super();
    }

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        String url = ERROR;
        HttpSession session = request.getSession();
        try {
            String code = request.getParameter("code");
            if (code == null || code.isEmpty()) {
                url = ERROR;
            } else {
                String accessToken = GoogleUtils.getToken(code);
                GooglePojo googlePojo = GoogleUtils.getUserInfo(accessToken);
                AdminDAO dao = new AdminDAO();
                AdminDTO user = dao.checkLoginGoogle(googlePojo.getEmail());
                if (user != null) {
                    String roleID = user.getRoleID().trim();
                    if (AD.equals(roleID)) {
                        url = ADMIN_PAGE;
                        session.setAttribute("LOGIN_USER", user);

                    } else if (ST.equals(roleID)) {
                        url = STUDENT_PAGE;
                        StudentDAO stdao = new StudentDAO();
                        StudentDTO std = stdao.getStudent(user.getUserID());
                        session.setAttribute("LOGIN_USER", std);
                    } else if (SP.equals(roleID)) {
                        url = SUPPORT_PAGE;
                        SupporterDAO spdao = new SupporterDAO();
                        SupporterDTO sp = spdao.getSupporter(user.getUserID());
                        session.setAttribute("LOGIN_USER", sp);
                    }
                    session.setAttribute("CHECK_AUTHORIZATION", user);
                }else{
                    request.setAttribute("ERROR", "Your account can't login to system!");
                }
            }
        } catch (Exception e) {
            log("Error at LoginGoogleController: " + e);
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
