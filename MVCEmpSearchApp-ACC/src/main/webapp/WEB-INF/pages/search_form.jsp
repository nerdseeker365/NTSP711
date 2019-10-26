<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

    <h1 style="color:red;text-align:center"> Search Details</h1>
    
    <form action="search.htm"   method="POST">
        Employee number  :: <input  type="text" name="empNo">  <br>
        Employee Name  :: <input  type="text" name="ename">  <br>
       JOB  :: <input  type="text" name="job">  <br>
       salary  :: <input  type="text" name="sal">  <br>
        <input type="submit"  value="search">
    </form>