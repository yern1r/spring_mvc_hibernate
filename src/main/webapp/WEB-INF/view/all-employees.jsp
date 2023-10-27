<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%--
  Created by IntelliJ IDEA.
  User: apple
  Date: 25.10.2023
  Time: 8:46 AM
  To change this template use File | Settings | File Templates.
--%>

<html>
<head>
    <title>All employees</title>
</head>
<body>

<h2>All Employees</h2>
<br>
<table>
    <tr>
        <th>Name</th>
        <th>Surname</th>
        <th>Department</th>
        <th>Salary</th>
        <th>Operations</th>
    </tr>

    <c:forEach var="emp" items="${allEmps}">

        <c:url  var="updateButton" value="/updateInfo">
            <c:param name="empId" value="${emp.employer_id}"/>
        </c:url>
        <tr>
            <td>${emp.name}</td>
            <td>${emp.surname}</td>
            <td>${emp.department}</td>
            <td>${emp.salary}</td>
            <td>
                <input type="button" value="Update"
                onclick="window.location.href='${updateButton}'"/>
            </td>
            <td>
                <input type="button" value="Delete"
                onclick="">
            </td>
        </tr>

    </c:forEach>
</table>

<br>
<input type="button" value="Add"
       onclick="window.location.href = 'addNewEmployee' ">
</body>
</html>
