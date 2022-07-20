/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sample.controller;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.nio.file.Files;
import static java.nio.file.Files.list;
import java.nio.file.Path;
import java.nio.file.Paths;
import static java.util.Collections.list;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;
import sample.student.ReadExcelStudent;
import sample.student.StudentDTO;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import sample.student.StudentDAO;

@MultipartConfig
@WebServlet(name = "UploadFileExcelController", urlPatterns = {"/UploadFileExcelController"})

public class UploadFileExcelController extends HttpServlet {

    private static final String ERROR = "MainController?action=Search&searchby=name";
    private static final String SUCCESS = "MainController?action=Search&searchby=name";

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        //fetch form data
        String url = ERROR;
        try {
            Part part = request.getPart("file");
            String realPath = request.getServletContext().getRealPath("/excel-file");
            String fileName = Paths.get(part.getSubmittedFileName()).getFileName().toString();
            String error = "";
            if (fileName.endsWith("xlsx")) {
                if (!Files.exists(Paths.get(realPath))) {
                    Files.createDirectory(Paths.get(realPath));
                }
                String excelFilePath = realPath + "/" + fileName;
                part.write(excelFilePath);
                ReadExcelStudent readFile = new ReadExcelStudent();
                List<StudentDTO> students = readFile.readExcel(excelFilePath);
                StudentDAO dao = new StudentDAO();
                for (StudentDTO student : students) {
                    boolean check = dao.createUser(student);
                    if (check) {
                        dao.createStudent(student);
                    }
                }
                Files.deleteIfExists(Paths.get(excelFilePath));
                url = SUCCESS;
            }else{
                error = "File need is excel file!";
                request.setAttribute("ERROR", error);
            }
        } catch (Exception e) {
            log("Error at UploadFileExcelController: " + e.toString());
        } finally {
            request.getRequestDispatcher(url).forward(request, response);
        }

    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    // </editor-fold>
}
