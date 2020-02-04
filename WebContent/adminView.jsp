<%@page import="chatBotNlpBhortiBondhu.AdminInfoModel" %>
<%@page import="java.util.List" %>

<%@page import="java.sql.DriverManager" %>

<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Bhorti Bondhu- Your Admission guide!!!</title>
</head>
 <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
  
  
  <style>
  

  
  </style>
  
<body>


<%
HttpSession s= request.getSession();  
//AdminInfoModel e = (AdminInfoModel)request.getAttribute("ad");
AdminInfoModel e = (AdminInfoModel)s.getAttribute("ad");


out.println("<h2  align=\"center\">"+"HI, Admin: "+e.getUsername()+" !"+"</h2>");

out.print("\n");
%>

<%
//out.print(e.getUsername());
%>




<%

//List<AdminInfoModel> e2 = (List<AdminInfoModel>)request.getAttribute("lp");

List<AdminInfoModel> e2 = (List<AdminInfoModel>)s.getAttribute("lp");
for (AdminInfoModel st : e2 ){
	out.println(st.getFullName()+" "+st.getPassword());
}




  

%>

<!-- Default form contact -->
<form class="text-center border border-light p-5" action="Dataset1Controller" method="post">

    <p class="h4 mb-4">Add new questions and answers!!</p>

    <!-- Name -->
    <input type="text" id="defaultContactFormName" class="form-control mb-4" placeholder="question" name ="question">

  

  
    <!-- Message -->
    <div class="form-group">
        <textarea class="form-control rounded-0" id="exampleFormControlTextarea2" rows="15" placeholder="Answer" name="answer"></textarea>
    </div>



  
   



 
    <!-- Send button -->
    <button class="btn btn-info btn-block" type="submit">Submit</button>
    

</form>


 <form class="text-center border border-light p-5" action="dataset1UpdateController" method="post">

    <p class="h4 mb-4">Do u want to update?</p>

    <!-- Name -->
    <input type="text" id="defaultContactFormName" class="form-control mb-4" placeholder="question" name ="upQuestion">

  

  
    <!-- Message -->
    <div class="form-group">
        <textarea class="form-control rounded-0" id="exampleFormControlTextarea2" rows="15" placeholder="Answer" name="upAnswer"></textarea>
    </div>



  
   



 
    <!-- Send button -->
    <button class="btn btn-info btn-block" type="submit">UPDATE</button>
    

</form>
 



<form class="text-center border border-light p-5" action="Dataset1DeleteController" method="post">

    <p class="h4 mb-4">Do u want to Delete?</p>

    <!-- Name -->
    <input type="text" id="d" class="form-control mb-4" placeholder="question" name ="delQuestion">

  

  
    <!-- Message -->
   


  
   



 
    <!-- Send button -->
    <button class="btn btn-info btn-block" type="submit">DELETE</button>
    

</form>
 
  
 
 

<!-- Default form contact -->






<table class="table table-dark">
  <thead>
    <tr>
      
      <th scope="col">Admin</th>
      <th scope="col">Password</th>
      
    </tr>
  </thead>
  <tbody>
   
    <%
    
   

for (AdminInfoModel sy : e2 ){
	out.print("<tr>");
	String ff1 ="<td>"+sy.getFullName()+"</td>";
	String ff2 ="<td>"+sy.getPassword()+"</td>";
	out.print(ff1);
	out.print(ff2);
	out.print("</tr>");
}
    %>

  
  
</tbody>
</table>








</body>








</html>