<%-- 
    Document   : displayContactMessage
    Created on : Apr 17, 2018, 8:40:23 PM
    Author     : elwyn
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <jsp:include page="pageHeader.jsp">
            <jsp:param name="title" value="IMS"></jsp:param>
        </jsp:include><!----used for dynamic webpage---->
    </head>
    <body class="fixed-nav sticky-footer bg-dark" id="page-top" onload="startTime()">
        <jsp:include page="header.jsp"></jsp:include>

            <div class="content-wrapper">
                <div class="container-fluid">
                    <!-- Breadcrumbs-->
                    <ol class="breadcrumb">
                        <li class="breadcrumb-item">
                            <a href="${pageContext.request.contextPath}/admin/message/display">Contact</a>
                        </li>
                        <li class="breadcrumb-item active">Display</li>
                    </ol>
                </div><!---container-fluid-close--->
                
                <div class="row">
                    <div class="col-sm-12 jumbotron">
                        <h1>Displaying Messages</h1>
                        <hr />
                        <c:forEach items="${ContactDetails}" var="Contact" varStatus="status">
                            <strong>Name:<span class="small"> ${Contact.name}</span></strong><br />
                            <strong>Email:<span class="small"> ${Contact.email}</span></strong><br />
                            <strong>Website:<span class="small"> ${Contact.website}</span></strong><br />
                            <strong>Message:<span class="small"> ${Contact.message}</span></strong>
                            <hr />
                            <c:if test="${status.last}">${Contact.name}</c:if>
                        </c:forEach>
                        
                    </div>
                </div><!---row-close-->
                
                <jsp:include page="footer.jsp"></jsp:include>
            </div><!---content-wrapper-close---->
</body>
</html>
