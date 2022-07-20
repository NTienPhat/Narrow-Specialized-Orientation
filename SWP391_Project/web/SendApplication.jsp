<%-- 
    Document   : SendApplication
    Created on : Jun 15, 2022, 6:16:09 PM
    Author     : user
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Send Application</title>
        <link rel="stylesheet" href="css/admincss.css">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-0evHe/X+R7YkIZDRvuzKMRqM+OrBnVFBL6DOitfPri4tjfHxaWutUpFmBp4vmVor" crossorigin="anonymous">
        <script src="https://kit.fontawesome.com/9b6cd90630.js" crossorigin="anonymous"></script>
        <script src="ckeditor/ckeditor.js"></script>
    </head>
    <body class="sb-nav-fixed jumbotron">

        <%@include file="HeaderStudent.jsp" %>

        <div id="layoutSidenav_content">

            <main class="container-fluid">
                <h1 class="mt-4 col-md-4"><i class="fa fa-house"></i>Send Application</h1>


                <div class="room container-fluid px-4">    
                    <div class="tab-content ">
                        <form action="MainController" method="GET">
                            <div class="form-group">
                                <label for="usr">Type:</label>
                                <input type="text" class="form-control" id="usr" name="title">
                                <p style="color: red;">${ERROR.messTitle}</p>
                                <label for="comment">Question:</label>
                                <textarea class="form-control" rows="5" id="comment" id="text"  type="text" name="text"></textarea>
                                <p style="color: red;">${ERROR.messText}</p>
                            </div>
                            <br>
                            <button type="submit" class="btn btn-success">Submit</button>
                            <input type="hidden" name="userID" value="${LOGIN_USER.userID}" />
                            <input type="hidden" name="majorID" value="${LOGIN_USER.majorID}" />
                            <input type="hidden" name="action" value="SendMess" />
                        </form>
                            <p style="color: lightgreen;">${SUCCESS}</p>
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
    <script>
        CKEDITOR.replace('text');
    </script>
</body>
</html>
