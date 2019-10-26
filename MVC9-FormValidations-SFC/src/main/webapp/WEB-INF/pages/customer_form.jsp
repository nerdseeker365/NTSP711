<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@taglib uri="http://www.springframework.org/tags/form"  prefix="form" %>    
    
    
    <h1 style="color:red;text-align:center"> Customer Registration form </h1>
    
     <script type="text/javascript"  src="js/validation.js">
</script> 
    
    <form:form  method="POST"  commandName="custCmd"  onsubmit="return  validate(this)">
       <%--  <p style="color:red">
            <form:errors  path="*"/>
        </p> --%>
         Customer name :: <form:input path="cname"/><span id="name.err"> </span><form:errors  cssStyle="color:red" path="cname"/> <br>
         Customer Addrs ::  <form:input path="addrs"/><span id="addrs.err"> </span><form:errors path="addrs"/> <br>
         Customer mobileNo :: <form:input path="mobileNo"/><span id="mobileNo.err"> </span><form:errors path="mobileNo"/> <br>
         bill Amount :: <form:input path="billAmt"/><span id="billAmt.err"> </span><form:errors path="billAmt"/> <br>
          <form:hidden path="vflag" />
         <input type="submit"  value="register"/>
    </form:form>
    
    <style>
   span {
        font-family: verdana; 
        font-size: x-small;
        color: red;
    }
   
</style>
    
    
    
