<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page import="entity.StudentEntity"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="" method="post">
		<div>
			<p>
				请输入要查询的内容：<input type="text" name="everything" value=""/> &nbsp;
				<input type="submit" value="查询"/><br/>
			</p>
			<table>
				<tr>
					<th>学号</th>
					<th>姓名</th>
					<th>年龄</th>
					<th>地址</th>
					<th>操作</th>
				</tr>
				<c:forEach items="${lists }" var="stu">
					<tr>
						<td>${stu.id }</td>
						<td>${stu.userName }</td>
						<td>${stu.age }</td>
						<td>${stu.address }</td>
						<td>
							<a href="FindId?stuId=${stu.id }">修改</a><%-- FindId?stuId=${stu.id } --%>
							<a href="DeleteId?stuId=${stu.id }">删除</a>
						</td>
					</tr>
				</c:forEach>
			</table>
			<br/>
			<p><a href="addStu.jsp">增加学生信息</a></p>
			<%-- <p>
				<center>
					<a href="ServerView?pageIndex=1">首页</a>
					<a href="ServerView?pageIndex=${pg.currpage-1 }">上一页</a>
					<a href="ServerView?pageIndex=${pg.currpage+1 }">下一页</a>
					<a href="ServerView?pageIndex=${pg.totalPage }">末页</a>
					&nbsp;&nbsp;&nbsp;&nbsp;[当前第${pg.currpage }页/共${pg.totalPage}页]
				</center>
			<p>	 --%>
		</div>
	</form>
</body>
</html>