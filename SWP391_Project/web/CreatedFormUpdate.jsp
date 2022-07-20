<%-- 
    Document   : CreatedFormUpdate
    Created on : Jul 15, 2022, 8:58:20 PM
    Author     : user
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Created Form Update</title>
        <link rel="stylesheet" href="css/admincss.css">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-0evHe/X+R7YkIZDRvuzKMRqM+OrBnVFBL6DOitfPri4tjfHxaWutUpFmBp4vmVor" crossorigin="anonymous">
        <script src="https://kit.fontawesome.com/9b6cd90630.js" crossorigin="anonymous"></script>
    </head>
    <body class="sb-nav-fixed jumbotron">

        <%@include file="Header.jsp" %>

        <div id="layoutSidenav_content">

            <main class="container-fluid">
                <h1 class="mt-4 col-md-4"><i class="fa fa-house"></i>Created Form Update</h1>     
                <div class="room container-fluid px-4">    
                    <div class="tab-content ">
                        <form action="MainController" method="GET">
                            <table class="table table-responsive table-bordered table-hover">
                                <tr>
                                    <td>Narrow</td>
                                    <td>
                                       <input value="${a}" type="text" name="">
                                    </td>
                                </tr>
                                <tr>
                                    <td>Major</td>
                                    <td>
                                        <input value="${a}" type="text" name="">
                                    </td>
                                </tr>
                                <tr>
                                    <td>Start Date</td>
                                    <td>
                                        <input value="${a}" type="text" name="">
                                    </td>
                                </tr>
                                <tr>
                                    <td>End Date</td>
                                    <td>
                                        <input value="${a}" type="text" name="">
                                    </td>
                                </tr>
                                <tr>
                                    <td>Number Of Register</td>
                                    <td>
                                        <input value="${a}" type="text" name="">
                                    </td>

                                </tr>
                                <tr>
                                    <td colspan="2">
                                        <input class="button" type="submit" name="action" value="">
                                        <input type="hidden" name="ID" value="${id}">
                                    </td>
                                </tr>
                            </table>
                        </form>
                    </div>


                </div>

            </main>
            <%@include file="Footer.jsp" %>
        </div>

        <script src="https://cdn.jsdelivr.net/npm/simple-datatables@latest" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" crossorigin="anonymous"></script>
        <script src="https://use.fontawesome.com/releases/v6.1.0/js/all.js" crossorigin="anonymous"></script>

    </body>
</html>
