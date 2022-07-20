<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%-- 
    Document   : CreatedRegisterForm
    Created on : Jun 27, 2022, 3:32:07 PM
    Author     : user
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Created Form</title>
        <link rel="stylesheet" href="css/admincss.css">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-0evHe/X+R7YkIZDRvuzKMRqM+OrBnVFBL6DOitfPri4tjfHxaWutUpFmBp4vmVor" crossorigin="anonymous">
        <script src="https://kit.fontawesome.com/9b6cd90630.js" crossorigin="anonymous"></script>
    </head>
    <body class="sb-nav-fixed jumbotron">

        <%@include file="Header.jsp" %>

        <div id="layoutSidenav_content">

            <main class="container-fluid">
                <h1 class="mt-4 col-md-4"><i class="fa fa-house"></i>Created Form</h1>     
                <c:choose>
                    <c:when test="${not empty requestScope.LIST_SEMESTER}">
                        <form action="MainController">
                            <div class="room container-fluid px-4">    
                                <div class="tab-content ">
                                    <table class="table">
                                        <tr>
                                            <th scope="col">Term</th>
                                            <th scope="col">Load</th>
                                        </tr>
                                        <tr>
                                            <td scope="row">
                                                <div class="term">
                                                    <select class="form-select w-25" name="semesterID">
                                                        <c:forEach var="semester" items="${requestScope.LIST_SEMESTER}">
                                                            <c:choose>
                                                                <c:when test="${requestScope.CURRENT_SEMESTER == semester.semesterID}">
                                                                    <option value="${semester.semesterID}" selected="true" >${semester.semesterName}</option>
                                                                </c:when>    
                                                                <c:otherwise>
                                                                    <option value="${semester.semesterID}" >${semester.semesterName}</option>
                                                                </c:otherwise>
                                                            </c:choose>
                                                        </c:forEach>
                                                    </select>
                                                </div>
                                            </td>
                                            <td>
                                                <button class="btn btn-success" type="submit" value="GetListCreatedNarrow" name="action"><i class="fas fa-angle-double-down"></i></button>
                                            </td>
                                        </tr>
                                    </table>
                                    </form>
                                </div>
                                <c:choose>
                                    <c:when test="${not empty LIST_CREATEDFROM}">
                                        <table class="table">
                                            <tr>
                                                <th scope="col">Major</th>
                                                <th scope="col">Narrow</th>
                                                <th scope="col">Start Date</th>
                                                <th scope="col">End Date</th>
                                                <th scope="col">Number Of Register</th>
                                                <th style="text-align: center" scope="col">Update</th>
                                            </tr>
                                            <c:forEach var="form" items="${LIST_CREATEDFROM}">
                                                <form action="MainController">
                                                    <tr>
                                                        <td><c:out value="${form.majorID}"></c:out></td>
                                                        <td><c:out value="${form.narrowID}"></c:out></td>
                                                        <td><input type="datetime-local" name="startDate" value="${form.startDate}"/></td>
                                                        <td><input type="datetime-local" name="endDate" value="${form.endDate}"/></td>
                                                        <td><c:out value="${form.totalStudent}/${requestScope.TOTAL_STUDENT}"></c:out></td>
                                                            <td style="text-align: center">              
                                                                <button name="action" value="ChangeDate"><i class="fas fa-edit"></i></button>
                                                                <input type="hidden" name="semesterID" value="${requestScope.CURRENT_SEMESTER}">
                                                                <input type="hidden" name="registerID" value="${form.registerID}">
                                                        </td>
                                                    </tr>
                                                </form>

                                            </c:forEach>
                                            <td>
                                                <form action="MainController">    
                                                    <input type="hidden" name="semesterID" value="${requestScope.CURRENT_SEMESTER}">
                                                    <button type="submit" class="btn btn-success" value="AcceptRegisterOfStudent" name="action">Submit</button>        
                                                </form>
                                            </td>

                                        </table>
                                    </c:when>
                                    <c:otherwise>
                                        <p style="color: red;">${requestScope.ERROR_FORMCREATED}</p>
                                    </c:otherwise>
                                </c:choose>
                            </div>

                        </c:when>
                        <c:otherwise>
                            <p style="color: red;">${requestScope.ERROR}</p>
                        </c:otherwise>
                    </c:choose>
                    <c:forEach var="success" items="${LIST_SUCCESS}">
                        <p style="color: lightgreen"><c:out value="${success}"></c:out></p>
                    </c:forEach>
                    <c:forEach var="invalid" items="${LIST_ERROR}">
                        <p style="color: red"><c:out value="${invalid}"></c:out></p>
                    </c:forEach>
                    <p style="color: red"><c:out value="${UPADTE_ERROR}"></c:out></p>
                </main>
            <%@include file="Footer.jsp" %>
        </div>

        <script src="https://cdn.jsdelivr.net/npm/simple-datatables@latest" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" crossorigin="anonymous"></script>
        <script src="https://use.fontawesome.com/releases/v6.1.0/js/all.js" crossorigin="anonymous"></script>

    </body>
</html>
