<%-- 
    Document   : UpdateStudent
    Created on : Jun 3, 2022, 11:10:32 AM
    Author     : user
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Update Student</title>
        <link rel="stylesheet" href="css/admincss.css">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-0evHe/X+R7YkIZDRvuzKMRqM+OrBnVFBL6DOitfPri4tjfHxaWutUpFmBp4vmVor" crossorigin="anonymous">
        <script src="https://kit.fontawesome.com/9b6cd90630.js" crossorigin="anonymous"></script>
    </head>
    <body class="sb-nav-fixed jumbotron">

        <%@include file="Header.jsp" %>

        <div id="layoutSidenav_content">

            <main class="container-fluid">
                <h1 class="mt-4 col-md-4"><i class="fa fa-house"></i>Update Student</h1>



                <div class="room container-fluid px-4">    
                    <div class="tab-content ">
                        <form action="MainController" method="GET">
                            <table class="table w-50 table-borderless">
                                <tr>
                                    <td>ID</td>
                                    <td>
                                        <input readonly="" class="form-control" value="${requestScope.STUDENT.userID}" type="text">
                                    </td>
                                </tr>
                                <tr>
                                    <td>Email</td>
                                    <td>
                                        <input readonly="" class="form-control" value="${requestScope.STUDENT.email}" type="text">
                                    </td>
                                </tr>
                                <tr>
                                    <td>Full name</td>
                                    <td>
                                        <input class="form-control" value="${requestScope.STUDENT.name}" type="text" name="name">
                                    </td>
                                    <td>
                                        <p style="color: red; ">${requestScope.ERROR.name}</p>
                                    </td>
                                </tr>
                                <tr>
                                    <td>Phone</td>
                                    <td>
                                        <input class="form-control" value="${requestScope.STUDENT.phoneNumber}" type="text" name="phoneNumber">
                                    </td>
                                    <td>
                                        <p style="color: red; ">${requestScope.ERROR.phoneNumber}</p>
                                    </td>
                                </tr>
                                <tr>
                                    <td>Address</td>
                                    <td>
                                        <input class="form-control" value="${requestScope.STUDENT.address}" type="text" name="address">
                                    </td>

                                </tr>
                                <tr>
                                    <td>Semester</td>
                                    <td>
                                        <input class="form-control" value="${requestScope.STUDENT.semesterID}" type="text" name="semesterID">
                                    </td>
                                    <td>
                                        <p style="color: red; ">${requestScope.ERROR.semesterID}</p>
                                    </td>
                                </tr>
                                <tr>
                                    <td>Major</td>
                                    <td>
                                        <input class="form-control" value="${requestScope.STUDENT.majorID}" type="text" name="majorID">
                                    </td>
                                    <td>
                                        <p style="color: red; ">${requestScope.ERROR.majorID}</p>
                                    </td>
                                </tr>
                                <tr>
                                    <td>Narrow</td>
                                    <td>
                                        <input class="form-control" value="${requestScope.STUDENT.narrowID}" type="text" name="narrowID">
                                    </td>
                                    <td>
                                        <p style="color: red; ">${requestScope.ERROR.narrowID}</p>
                                    </td>
                                </tr>
                                <tr style="text-align: center;">
                                    <td colspan="2">
                                        <button class="btn btn-success" type="submit" name="action" id="sumbitButton" value="UpdateStudent">Update</button>
                                        <input type="hidden" name="userID" value="${requestScope.STUDENT.userID}">
                                        <input type="hidden" name="email" value="${requestScope.STUDENT.email}">
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


<!--<form class="w-50" action="MainController" method="GET">
    <table class="table">
        <div class="form-group">
            <label for="exampleInputEmail1">ID</label>
            <input readonly value="" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" placeholder="Enter email">
        </div>
        <div class="form-group">
            <label for="exampleInputEmail1">Email</label>
            <input readonly value="" type="email" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" placeholder="Enter email">
        </div>
        <div class="form-group">
            <label for="exampleInputEmail1">Full Name</label>
            <input name="name" value=" class="form-control">
            <p style="color: red; "></p>
        </div>
        <div class="form-group">
            <label for="exampleInputEmail1">Phone</label>
            <input name="phoneNumber" value="" class="form-control">
            <p style="color: red; "></p>
        </div>
        <div class="form-group">
            <label for="exampleInputEmail1">Address</label>
            <input name="address" value="" class="form-control">
        </div>
        <div class="form-group">
            <label for="exampleInputEmail1">Semester</label>
            <input name="semesterID" value="" class="form-control">
            <p style="color: red; "></p>
        </div>
        <div class="form-group">
            <label for="exampleInputEmail1">Major</label>
            <input name="majorID" value="" class="form-control">
            <p style="color: red; "></p>
        </div>
        <div class="form-group">
            <label for="exampleInputEmail1">Narrow</label>
            <input name="narrowID" value="" class="form-control">
            <p style="color: red; "></p>
        </div>
        <div class="form-group">
            <button class="btn btn-success" type="submit" name="action" id="sumbitButton" value="UpdateStudent">Update</button>
            <input type="hidden" name="userID" value="">
            <input type="hidden" name="email" value="">
        </div>
    </table>
</form>-->