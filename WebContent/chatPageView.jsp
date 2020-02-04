
<%@page import="chatBotNlpBhortiBondhu.userInfoModel" %>
<%@page import="chatBotNlpBhortiBondhu.Dataset1Model" %>
<%@page import="chatBotNlpBhortiBondhu.Dataset1DbUtil " %>
<%@page import="java.util.*" %>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
  
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>

<a href="Logout.jsp" class="btn btn-primary btn-lg" role="button">LOG OUT</a>


<h1></h1>
<h1></h1>
<%! 

String user = "GUEST";

%>


<%
HttpSession se=request.getSession();


	userInfoModel r = (userInfoModel) se.getAttribute("uu");

	//out.print(r.getRegEmail());

	if ((r.getRegEmail())!=null){
		
		user = r.getRegEmail();
	}

	 
	

out.print(user+ "আপনাকে স্বাগতম , আমাকে যেকোনো বিশ্ববিদ্যালয় ভর্তি সংক্রান্ত তথ্য  জিজ্ঞাসা করুন. অনুগ্রহ করে আপনার প্রশ্ন টি ইংলিশ এ করুন, আমাকে এখনো বাংলা শিখানো  হয়নি ");
%>

<%
Dataset1DbUtil ds = new Dataset1DbUtil();

List<Dataset1Model> jj;

jj = ds.showTable1();

//out.print(jj.size());
Vector<String> ans_vec = new Vector<String>(); 
Vector<String> ques_vec = new Vector<String>(); 



//for (Dataset1Model w : jj){
	
	//out.print(w.getQues());
	
//	ques_vec.add(w.getQues());
//	ans_vec.add(w.getAns());
	
//}

//out.print(ans_vec.size());


%>




<form method="post" action="kk.jsp">

Enter Your Question: <input type="text" name="ic">

<h1></h1>
 

<button type="submit" class="btn btn-primary btn-lg">Enter</button>
</form>



<h1></h1>
<h1></h1>
<h2>Thank you for your question, Reply from Admin:</h2>
<h2></h2>
<%

String nn = (String)request.getAttribute("hj1");

if (nn !=null){
	
	out.print(nn);
	nn="";
	}


%>
</body>
</html>