/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sample.controller;

import java.io.IOException;
import java.sql.Timestamp;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import sample.RegisterAD.RegisterADDAO;
import sample.RegisterAD.RegisterADDTO;
import sample.RegisterAD.RegisterADERROR;
import sample.major.MajorDAO;
import sample.major.MajorDTO;
import sample.validation.Validation;

/**
 *
 * @author Hoang Tam
 */
@WebServlet(name = "MakeFormRegisterController", urlPatterns = {"/MakeFormRegisterController"})
public class MakeFormRegisterController extends HttpServlet {

    private String ERROR = "MainController?action=GetInformationForRegisterForm&termCurrent=";
    private String SUCCESS = "MainController?action=GetInformationForRegisterForm&termCurrent=";

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        String termID = request.getParameter("term").substring(64);
        ERROR = "MainController?action=GetInformationForRegisterForm&termCurrent=" + termID;
        String url = ERROR;
        try {
            String startDateString = request.getParameter("startDate");
            String endDateString = request.getParameter("endDate");
            SUCCESS = "MainController?action=GetInformationForRegisterForm&termCurrent=" + termID;
            Timestamp startDate = Validation.dateStringToTimestamp(startDateString);
            Timestamp endDate = Validation.dateStringToTimestamp(endDateString);
            Timestamp currentDate = Validation.takeCurrentDate();
            boolean checkValid = true;
            RegisterADERROR error = new RegisterADERROR();
            if (startDate != null ) {
                if (Validation.compareDate(startDate, currentDate) == -1) {
                    error.setImportDate("The start date need greater than or equal current date!!");
                    checkValid = false;
                }
            } else {
                error.setImportDate("Please fill start date!");
                checkValid = false;
            }
            if (endDate != null) {
                if (Validation.compareDate(endDate, startDate) == -1 || Validation.compareDate(endDate, startDate) == 0) {
                    error.setUsingDate("The end date need greater than  start date!!");
                    checkValid = false;
                }
            } else {
                error.setUsingDate("Please fill end date!");
                checkValid = false;
            }
            if (checkValid) {
                MajorDAO majorDao = new MajorDAO();
                List<MajorDTO> listMajor = majorDao.getListMajor("");
                RegisterADDAO dao = new RegisterADDAO();
                String mjID = "";
                String a[] = null;
                boolean checkVaildCreate = true;
                RegisterADDTO registerAD = new RegisterADDTO();
                for (MajorDTO major : listMajor) {
                    mjID = major.getMajorID();
                    a = request.getParameterValues(mjID);
                    if (a != null) {
                        for (String nwID : a) {
                            if (nwID.equals("true")) {
                                continue;
                            }
                            registerAD = new RegisterADDTO(0, mjID, nwID, termID, startDate, endDate, 20);
                            checkVaildCreate = dao.createSemester(registerAD);
                        }
                    }
                }
                if (checkVaildCreate) {
                    url = SUCCESS;
                }
            } else {
                request.setAttribute("ERROR", error);
            }
        } catch (Exception e) {
            log("error at DeleteController: " + e.toString());
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
