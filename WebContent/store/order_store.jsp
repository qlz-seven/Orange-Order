<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>订单信息</title>
<style type="text/css">
    .clear{clear:both;}
    .divleft{
        float:left;
        width:600px;
        height:600px;
        border:1px solid #999;
        margin-left:100px;
        margin-right:10px;
    }
    
    .op{
        font-size:30px;
        padding:10px 10px;
        text-align:center;
    }
    .ophr{
        width:1300px;
        margin:8px auto 8px;
    }
    .lop{
        font-size:18px;
        margin:10px 10px;
    }
    .tb{
        width:550px;
        border:1px solid #999;
        margin:20px 20px;
    }
    
   
</style>
</head>
<body style="background:#FFFFFF;font-size:15px;">
    <%@include file="mhead.jsp"%>

    <p class="op">订单管理 ${orderList1_msg }</p>
    <hr class="ophr">
    <div class="divleft">
        <span class="lop">待处理</span>
        <c:forEach items="${orderList1 }" var="o">
        <table class="tb" cellspacing="0">
            <tr>
                <td width="400px"><input type="hidden" name="orderId" value="${o.orderId}">订单${o.orderId}</td>
                <td width="200px"><a href="${pageContext.request.contextPath }/findOrderByIdServlet?orderId=${o.orderId}">订单详情>></a></td>
            </tr>
            <tr>
                <td width="85%" align="right">
                <a href="${pageContext.request.contextPath }/acceptOrderServlet?orderId=${o.orderId}">接单</a></td>
                <td width="15%"><a href="">拒绝</a></td>
            </tr>
        </table>
        </c:forEach>
    </div>
    
   

    <%@include file="foot.jsp"%>
</body>
</html>