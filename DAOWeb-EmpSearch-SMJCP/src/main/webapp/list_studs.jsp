<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false" import="java.util.*"%>
    
 <%
      //read request attribute value
      List<Map<String,Object>>  list=(List<Map<String,Object>>)request.getAttribute("studList");
        if(list!=null){  %>
            <table border="1"  align="center">
                <tr>
                    <th>Sno</th> <th>sname </th><th> sadd </th>
                </tr>
                <%
                    for(Map<String,Object> map:list){ %>
                    	<tr>
                    	   <td><%=map.get("SNO") %> </td>
                    	   <td><%=map.get("SNAME") %> </td>
                    	   <td><%=map.get("SADD") %> </td>
                    	</tr>
                   <% }//for
                     %>
            </table>
            <%}//if 
        else{  %>
        	  <b> Records not found </b>
     <%   } %>
     
