<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>

<title>修改栏目</title>



</head>

<body>
	<form action="../update.htm" method="post">
		<input type="hidden" name="id" value="${new1.newsid }" /> 新闻标题：<input
			type="text" name="title" value="${new1.newstitle }" /> <br>
		新闻内容：<input type="text" name="content" value="${new1.newscontent }" />
		<br> 新闻类型ID：<input type="text" name="typeid" /><br> <input
			type="submit" value="提交" />
	</form>
</body>
</html>
