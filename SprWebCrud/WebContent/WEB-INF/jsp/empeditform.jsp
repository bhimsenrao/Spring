<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    
  
        <h1>Edit Employee</h1>  
        ${command.id}
        
       <form:form method="POST" action="/SprWebCrud/editsave">    
        <table >     
        <tr>  
        <td></td>    
         <td><form:hidden  path="id" value="${emp.id}"/></td>  
         </tr>   
         <tr>    
          <td>Name : </td>   
          <td><form:input path="name" value="${emp.name}"  /></td>  
         </tr>    
         <tr>    
          <td>Salary :</td>    
          <td><form:input path="salary" value="${emp.salary}" /></td>  
         </tr>   
         <tr>    
          <td>Designation :</td>    
          <td><form:input path="designation" value="${emp.designation}"/></td>  
         </tr>   
           
         <tr>    
          <td> </td>    
          <td><input type="submit" value="Edit Save" /></td>    
         </tr>    
        </table>    
       </form:form>   