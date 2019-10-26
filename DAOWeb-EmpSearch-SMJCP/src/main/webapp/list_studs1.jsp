<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c" %>

<c:choose>
   <c:when test="${!empty studList }">
       <table border="1">
            <tr>
               <th>Sno </th><th>sname</th><th>sadd </th>
            </tr>
            <c:forEach var="map" items="${studList }">
                <tr>
                   <td>${map.sno} </td>
                   <td>${map.sname} </td>
                   <td>${map.sadd} </td>
                </tr>
            </c:forEach>
       </table>
   </c:when>
   <c:otherwise>
              <h1> Records not found</h1>
   </c:otherwise>
</c:choose>


