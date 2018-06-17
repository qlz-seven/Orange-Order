<%@ page language="java" import="java.util.*" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>

<title>Store注册页面</title>
<%--导入css --%>
<link rel="stylesheet" href="css/main.css" type="text/css" />

</head>


<body class="main">
	<%@include file="head.jsp"%>
	<div id="divcontent">
		<form action="${pageContext.request.contextPath}/sregisterServlet"
			method="post">
			<table width="850px" border="0" cellspacing="0">
				<tr>
					<td style="padding:30px">
						<h1>新店注册${store_msg }</h1>
						
						<table width="70%" border="0" cellspacing="2" class="upline">
							<tr>
								<td style="text-align:right; width:20%">商家名称：</td>
								<td style="width:40%">
								<input type="text" class="textinput"
									name="storeName" /></td>
								<td><font color="#999999">商家名称不能为空</font></td>
							</tr>
							<tr>
								<td style="text-align:right">密码：</td>
								<td><input type="password" class="textinput"
									name="password" /></td>
								<td><font color="#999999">密码设置至少6位</font></td>
							</tr>
							
							
							<tr>
								<td style="text-align:right">邮箱：</td>
								<td><input type="text" class="textinput"
									name="email" /></td>
							</tr>
							<tr>
								<td style="text-align:right">电话：</td>
								<td><input type="text" class="textinput"
									name="telephone" /></td>
							</tr>
							<tr>
								<td style="text-align:right">地址：</td>
								<td><input type="text" class="textinput"
									name="addr" /></td>
							</tr>

						</table>
		                
		                <table width="70%" border="0" cellspacing="0">
							<tr>
								<td style="padding-top:20px; text-align:center"><input
									type=submit value="申请开店" name="sumbit">
								</td>
							</tr>
						</table></td>
				</tr>
			</table>
		</form>
	</div>



	
    <%@include file="foot.jsp"%>

</body>
</html>
