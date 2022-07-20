<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%-- 
    Document   : AddSpecialization
    Created on : Jun 8, 2022, 11:28:19 PM
    Author     : user
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Add Narrow</title>
        <link rel="stylesheet" href="css/admincss.css">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-0evHe/X+R7YkIZDRvuzKMRqM+OrBnVFBL6DOitfPri4tjfHxaWutUpFmBp4vmVor" crossorigin="anonymous">
        <script src="https://kit.fontawesome.com/9b6cd90630.js" crossorigin="anonymous"></script>
        <script src="ckeditor/ckeditor.js"></script>
    </head>
    <body class="sb-nav-fixed jumbotron">

        <%@include file="Header.jsp" %>

        <div id="layoutSidenav_content">

            <main class="container-fluid">
                <h1 class="mt-4 col-md-4"><i class="fa fa-house"></i>Narrow Management</h1>


                <div class="room container-fluid px-4">    
                    <div class="tab-content ">
                        <form action="MainController">
                            <table class="table w-50 table-borderless">
                                <tr>
                                    <td></td>
                                    <td style="font-weight: bold;font-size: large">ADD NARROW</td>
                                </tr>
                                <tr>
                                    <td>ID</td>
                                    <td>
                                        <input value="${requestScope.NARROW.narrowID}" type="text" name="narrowID" class="form-control" placeholder="Enter ID...">
                                    </td>
                                    <td>
                                        <p style="color: red;">${requestScope.ERROR.narrowID}</p>
                                    </td>
                                </tr>

                                <tr>
                                    <td>Name</td>
                                    <td>
                                        <input value="${requestScope.NARROW.narrowName}" type="text" name="narrowName" class="form-control" placeholder="Enter Name...">
                                    </td>
                                    <td>
                                        <p style="color: red;">${requestScope.ERROR.narrowName}</p>
                                    </td>
                                </tr>
                                <tr>
                                    <td>LinkFLM</td>
                                    <td>
                                        <input value="${requestScope.NARROW.linkFLM}" type="text" name="linkFLM" class="form-control" placeholder="Enter Link...">
                                    </td>

                                </tr>
                                <tr>
                                    <td>Description</td>
                                    <td>
                                        <textarea style="width: 820px; height: 175px;" id="description"  type="text" name="description">${requestScope.NARROW.description}</textarea>
                                    </td>
                                </tr>
                                <tr>
                                    <td>MajorID</td>
                                    <td>
                                        <select class="form-select w-25" name="majorID">
                                            <c:forEach var="major" items="${requestScope.LIST_MAJOR}">
                                                <c:choose>
                                                    <c:when test="${requestScope.CURRENT_MAJORID == major.majorID}">
                                                        <option value="${major.majorID}" selected="true">${major.majorID}</option>
                                                    </c:when>    
                                                    <c:otherwise>
                                                        <option value="${major.majorID}">${major.majorID}</option>
                                                    </c:otherwise>
                                                </c:choose>
                                            </c:forEach>
                                        </select>
                                    </td>
                                </tr>

                                <tr style="text-align: center;">
                                    <td colspan="2">
                                        <button class="btn btn-success" type="submit" name="action" id="sumbitButton" value="Add Narrow">Add</button>
                                    </td>
                                </tr>
                                <tr style="text-align: center;">
                                    <td colspan="2">
                                        <input class="button btn btn-danger" type="reset" name="action" value="Reset">
                                    </td>
                                </tr>
                            </table>
                        </form>
                    </div>


                </div>
            </main>
            <%@include file="Footer.jsp" %>
        </div>
    </div>



    <script src="https://cdn.jsdelivr.net/npm/simple-datatables@latest" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" crossorigin="anonymous"></script>
    <script src="https://use.fontawesome.com/releases/v6.1.0/js/all.js" crossorigin="anonymous"></script>
    <script>
        CKEDITOR.replace('description');
    </script>

</body>
</html>