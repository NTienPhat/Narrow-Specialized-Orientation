<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%-- 
    Document   : NarrowRegister
    Created on : Jun 12, 2022, 7:21:55 PM
    Author     : user
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Narrow Register</title>
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <link rel="stylesheet" href="css/admincss.css">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-0evHe/X+R7YkIZDRvuzKMRqM+OrBnVFBL6DOitfPri4tjfHxaWutUpFmBp4vmVor" crossorigin="anonymous">
        <script src="https://kit.fontawesome.com/9b6cd90630.js" crossorigin="anonymous"></script>
        <meta http-equiv="x-ua-compatible" content="ie=edge">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js"></script>
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
        <link rel="stylesheet" href="node_modules/bootstrap/dist/css/bootstrap.min.css">
        <link rel="stylesheet" href="node_modules/font-awesome/css/font-awesome.min.css">
        <link rel="stylesheet" href="css/bootstrap-social.css">
        <link href="css/register.css" rel="stylesheet">
    </head>
    <body class="sb-nav-fixed jumbotron">

        <%@include file="HeaderStudent.jsp" %>

        <div id="layoutSidenav_content">

            <main class="container-fluid">
                <h1 class="mt-4 col-md-4"><i class="fa fa-house"></i>Narrow Register</h1>

                <div class="room container-fluid px-4">    
                    <div class="tab-content ">
                        <c:choose>
                            <c:when test="${ not empty requestScope.LIST_NARROW }">
                                <form action="MainController">
                                    <div class="main_form">
                                        <div class="row row-content mt-5">
                                            <div class="col-12">
                                                <div class="text-center">
                                                    <h2>REGISTER</h2>
                                                </div>

                                                <div class="content" style="border: 1px solid #ddd; padding: 15px; border-radius: 15px; background-color: #f3b467;">
                                                    <div class="row" style="margin-bottom: 20px;">
                                                        <div class="col-6">
                                                            <div class="form-group" style="padding-left: 70px;">
                                                                <h4>Major</h4>
                                                            </div>
                                                        </div>

                                                        <div class="col-6">
                                                            <div class="form-group">
                                                                <h4>${MAJOR.majorName}</h4>
                                                            </div>
                                                        </div>
                                                    </div>
                                                    <div class="row">
                                                        <div class="col-6">
                                                            <div class="form-group" style="padding-left: 70px;">
                                                                <h4>Narrow Specialization</h4>
                                                            </div>
                                                        </div>

                                                        <div class="col-6">
                                                            <div class="form-group">
                                                                <p class=" d-none d-sm-block">
                                                                    <c:forEach var="narrow" items="${LIST_NARROW}">
                                                                        <label class="form-check-inline" for="radio1">
                                                                            <input type="radio" class="form-check-input" id="${narrow.narrowID}" name="narrowRegister" value="${narrow.registerID}" >${narrow.narrowName}
                                                                        </label> <br>
                                                                    </c:forEach>

                                                                </p>
                                                            </div>
                                                        </div>

                                                        <div class="col-12 text-center">
                                                            <div class="form-group">
                                                                <button class="submit btn btn-success">Submit</button>
                                                                <input type="hidden" name="action" value="RegisterNarrow"/>
                                                            </div>
                                                        </div>
                                                    </div>
                                                </div>


                                            </div>
                                        </div>

                                    </div><!-- MAIN-FORM -->
                                </form>
                            </c:when>
                        </c:choose>
                        <p style="color: lightgreen">${requestScope.ERROR}</p>
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

