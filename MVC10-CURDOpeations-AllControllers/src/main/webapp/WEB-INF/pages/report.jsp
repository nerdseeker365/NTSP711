<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"  isELIgnored="false"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core"   prefix="c"%>
    

    
<h1 style="color:blue;text-align:center"> All  Scientists Details </h1>


<c:choose>
 <c:when test="${!empty listDTO }">
    <table   border="1"  style="color: red;background: orange;align-self: center"> 
      <tr><th>SRNO</th><th>ID</th><th>name</th><th>Domain </th> <th>Experience</th><th>PatentsCount </th> <th>Operations </th>  </tr>
     <c:forEach  var="dto"  items="${listDTO}">
        <tr  background="blue" style="color:yellow">
           <td>${dto.srno}  </td>
           <td>${dto.id}  </td>
           <td>${dto.name}  </td>
           <td>${dto.domain}  </td>
           <td>${dto.experience}  </td>
           <td>${dto.patentsCount}  </td>
           <td>
            <a href="edit.htm?id=${dto.id}"><img src="images/edit1.png" width="30" height="30"></a>
              &nbsp;&nbsp;
              <a href="delete.htm?id=${dto.id}"  onclick=" confirmDelete(${dto.name})"><img src="images/delete1.jpg" width="30" height="30"></a>
             </td>
        </tr>
     </c:forEach>      
    </table>
 </c:when>
   <c:otherwise>
        <h1 style="color:red;text-align:center"> Records not Found </h1>
   </c:otherwise>
</c:choose>
 <br><br>
   <h1 style="color:blue;text-align:center">${resultMsg }  </h1>
 <script language="JavaScript">
    function confirmDelete(name){
    	alert("1");
    	return  confirm('Do U want to delete'+name+' scientist');
    }
 
 </script>

    