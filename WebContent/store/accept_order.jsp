<%@ page import="com.orange.domain.*" language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>接收订单</title>
<link rel="stylesheet" href="${pageContext.request.contextPath }/store/css/main.css" type="text/css" />
</head>
<body>
	<table cellspacing="0" class="infocontent">
		<tr>
			<td style="padding:20px">
				<table width="100%" border="0" cellspacing="0" class="tableopen">
					<tr>
						<td bgcolor="#FFF68F" class="tableopentd01">订单号</td>
						<td bgcolor="#FFD700" class="tableopentd01">顾客</td>
						<td bgcolor="#FFC125" class="tableopentd01">订单时间</td>
						<td bgcolor="#FFB90F" class="tableopentd01">状态</td>
						<td bgcolor="#FFFF00" class="tableopentd01">操作</td>
					</tr>

					<tr>
						<td class="tableopentd02">${order.orderId }</td>

						<td class="tableopentd02">tom</td>
						<td class="tableopentd02">2012-10-10</td>
						<td class="tableopentd02">${order.state==1?"已支付":"已接单" }</td>
						<td class="tableopentd03"><a href="${pageContext.request.contextPath }/sendServlet?orderId=${order.orderId}">送餐</a>&nbsp;&nbsp;
						</td>
					</tr>
									
					
				</table>
			</td>
		</tr>
		<tr>
			<td><input type="submit" value="返回"></td>
		</tr>
	</table>
</body>
</html>