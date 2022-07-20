<%-- 
    Document   : HeaderStudent
    Created on : Jun 20, 2022, 5:22:30 PM
    Author     : user
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8" />
        <meta http-equiv="X-UA-Compatible" content="IE=edge" />
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no" />
        <meta name="description" content="" />
        <meta name="author" content="" />
        <title>Admin Page</title>
        <link href="https://cdn.jsdelivr.net/npm/simple-datatables@latest/dist/style.css" rel="stylesheet" />
        <link href="css/stylemenu.css" rel="stylesheet" />
    </head>
    <body class="sb-nav-fixed">
        <nav style="background-color: #f86c24;border-bottom: 2px solid black;" class="sb-topnav navbar navbar-expand navbar-dark">
            <!-- Navbar Brand-->

            <a class="navbar-brand ps-3" href="StudentPage.jsp">
                <img src="images/logoheader.jpg" class="rounded-circle"  alt="logo"width="45" height="41">
                Student Page

            </a>
            <!-- Sidebar Toggle-->
            <button class="btn btn-link btn-sm order-1 order-lg-0 me-4 me-lg-0" id="sidebarToggle" href="#!"><i class="fas fa-bars"></i></button>
            <!-- Navbar Search-->
            <form class="d-none d-md-inline-block form-inline ms-auto me-0 me-md-3 my-2 my-md-0">
                <div class="input-group">
                    
                </div>
            </form>
            <!-- Navbar-->
            <ul class="navbar-nav ms-auto ms-md-0 me-3 me-lg-4">
                <li class="nav-item dropdown">
                    <a class="nav-link dropdown-toggle" id="navbarDropdown" href="#" role="button" data-bs-toggle="dropdown" aria-expanded="false"><i class="fas fa-user fa-fw"></i></a>
                    <ul class="dropdown-menu dropdown-menu-end" aria-labelledby="navbarDropdown">  
                        </li>
                        <li><a class="dropdown-item" href="MainController?action=Logout">Logout</a></li>
                    </ul>
                </li>
            </ul>
        </nav>
        <div id="layoutSidenav">
            <div id="layoutSidenav_nav">
                <nav class="sb-sidenav accordion sb-sidenav-dark" id="sidenavAccordion">
                    <div class="sb-sidenav-menu">
                        <div class="nav">

                            <a class="nav-link" href="UpdateInformation.jsp">
                                <div class="sb-nav-link-icon"></div>
                                Update Information
                            </a>
                            <a class="nav-link collapsed" href="SendApplication.jsp">
                                <div class="sb-nav-link-icon"></div>
                                Send Application                               
                            </a>
                            <a class="nav-link collapsed" href="MainController?action=ViewApplication">
                                <div class="sb-nav-link-icon"></div>
                                View Application                               
                            </a>
                            <a class="nav-link collapsed" href="MainController?action=FormRegisterNarrow">
                                <div class="sb-nav-link-icon"></div>
                                Narrow Register                             
                            </a>  
                            <a class="nav-link collapsed" href="MainController?action=ViewRegistedStatus">
                                <div class="sb-nav-link-icon"></div>
                                Register Status                             
                            </a>  
                        </div>
                    </div>
                    <div class="sb-sidenav-footer">
                        <div class="small">Logged in as: ${LOGIN_USER.name}</div>                                               
                    </div>
                </nav>
            </div>    
    </body>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/Chart.js/2.8.0/Chart.min.js" crossorigin="anonymous"></script>    
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" crossorigin="anonymous"></script>
    <script src="https://use.fontawesome.com/releases/v6.1.0/js/all.js" crossorigin="anonymous"></script>
    <script>
        window.addEventListener('DOMContentLoaded', event => {

            // Toggle the side navigation
            const sidebarToggle = document.body.querySelector('#sidebarToggle');
            if (sidebarToggle) {
                // Uncomment Below to persist sidebar toggle between refreshes
                // if (localStorage.getItem('sb|sidebar-toggle') === 'true') {
                //     document.body.classList.toggle('sb-sidenav-toggled');
                // }
                sidebarToggle.addEventListener('click', event => {
                    event.preventDefault();
                    document.body.classList.toggle('sb-sidenav-toggled');
                    localStorage.setItem('sb|sidebar-toggle', document.body.classList.contains('sb-sidenav-toggled'));
                });
            }

        });
    </script>
</html>
