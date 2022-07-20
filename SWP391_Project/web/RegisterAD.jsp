<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@page import="sample.term.SemesterDTO"%>
<%@page import="java.util.List"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%-- 
    Document   : RegisterAD
    Created on : Jun 10, 2022, 10:57:32 AM
    Author     : lamtr
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>

        <title>Register Admin Page</title>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <meta http-equiv="x-ua-compatible" content="ie=edge">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js"></script>
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
        <link rel="stylesheet" href="node_modules/bootstrap/dist/css/bootstrap.min.css">
        <link rel="stylesheet" href="node_modules/font-awesome/css/font-awesome.min.css">
        <link rel="stylesheet" href="css/bootstrap-social.css">

    </head>

    <body class="sb-nav-fixed jumbotron">

        <%@include file="Header.jsp" %>

        <div id="layoutSidenav_content">
            <%
                List<SemesterDTO> listSemeter = (List<SemesterDTO>) request.getAttribute("LIST_SEMESTER");
                if (listSemeter != null) {
            %>
            <form action="MainController" method="POST">
                <main class="container-fluid">
                    <h1 class="mt-4 col-md-4"><i class="fa fa-house"></i>Register Form</h1>
                    <div class="room container-fluid px-4">    
                        <div class="tab-content ">
                            <div id="regisAD" class="container">

                                <div class="row" style="border: 1px solid #ddd; padding: 20px; border-radius: 10px;">
                                    <div class="form-row">
                                        <div class="col-4">

                                            <div class="term" style="border: 1px solid #ddd; padding: 15px; text-align: center; margin-bottom: 15px; border-radius: 10px; height: 100px;">
                                                <select name="term" class="selectpicker term" onchange="location = this.options[this.selectedIndex].value;" data-width="auto" data-title="Manage entries" data-style="btn-sm btn-info">
                                                    <%
                                                        String currentTerm = (String) request.getAttribute("CURRENT_TERMID");
                                                        for (SemesterDTO semester : listSemeter) {
                                                            if (semester.getSemesterID().equals(currentTerm)) {
                                                    %>

                                                    <option value="MainController?action=GetInformationForRegisterForm&termCurrent=<%=semester.getSemesterID()%>" selected="true"> <%=semester.getSemesterName()%> </option>
                                                    <% } else {
                                                    %>
                                                    <option value="MainController?action=GetInformationForRegisterForm&termCurrent=<%=semester.getSemesterID()%>"> <%=semester.getSemesterName()%> </option>
                                                    <%
                                                            }
                                                        }
                                                    %>
                                                </select>

                                            </div>

                                            <div id="list-major" style="border: 1px solid #ddd; padding: 10px; text-align: center; border-radius: 10px; height: 70%;">
                                                <h3 style="text-align: center; color: orangered;">List Major</h3>

                                                <div style="text-justify: auto; padding: 10px;">
                                                    <ul class="nav nav-tabs">


                                                        <c:forEach var="major" items="${LIST_MAJOR}">
                                                            <li class="nav-item">
                                                                <a class="nav-link btn-outline-info" href="#${major.majorID}" role="tab" data-toggle="tab">${major.majorName}</a>
                                                            </li>
                                                        </c:forEach>
                                                        <!--                                                        <li class="nav-item">
                                                                                                                    <a class="nav-link btn-outline-info" href="#IT" role="tab" data-toggle="tab">Information Technology</a>
                                                                                                                </li>
                                                                                                                <li class="nav-item">
                                                                                                                    <a class="nav-link btn-outline-info" href="#BA" role="tab" data-toggle="tab">Business Administration</a>
                                                                                                                </li>
                                                                                                                <li class="nav-item">
                                                                                                                    <a class="nav-link btn-outline-info" href="#EL" role="tab" data-toggle="tab">English Language</a>
                                                                                                                </li>
                                                                                                                <li class="nav-item">
                                                                                                                    <a class="nav-link btn-outline-info" href="#JL" role="tab" data-toggle="tab">Japanese Language</a>
                                                                                                                </li>
                                                                                                                <li class="nav-item">
                                                                                                                    <a class="nav-link btn-outline-info" href="#KL" role="tab" data-toggle="tab">Korean Language</a>
                                                                                                                </li>-->
                                                    </ul>

                                                </div>

                                            </div>
                                        </div> <!-- col-left -->

                                        <div class="col-8">
                                            <div  style="border: 1px solid #ddd; padding: 10px; margin-bottom: 20px; border-radius: 10px; height: 100px;">
                                                <table class="">
                                                    <tr>
                                                        <td>Start date:</td>
                                                        <td><input type="datetime-local" name="startDate"></td>
                                                        <td><p style="color: red;">${requestScope.ERROR.importDate}</p> </td>
                                                    </tr>
                                                    <tr>
                                                        <td>End date:</td>
                                                        <td><input type="datetime-local" name="endDate"></td>
                                                        <td><p style="color: red;">${requestScope.ERROR.usingDate}</p> </td>
                                                    </tr>
                                                </table>
                                            </div>


                                            <div class="mutil-list" style="border: 1px solid #ddd; padding: 10px; border-radius: 10px; height: 70%;">
                                                <div class="tab-content">
                                                    <c:forEach var="major" items="${requestScope.LIST_MAJOR}">
                                                        <div role="tabpanel" class="tab-pane fade show" id="${major.majorID}">
                                                            <p class=" d-none d-sm-block">
                                                                <c:forEach var="narrow" items="${requestScope.LIST_NARROW}">

                                                                    <c:if test="${major.majorID == narrow.majorID}">
                                                                        <c:set var="splitNarrowID" value="${fn:split(narrow.narrowID, '-')}" />

                                                                        <label class="form-check-inline" for="${splitNarrowID[0]}">
                                                                            <c:choose>
                                                                                <c:when test="${splitNarrowID[1] == 'true'}">
                                                                                    <input type="checkbox" class="form-check-input" disabled="disabled"  checked="checked" name="${major.majorID}" value="true" >${narrow.narrowName}
                                                                                </c:when>
                                                                                <c:otherwise>
                                                                                    <input type="checkbox" class="form-check-input" id="${narrow.narrowID}" name="${major.majorID}" value="${splitNarrowID[0]}" >${narrow.narrowName}
                                                                                </c:otherwise>
                                                                            </c:choose>

                                                                        </label> <br>
                                                                    </c:if>
                                                                </c:forEach>

                                                            </p>
                                                        </div> <!-- IT -->
                                                    </c:forEach>


                                                    <!--                                                    <div role="tabpanel" class="tab-pane fade show" id="AB">
                                                                                                            <p class=" d-none d-sm-block">
                                                                                                                <label class="form-check-inline" for="radio1">
                                                                                                                    <input type="checkbox" class="form-check-input" id="radio1" name="optradio" value="option1" >PRN211 (.NET)
                                                                                                                </label> <br>
                                                                                                                <label class="form-check-inline" for="radio2">
                                                                                                                    <input type="checkbox" class="form-check-input" id="radio2" name="optradio" value="option2">Bridge Software Engineer (JS)
                                                                                                                </label> <br>
                                                                                                                <label class="form-check-inline" for="radio3">
                                                                                                                    <input type="checkbox" class="form-check-input" id="radio3" name="optradio" value="option3">PRP201c (Autonomous Car)
                                                                                                                </label> <br>
                                                                                                                <label class="form-check-inline" for="radio4">
                                                                                                                    <input type="checkbox" class="form-check-input" id="radio4" name="optradio" value="option4">PRP201c (AI with tensor flow)
                                                                                                                </label> <br>
                                                                                                                <label class="form-check-inline" for="radio5">
                                                                                                                    <input type="checkbox" class="form-check-input" id="radio5" name="optradio" value="option5">FER201m (React/NodeJS)
                                                                                                                </label>
                                                                                                            </p>
                                                                                                        </div>  IT -->



                                                </div> <!-- Tab Content -->

                                            </div>
                                        </div><!-- col-right -->
                                    </div>

                                    <div class="col-md-12 text-center buttons" style="margin-top: 10px;">
                                        <div class="form-group">
                                            <button type="submit" class="btn btn-success" value="MakeFormRegister" name="action">Submit</button>      
                                            <button type="reset" class="btn btn-danger" style="margin-left: 5px;">Reset</button>
                                        </div>
                                    </div>
                                </div>

                            </div> <!-- end-container -->
                        </div>


                    </div>
                </main>
            </form>
            <%}
            %>
            <footer style="border-top: 2px solid #f86c24;" class="py-4 bg-light mt-auto">
            <div class="container-fluid px-4">
                <div class="d-flex align-items-center justify-content-between small">
                    <div style="padding-left: 13%" class="text-muted">Copyright &copy; Team 2</div>
                    <div>
                        <a href="https://www.youtube.com/channel/UCfNrlxNgcTZDJ3jZeSSSJxg" target="_blank"><i class="fa-brands fa-youtube fa-2x"></i></a>
                        <a href="https://www.facebook.com/uni.fpt.edu.vn/" target="_blank"><i class="fab fa-facebook-f fa-2x"></i></a>
                        <a href="https://www.instagram.com/fptuniversityhcm/" target="_blank"><i class="fa-brands fa-instagram fa-2x"></i></a>
                    </div>
                </div>
            </div>
        </footer> 
        </div>
    </div>
    <style>
    footer
    {
        position: fixed;
    right: 0;
    bottom: 0;
    left: 0;
    }
    body
    {
        background-color: white !important;
    }
    </style>
    <script src="https://cdn.jsdelivr.net/npm/simple-datatables@latest" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" crossorigin="anonymous"></script>
    <script src="https://use.fontawesome.com/releases/v6.1.0/js/all.js" crossorigin="anonymous"></script>

</body>
</html>