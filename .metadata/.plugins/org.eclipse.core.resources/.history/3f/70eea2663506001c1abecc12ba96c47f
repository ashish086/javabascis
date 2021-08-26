<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
 <title>Placement Management Application</title>
</head>
<body>
 <center>
  <h1>Placement Management</h1>
        <h2>
         <a href="new">Add New Student</a>
         &nbsp;&nbsp;&nbsp;
         <a href="list">List All Students with Departments</a>
         
        </h2>
 </center>
    <div align="center">
  <c:if test="${user != null}">
   <form action="update" method="post">
        </c:if>
        <c:if test="${user == null}">
   <form action="insert" method="post">
        </c:if>
        <table border="1" cellpadding="5">
            <caption>
             <h2>
              <c:if test="${user != null}">
               Edit Details
              </c:if>
              <c:if test="${user == null}">
               Add New Student
              </c:if>
             </h2>
            </caption>
          <c:if test="${user != null}">
           <input type="hidden" name="id" value="<c:out value='${user.id}' />" />
          </c:if>            
            <tr>
                <th>Student Name: </th>
                <td>
                 <input type="text" name="name" size="45"
                   value="<c:out value='${user.name}' />"
                  />
                </td>
            </tr>
            <tr>
                <th>Student department: </th>
                <td>
                 <input type="text" name="department" size="45"
                   value="<c:out value='${user.department}' />"
                 />
                </td>
            </tr>
            <tr>
                <th>Student Emailid: </th>
                <td>
                 <input type="text" name="emailid" size="15"
                   value="<c:out value='${user.emailid}' />"
                 />
                </td>
            </tr>
            <tr>
             <td colspan="2" align="center">
              <input type="submit" value="Save" />
             </td>
            </tr>
        </table>
        </form>
    </div> 
</body>
</html>