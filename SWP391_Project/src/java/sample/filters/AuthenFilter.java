///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package sample.filters;
//
//import java.io.IOException;
//import java.io.PrintStream;
//import java.io.PrintWriter;
//import java.io.StringWriter;
//import java.util.ArrayList;
//import java.util.List;
//import javax.servlet.Filter;
//import javax.servlet.FilterChain;
//import javax.servlet.FilterConfig;
//import javax.servlet.ServletException;
//import javax.servlet.ServletRequest;
//import javax.servlet.ServletResponse;
//import javax.servlet.annotation.WebFilter;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import javax.servlet.http.HttpSession;
//import sample.admin.AdminDTO;
//import sample.student.StudentDTO;
//
///**
// *
// * @author Hoang Tam
// */
//@WebFilter(filterName = "AuthenFilter", urlPatterns = {"/*"})
//public class AuthenFilter implements Filter {
//
//    private static List<String> US_RESOURCES;
//    private static List<String> AD_RESOURCES;
//    private static List<String> SP_RESOURCES;
//    private static List<String> NON_AUTHEN_RESOURCES;
//    private static final String ST = "ST";
//    private static final String SP = "SP";
//    private static final String AD = "AD";
//    private static final String LOGIN_PAGE = "HomePage.jsp";
//    private static final boolean debug = true;
//
//    // The filter configuration object we are associated with.  If
//    // this value is null, this filter instance is not currently
//    // configured. 
//    private FilterConfig filterConfig = null;
//
//    public AuthenFilter() {
//        //khai bao nhung resources ma quyen US duoc phep truy cap
//        US_RESOURCES = new ArrayList<>();
//        US_RESOURCES.add("StudentPage.jsp");
//        US_RESOURCES.add("UpdateInformation.jsp");
//        US_RESOURCES.add("ViewApplication.jsp");
//        US_RESOURCES.add("SendApplication.jsp");
//        US_RESOURCES.add("NarrowRegister.jsp");
//        US_RESOURCES.add("StudentRegisterStatus.jsp");
//        
//        SP_RESOURCES = new ArrayList<>();
//        SP_RESOURCES.add("SupportPage.jsp");
//        SP_RESOURCES.add("SupportPage_ViewAnswer.jsp");
//
//        //khai bao nhung resources ma ko can xac thuc phan quyen
//        AD_RESOURCES = new ArrayList<>();
//        AD_RESOURCES.add("adminPage.jsp");
//        AD_RESOURCES.add("AddMajor.jsp");
//        AD_RESOURCES.add("AddSpecialization.jsp");
//        AD_RESOURCES.add("CreatedRegisterForm.jsp");
//        AD_RESOURCES.add("CreatedFormUpdate.jsp");
//        AD_RESOURCES.add("AddStudent.jsp");
//        AD_RESOURCES.add("AddSupporter.jsp");
//        AD_RESOURCES.add("AddTerm.jsp");
//        AD_RESOURCES.add("Major.jsp");
//        AD_RESOURCES.add("NarrowRegister.jsp");
//        AD_RESOURCES.add("Student.jsp");
//        AD_RESOURCES.add("Supporter.jsp");
//        AD_RESOURCES.add("Term.jsp");
//        AD_RESOURCES.add("UpdateMajor.jsp");
//        AD_RESOURCES.add("UpdateSpecialization.jsp");
//        AD_RESOURCES.add("UpdateStudent.jsp");
//        AD_RESOURCES.add("UpdateSupporter.jsp");
//        AD_RESOURCES.add("UpdateTerm.jsp");
//        AD_RESOURCES.add("RegisterAD.jsp");
//        // khai boa nhung resources msa ko can xac thuc, phan quyen
//        NON_AUTHEN_RESOURCES = new ArrayList<>();
//        NON_AUTHEN_RESOURCES.add("Login.jsp");
//        NON_AUTHEN_RESOURCES.add("HomePage.jsp");
//        NON_AUTHEN_RESOURCES.add("HomePage_IT.jsp");
//        NON_AUTHEN_RESOURCES.add("HomePage_GD.jsp");
//        NON_AUTHEN_RESOURCES.add("HomePage_TTDPT.jsp");
//        NON_AUTHEN_RESOURCES.add("MainController");
//        NON_AUTHEN_RESOURCES.add("Footer.jsp");
//        NON_AUTHEN_RESOURCES.add("HeaderStudent");
//        NON_AUTHEN_RESOURCES.add("login-google");
//        NON_AUTHEN_RESOURCES.add("https://accounts.google.com/o/oauth2/auth?scope=email&redirect_uri=http://localhost:8080/SWP391_Project/login-google&response_type=code\n"
//                + "&client_id=87164938910-2onepbbjdpgpde3b4sevt3v2s549kcsq.apps.googleusercontent.com&approval_prompt=force");
//        NON_AUTHEN_RESOURCES.add(".gif");
//        NON_AUTHEN_RESOURCES.add(".jpg");
//        NON_AUTHEN_RESOURCES.add(".png");
//        NON_AUTHEN_RESOURCES.add(".jpeg");
//        NON_AUTHEN_RESOURCES.add(".css");
//        NON_AUTHEN_RESOURCES.add(".js");
//    }
//
//    private void doBeforeProcessing(ServletRequest request, ServletResponse response)
//            throws IOException, ServletException {
//        if (debug) {
//            log("AuthenFilter:DoBeforeProcessing");
//        }
//
//        // Write code here to process the request and/or response before
//        // the rest of the filter chain is invoked.
//        // For example, a logging filter might log items on the request object,
//        // such as the parameters.
//        /*
//	for (Enumeration en = request.getParameterNames(); en.hasMoreElements(); ) {
//	    String name = (String)en.nextElement();
//	    String values[] = request.getParameterValues(name);
//	    int n = values.length;
//	    StringBuffer buf = new StringBuffer();
//	    buf.append(name);
//	    buf.append("=");
//	    for(int i=0; i < n; i++) {
//	        buf.append(values[i]);
//	        if (i < n-1)
//	            buf.append(",");
//	    }
//	    log(buf.toString());
//	}
//         */
//    }
//
//    private void doAfterProcessing(ServletRequest request, ServletResponse response)
//            throws IOException, ServletException {
//        if (debug) {
//            log("AuthenFilter:DoAfterProcessing");
//        }
//
//        // Write code here to process the request and/or response after
//        // the rest of the filter chain is invoked.
//        // For example, a logging filter might log the attributes on the
//        // request object after the request has been processed. 
//        /*
//	for (Enumeration en = request.getAttributeNames(); en.hasMoreElements(); ) {
//	    String name = (String)en.nextElement();
//	    Object value = request.getAttribute(name);
//	    log("attribute: " + name + "=" + value.toString());
//	}
//         */
//        // For example, a filter might append something to the response.
//        /*
//	PrintWriter respOut = new PrintWriter(response.getWriter());
//	respOut.println("<P><B>This has been appended by an intrusive filter.</B>");
//         */
//    }
//
//    /**
//     *
//     * @param request The servlet request we are processing
//     * @param response The servlet response we are creating
//     * @param chain The filter chain we are processing
//     *
//     * @exception IOException if an input/output error occurs
//     * @exception ServletException if a servlet error occurs
//     */
//    public void doFilter(ServletRequest request, ServletResponse response,
//            FilterChain chain)
//            throws IOException, ServletException {
//
//        try {
//            HttpServletRequest req = (HttpServletRequest) request;
//            HttpServletResponse res = (HttpServletResponse) response;
//            String uri = req.getRequestURI();
//            int index = uri.lastIndexOf("/");
//            String requestResource = uri.substring(index + 1);
//            //neu request den non authen resources thi ko can xac thuc -> cho di tiep
//            for (String value : NON_AUTHEN_RESOURCES) {
//                if (uri.endsWith(".jsp") && value.equals(".js")) {
//                    continue;
//                }
//                if (uri.contains(value)) {
//                    chain.doFilter(request, response);
//                    return;
//                }
//            }
//            HttpSession session = req.getSession();
//            //xac thu uer da dang nhap hay chua? chua --> quay ve login
//            if (session == null || session.getAttribute("LOGIN_USER") == null) {
//                res.sendRedirect(LOGIN_PAGE);
//            } else {
//                boolean check = false;
//                AdminDTO loginUser = (AdminDTO) session.getAttribute("CHECK_AUTHORIZATION");
//                String roleID = loginUser.getRoleID();
//                if (AD.equals(roleID)) {
//                    for (String value : AD_RESOURCES) {
//                        if (requestResource.contains(value)) {
//                            chain.doFilter(request, response);
//                            check = true;
//                        }
//
//                    }
//                } else if (ST.equals(roleID)) {
//                    for (String value : US_RESOURCES) {
//                        if (requestResource.contains(value)) {
//                            chain.doFilter(request, response);
//                            check = true;
//                        }
//                    }
//                } else if (SP.equals(roleID)) {
//                    for (String value : SP_RESOURCES) {
//                        if (requestResource.contains(value)) {
//                            chain.doFilter(request, response);
//                            check = true;
//                        }
//                    }
//                } else {
//                    res.sendRedirect(LOGIN_PAGE);
//                }
//                if (!check) {
//                    res.sendRedirect(LOGIN_PAGE);
//                }
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//
//    /**
//     * Return the filter configuration object for this filter.
//     */
//    public FilterConfig getFilterConfig() {
//        return (this.filterConfig);
//    }
//
//    /**
//     * Set the filter configuration object for this filter.
//     *
//     * @param filterConfig The filter configuration object
//     */
//    public void setFilterConfig(FilterConfig filterConfig) {
//        this.filterConfig = filterConfig;
//    }
//
//    /**
//     * Destroy method for this filter
//     */
//    public void destroy() {
//    }
//
//    /**
//     * Init method for this filter
//     */
//    public void init(FilterConfig filterConfig) {
//        this.filterConfig = filterConfig;
//        if (filterConfig != null) {
//            if (debug) {
//                log("AuthenFilter:Initializing filter");
//            }
//        }
//    }
//
//    /**
//     * Return a String representation of this object.
//     */
//    @Override
//    public String toString() {
//        if (filterConfig == null) {
//            return ("AuthenFilter()");
//        }
//        StringBuffer sb = new StringBuffer("AuthenFilter(");
//        sb.append(filterConfig);
//        sb.append(")");
//        return (sb.toString());
//    }
//
//    private void sendProcessingError(Throwable t, ServletResponse response) {
//        String stackTrace = getStackTrace(t);
//
//        if (stackTrace != null && !stackTrace.equals("")) {
//            try {
//                response.setContentType("text/html");
//                PrintStream ps = new PrintStream(response.getOutputStream());
//                PrintWriter pw = new PrintWriter(ps);
//                pw.print("<html>\n<head>\n<title>Error</title>\n</head>\n<body>\n"); //NOI18N
//
//                // PENDING! Localize this for next official release
//                pw.print("<h1>The resource did not process correctly</h1>\n<pre>\n");
//                pw.print(stackTrace);
//                pw.print("</pre></body>\n</html>"); //NOI18N
//                pw.close();
//                ps.close();
//                response.getOutputStream().close();
//            } catch (Exception ex) {
//            }
//        } else {
//            try {
//                PrintStream ps = new PrintStream(response.getOutputStream());
//                t.printStackTrace(ps);
//                ps.close();
//                response.getOutputStream().close();
//            } catch (Exception ex) {
//            }
//        }
//    }
//
//    public static String getStackTrace(Throwable t) {
//        String stackTrace = null;
//        try {
//            StringWriter sw = new StringWriter();
//            PrintWriter pw = new PrintWriter(sw);
//            t.printStackTrace(pw);
//            pw.close();
//            sw.close();
//            stackTrace = sw.getBuffer().toString();
//        } catch (Exception ex) {
//        }
//        return stackTrace;
//    }
//
//    public void log(String msg) {
//        filterConfig.getServletContext().log(msg);
//    }
//
//}