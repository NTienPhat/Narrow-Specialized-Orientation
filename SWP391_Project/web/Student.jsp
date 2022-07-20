<%-- 
    Document   : Student
    Created on : May 28, 2022, 9:21:21 PM
    Author     : user
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Student Management</title>
        <link rel="stylesheet" href="css/admincss.css">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-0evHe/X+R7YkIZDRvuzKMRqM+OrBnVFBL6DOitfPri4tjfHxaWutUpFmBp4vmVor" crossorigin="anonymous">
        <script src="https://kit.fontawesome.com/9b6cd90630.js" crossorigin="anonymous"></script>
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
    </head>
    <body class="sb-nav-fixed jumbotron">

        <%@include file="Header.jsp" %>

        <div id="layoutSidenav_content">

            <main class="container-fluid">
                <h1 class="mt-4 col-md-4"><i class="fa fa-house"></i>Student Management</h1>
                <br>
                <div class="room container-fluid px-4">    
                    <div class="tab-content ">
                        <div class="row">
                            <div class="col-md-3">
                                <a href="MainController?action=PageAddStudent">
                                    <button class="btnadd btn btn-success">Add Student: <i class="fa-solid fa-circle-plus"></i></button>
                                </a>
                            </div>
                            <div class="col-md-3">
                            </div>
                            <div class="col-md-3">
                            </div>
                            <div class="col-md-3">
                                <form method="POST" action="MainController" enctype="multipart/form-data" >
                                    <input  type="file" name="file" accept=".xlsx">
                                    <input class="btn-success" type="submit" value="Upload" name="action">
                                </form>
                                <span>Template file to add students: <a href="MainController?action=DownloadFileDemo&value=aaa.png">Download</a></span>
                                <p style="color: red;">${requestScope.ERROR}</p>
                            </div>
                        </div>

                        <input class="form-control w-25" id="myInput" type="text" placeholder="Search...">

                        <table class="table table-responsive table-hover table-striped">
                            <thead>
                                <tr>
                                    <th scope="col">ID</th>
                                    <th scope="col">Name</th>
                                    <th scope="col">Email</th>
                                    <th scope="col">Phone</th>
                                    <th scope="col">Address</th>
                                    <th scope="col">Role</th>
                                    <th scope="col">Semester</th>
                                    <th scope="col">Major</th>
                                    <th scope="col">Narrow</th>
                                    <th style="text-align: center" scope="col">Update</th>
                                    <th style="text-align: center" scope="col">Delete</th>
                                </tr>
                            </thead>
                            <tbody id="myTable">
                                <c:forEach var="s" items="${requestScope.LIST_Students}">
                                    <tr>
                                        <td><c:out value="${s.userID}"></c:out></td>
                                        <td><c:out value="${s.name}"></c:out></td>
                                        <td><c:out value="${s.email}"></c:out></td>
                                        <td><c:out value="${s.phoneNumber}"></c:out></td>
                                        <td><c:out value="${s.address}"></c:out></td>
                                        <td><c:out value="${s.roleID}"></c:out></td>
                                        <td><c:out value="${s.semesterID}"></c:out></td>
                                        <td><c:out value="${s.majorID}"></c:out></td>
                                        <td><c:out value="${s.narrowID}"></c:out></td>

                                            <td style="text-align: center">              
                                            <c:url  var="update" value="MainController">
                                                <c:param name="userID" value="${s.userID}"></c:param>
                                                <c:param name="action" value="pageUpdateStudent"></c:param>
                                            </c:url>
                                            <a href="${update}"><i class="fas fa-edit"></i></a>
                                        </td>
                                        <td style="text-align: center">              
                                            <c:url  var="delete" value="MainController">
                                                <c:param name="userID" value="${s.userID}"></c:param>
                                                <c:param name="action" value="deleteStudent"></c:param>
                                            </c:url>
                                            <a href="${delete}"><i class="fas fa-trash"></i></a>
                                        </td>

                                    </tr>
                                </c:forEach>
                            </tbody>

                        </table>
                        <p style="color: lightgreen">${requestScope.SUCCESS}</p>
                    </div>
                </div>
            </main>
            <%@include file="Footer.jsp" %>
        </div>
    </div>
    <script>
        $(document).ready(function () {
            $("#myInput").on("keyup", function () {
                var value = $(this).val().toLowerCase();
                $("#myTable tr").filter(function () {
                    $(this).toggle($(this).text().toLowerCase().indexOf(value) > -1)
                });
            });
        });
    </script>
    <script src="https://cdn.jsdelivr.net/npm/simple-datatables@latest" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" crossorigin="anonymous"></script>
    <script src="https://use.fontawesome.com/releases/v6.1.0/js/all.js" crossorigin="anonymous"></script>

</body>
</html>
