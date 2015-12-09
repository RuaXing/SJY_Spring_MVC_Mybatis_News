<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
    <title>新闻增删查改</title>
	
  </head>
  
  <body>
    <a href="news/index.htm">查看所有新闻</a><br>
   
     <a href="jsp/addnews.jsp">添加新闻</a>
  </body>
</html>
