
<%--
  Created by IntelliJ IDEA.
  User: elwyn
  Date: 3/20/2018
  Time: 17:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <%--<%@ include file="pageHeader.jsp" %>--%><!---for-static-webpage--->
    <jsp:include page="pageHeader.jsp">
        <jsp:param name="title" value="IMS"></jsp:param>
    </jsp:include><!----used for dynamic webpage---->
</head>
<body class="fixed-nav sticky-footer bg-dark" id="page-top">
<jsp:include page="header.jsp"></jsp:include>

<div class="content-wrapper">
    <div class="container-fluid">
        <!-- Breadcrumbs-->
        <ol class="breadcrumb">
            <li class="breadcrumb-item">
                <a href="">Enrolled Student</a>
            </li>
            <li class="breadcrumb-item active">Display</li>
        </ol>

        <!-- Example DataTables Card-->
        <div class="card mb-3">
            <div class="card-header">
                <i class="fa fa-table"></i> Student Course Information</div>
            <div class="card-body">
                <div class="table-responsive">
                    <table class="table table-bordered" id="dataTable" width="100%" cellspacing="0">
                        <thead>
                        <tr>
                            <th>S.No</th>
                            <th>Student Id</th>
                            <th>Student Name</th>
                            <th>Course Id</th>
                            <th>Course Title</th>
                            <th>Delete</th>
                        </tr>
                        </thead>
                        <tfoot>
                        <tr>
                            <th>S.No</th>
                            <th>Student Id</th>
                            <th>Student Name</th>
                            <th>Course Id</th>
                            <th>Course Title</th>
                            <th>Delete</th>
                        </tr>
                        </tfoot>
                        <tbody>
                        <c:forEach items="${SCDetails}" var="SC">
                            <tr>
                                <td>${SC.studentCourseId}</td>
                                <td>${SC.studentId}</td>
                                <td>${SC.studentName}</td>
                                <td>${SC.courseId}</td>
                                <td>${SC.courseName}</td>
                                <td><a href="${cp}/admin/relationship/delete?id=${SC.studentCourseId}">Delete</a></td>
                            </tr>
                        </c:forEach>
                        </tbody>
                    </table>
                </div>
            </div>
            <div class="card-footer small text-muted">Updated yesterday at 11:59 PM</div>
        </div>
    </div><!---container-fluid-close--->


    <jsp:include page="footer.jsp"></jsp:include>
</div><!---content-wrapper-close---->
</body>
</html>
