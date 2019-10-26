<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c" %>

<c:choose>
   <c:when test="${!empty  searchResults }">
      <table border="1">
         <tr>
            <th>SrNo</th> <th>empno </th><th>EmpName</th> <th>job </th><th>sal</th><th>mgr</th><th>deptNo</th> 
         </tr>
          <c:forEach  var="emp"  items="${searchResults}">
               <tr>
                  <td>${emp.srNo}  </td>
                  <td>${emp.empNo}  </td>
                  <td>${emp.ename}  </td>
                  <td>${emp.job}  </td>
                  <td>${emp.sal}  </td>
                  <td>${emp.mgr}  </td>
                  <td>${emp.deptNo}  </td>
               </tr>
          </c:forEach>
      </table>
   </c:when>

  <c:otherwise>
      <h1 style="color:red;text-align:center"> Employees not found </h1>
  </c:otherwise>
</c:choose>    
<br>
 <a href="home.htm">home</a>