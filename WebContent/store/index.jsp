<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<style type="text/css">
    .clear{clear:both;}
    .main {
	margin: 0px 0px 30px 0px;
	background: #FFFFFF;
	font-family: Arial, Helvetica, sans-serif;
	font-size: 12px;
	line-height: 150%;
	color: #000000; /*#666666*/
	text-align: center;
	vertical-align: top;
}
    #s_top{
        height:100px;
        padding:2px 100px;
    }
    #s_top img{
        float:left;
        width:200px;
        height:100px;
    }

    #s_mod{
        width:600px;
        height:40px;
        text-align:right;
        margin-top:20px;
        font-size:20px;
    }
    #s_mod a{
        text-decoration:none;
        font-size:20px;
        color:#06F;
    }
     #s_mod a:hover{
        color:red;
    }
    #s_info{
        border:1px solid #999;
        height:400px;
        width:70%;
        margin:8px auto 15px;
    }
    #dm p{
        font-size:25px;
        float:left;
        width:200px;
    }
    #dm img{
        float:left;
        width:200px;
        padding:20px 20px;
    }
    #gg{
        width:600px;
        height:150px;
        border:1px solid #999;
        margin:50px auto 8px;
    }
    #gg p{
        text-align:center;
    }
    #gg span{
        margin:50px;
    }
    hr{
        color:#FFA500;
    }
</style>
</head>
<body class="main">
    <div>
        <div id="s_top">
            <img alt="" src="images/logo.jpg">
            <h1 style="margin:30px;float:left">橘子外卖</h1>
        </div>
        <div class="clear"></div>
        <hr/>
        <div id="s_mod">
               <a href="${pageContext.request.contextPath}/checkOrderServlet">订单管理|</a>&nbsp;&nbsp;
               <a href="${pageContext.request.contextPath}/findAlldishServlet">商品管理|</a>&nbsp;&nbsp;
               <a href="${pageContext.request.contextPath }/findSUserByIdServlet?id=${store.storeId}">账户管理</a>&nbsp;&nbsp;   
        </div>
        <hr/>
        <div id="s_info">
            <div id="dm">
                <p style="padding:40px 5px;">${store.storeName }</p>
                <img alt="" src="${pageContext.request.contextPath }/images/1.jpeg">
            </div>
            <div class="clear"></div>
            <hr style="width:80%;align:center;"/>
            <div class="clear"></div>
            <div id="gg">
                <p>公告：</p>
                <p>(${store.openTime })</p>
                <span>${store.description }</span>
            </div>
        </div>
        <div class="clear"></div>
    </div>
    <%@include file="foot.jsp"%>
</body>
</html>