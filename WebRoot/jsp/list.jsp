<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
    <title>新闻列表</title>
  

  </head>
  
  <body>
   <c:forEach items="${newslist }" var="news">
		<li>${news.newstitle} 	<a href="edit/${news.newsid }.htm">编辑</a> 	<a href="delete/${news.newsid }.htm">删除</a></li>
	</c:forEach>
  </body>
</html>
