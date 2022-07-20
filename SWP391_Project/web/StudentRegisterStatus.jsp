<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%-- 
    Document   : StudentRegisterStatus
    Created on : Jul 18, 2022, 3:40:21 PM
    Author     : user
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Student Page</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-0evHe/X+R7YkIZDRvuzKMRqM+OrBnVFBL6DOitfPri4tjfHxaWutUpFmBp4vmVor" crossorigin="anonymous">
        <script src="https://kit.fontawesome.com/9b6cd90630.js" crossorigin="anonymous"></script>
    </head>
    <body class="sb-nav-fixed jumbotron">

        <%@include file="HeaderStudent.jsp" %>

        <div id="layoutSidenav_content">

            <main class="container-fluid">
                <h1 class="mt-4 col-md-4"><i class="fa fa-house"></i>Register Status</h1>
                <c:if test="${not empty REGISTED_STATUS}">
                    <div class="room container-fluid px-4">    
                        <div class="tab-content ">
                            <table class="table table-responsive table-bordered table-hover">
                                <tr class="bg-light">
                                    <th scope="col">Semester</th>
                                    <th scope="col">Major</th>
                                    <th scope="col">Narrow</th>
                                    <th scope="col">Register Date</th>
                                    <th scope="col">Status</th>
                                </tr>
                                <tr>
                                    <td>${REGISTED_STATUS.semesterID}</td>
                                    <td>${REGISTED_STATUS.majorID}</td>
                                    <td>${REGISTED_STATUS.narrowID}</td>
                                    <td>${REGISTED_STATUS.registedDate}</td>
                                    <td>${REGISTED_STATUS.status}</td>
                                </tr>
                            </table>
                        </div>
                    </div>
                </c:if>
                <p style="color: red;">${ERROR}</p>
            </main>
            <%@include file="Footer.jsp" %>
        </div>
    </div>

    <script src="https://cdn.jsdelivr.net/npm/simple-datatables@latest" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" crossorigin="anonymous"></script>
    <script src="https://use.fontawesome.com/releases/v6.1.0/js/all.js" crossorigin="anonymous"></script>

</body>
</html>
