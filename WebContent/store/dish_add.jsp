<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Language" content="zh-cn">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>添加商品</title>
<link href="css/Style.css"
	type="text/css" rel="stylesheet">
</head>
<body style="background:#fff;">
    <%@include file="mhead.jsp"%>
    <form id="userAction_save_do" action="${pageContext.request.contextPath }/dishAddServlet" method="post" >
		&nbsp;
		<table cellSpacing="1" cellPadding="5" width="100%" align="center"
			bgColor="#eeeeee" style="border: 1px solid #999" border="0">
			<tr>
				<td class="ta_01" align="center" bgColor="#FFA500" colSpan="4"
					height="26"><strong><STRONG>添加商品${dishadd_msg }</STRONG> </strong>
				</td>
			</tr>


			<tr>
				<td align="center" bgColor="#FFEC8B" class="ta_01">商品名称：</td>
				<td class="ta_01" bgColor="#ffffff"><input type="text" name="dishName" class="bg"/>
				</td>
				<td align="center" bgColor="#FFEC8B" class="ta_01">商品品价格：</td>
				<td class="ta_01" bgColor="#ffffff"><input type="text" name="price" class="bg" />
				</td>
			</tr>
			<tr>
				<td align="center" bgColor="#FFEC8B" class="ta_01">商品数量：</td>
				<td class="ta_01" bgColor="#ffffff"><input type="text" name="num" class="bg" />
				</td>
				<td align="center" bgColor="#FFEC8B" class="ta_01">商品种类：</td>
				<td class="ta_01" bgColor="#ffffff">
				<input type="text" name="dishType" class="bg" />
				</td>
			</tr>


			<tr>
				<td align="center" bgColor="#FFEC8B" class="ta_01">商品图片：</td>
				<td class="ta_01" bgColor="#ffffff" colSpan="3">
				<input type="file" name="dishImg" size="30" value=""/>
				</td>
			</tr>
			<TR>
				<TD class="ta_01" align="center" bgColor="#FFEC8B">商品介绍：</TD>
				<TD class="ta_01" bgColor="#ffffff" colSpan="3">
				<textarea name="dishDescription" cols="30" rows="3" style="WIDTH: 96%"></textarea>
				</TD>
			</TR>
			


			<tr>
				<td class="ta_01" style="WIDTH: 100%" align="center" bgColor="#FFEC8B" colSpan="4">
					
					
						
					<input type="submit" class="button_ok" value="确定">	
						
					<FONT face="宋体">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</FONT>
					
					
					
					<input type="reset" value="重置" class="button_cancel">

					<FONT face="宋体">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</FONT>
					<span id="Label1">
					
					</span>
				</td>
			</tr>
		</table>
	</form>
	<INPUT class="button_ok" type="button" onclick="history.go(-1)" value="返回" />
	<%@include file="foot.jsp"%>
</body>
</html>