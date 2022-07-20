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
import sample.RegisterAD.RegisterADDAO;
import sample.RegisterAD.RegisterADDTO;
import sample.major.MajorDAO;
import sample.major.MajorDTO;
import sample.narrow.NarrowDAO;
import sample.narrow.NarrowDTO;
import sample.term.SemesterDAO;
import sample.term.SemesterDTO;

/**
 *
 * @author Hoang Tam
 */
@WebServlet(name = "GetInformationForRegisterFormController", urlPatterns = {"/GetInformationForRegisterFormController"})
public class GetInformationForRegisterFormController extends HttpServlet {

    private static final String ERROR = "RegisterAD.jsp";
    private static final String SUCCESS = "RegisterAD.jsp";

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        String url = ERROR;
        try {
            String termCurrent = request.getParameter("termCurrent");
            MajorDAO majorDao = new MajorDAO();
            List<MajorDTO> listMajor = majorDao.getListMajor("");
            NarrowDAO narrowDao = new NarrowDAO();
            List<NarrowDTO> listNarrow = narrowDao.getListNarrow("");
            SemesterDAO semesterDao = new SemesterDAO();
            List<SemesterDTO> listSemester = semesterDao.getListSemester("");
            if(termCurrent == null || termCurrent.isEmpty()){
                termCurrent = listSemester.get(1).getSemesterID();
            }
            RegisterADDAO registerDao = new RegisterADDAO();
            List<RegisterADDTO> listRegisterAD = registerDao.getListSemester(termCurrent);
            boolean checklist = true;
            if (listMajor.size() == 0 || listNarrow.size() == 0 || listSemester.size() == 0) {
                checklist = false;
            }
            if (checklist) {
                if(!listRegisterAD.isEmpty()){
                    for (RegisterADDTO registerAD : listRegisterAD) {
                        for (int i = 0; i < listNarrow.size(); i++ ) {
                            if(listNarrow.get(i).getNarrowID().equals(registerAD.getNarrowID())){
                                listNarrow.get(i).setNarrowID(listNarrow.get(i).getNarrowID() + "-true");
                                continue;
                            }
                        }
                    }
                }
                request.setAttribute("LIST_MAJOR", listMajor);
                request.setAttribute("LIST_NARROW", listNarrow);
                request.setAttribute("LIST_SEMESTER", listSemester);
                request.setAttribute("LIST_RegisterForm", listRegisterAD);
                request.setAttribute("CURRENT_TERMID", termCurrent);
                url = SUCCESS;
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
