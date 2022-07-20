/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sample.controller;

import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import sample.major.MajorDAO;
import sample.major.MajorDTO;
import sample.narrow.NarrowDAO;
import sample.narrow.NarrowDTO;
import sample.narrow.NarrowERROR;
import sample.validation.Validation;

/**
 *
 * @author Hoang Tam
 */
@WebServlet(name = "AddNarrowController", urlPatterns = {"/AddNarrowController"})
public class AddNarrowController extends HttpServlet {

    private static final String ERROR = "AddSpecialization.jsp";
    private static final String SUCCESS = "MainController?action=SearchNarrow&searchby=name";

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        String url = ERROR;
        try {
            boolean checkVaild = true;
            boolean checkCreateNarrow = false;
            NarrowERROR error = new NarrowERROR();
            String majorID = request.getParameter("majorID");
            String narrowID = request.getParameter("narrowID");
            String narrowName = request.getParameter("narrowName");
            String linkFLM = request.getParameter("linkFLM");
            String description = request.getParameter("description");
            NarrowDAO dao = new NarrowDAO();
            if (Validation.checkNarrowID(majorID, narrowID)) {
                error.setNarrowID("Dupplicate narrow ID!!");
                checkVaild = false;
            }
            if (narrowName.length() < 8 || narrowName.length() > 50) {
                error.setNarrowName("Length name is from 8 to 50!");
                checkVaild = false;
            }
            NarrowDTO narrow = new NarrowDTO(narrowID, narrowName, linkFLM, description, majorID);
            if (checkVaild) {
                checkCreateNarrow = dao.createNarrow(narrow);
                if (checkCreateNarrow) {
                    url = SUCCESS;
                    request.setAttribute("SUCCESS", "Create " + narrow.getNarrowID() + " successfully!!");
                }
            } else {
                request.setAttribute("ERROR", error);
                request.setAttribute("NARROW", narrow);
                MajorDAO majorDao = new MajorDAO();
                List<MajorDTO> listMajor = majorDao.getListMajor("");
                request.setAttribute("LIST_MAJOR", listMajor);
                request.setAttribute("CURRENT_MAJORID", majorID);
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
