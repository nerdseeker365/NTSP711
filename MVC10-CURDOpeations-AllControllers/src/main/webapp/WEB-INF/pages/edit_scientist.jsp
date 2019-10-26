<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"  isELIgnored="false"%>
<%@taglib uri="http://www.springframework.org/tags/form"  prefix="form" %>
 <body bgcolor="cyan">
   <h1 style="color:red;text-align:center"> Edit Scientist Details  </h1>
<table   style="align-items: center "   >
    <form:form  method="POST"  commandName="scCmd">
  <tr>
      <td> Scientist ID:: </td>
      <td> <form:input path="id"  disabled="true"/> </td>
   </tr>
   <tr>
      <td> Scientist Name:: </td>
      <td> <form:input path="name"/> </td>
   </tr>
   <tr>
      <td> Scientist Domain:: </td>
      <td> <form:input path="domain"/> </td>
   </tr>
   <tr>
      <td> Scientist Experience:: </td>
      <td> <form:input path="experience"/> </td>
   </tr>
   <tr>
      <td> Patents Count:: </td>
      <td> <form:input path="patentsCount"/> </td>
   </tr>
   
   <tr>
      <td><input type="submit"  value="edit"/> </td>
      <td><input type="reset"  value="cancel"/>  </td>
   </tr>
   
  </form:form>
  
  </table>    
</body>