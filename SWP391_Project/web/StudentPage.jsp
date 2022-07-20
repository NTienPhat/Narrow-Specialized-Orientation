<%-- 
    Document   : StudentPage
    Created on : Jun 12, 2022, 7:24:02 PM
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
                <h1 class="mt-4 col-md-4"><i class="fa fa-house"></i>Student Page</h1>
                <div class="room container-fluid px-4">    
                    <div class="tab-content ">
                        <%
                            String name = (String) session.getAttribute("name");
                        %>
                        <h1>Welcome ${LOGIN_USER.name}</h1>
                        <h3>You information</h3>
                        <form action="MainController" method="GET">
                            <table class="table w-50 table-borderless">
                                <tr>
                                    <td>ID</td>
                                    <td>
                                        <input value="${LOGIN_USER.userID}" name="id" readonly class="form-control">
                                    </td>
                                </tr>
                                <tr>
                                    <td>Email</td>
                                    <td>
                                        <input value="${LOGIN_USER.email}" name="email" readonly class="form-control" >
                                    </td>
                                </tr>
                                <tr>
                                    <td>Full name</td>
                                    <td>
                                         <input value="${LOGIN_USER.name}" name="name" readonly class="form-control" >
                                    </td>                  
                                </tr>
                                <tr>
                                    <td>Phone</td>
                                    <td>
                                        <input value="${LOGIN_USER.phoneNumber}" name="id" readonly class="form-control" >
                                    </td>
                                </tr>
                                <tr>
                                    <td>Address</td>
                                    <td>
                                        <input value="${LOGIN_USER.address}" name="PhoneNumber" readonly class="form-control" >
                                    </td>                
                                </tr>
                                <tr>
                                    <td>Semester</td>
                                    <td>
                                        <input value="${LOGIN_USER.semesterID}" name="semesterID" readonly class="form-control" >
                                    </td> 
                                </tr>
                                <tr>
                                    <td>Major</td>
                                    <td>
                                        <input value="${LOGIN_USER.majorID}" name="majorID" readonly class="form-control" >
                                    </td>

                                </tr>
                                <tr>
                                    <td>Narrow</td>
                                    <td>
                                        <input value="${LOGIN_USER.narrowID}" name="narrowID" readonly class="form-control"  >
                                    </td>
                                </tr>
                            </table>
                        </form>

                        
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
