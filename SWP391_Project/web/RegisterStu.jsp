<%-- 
    Document   : Register
    Created on : Jun 10, 2022, 10:50:14 AM
    Author     : lamtr
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>

        <title>Register Student Page</title>
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
        <link href="css/register.css" rel="stylesheet">

    </head>

    <body>

        <header>
            <h1>REGISTER FORM</h1> <!-- tiêu đề -->
        </header>

        <div id="regisStu" class="container">
            <form action="">
                <div class="row" style="border: 1px solid #ddd; margin: 20px; padding: 10px; border-radius: 10px;">
                    <div class="col-4" >
                        <div class="term" style="border: 1px solid #ddd; padding: 15px; text-align: center; margin-bottom: 15px; border-radius: 10px;">
                            <h3>TERM</h3>
                        </div>

                        <div id="list-major" style="border: 1px solid #ddd; padding: 10px; text-align: center; border-radius: 10px; height: 300px;">
                            <h3 style="text-align: center; color: orangered;">List Major</h3>

                            <div style="text-justify: auto; padding: 10px;">
                                <ul class="nav nav-tabs">
                                    <li class="nav-item">
                                        <a class="nav-link btn-outline-info" href="#IT" role="tab" data-toggle="tab">Information Technology</a>
                                    </li>
                                    <li class="nav-item">
                                        <a class="nav-link btn-outline-info" href="#BA" role="tab" data-toggle="tab">Business Administration</a>
                                    </li>
                                    <li class="nav-item">
                                        <a class="nav-link btn-outline-info" href="#EL"role="tab" data-toggle="tab">English Language</a>
                                    </li>
                                    <li class="nav-item">
                                        <a class="nav-link btn-outline-info" href="#JL" role="tab" data-toggle="tab">Japanese Language</a>
                                    </li>
                                    <li class="nav-item">
                                        <a class="nav-link btn-outline-info" href="#KL" role="tab" data-toggle="tab">Korean Language</a>
                                    </li>
                                </ul>

                            </div>

                        </div>
                    </div> <!-- col-left -->

                    <div class="col-8">
                        <div style="border: 1px solid #ddd; padding: 10px; margin-bottom: 15px; border-radius: 10px;">
                            <p>Start date: </p>
                            <p>End date: </p>
                        </div>

                        <div id="mutil-list" style="border: 1px solid #ddd; padding: 10px; border-radius: 10px; height: 280px;">
                            <div  class="tab-content">
                                <div role="tabpanel" class="tab-pane fade show" id="IT">
                                    <h4>Narrow Specialization</h4>
                                    <p class=" d-none d-sm-block">
                                        <label class="form-check-inline" for="radio1">
                                            <input type="radio" class="form-check-input" id="radio1" name="optradio" value="option1" >PRN211 (.NET)
                                        </label> <br>
                                        <label class="form-check-inline" for="radio2">
                                            <input type="radio" class="form-check-input" id="radio2" name="optradio" value="option2">Bridge Software Engineer (JS)
                                        </label> <br>
                                        <label class="form-check-inline" for="radio3">
                                            <input type="radio" class="form-check-input" id="radio3" name="optradio" value="option3">PRP201c (Autonomous Car)
                                        </label> <br>
                                        <label class="form-check-inline" for="radio4">
                                            <input type="radio" class="form-check-input" id="radio4" name="optradio" value="option4">PRP201c (AI with tensor flow)
                                        </label> <br>
                                        <label class="form-check-inline" for="radio5">
                                            <input type="radio" class="form-check-input" id="radio5" name="optradio" value="option5">FER201m (React/NodeJS)
                                        </label>
                                    </p>
                                    <div class="buttons" style="text-align: center;">
                                        <button type="submit" class="btn btn-success">Submit</button>        
                                    </div>
                                </div> <!-- IT -->

                                <div role="tabpanel" class="tab-pane fade show" id="BA">
                                    <h4>Narrow Specialization</h4>
                                    <p class=" d-none d-sm-block">
                                        <label class="form-check-inline" for="radio6">
                                            <input type="radio" class="form-check-input" id="radio6" name="optradio" value="option1">Digital Marketing
                                        </label> <br>
                                        <label class="form-check-inline" for="radio7">
                                            <input type="radio" class="form-check-input" id="radio7" name="optradio" value="option2">Kinh doanh quốc tế
                                        </label> <br>
                                        <label class="form-check-inline" for="radio8">
                                            <input type="radio" class="form-check-input" id="radio8" name="optradio" value="option3">Quản trị khách sạn
                                        </label> <br>
                                        <label class="form-check-inline" for="radio9">
                                            <input type="radio" class="form-check-input" id="radio9" name="optradio" value="option4">Quản trị dịch vụ du lịch và lữu hành
                                        </label> <br>
                                        <label class="form-check-inline" for="radio10">
                                            <input type="radio" class="form-check-input" id="radio10" name="optradio" value="option5">Quản trị truyền thông đa phương tiện
                                        </label>
                                    </p>
                                    <div class="buttons" style="text-align: center;">
                                        <button type="submit" class="btn btn-success">Submit</button>        
                                    </div>
                                </div> <!-- BA -->

                                <div role="tabpanel" class="tab-pane fade show" id="EL">
                                    <h4>Narrow Specialization</h4>
                                    <p class=" d-none d-sm-block">
                                        <label class="form-check-inline" for="radio11">
                                            <input type="radio" class="form-check-input" id="radio11" name="optradio" value="option1">Phiên dịch viên
                                        </label> <br>
                                        <label class="form-check-inline" for="radio12">
                                            <input type="radio" class="form-check-input" id="radio12" name="optradio" value="option2">Thư ký, trợ lý đối ngoại
                                        </label> <br>
                                        <label class="form-check-inline" for="radio13">
                                            <input type="radio" class="form-check-input" id="radio13" name="optradio" value="option3">Giảng dạy
                                        </label> <br>
                                        <label class="form-check-inline" for="radio14">
                                            <input type="radio" class="form-check-input" id="radio14" name="optradio" value="option4">Nghiên cứu viên
                                        </label>
                                    </p>
                                    <div class="buttons" style="text-align: center;">
                                        <button type="submit" class="btn btn-success">Submit</button>        
                                    </div>
                                </div> <!-- EL -->

                                <div role="tabpanel" class="tab-pane fade show" id="JL">
                                    <h4>Narrow Specialization</h4>
                                    <p class=" d-none d-sm-block">
                                        <label class="form-check-inline" for="radio15">
                                            <input type="radio" class="form-check-input" id="radio15" name="optradio" value="option1">Phiên dịch viên
                                        </label> <br>
                                        <label class="form-check-inline" for="radio16">
                                            <input type="radio" class="form-check-input" id="radio16" name="optradio" value="option2">Thư ký, trợ lý đối ngoại
                                        </label> <br>
                                        <label class="form-check-inline" for="radio17">
                                            <input type="radio" class="form-check-input" id="radio17" name="optradio" value="option3">Giảng dạy
                                        </label> <br>
                                        <label class="form-check-inline" for="radio18">
                                            <input type="radio" class="form-check-input" id="radio18" name="optradio" value="option4">Nghiên cứu viên
                                        </label>
                                    </p>
                                    <div class="buttons" style="text-align: center;">
                                        <button type="submit" class="btn btn-success">Submit</button>        
                                    </div>
                                </div> <!-- JL -->

                                <div role="tabpanel" class="tab-pane fade show" id="KL">
                                    <h4>Narrow Specialization</h4>
                                    <p class=" d-none d-sm-block">
                                        <label class="form-check-inline" for="radio19">
                                            <input type="radio" class="form-check-input" id="radio19" name="optradio" value="option1">Phiên dịch viên
                                        </label> <br>
                                        <label class="form-check-inline" for="radio20">
                                            <input type="radio" class="form-check-input" id="radio20" name="optradio" value="option2">Thư ký, trợ lý đối ngoại
                                        </label> <br>
                                        <label class="form-check-inline" for="radio21">
                                            <input type="radio" class="form-check-input" id="radio21" name="optradio" value="option3">Giảng dạy
                                        </label> <br>
                                        <label class="form-check-inline" for="radio22">
                                            <input type="radio" class="form-check-input" id="radio22" name="optradio" value="option4">Nghiên cứu viên
                                        </label>
                                    </p>
                                    <div class="buttons" style="text-align: center;">
                                        <button type="submit" class="btn btn-success">Submit</button>        
                                    </div>
                                </div> <!-- KL -->
                            </div><!-- Tab Content -->

                        </div><!-- mutil-list -->

                    </div><!-- col-right -->

                </div>
            </form>
        </div> <!-- end -->

        <footer style="background-color: #f86c24;">
            <p>Team</p>
            <p>FPT University</p>
        </footer>

    </body>
</html>
