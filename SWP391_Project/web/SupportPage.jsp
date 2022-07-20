<%-- 
    Document   : SupportAD
    Created on : Jun 28, 2022, 10:13:36 PM
    Author     : lamtr
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Supporter Management</title>
        <link rel="stylesheet" href="css/admincss.css">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-0evHe/X+R7YkIZDRvuzKMRqM+OrBnVFBL6DOitfPri4tjfHxaWutUpFmBp4vmVor" crossorigin="anonymous">
        <script src="https://kit.fontawesome.com/9b6cd90630.js" crossorigin="anonymous"></script>
        <script src="ckeditor/ckeditor.js"></script>
    </head>
    <body class="sb-nav-fixed jumbotron">

        <%@include file="HeaderSupport.jsp" %>

        <div id="layoutSidenav_content">

            <main class="container-fluid">
                <h1 class="mt-4 col-md-4"><i class="fa fa-house"></i>View Question</h1>
                <c:if test="${ not empty LIST_MESS}">
                    <div class="room container-fluid px-4">    
                        <div class="tab-content ">

                            <table class="table table-responsive table-bordered table-hover">
                                <tr class="bg-light">
                                    <th scope="col">NO</th>
                                    <th scope="col">STID</th>
                                    <th scope="col">Title</th>
                                    <th scope="col">Question</th>
                                    <th scope="col">Sent Date</th>
                                    <th scope="col">Reply</th>
                                </tr>
                                <!--Foreach -->
                                <c:forEach var="mess" items="${LIST_MESS}" varStatus="counter">
                                    <form action="MainController">
                                        <tr>
                                            <td><c:out value="${counter.count}"></c:out></td>
                                            <td><c:out value="${mess.STID}"></c:out></td>
                                            <td><c:out value="${mess.messTitle}"></c:out></td>
                                                <td>
                                                    <details>
                                                        <summary>Click</summary>
                                                        <div>${mess.messText}</div>
                                                </details>
                                            </td>
                                            <td><c:out value="${mess.messDate}"></c:out></td>
                                                <td>
                                                    <details>
                                                        <summary>Click</summary>
                                                        <div class="row">
                                                            <div class="col-md-10">
                                                                <textarea class="w-100" style="height: 75px;" id="reply" name="reply"></textarea>
                                                            </div>
                                                            <div class="col-md-2">
                                                                <button type="submit" name="action" value="Reply"><i class="fa-solid fa-reply"></i></button>
                                                                <input type="hidden" name="STID" value="${mess.STID}"/>
                                                            <input type="hidden" name="SPID" value="${mess.SPID}"/>
                                                            <input type="hidden" name="messID" value="${mess.messID}"/>
                                                        </div>
                                                    </div>
                                                </details>
                                            </td>
                                        </tr>
                                    </form>

                                </c:forEach>

                                <!--Foreach -->
                            </table>
                        </div>


                    </div>
                </c:if>
                <p style="color: red;">${ERROR}</p>
            </main>
            <%@include file="Footer.jsp" %>
        </div>
    </div>

    <script src="https://cdn.jsdelivr.net/npm/simple-datatables@latest" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" crossorigin="anonymous"></script>
    <script src="https://use.fontawesome.com/releases/v6.1.0/js/all.js" crossorigin="anonymous"></script>
    <script>
        CKEDITOR.replace('reply');
    </script>
</body>
</html>
