<%-- 
    Document   : Specialization
    Created on : May 29, 2022, 9:29:04 PM
    Author     : user
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Narrow Management</title>
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
                <h1 class="mt-4 col-md-4"><i class="fa fa-house"></i>Narrow Management</h1>
                <br>
                <div class="room container-fluid px-4">    
                    <div class="tab-content ">
                        <a href="MainController?action=PageAddNarrow">
                            <button class="btnadd btn btn-success">Add Narrow: <i class="fa-solid fa-circle-plus"></i></button>
                        </a>
                        <br>
                        <input class="form-control w-25" id="myInput" type="text" placeholder="Search..">
                        <table class="table table-responsive table-hover table-striped">
                            <thead>
                                <tr>
                                    <th scope="col">ID</th>
                                    <th scope="col">Name</th>
                                    <th scope="col">LinkFLM</th>
                                    <th scope="col">Description</th>
                                    <th scope="col">majorID</th>
                                    <th style="text-align: center" scope="col">Update</th>
                                    <th style="text-align: center" scope="col">Delete</th>
                                </tr>
                            </thead>
                            <tbody id="myTable">
                                <c:forEach var="n" items="${requestScope.LIST_Narrows}">
                                    <tr>
                                        <td><c:out value="${n.narrowID}"></c:out></td>
                                        <td><c:out value="${n.narrowName}"></c:out></td>
                                        <td><c:out value="${n.linkFLM}"></c:out></td>
                                        <td><c:out value="${n.description}"></c:out></td>
                                        <td><c:out value="${n.majorID}"></c:out></td>
                                            <td style="text-align: center">              
                                            <c:url  var="update" value="MainController">
                                                <c:param name="nid" value="${n.narrowID}"></c:param>

                                                <c:param name="action" value="PageUpdateNarrow"></c:param>
                                            </c:url>
                                            <a href="${update}"><i class="fas fa-edit"></i></a>
                                        </td>
                                        <td style="text-align: center">              
                                            <c:url  var="delete" value="MainController">
                                                <c:param name="nid" value="${n.narrowID}"></c:param>
                                                <c:param name="action" value="DeleteNarrow"></c:param>
                                            </c:url>
                                            <a href="${delete}"><i class="fas fa-trash"></i></a>
                                        </td>
                                    </tr>
                                </c:forEach>
                            </tbody>


                        </table>
                        <c:if test="${not empty requestScope.SUCCESS}">
                            <p style="color: lightgreen">${requestScope.SUCCESS}</p>
                        </c:if>
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
