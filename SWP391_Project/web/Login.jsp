<%-- 
    Document   : Login
    Created on : Jun 9, 2022, 8:37:58 PM
    Author     : lamtr
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>

        <title>Login Page</title>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <meta http-equiv="x-ua-compatible" content="ie=edge">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js"></script>
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
        <link rel="stylesheet" href="node_modules/bootstrap/dist/css/bootstrap.min.css">
        <link rel="stylesheet" href="node_modules/font-awesome/css/font-awesome.min.css">
        <link rel="stylesheet" href="css/bootstrap-social.css">
        <link href="css/login.css" rel="stylesheet">


    </head>

    <body>
        <div id="page">
            <div id="login-page">
                <div class="form-login">
                    <div class="main-form-login">
                        <div class="logo-form-login">
                            <a href=""><img src="images/logo.jpg"></a>
                        </div>

                        <div class="tt-st3">WELCOME</div>
                        <div id="display-error" style="margin-bottom: 10px"></div>
                        <div class="buttom-form-login">
                            <button class="buttom-st3 fa fa-google btn btn-primary">
                                <a href="https://accounts.google.com/o/oauth2/auth?scope=email&redirect_uri=http://localhost:8080/SWP391_Project/login-google&response_type=code
                               &client_id=87164938910-2onepbbjdpgpde3b4sevt3v2s549kcsq.apps.googleusercontent.com&approval_prompt=force" style="color: white;">
                                    Đăng nhập
                                </a>
                            </button>
                        </div>
                        <p style="color: red; text-align: center;">${ERROR}</p>
                    </div>
                    <div class="clear"></div>
                </div>
            </div>
        </div>

    </body>
</html>
