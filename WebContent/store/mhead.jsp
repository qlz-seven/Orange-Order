<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<style type="text/css">
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
        width:400px;
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
    hr{
        color:#FFA500;
    }
</style>
</head>
<body>
    <div id="s_top">
            <img alt="" src="${pageContext.request.contextPath }/store/images/logo.jpg">
            <h1 style="margin:30px;float:left">橘子外卖</h1>
        </div>
        <hr/>
       
        <hr/>
</body>
</html>