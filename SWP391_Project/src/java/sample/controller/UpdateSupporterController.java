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
import sample.supporter.SupporterDAO;
import sample.supporter.SupporterDTO;
import sample.supporter.SupporterERROR;
import sample.validation.Validation;

/**
 *
 * @author Admin
 */
@WebServlet(name = "UpdateSupporterController", urlPatterns = {"/UpdateSupporterController"})
public class UpdateSupporterController extends HttpServlet {

    private static final String ERROR = "UpdateSupporter.jsp";
    private static final String SUCCESS = "MainController?action=SearchSupporter&searchby=name";
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        String url = ERROR;
        try {
            boolean checkVaild = true;
            boolean checkUpdate = false;
            SupporterERROR error = new SupporterERROR();
            String userID = request.getParameter("userID");
            String name = request.getParameter("name");
            String email = request.getParameter("email");
            String phone = request.getParameter("phoneNumber");
            String address = request.getParameter("address");
            String majorID = request.getParameter("majorID");
            SupporterDAO dao = new SupporterDAO();

            if (name.length() < 8 || name.length() > 50) {
                error.setName("Length name is form 8 to 50!");
                checkVaild = false;
            }
            if (!Validation.checkPhone(phone)) {
                error.setPhoneNumber("The phone number is invalid!");
                checkVaild = false;
            }
            if (!Validation.checkMajorID(majorID)) {
                error.setMajorID("Major ID is invalid!");
                checkVaild = false;
            }
            
            if (checkVaild) {
                SupporterDTO supporter = new SupporterDTO(userID, name, email, phone, address, userID, majorID);
                checkUpdate = dao.updateSupporter(supporter);
                if (checkUpdate) {
                        url = SUCCESS;
                        request.setAttribute("SUCCESS", "Update " + supporter.getUserID() + " successfully!!");
                }
                request.setAttribute("SUPPORTER", supporter);
            } else {
                SupporterDTO supporter = dao.getSupporter(userID);
                request.setAttribute("ERROR", error);
                request.setAttribute("SUPPORTER", supporter);
            }
        } catch (Exception e) {
            log("Error at UpdateSupporterController: " + e.toString());
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
