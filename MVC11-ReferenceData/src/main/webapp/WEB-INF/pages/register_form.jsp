<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"  isELIgnored="false"%>
<%@taglib uri="http://www.springframework.org/tags/form"   prefix="form"%>

<form:form  method="POST"  commandName="regCmd">
    <p  style="color:red">
         <form:errors path="*"/>
    </p>
    Customer name ::  <form:input path="custName"/>  <br>
    Customer Addrs ::  <form:input path="custAddrs"/>  <br>
    Gender ::  <form:radiobuttons path="gender"  items="${gendersList}"/> <br>
    Country ::  <form:select path="country">
                                 <form:options items="${countriesList}"/>
                             </form:select>  <br>
    Hobies  ::  <form:checkboxes items="${hobiesList}" path="hobies"/>  <br>
    Products ::  <form:select path="products" multiple="multiple" >
                                         <form:options items="${productsList}"/>
                              </form:select>              <bR>
   <input type="submit"  value="register"/>                                              

</form:form>    
