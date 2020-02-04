<%@page import="java.io.*"%>

<!DOCTYPE html>
<html>
<head>
 <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
<style>
body { 
  background-image: url('backg.png');
  background-repeat: no-repeat;
  background-attachment: fixed;
  background-position: center; 
   background-color: black;
 }

legend { 
  display: block;
  padding-left: 2px;
  padding-right: 2px;
  border: none;
}

#btnuser {  
    margin-left: 450px;
    margin-top: 550px;
   
}
#btnuser1 {  
    margin-left: 4px;
    margin-top: 550px;
   
}
#btnuser2 {  
    margin-left: 7px;
    margin-top: 550px;
   
}

</style>
<meta charset="ISO-8859-1">
<title>Welcome to Bhortibondhu- your Admission Test Guide!</title>
</head>
<body >
<a href="" class="btn btn-primary btn-lg" role="button" id="btnuser"  data-toggle="modal" data-target="#userM">USER</a>
<a href="" class="btn btn-primary btn-lg" role="button" id="btnuser1" data-toggle="modal" data-target="#adminM">ADMIN</a>

<a href="chatPageView.jsp" class="btn btn-danger btn-lg" role="button" id="btnuser2">CHAT WITH US AS A GUEST?</a>


  <!-- Modal -->
  <div class="modal fade" id="adminM" role="dialog">
    <div class="modal-dialog">
    
      <!-- Modal content-->
      <div class="modal-content">
        <div class="modal-header">
          
        <div class="modal-body">
          <h2>ADMIN LOGIN</h2>
          
          
          <form action="adminController" method="post">
          
          USER NAME: <input type="text" name="adminuname">
          
          <h1></h1>
          
          PASSWORD : <input type="password" name="adminpass" >
            <h1></h1>
          <button type="submit" class="btn btn-danger">LOGIN</button>
          
          
          </form>
          
          
        </div>
        <div class="modal-footer">
          <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
        </div>
      </div>
      
    </div>
  </div>
  
</div>
<!-- eror-->






<!-- Modal user-->
  <div class="modal fade" id="userM" role="dialog">
    <div class="modal-dialog">
    
      <!-- Modal content-->
      <div class="modal-content">
        <div class="modal-header">
          
        <div class="modal-body">
          <h2>USER LOGIN</h2>
          
          
          <form action="userLogin" method="post">
          
          USER EMAIL: <input type="text" name="sname">
          
          <h1></h1>
          
          PASSWORD : <input type="password" name="spass" >
            <h1></h1>
          <button type="submit" class="btn btn-danger">LOGIN</button>
          </form>
          <h1></h1>
            <h2>USER REGISTER</h2>
          
          
          <form action="userController" method="post">
          
          USER EMAIL: <input type="text" name="regname">
          
          <h1></h1>
          
          PASSWORD : <input type="password" name="regpass" >
          
          
         
          
          
            <h1></h1>
          <button type="submit" class="btn btn-danger">REGISTER</button>
          </form>
          
        </div>
        <div class="modal-footer">
          <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
        </div>
      </div>
      
    </div>
  </div>
  
</div>


  


</body>
</html>