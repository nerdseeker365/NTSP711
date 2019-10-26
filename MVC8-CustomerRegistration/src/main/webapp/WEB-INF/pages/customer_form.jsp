<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@taglib uri="http://www.springframework.org/tags/form"  prefix="form" %>    
    
    
    <h1 style="color:red;text-align:center"> Customer Registration form </h1>
    
    <form:form  method="POST"  commandName="custCmd">
         Customer name :: <form:input path="cname"/> <br>
         Customer Addrs ::  <form:input path="addrs"/> <br>
         Customer mobileNo :: <form:input path="mobileNo"/> <br>
         bill Amount :: <form:input path="billAmt"/> <br>
         <input type="submit"  value="register"/>
    </form:form>
    
    
    
