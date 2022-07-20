<%-- 
    Document   : adminPage
    Created on : May 23, 2022, 5:09:51 PM
    Author     : user
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Admin Page</title>
        <link rel="stylesheet" href="css/admincss.css">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-0evHe/X+R7YkIZDRvuzKMRqM+OrBnVFBL6DOitfPri4tjfHxaWutUpFmBp4vmVor" crossorigin="anonymous">
        <script src="https://kit.fontawesome.com/9b6cd90630.js" crossorigin="anonymous"></script>
    </head>
    <body class="sb-nav-fixed jumbotron">

        <%@include file="Header.jsp" %>

        <div id="layoutSidenav_content">

            <main class="container-fluid">
                <h1 class="mt-4 col-md-4"><i class="fa fa-house"></i>Admin Page</h1>



                <div class="room container-fluid px-4">    
                    <div class="tab-content ">
                        <h1>Welcome ${sessionScope.LOGIN_USER.name}</h1>
                    </div>
                </div>
                    <div style="height: 50px;">
                        
                    </div>
                <div class="row d-flex justify-content-center">

                    <div style="max-width: 25%;height: 200px" class="border border-danger rounded card-item col-xl-4 col-sm-6 col-12 w-75">
                        <div class="card-item_employee">
                            <a style="text-decoration: none;color: black;" class="card-item_link d-flex justify-content-center" href="MainController?action=Search&searchby=name">
                                <i class="fa-solid fa-user fa-3x p-5"></i>
                            </a>
                            <div class="d-flex justify-content-center">
                                <a class="card-item_link" style="text-decoration: none; color: black" class="card-item_link d-flex justify-content-center" href="MainController?action=Search&searchby=name">Student</a>
                            </div>
                        </div>
                    </div>
                    <div style="width: 20px"></div>

                    <div style="max-width: 25%;height: 200px" class="border border-danger rounded card-item col-xl-4 col-sm-6 col-12 w-75">
                        <div class="card-item_employee">
                            <a style="text-decoration: none; color: black;" class="card-item_link d-flex justify-content-center" href="MainController?action=SearchNarrow&searchby=name">
                                <i class="fa-brands fa-leanpub fa-3x p-5"></i>
                            </a>
                            <div class="d-flex justify-content-center">
                                <a class="card-item_link" style="text-decoration: none; color: black" class="card-item_link d-flex justify-content-center" href="MainController?action=SearchNarrow&searchby=name">Narrow</a>
                            </div>
                        </div>
                    </div>
                    <div style="width: 20px"></div>

                    <div style="max-width: 25%;height: 200px" class="border border-danger rounded card-item col-xl-4 col-sm-6 col-12 w-75">
                        <div class="card-item_employee">
                            <a style="text-decoration: none;color: black;" class="card-item_link d-flex justify-content-center" href="MainController?action=GetInformationForRegisterForm">
                                <i class="fa-solid fa-calendar-plus fa-3x p-5"></i>
                            </a>
                            <div class="d-flex justify-content-center">
                                <a class="card-item_link" style="text-decoration: none; color: black" class="card-item_link d-flex justify-content-center" href="MainController?action=GetInformationForRegisterForm">Create Form</a>
                            </div>
                        </div>
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
