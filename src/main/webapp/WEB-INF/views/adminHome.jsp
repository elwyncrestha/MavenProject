<%--
  Created by IntelliJ IDEA.
  User: elwyn
  Date: 2/19/2018
  Time: 12:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <%--<%@ include file="pageHeader.jsp" %>--%><!---for-static-webpage--->
        <jsp:include page="pageHeader.jsp">
            <jsp:param name="title" value="IMS"></jsp:param>
        </jsp:include><!----used for dynamic webpage---->
    </head>

    <!---time-script-->
    <script>
        function startTime() {
            var today = new Date();
            var h = today.getHours();
            var m = today.getMinutes();
            var s = today.getSeconds();
            m = checkTime(m);
            s = checkTime(s);
            document.getElementById('txt').innerHTML =
                    h + "hr : " + m + "m : " + s + "sec";
            var t = setTimeout(startTime, 500);
        }
        function checkTime(i) {
            if (i < 10) {
                i = "0" + i
            }
            ;  // add zero in front of numbers < 10
            return i;
        }
    </script>
    
    

    <body class="fixed-nav sticky-footer bg-dark" id="page-top" onload="startTime()">
        <jsp:include page="header.jsp"></jsp:include>

            <div class="content-wrapper">
                <div class="container-fluid">
                    <!-- Breadcrumbs-->
                    <ol class="breadcrumb">
                        <li class="breadcrumb-item">
                            <a href="${pageContext.request.contextPath}/admin/dashboard">Dashboard</a>
                    </li>
                    <li class="breadcrumb-item active">IMS</li>
                </ol>
                <div class="row">
                    <div class="col-12 jumbotron">
                        <h1>Institute Management System</h1>
                        <p>Contains student and course information. Manages examination. Protected by spring token login.</p>
                    </div>
                </div><!---row-close---->

                <div class="row">
                    <div class="col-sm-12 jumbotron">
                        <h1>Current <span class="small">(GMT + 5:45)</span> time is: <span id="txt"></span></h1>
                    </div><!---well-close-->
                </div><!---row-close-->
            </div><!---container-fluid-close--->


            <jsp:include page="footer.jsp"></jsp:include>
        </div><!---content-wrapper-close---->
    </body>
</html>
