/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sample.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Hoang Tam
 */
@MultipartConfig
public class MainController extends HttpServlet {

    private static final String ERROR="error.jsp";
    private static final String LOGIN="Login";
    private static final String LOGIN_CONTROLLER="LoginController";
    private static final String SEARCH="Search";
    private static final String SEARCH_CONTROLLER="SearchStudentController";
    private static final String DELETESTUDENT="deleteStudent";
    private static final String DELETE_CONTROLLER="DeleteStudentController";
    private static final String UPDATESTUDENT="UpdateStudent";
    private static final String UPDATESTUDENT_CONTROLLER="UpdateStudentController";
    private static final String PAGEUPDATESTUDENT="pageUpdateStudent";
    private static final String PAGEUPDATESTUDENT_CONTROLLER="PageUpdateStudentController";
    private static final String LOGOUT="Logout";
    private static final String LOGOUT_CONTROLLER="LogoutController";
    private static final String ADDSTUDENT="AddStudent";
    private static final String ADDSTUDENT_CONTROLLER="AddStudentController";
    private static final String VIEW="View";
    private static final String VIEW_CONTROLLER="viewCart.jsp";
    private static final String REMOVE="Remove";
    private static final String REMOVE_CONTROLLER="RemoveController";
    private static final String EDIT="Edit";
    private static final String EDIT_CONTROLLER="EditController";
    private static final String SEARCHFORUSER="SearchForUser";
    private static final String SEARCHFORUSER_CONTROLLER="SearchForUserController";
    private static final String DETAIL="Detail";
    private static final String DETAIL_CONTROLLER="DetailController";
    private static final String ADDTOCART="AddToCart";
    private static final String ADDTOCART_CONTROLLER="AddToCartController";
    private static final String VIEWCART="ViewCart";
    private static final String VIEWCART_CONTROLLER="ViewCartController";
    private static final String CHECKOUT="CheckOut";
    private static final String CHECKOUT_CONTROLLER="CheckOutController";
    private static final String SENDMAIL="SendMail";
    private static final String SENDMAIL_CONTROLLER="SendMailController";
    private static final String UPLOADFILEEXCEL="Upload";
    private static final String UPLOADFILEEXCEL_CONTROLLER="UploadFileExcelController";
    private static final String DOWNLOADFILEDEMO="DownloadFileDemo";
    private static final String DOWNLOADFILEDEMO_CONTROLLER="DownloadFileDemoController";
    
    private static final String ADDSUPPORTER="AddSupporter";
    private static final String ADDSUPPORTER_CONTROLLER="AddSupporterController";
    private static final String SEARCHSUPPORTER="SearchSupporter";
    private static final String SEARCHSUPPORTER_CONTROLLER="SearchSupporterController";
    private static final String DELETESUPPORTER="DeleteSupporter";
    private static final String DELETESUPPORTER_CONTROLLER="DeleteSupporterController";
    private static final String UPDATESUPPORTER="UpdateSupporter";
    private static final String UPDATESUPPORTER_CONTROLLER="UpdateSupporterController";
    private static final String PAGEUPDATESUPPORTER="PageUpdateSupporter";
    private static final String PAGEUPDATESUPPORTER_CONTROLLER="PageUpdateSupporterController";
    
    private static final String ADDMAJOR="AddMajor";
    private static final String ADDMAJOR_CONTROLLER="AddMajorController";
    private static final String SEARCHMAJOR="SearchMajor";
    private static final String SEARCHMAJOR_CONTROLLER="SearchMajorController";
    private static final String DELETEMAJOR="DeleteMajor";
    private static final String DELETEMAJOR_CONTROLLER="DeleteMajorController";
    private static final String UPDATEMAJOR="UpdateMajor";
    private static final String UPDATEMAJOR_CONTROLLER="UpdateMajorController";
    private static final String PAGEUPDATEMAJOR="PageUpdateMajor";
    private static final String PAGEUPDATEMAJOR_CONTROLLER="PageUpdateMajorController";
    
    private static final String ADDTERM="AddTerm";
    private static final String ADDTERM_CONTROLLER="AddTermController";
    private static final String SEARCHTERM="SearchTerm";
    private static final String SEARCHTERM_CONTROLLER="SearchTermController";
    private static final String DELETETERM="DeleteTerm";
    private static final String DELETETERM_CONTROLLER="DeleteTermController";
    private static final String UPDATETERM="UpdateTerm";
    private static final String UPDATETERM_CONTROLLER="UpdateTermController";
    private static final String PAGEUPDATETERM="PageUpdateTerm";
    private static final String PAGEUPDATETERM_CONTROLLER="PageUpdateTermController";
   
    private static final String ADDNARROW="AddNarrow";
    private static final String ADDNARROW_CONTROLLER="AddNarrowController";
    private static final String SEARCHNARROW="SearchNarrow";
    private static final String SEARCHNARROW_CONTROLLER="SearchNarrowController";
    private static final String DELETENARROW="DeleteNarrow";
    private static final String DELETENARROW_CONTROLLER="DeleteNarrowController";
    private static final String UPDATENARROW="UpdateNarrow";
    private static final String UPDATENARROW_CONTROLLER="UpdateNarrowController";
    private static final String PAGEUPDATENARROW="PageUpdateNarrow";
    private static final String PAGEUPDATENARROW_CONTROLLER="PageUpdateNarrowController";
    private static final String PAGEADDNARROW="PageAddNarrow";
    private static final String PAGEADDNARROW_CONTROLLER="PageAddNarrowController";
    
    private static final String GETINFORMATIONFORREGISTERFORM="GetInformationForRegisterForm";
    private static final String GETINFORMATIONFORREGISTERFORM_CONTROLLER="GetInformationForRegisterFormController";
    private static final String MAKEFORMREGISTER="MakeFormRegister";
    private static final String MAKEFORMREGISTER_CONTROLLER="MakeFormRegisterController";
    
    private static final String UPDATESTUDENTINFORMATION="UpdateStudentInformation";
    private static final String UPDATESTUDENTINFORMATION_CONTROLLER="UpdateStudentInformationController";
    
    private static final String SENDMESS="SendMess";
    private static final String SENDMESS_CONTROLLER="SendMessController";
    
    private static final String FORMREGISTERNARROW="FormRegisterNarrow";
    private static final String FORMREGISTERNARROW_CONTROLLER="FormRegisterNarrowController";
    private static final String REGISTERNARROW="RegisterNarrow";
    private static final String REGISTERNARROW_CONTROLLER="RegisterNarrowController";
    
    private static final String GETSEMESTERFORCREATEDREGUSTERFORM="GetSemesterForCreatedRegisterForm";
    private static final String GETSEMESTERFORCREATEDREGUSTERFORM_CONTROLLER="GetSemesterForCreatedRegisterFormController";
    private static final String GETLISTCREATENARROW="GetListCreatedNarrow";
    private static final String GETLISTCREATENARROW_CONTROLLER="GetListCreatedNarrowController";
    private static final String APCCEPTREGISTEROFSTUDENT="AcceptRegisterOfStudent";
    private static final String APCCEPTREGISTEROFSTUDENT_CONTROLLER="AcceptRegisterOfStudentController";
    
    private static final String VIEWQUESTION="ViewQuestion";
    private static final String VIEWQUESTION_CONTROLLER="ViewQuestionController";
    private static final String REPLY="Reply";
    private static final String REPLY_CONTROLLER="ReplyController";
    private static final String PAGEADDMAJOR="PageAddMajor";
    private static final String PAGEADDMAJOR_CONTROLLER="PageAddMajorController";
    private static final String PAGEADDSTUDENT="PageAddStudent";
    private static final String PAGEADDSTUDENT_CONTROLLER="PageAddStudentController";
    private static final String PAGEADDSUPPORTER="PageAddSupporter";
    private static final String PAGEADDSUPPORTER_CONTROLLER="PageAddSupporterController";
    private static final String PAGEADDTERM="PageAddTerm";
    private static final String PAGEADDTERM_CONTROLLER="PageAddTermController";
    
    private static final String VIEWAPPLICATION="ViewApplication";
    private static final String VIEWAPPLICATION_CONTROLLER="ViewApplicationController";
    private static final String VIEWREGISTEDSTATUS="ViewRegistedStatus";
    private static final String VIEWREGISTEDSTATUS_CONTROLLER="ViewRegistedStatusController";
    private static final String VIEWANSWER="ViewAnswer";
    private static final String VIEWANSWER_CONTROLLER="ViewAnswerController";
    private static final String CHANGEDATE="ChangeDate";
    private static final String CHANGEDATE_CONTROLLER="ChangeDateController";
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        String url = ERROR;
        try {
            String action= request.getParameter("action");
            if(LOGIN.equals(action)){
                url=LOGIN_CONTROLLER;
            }else if(SEARCH.equals(action)){
                    url= SEARCH_CONTROLLER;
            
            }else if(DELETESTUDENT.equals(action)){
                    url= DELETE_CONTROLLER;
            
            }else if(UPDATESTUDENT.equals(action)){
                    url= UPDATESTUDENT_CONTROLLER;
            }
            else if(PAGEUPDATESTUDENT.equals(action)){
                    url= PAGEUPDATESTUDENT_CONTROLLER;
            }
            else if(UPLOADFILEEXCEL.equals(action)){
                    url= UPLOADFILEEXCEL_CONTROLLER;
            }
            else if(LOGOUT.equals(action)){
                    url= LOGOUT_CONTROLLER;
            }
            else if(ADDSTUDENT.equals(action)){
                    url= ADDSTUDENT_CONTROLLER;
            }
            
            else if(VIEW.equals(action)){
                    url= VIEW_CONTROLLER;
            }
            else if(REMOVE.equals(action)){
                    url= REMOVE_CONTROLLER;
            }
            else if(EDIT.equals(action)){
                    url= EDIT_CONTROLLER;
            }
            else if(SEARCHFORUSER.equals(action)){
                    url= SEARCHFORUSER_CONTROLLER;
            }
            else if(DETAIL.equals(action)){
                    url= DETAIL_CONTROLLER;
            }
            else if(ADDTOCART.equals(action)){
                    url= ADDTOCART_CONTROLLER;
            }
            else if(VIEWCART.equals(action)){
                    url= VIEWCART_CONTROLLER;
            }
            else if(CHECKOUT.equals(action)){
                    url= CHECKOUT_CONTROLLER;
            }
            else if(SENDMAIL.equals(action)){
                    url= SENDMAIL_CONTROLLER;
            }
            else if(ADDSUPPORTER.equals(action)){
                    url= ADDSUPPORTER_CONTROLLER;
            }
            else if(SEARCHSUPPORTER.equals(action)){
                    url= SEARCHSUPPORTER_CONTROLLER;
            }
            else if(UPDATESUPPORTER.equals(action)){
                    url= UPDATESUPPORTER_CONTROLLER;
            }
            else if(PAGEUPDATESUPPORTER.equals(action)){
                    url= PAGEUPDATESUPPORTER_CONTROLLER;
            }
            else if(DELETESUPPORTER.equals(action)){
                    url= DELETESUPPORTER_CONTROLLER;
            }
            else if(ADDMAJOR.equals(action)){
                    url= ADDMAJOR_CONTROLLER;
            }
            else if(SEARCHMAJOR.equals(action)){
                    url= SEARCHMAJOR_CONTROLLER;
            }
            else if(DELETEMAJOR.equals(action)){
                    url= DELETEMAJOR_CONTROLLER;
            }
            else if(UPDATEMAJOR.equals(action)){
                    url= UPDATEMAJOR_CONTROLLER;
            }
            else if(PAGEUPDATEMAJOR.equals(action)){
                    url= PAGEUPDATEMAJOR_CONTROLLER;
            }
            else if(ADDTERM.equals(action)){
                    url= ADDTERM_CONTROLLER;
            }
            else if(SEARCHTERM.equals(action)){
                    url= SEARCHTERM_CONTROLLER;
            }
            else if(DELETETERM.equals(action)){
                    url= DELETETERM_CONTROLLER;
            }
            else if(UPDATETERM.equals(action)){
                    url= UPDATETERM_CONTROLLER;
            }
            else if(PAGEUPDATETERM.equals(action)){
                    url= PAGEUPDATETERM_CONTROLLER;
            }
            else if(SEARCHNARROW.equals(action)){
                    url= SEARCHNARROW_CONTROLLER;
            }
            else if(UPDATENARROW.equals(action)){
                    url= UPDATENARROW_CONTROLLER;
            }
            else if(PAGEUPDATENARROW.equals(action)){
                    url= PAGEUPDATENARROW_CONTROLLER;
            }
            else if(DELETENARROW.equals(action)){
                    url= DELETENARROW_CONTROLLER;
            }
            else if(PAGEADDNARROW.equals(action)){
                    url= PAGEADDNARROW_CONTROLLER;
            }
            else if(ADDNARROW.equals(action)){
                    url= ADDNARROW_CONTROLLER;
            }
            else if(GETINFORMATIONFORREGISTERFORM.equals(action)){
                    url= GETINFORMATIONFORREGISTERFORM_CONTROLLER;
            }
            else if(MAKEFORMREGISTER.equals(action)){
                    url= MAKEFORMREGISTER_CONTROLLER;
            }
            else if(UPDATESTUDENTINFORMATION.equals(action)){
                    url= UPDATESTUDENTINFORMATION_CONTROLLER;
            }
            else if(SENDMESS.equals(action)){
                    url= SENDMESS_CONTROLLER;
            }
            else if(FORMREGISTERNARROW.equals(action)){
                    url= FORMREGISTERNARROW_CONTROLLER;
            }
            else if(REGISTERNARROW.equals(action)){
                    url= REGISTERNARROW_CONTROLLER;
            }
            else if(GETSEMESTERFORCREATEDREGUSTERFORM.equals(action)){
                    url= GETSEMESTERFORCREATEDREGUSTERFORM_CONTROLLER;
            }
            else if(GETLISTCREATENARROW.equals(action)){
                    url= GETLISTCREATENARROW_CONTROLLER;
            }
            else if(APCCEPTREGISTEROFSTUDENT.equals(action)){
                    url= APCCEPTREGISTEROFSTUDENT_CONTROLLER;
            }
            else if(DOWNLOADFILEDEMO.equals(action)){
                    url= DOWNLOADFILEDEMO_CONTROLLER;
            }
            else if(VIEWQUESTION.equals(action)){
                    url= VIEWQUESTION_CONTROLLER;
            }
            else if(REPLY.equals(action)){
                    url= REPLY_CONTROLLER;
            }
            else if(PAGEADDMAJOR.equals(action)){
                    url= PAGEADDMAJOR_CONTROLLER;
            }
            else if(PAGEADDSUPPORTER.equals(action)){
                    url= PAGEADDSUPPORTER_CONTROLLER;
            }
            else if(PAGEADDSTUDENT.equals(action)){
                    url= PAGEADDSTUDENT_CONTROLLER;
            }
            else if(PAGEADDTERM.equals(action)){
                    url= PAGEADDTERM_CONTROLLER;
            }
            else if(VIEWAPPLICATION.equals(action)){
                    url= VIEWAPPLICATION_CONTROLLER;
            }
            else if(VIEWREGISTEDSTATUS.equals(action)){
                    url= VIEWREGISTEDSTATUS_CONTROLLER;
            }
            else if(VIEWANSWER.equals(action)){
                    url= VIEWANSWER_CONTROLLER;
            }
            else if(CHANGEDATE.equals(action)){
                    url= CHANGEDATE_CONTROLLER;
            }
        } catch (Exception e) {
            log("Error at MainController: "+ e.toString());
        }finally{
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
