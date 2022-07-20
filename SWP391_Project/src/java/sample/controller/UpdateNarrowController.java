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
import sample.narrow.NarrowDAO;
import sample.narrow.NarrowDTO;
import sample.narrow.NarrowERROR;

/**
 *
 * @author Hoang Tam
 */
@WebServlet(name = "UpdateNarrowController", urlPatterns = {"/UpdateNarrowController"})
public class UpdateNarrowController extends HttpServlet {
private static final String ERROR = "UpdateSpecialization.jsp";
    private static final String SUCCESS = "MainController?action=SearchNarrow&searchby=name";
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        String url = ERROR;
        try {
            boolean checkVaild = true;
            boolean checkUpdate = false;
            NarrowERROR error = new NarrowERROR();
            String narrowName = request.getParameter("narrowName");
            String narrowID = request.getParameter("narrowID");
            String linkFLM = request.getParameter("linkFLM");
            String description = request.getParameter("description");
            NarrowDAO dao = new NarrowDAO();
            
            if (narrowName.length() < 8 || narrowName.length() > 50) {
                error.setNarrowName("Length name is form 8 to 50!");
                checkVaild = false;
            }
            

            if (checkVaild) {
                NarrowDTO narrow = new NarrowDTO(narrowID, narrowName, linkFLM, description, "");
                checkUpdate = dao.updateNarrow(narrow);
                if (checkUpdate) {
                    url = SUCCESS;
                    request.setAttribute("SUCCESS", "Update "+ narrow.getNarrowID()+ " successfully!!");
                }
                request.setAttribute("MAJOR", narrow);
            } else {
                NarrowDTO narrow = dao.getNarrow(narrowID);
                request.setAttribute("ERROR", error);
                request.setAttribute("MAJOR", narrow);
            }
        } catch (Exception e) {
            log("Error at UpdateNarrowController: " + e.toString());
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
