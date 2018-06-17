<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Language" content="zh-cn">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>菜单列表</title>
<link href="${pageContext.request.contextPath}/store/css/Style.css"
	rel="stylesheet" type="text/css" />
<script language="javascript"
	src="${pageContext.request.contextPath}/store/js/public.js"></script>
<script type="text/javascript">
	function addDish() {
		window.location.href = "store/dish_add.jsp";
	}
</script>
</head>
<body style="background:#fff">
    <%@include file="mhead.jsp"%>
   
    <br>
	
		<table cellSpacing="1" cellPadding="0" width="100%" align="center"
			bgColor="#FFEC8B" border="0">
			<TBODY>
				
				<tr>
					<td class="ta_01" align="center" bgColor="#FFA500"><strong>菜单列表</strong>${deldish_msg }
					</td>
				</tr>
				<tr>
					<td class="ta_01" align="right">
						<form action="${pageContext.request.contextPath }/findDishByManyConditionServlet">
						<input type="text" name="dishName">
						<input type="submit" name="serch" value="查询" >
						</form>
						<button type="button" id="add" name="add" value="&#28155;&#21152;"
							class="button_add" onclick="addDish()">&#28155;&#21152;
						</button>
					</td>
				</tr>
				<tr>
					<td class="ta_01" align="center" bgColor="#FFEC8B">
						<table cellspacing="0" cellpadding="1" rules="all"
							bordercolor="gray" border="1" id="DataGrid1"
							style="BORDER-RIGHT: gray 1px solid; BORDER-TOP: gray 1px solid; BORDER-LEFT: gray 1px solid; WIDTH: 100%; WORD-BREAK: break-all; BORDER-BOTTOM: gray 1px solid; BORDER-COLLAPSE: collapse; BACKGROUND-COLOR: #FFEC8B; WORD-WRAP: break-word">
							<tr
								style="FONT-WEIGHT: bold; FONT-SIZE: 12pt; HEIGHT: 25px; BACKGROUND-COLOR: #FFA500">
								<td align="center" width="24%">商品编号</td>
								<td align="center" width="18%">商品名称</td>
								<td align="center" width="9%">商品价格</td>
								<td align="center" width="9%">商品数量</td>
								<td width="8%" align="center">商品类别</td>
								<td width="8%" align="center">商品图片</td>
								<td width="8%" align="center">商品介绍</td>
								<td width="8%" align="center">编辑</td>

								<td width="8%" align="center">删除</td>
							</tr>

							<c:forEach items="${dish }" var="d">
								<tr onmouseover="this.style.backgroundColor = 'white'"
									onmouseout="this.style.backgroundColor = '#F5FAFE';">
									<td style="CURSOR: hand; HEIGHT: 22px" align="center"
										width="23">${d.dishId }</td>
									<td style="CURSOR: hand; HEIGHT: 22px" align="center"
										width="18%">${d.dishName }</td>
									<td style="CURSOR: hand; HEIGHT: 22px" align="center"
										width="8%">${d.price}</td>
									<td style="CURSOR: hand; HEIGHT: 22px" align="center"
										width="8%">${d.num }</td>
									<td style="CURSOR: hand; HEIGHT: 22px" align="center">
										${d.dishType }</td>
									<td style="CURSOR: hand; HEIGHT: 22px" align="center">
										${d.dishImg }</td>
									<td style="CURSOR: hand; HEIGHT: 22px" align="center">
										${d.dishDescription }</td>
									<td align="center" style="HEIGHT: 22px" width="7%"><a
										href="${pageContext.request.contextPath }/findDishByIdServlet?dishId=${d.dishId}">
											<img
											src="${pageContext.request.contextPath}/store/images/i_edit.gif"
											border="0" style="CURSOR: hand"> </a>
									</td>

									<td align="center" style="HEIGHT: 22px" width="7%"><a
										href="${pageContext.request.contextPath }/delDishServlet?dishId=${d.dishId}">
											<img
											src="${pageContext.request.contextPath}/store/images/i_del.gif"
											width="16" height="16" border="0" style="CURSOR: hand">
									</a>
									</td>
								</tr>
							</c:forEach>
							
						</table>
					</td>
				</tr>
			</TBODY>
		</table>
	<%@include file="foot.jsp"%>
</body>
</html>