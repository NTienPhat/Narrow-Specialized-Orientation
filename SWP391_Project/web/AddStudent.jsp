<%-- 
    Document   : AddStudent
    Created on : Jun 3, 2022, 11:19:22 AM
    Author     : user
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Add Student</title>
        <link rel="stylesheet" href="css/admincss.css">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-0evHe/X+R7YkIZDRvuzKMRqM+OrBnVFBL6DOitfPri4tjfHxaWutUpFmBp4vmVor" crossorigin="anonymous">
        <script src="https://kit.fontawesome.com/9b6cd90630.js" crossorigin="anonymous"></script>
    </head>
    <body class="sb-nav-fixed jumbotron">

        <%@include file="Header.jsp" %>

        <div id="layoutSidenav_content">

            <main class="container-fluid">
                <h1 class="mt-4 col-md-4"><i class="fa fa-house"></i>Student Management</h1>


                <div class="room container-fluid px-4">    
                    <div class="tab-content ">
                        <form action="MainController">

                            <table class=" table w-50 addtable table-borderless">
                                <tr>
                                    <td></td>
                                    <td style="font-weight: bold;font-size: large">ADD STUDENT</td>
                                </tr>


                                <tr>
                                    <td>ID</td>
                                    <td>
                                        <input value="${requestScope.STUDENT.userID}" type="text" name="userID" class="form-control" placeholder="Enter ID...">
                                    </td>
                                    <td>
                                        <p style="color: red; ">${requestScope.ERROR.userID}</p>
                                    </td>
                                </tr>
                                <tr>
                                    <td>Email</td>
                                    <td>
                                        <input value="${requestScope.STUDENT.email}" type="text" name="email" class="form-control" placeholder="Enter Email...">
                                    </td>
                                    <td>
                                        <p style="color: red; ">${requestScope.ERROR.email}</p>
                                    </td>
                                </tr>
                                <tr>
                                    <td>Full name</td>
                                    <td>
                                        <input value="${requestScope.STUDENT.name}" type="text" name="name" class="form-control" placeholder="Enter Full Name...">
                                    </td>
                                    <td>
                                        <p style="color: red; ">${requestScope.ERROR.name}</p>
                                    </td>
                                </tr>
                                <tr>
                                    <td>Phone</td>
                                    <td>
                                        <input value="${requestScope.STUDENT.phoneNumber}" type="text" name="phoneNumber" class="form-control" placeholder="Enter Phone...">
                                    </td>
                                    <td>
                                        <p style="color: red; ">${requestScope.ERROR.phoneNumber}</p>
                                    </td>
                                </tr>
                                <tr>
                                    <td>Address</td>
                                    <td>
                                        <input value="${requestScope.STUDENT.address}" type="text" name="address" class="form-control" placeholder="Enter Address...">
                                    </td>
                                </tr>
                                <tr>
                                    <td>Semester</td>
                                    <td>
                                        <input value="${requestScope.STUDENT.semesterID}" type="text" name="semesterID" class="form-control" placeholder="Enter Semester...">
                                    </td>
                                    <td>
                                        <p style="color: red; ">${requestScope.ERROR.semesterID}</p>
                                    </td>
                                </tr>
                                <tr>
                                    <td>Major</td>
                                    <td>
                                        <input value="${requestScope.STUDENT.majorID}" type="text" name="majorID" class="form-control" placeholder="Enter Major...">
                                    </td>
                                    <td>
                                        <p style="color: red; ">${requestScope.ERROR.majorID}</p>
                                    </td>
                                </tr>
                                <tr>
                                    <td>Narrow</td>
                                    <td>
                                        <input value="${requestScope.STUDENT.narrowID}" type="text" name="narrowID" class="form-control" placeholder="Enter Password...">
                                    </td>
                                    <td>
                                        <p style="color: red; ">${requestScope.ERROR.narrowID}</p>
                                    </td>
                                </tr>
                                <tr style="text-align: center;">
                                    <td colspan="2">
                                        <button class="btn btn-success" type="submit" name="action" id="sumbitButton" value="AddStudent">Add</button>
                                    </td>
                                    
                                </tr>
                                <tr style="text-align: center;">
                                    <td colspan="2">
                                        <input class="button btn btn-danger" type="submit" name="action" value="Reset">
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


    <style>

    </style>
    
    <script src="https://cdn.jsdelivr.net/npm/simple-datatables@latest" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" crossorigin="anonymous"></script>
    <script src="https://use.fontawesome.com/releases/v6.1.0/js/all.js" crossorigin="anonymous"></script>

</body>
</html>
