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
import sample.major.MajorDAO;
import sample.major.MajorDTO;
import sample.major.MajorERROR;
import sample.validation.Validation;

/**
 *
 * @author Admin
 */
@WebServlet(name = "AddMajorController", urlPatterns = {"/AddMajorController"})
public class AddMajorController extends HttpServlet {
    private static final String ERROR = "AddMajor.jsp";
    private static final String SUCCESS = "SearchMajorController";
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        String url = ERROR;
        try {
            boolean checkVaild = true;
            boolean checkCreateMajor = false;
            MajorERROR error = new MajorERROR();
            String majorID = request.getParameter("majorID");
            String majorName = request.getParameter("majorName");
            String linkFLM = request.getParameter("linkFLM");
            String description = request.getParameter("description");
            MajorDAO dao = new MajorDAO();

            if (Validation.checkMajorID(majorID)) {
                error.setMajorID("Major ID has existed!");
                checkVaild = false;
            }
            if (majorName.length() < 8 || majorName.length() > 50) {
                error.setMajorName("Length name is from 8 to 50!");
                checkVaild = false;
            }
            if (description.length() < 8 || description.length() > 50) {
                error.setDescription("Length description is from 8 to 50!");
                checkVaild = false;
            }
            
            MajorDTO major = new MajorDTO(majorID, majorName, linkFLM, description);
            if (checkVaild) {      
                    checkCreateMajor = dao.createMajor(major);
                    if (checkCreateMajor) {
                        url = SUCCESS;
                        request.setAttribute("SUCCESS", "Create " + major.getMajorID() + " successfully!!");
                    }
            } else {
                request.setAttribute("ERROR", error);
                request.setAttribute("MAJOR", major);
            }
        } catch (Exception e) {
            log("Error at UpdateMajorController: " + e.toString());
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
