<%--
  Created by IntelliJ IDEA.
  User: elwyn
  Date: 3/11/2018
  Time: 12:56
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
    <body class="fixed-nav sticky-footer bg-dark" id="page-top">
        <jsp:include page="header.jsp"></jsp:include>

            <div class="content-wrapper">
                <div class="container-fluid">
                    <!-- Breadcrumbs-->
                    <ol class="breadcrumb">
                        <li class="breadcrumb-item">
                            <a href="">Student</a>
                        </li>
                        <li class="breadcrumb-item active">Add</li>
                    </ol>
                    <div class="row">
                        <div class="col-12">
                            <h1>Add new student</h1>
                        </div>
                        <div class="container">
                            <div class="card card-register mx-auto mt-5">
                                <div class="card-header">New Student Information</div>
                                <div class="card-body">
                                    <form action="${pageContext.request.contextPath}/admin/student/add" method="post">
                                    <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" />
                                    <div class="form-group">
                                        <label for="exampleInputFirstName">First Name</label>
                                        <input class="form-control" name="firstName" id="exampleInputFirstName" type="text" placeholder="Enter student first name">
                                    </div>
                                    <div class="form-group">
                                        <label for="exampleInputLastName">Last Name</label>
                                        <input class="form-control" name="lastName" id="exampleInputLastName" type="text" placeholder="Enter student last name">
                                    </div>
                                    <div class="form-group">
                                        <label for="exampleInputCountry">Country</label>
                                        <select name="country" class="form-control" id="exampleInputCountry">
                                            <option>Nepal</option>
                                            <option>India</option>
                                            <option>China</option>
                                            <option>USA</option>
                                            <option>UK</option>
                                            <option>Norway</option>
                                            <option>Canada</option>
                                        </select>
                                    </div>
                                    <div class="form-group">
                                        <%--<label>Gender</label>--%>
                                        <%--<input class="form-control" name="sGender" type="radio" value="Male">Male--%>
                                        <%--<input class="form-control" name="sGender" type="radio" value="Female">Female--%>
                                        <label for="radioGender">Gender</label><br />
                                        <div class="form-control" id="radioGender">
                                            <input id="radioMale" name="gender" type="radio" value="Male"> Male &nbsp;
                                            <input id="radioFemale" name="gender" type="radio" value="Female"> Female
                                        </div>
                                    </div>
                                    <div class="form-group">
                                        <label for="checkboxHobbies">Hobbies</label>
                                        <div class="form-control" id="checkboxHobbies">
                                            <input name="hobbies" type="checkbox" value="Coding"> Coding &nbsp;
                                            <input name="hobbies" type="checkbox" value="Music"> Music &nbsp;
                                            <input name="hobbies" type="checkbox" value="Dancing"> Dancing &nbsp;
                                            <input name="hobbies" type="checkbox" value="Playing"> Playing
                                        </div>
                                    </div>
                                    <input type="submit" class="btn btn-primary btn-block" value="Add">
                                </form>
                            </div>
                        </div>
                    </div>
                </div><!---row-close---->
            </div><!---container-fluid-close---><br />

            <jsp:include page="footer.jsp"></jsp:include>
        </div><!---content-wrapper-close---->
    </body>
</html>
