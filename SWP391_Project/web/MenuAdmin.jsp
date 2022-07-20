<%-- 
    Document   : MenuAdmin
    Created on : Jun 3, 2022, 11:37:10 AM
    Author     : user
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" type="text/css" href="css/cssforadmin.css">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-0evHe/X+R7YkIZDRvuzKMRqM+OrBnVFBL6DOitfPri4tjfHxaWutUpFmBp4vmVor" crossorigin="anonymous">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
        <link href="https://fonts.googleapis.com/css2?family=Play&amp;display=swap" rel="stylesheet">
    </head>
    <body>
        <div id="dp_menu" class="dp_menu">
            <button><span>MENU</span></button>
            <ul class="main-menu" style="display:none">
                <li><a href="MainController?action=Search&searchby=name">Student</a></li>
                <li><a href="MainController?action=SearchSupporter&searchby=name">Supporter</a></li>
                <li><a href="MainController?action=SearchMajor">Major</a></li>
                <li><a href="Specialization.jsp">Specialization</a></li>
                <li><a href="MainController?action=SearchTerm">Term</a></li>            
                <li><a href="#services">Register form</a></li>
                <li><a href="#contact">Notification</a></li>
                <li><a href="#followme">Logout</a></li>
            </ul>
        </div>
    </body>
    <script>
        $(document).ready(function () {
            $("button").click(function () {
                $("#dp_menu > ul").toggle(500);
                $("#dp_menu").toggleClass("show");
            });
        });
    </script>
</html>
