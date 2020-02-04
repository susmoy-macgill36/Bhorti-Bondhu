

<%@page import="chatBotNlpBhortiBondhu.userInfoModel" %>
<%@page import="chatBotNlpBhortiBondhu.Dataset1Model" %>
<%@page import="chatBotNlpBhortiBondhu.Dataset1DbUtil " %>
<%@page import="chatBotNlpBhortiBondhu.TestM " %>
<%@page import="java.util.*" %>


<%@page import="java.util.Collections" %>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

hello
<%

Dataset1DbUtil ds = new Dataset1DbUtil();

List<Dataset1Model> jj;

jj = ds.showTable1();
out.print(jj.size());

Vector<String> ans_vec = new Vector<String>(); 
Vector<String> ques_vec = new Vector<String>(); 

for (Dataset1Model w : jj){

	//out.print(w.getQues());
	
	ques_vec.add(w.getQues());
	//ans_vec.add(w.getAns());
	
}

for (Dataset1Model w1 : jj){

	//out.print(w.getQues());
	
	//ques_vec.add(w.getQues());
	ans_vec.add(w1.getAns());
	
}

String bb = (String) request.getParameter("ic").toLowerCase();

String io = bb.replaceAll("\\p{Punct}","");
out.print(io);

TestM m = new TestM();

//request.setAttribute("bb",bb);

//RequestDispatcher ii = request.getRequestDispatcher("chatPageView.jsp");

//ii.forward(request, response);

Vector<Double> dist = new Vector<Double>();
for (int i =0; i<ques_vec.size();i++)
{
	
	dist.add(m.compareStrings(io,ques_vec.get(i)));
	
	
	
	
}


for (int i4 =0; i4< ques_vec.size(); i4++){
	
	
	out.print(ques_vec.get(i4));
	out.print("\n");
	
}

for (int i1 =0; i1<dist.size();i1++)
{
	
	out.print("\n");
	out.print(dist.get(i1));
}

Object obj = Collections.max(dist);

out.print(obj);


Double yu = (Double)obj;

out.print(yu);


int indx = 0;



for (int i1 =0; i1<dist.size();i1++)
{
	
	if (yu==dist.get(i1)){
		
		indx = i1;
	}
}



out.print("hgh indx is"+ indx);



out.println(ques_vec.get(indx));



String hj1  = ans_vec.get(indx);

request.setAttribute("hj1",hj1);


RequestDispatcher  lk = request.getRequestDispatcher("chatPageView.jsp");

lk.forward(request,response);

out.print(hj1);



%>

</body>
</html>