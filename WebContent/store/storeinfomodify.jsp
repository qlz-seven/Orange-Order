<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>商家信息管理</title>
<link rel="stylesheet" href="${pageContext.request.contextPath }/store/css/main.css" type="text/css" />
</head>
<body style="background:#fff">
    <jsp:include page="mhead.jsp" />
    <table cellspacing="0" class="infocontent">
		<tr>
			<td>
				<form action="${pageContext.request.contextPath }/modifySUserServlet" method="post" >
					<input type="hidden" name="storeId" value="${store.storeId }">
						<table width="100%" border="0" cellspacing="2" class="upline">
							<tr>
								<td style="text-align:right; width:20%">商家名称：</td>
								<td style="width:40%; padding-left:20px">
									<input type="text" name="storeName" value="${store.storeName}" class="textinput"/>
								</td>
								<td>&nbsp;</td>


							</tr>
							
							<tr>
								<td style="text-align:right">密码：</td>
								<td style="width:40%; padding-left:20px">
									<input type="password" name="password" class="textinput" />
								</td>
								<td><font color="#999999">密码设置至少6位，请区分大小写</font>
								</td>
							</tr>
							<tr>
								<td style="text-align:right">邮箱：</td>
								<td style="width:40%; padding-left:20px">
									<input type="text" name="email" value="${store.email}" class="textinput"/>
								</td>
								<td>&nbsp;</td>
							</tr>
							<tr>
								<td style="text-align:right">地址：</td>
								<td style="width:40%; padding-left:20px">
									<input type="text" name="addr" value="${store.addr}" class="textinput"/>
								</td>
								<td>&nbsp;</td>
							</tr>
							<tr>
								<td style="text-align:right">联系方式：</td>
								<td colspan="2" style="width:40%; padding-left:20px">
									<input name="telephone" type="text" value="${store.telephone}" class="textinput" />
								</td>
							</tr>
							<tr>
								<td style="text-align:right">配送时间：</td>
								<td colspan="2" style="width:40%; padding-left:20px">
									<input name="sendTime" type="text" value="${store.sendTime}" class="textinput" />
								</td>
							</tr>
							<tr>
								<td style="text-align:right">配送费：</td>
								<td colspan="2" style="width:40%; padding-left:20px">
									<input name="sendCost" type="text" value="${store.sendCost}" class="textinput" />
								</td>
							</tr>
							<tr>
								<td style="text-align:right">营业时间：</td>
								<td colspan="2" style="width:40%; padding-left:20px">
									<input name="openTime" type="text" value="${store.openTime}" class="textinput" />
								</td>
							</tr>
							<tr>
								<td style="text-align:right">商家类型：</td>
								<td colspan="2" style="width:40%; padding-left:20px">
									<input name="type" type="text" value="${store.type}" class="textinput" />
								</td>
							</tr>
							<tr>
								<td style="text-align:right">店铺头像：</td>
								<td style="width:40%; padding-left:20px">
									<input type="file" name="imgUri" size="30" value="${store.imgUri }"/>
								</td>
								<td>&nbsp;</td>
							</tr>
							<tr>
								<td style="text-align:right">店铺介绍：</td>
								<td colspan="2">
									<textarea class="textarea" name="description">${store.description}</textarea>
								</td>
								<td>&nbsp;</td>
							</tr>

							<tr>
								<td style="text-align:right">&nbsp;</td>
								<td>&nbsp;</td>
								<td>&nbsp;</td>
							</tr>
							
						</table>





						<p style="text-align:center">

							<input type="image" src="images/botton_gif_025.gif" border="0">

						</p>
						<p style="text-align:center">&nbsp;</p>
					</form></td>
			</tr>
		</table>
    <jsp:include page="foot.jsp" />
</body>
</html>