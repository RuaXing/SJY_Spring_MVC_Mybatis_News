<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>

<title>新增栏目</title>



</head>

<body>
	<form action="../news/add.htm" method="post">
		标题：<input type="text" name="title" /> <br>
	 内容：<input type="text"
			name="content" /> <br> 新闻类型ID：<input type="text"
			name="typeid" /><br> <input type="submit" value="提交" />
	</form>
</body>
</html>
