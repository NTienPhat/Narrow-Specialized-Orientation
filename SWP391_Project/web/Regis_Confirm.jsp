<%-- 
    Document   : Regis_Confirm
    Created on : Jul 14, 2022, 8:48:33 PM
    Author     : lamtr
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Supporter Management</title>
        <link rel="stylesheet" href="css/studentcss.css">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-0evHe/X+R7YkIZDRvuzKMRqM+OrBnVFBL6DOitfPri4tjfHxaWutUpFmBp4vmVor" crossorigin="anonymous">
        <script src="https://kit.fontawesome.com/9b6cd90630.js" crossorigin="anonymous"></script>
    </head>
    <body class="sb-nav-fixed jumbotron">

        <%@include file="HeaderStudent.jsp" %>

        <div id="layoutSidenav_content">

            <main class="container-fluid">
                <h1 class="mt-4 col-md-4"><i class="fa fa-house"></i>Supporter Management</h1>
                <div class="room container-fluid px-4">    
                    <div class="tab-content ">
                        <a href="AddSupporter.jsp">
                            <button class="btnadd">Add Supporter: <i class="fa-solid fa-circle-plus"></i></button>
                        </a>

                        <form style="margin-bottom: 5px;" action="MainController">
                            <input id="inputsearch" type="text" name="search" placeholder="Search..." value="${requestScope.SEARCH}">
                            <select name="searchby">
                                <option value="id" ${requestScope.ID} >By Id</option>
                                <option value="name" ${requestScope.NAME} >By Name</option>
                            </select>
                            <input type="hidden" name="action" value="SearchSupporter"/>
                            <input class="btnsearch" type="submit" value="Search" >
                        </form>
                        <table class="table table-responsive table-bordered table-hover">
                            <tr>
                                <th scope="col">ID</th>
                                <th scope="col">Name</th>
                                <th scope="col">Registration Subject</th>
                                <th scope="col">Registration Date</th>
                                <th scope="col">Confirmation Status</th>
                            </tr>
                            <c:forEach var="sp" items="${requestScope.LIST_Supporters}">
                                <tr>
                                    <td><c:out value="${sp.userID}"></c:out></td>
                                <td><c:out value="${sp.name}"></c:out></td>
                                <td><c:out value="${sp.regisSubject}"></c:out></td>
                                <td><c:out value="${sp.regisDate}"></c:out></td>
                                <td><c:out value="${sp.cofirmStatus}"></c:out></td>
                                </tr>
                            </c:forEach>
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

    <script src="https://cdn.jsdelivr.net/npm/simple-datatables@latest" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" crossorigin="anonymous"></script>
    <script src="https://use.fontawesome.com/releases/v6.1.0/js/all.js" crossorigin="anonymous"></script>

</body>
</html>
