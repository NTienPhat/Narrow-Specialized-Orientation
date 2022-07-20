<%-- 
    Document   : AddTerm
    Created on : Jun 8, 2022, 11:17:47 PM
    Author     : user
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Add Term</title>
        <link rel="stylesheet" href="css/admincss.css">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-0evHe/X+R7YkIZDRvuzKMRqM+OrBnVFBL6DOitfPri4tjfHxaWutUpFmBp4vmVor" crossorigin="anonymous">
        <script src="https://kit.fontawesome.com/9b6cd90630.js" crossorigin="anonymous"></script>
    </head>
    <body class="sb-nav-fixed jumbotron">

        <%@include file="Header.jsp" %>

        <div id="layoutSidenav_content">

            <main class="container-fluid">
                <h1 class="mt-4 col-md-4"><i class="fa fa-house"></i>Term Management</h1>


                <div class="room container-fluid px-4">    
                    <div class="tab-content ">
                        <form action="MainController">
                            <table class="table w-50 table-borderless">
                                <tr>
                                    <td></td>
                                    <td style="font-weight: bold;font-size: large">ADD TERM</td>
                                </tr>
                                <tr>
                                    <td>ID</td>
                                    <td>
                                        <input value="${requestScope.SEMESTER.semesterID}" type="text" name="semesterID" class="form-control" placeholder="Enter ID...">
                                    </td>
                                    <td>
                                        <p style="color: red; ">${requestScope.ERROR.semesterID}</p>
                                    </td>
                                </tr>
                                <tr>
                                    <td>Name</td>
                                    <td>
                                        <input value="${requestScope.SEMESTER.semesterName}" type="text" name="semesterName" class="form-control" placeholder="Enter Link...">
                                    </td>
                                    <td>
                                        <p style="color: red; ">${requestScope.ERROR.semesterName}</p>
                                    </td>
                                </tr>

                                <tr style="text-align: center;">
                                    <td colspan="2">
                                        <button class="btn btn-success" type="submit" name="action" id="sumbitButton" value="AddTerm">Add</button>
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
