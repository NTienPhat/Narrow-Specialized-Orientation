<%-- 
    Document   : SupportPage
    Created on : Jun 25, 2022, 9:11:55 PM
    Author     : lamtr
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>

        <title>Support Page</title>
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
        <link href="css/" rel="stylesheet">

    </head>
    <body class="sb-nav-fixed jumbotron">

        <%@include file="HeaderStudent.jsp" %>
        <div id="layoutSidenav_content">
            <div class="container">
                <div class="row justify-content-center">
                    <div class="col-md-12 text-center">
                        <h2 class="heading-section">Page Support</h2>
                    </div>
                </div>
                <div class="row justify-content-center">
                    <div class="col-lg-10 col-md-12">
                        <div class="wrapper">
                            <div class="row no-gutters">
                                <div class="col-md-12 d-flex align-items-stretch">
                                    <div class="contact-wrap w-100 p-md-4 p-3">

                                        <form method="POST" id="contactForm" name="contactForm">
                                            <div class="row">
                                                <div class="col-md-12">
                                                    <div class="form-group">
                                                        <input type="text" class="form-control" name="problem" id="problem" placeholder="Problem">
                                                    </div>
                                                </div>
                                                <div class="col-md-12">
                                                    <div class="form-group">
                                                        <textarea name="message" class="form-control" id="message" cols="30" rows="7" placeholder="Message"></textarea>
                                                    </div>
                                                </div>
                                                <div class="col-md-12 text-center">
                                                    <div class="form-group">
                                                        <input type="submit" value="Send Message" class="btn btn-primary">
                                                        <div class="submitting"></div>
                                                    </div>
                                                </div>
                                            </div>
                                        </form>
                                    </div>
                                </div>

                                <!-- <div class="col-md-5 d-flex align-items-stretch">
                                    <div class="info-wrap bg-primary w-100 p-lg-5 p-4">
                                        <h3 class="mb-4 mt-md-4">Contact us</h3>
                                        <div class="dbox w-100 d-flex align-items-start">
                                            <div class="icon d-flex align-items-center justify-content-center">
                                                <span class="fa fa-map-marker"></span>
                                            </div>
                                            <div class="text pl-3">
                                                <p><span>Address:</span> Lô E2a-7, Đường D1 Khu Công nghệ cao, P. Long Thạnh Mỹ, TP. Thủ Đức, TP. Hồ Chí Minh</p>
                                            </div>
                                        </div>
                                        <div class="dbox w-100 d-flex align-items-center">
                                            <div class="icon d-flex align-items-center justify-content-center">
                                                <span class="fa fa-phone"></span>
                                            </div>
                                            <div class="text pl-3">
                                                <p><span>Phone:</span> 028 7300 1866</p>
                                            </div>
                                        </div>
                                        <div class="dbox w-100 d-flex align-items-center">
                                            <div class="icon d-flex align-items-center justify-content-center">
                                                <span class="fa fa-paper-plane"></span>
                                            </div>
                                            <div class="text pl-3">
                                                <p><span>Email:</span> daihocfpt@fpt.edu.vn</p>
                                            </div>
                                        </div>
                                    </div>
                                </div> -->
                                <!-- Contact us -->
                            </div>
                        </div>
                    </div>
                </div>
            </div> <!-- container -->

            <%@include file="Footer.jsp" %>
        </div>
    </body>
</html>
