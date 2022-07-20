<%-- 
    Document   : Header_HomePage
    Created on : Jun 23, 2022, 1:41:38 PM
    Author     : user
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>       
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
        <link rel="stylesheet" href="css/homepagecss.css">
        <link href="https://fonts.googleapis.com/css?family=Poppins" rel="stylesheet">
    </head>
  
    <body>
        <nav class="navbar navbar-expand-lg navbar-dark bg-dark ">
            <a class="navbar-brand" href="HomePage.jsp">Trang chủ</a>
            <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent"
                    aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
            </button>

            <div class="collapse navbar-collapse" id="navbarSupportedContent">
                <ul class="navbar-nav mr-auto">
                    
                    <li class="nav-item dropdown">
                        <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-toggle="dropdown"
                           aria-haspopup="true" aria-expanded="false">
                            Ngành đào tạo
                        </a>
                        <div class="dropdown-menu" aria-labelledby="navbarDropdown">
                            <a class="dropdown-item" href="HomePage_IT.jsp">Kỹ thuật phần mềm</a>
                            <a class="dropdown-item" href="HomePage_GD.jsp">Thiết kế mỹ thuật số</a>
                            <a class="dropdown-item" href="HomePage_TTDPT.jsp">Truyền thông đa phương tiện</a>
                            <a class="dropdown-item" href="#">An toàn thông tin</a>
                            <a class="dropdown-item" href="#">Trí tuệ nhân tạo</a>
                            <a class="dropdown-item" href="#">Quản trị kinh doanh</a>
                            <a class="dropdown-item" href="#">Kinh doanh quốc tế</a>
                            <a class="dropdown-item" href="#">Quản trị khách sạn</a>
                            <a class="dropdown-item" href="#">Ngôn ngữ Anh</a>
                            <a class="dropdown-item" href="#">Ngôn ngữ Nhật</a>
                        </div>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="Login.jsp">Đăng nhập</a>
                    </li>
                </ul>
                
            </div>
        </nav>

        <div class="logo">
            <img width="14%" src="https://job.fpt.edu.vn/Content/images/logo_unit/fpt-university.png">
        </div>
    </body>
    <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
</html>
