<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"  isELIgnored="false"%>
<%@taglib uri="http://www.springframework.org/tags/form"   prefix="form"%>

<h1 style="color:red;text-align:center"> Registration Form </h1>

<form:form  method="POST"  commandName="regCmd">
    <p  style="color:red">
         <form:errors path="*"/>
    </p>
    Student name ::  <form:input path="studName"/>  <br>
    Student Addrs ::  <form:input path="studAddrs"/>  <br>
    Student DOB :: <form:input path="dob"/>(dd-MM-yyyy) <br>
    Student DOJ :: <form:input path="doj"/>(dd-MM-yyyy) <br>
     <input type="submit"  value="register"/>                                              

</form:form>    
