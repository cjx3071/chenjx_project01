<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    
	<meta charset="utf-8">
<meta name="renderer" content="webkit|ie-comp|ie-stand">
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
<meta name="viewport" content="width=device-width,initial-scale=1,minimum-scale=1.0,maximum-scale=1.0,user-scalable=no" />
<meta http-equiv="Cache-Control" content="no-siteapp" />
 <link href="assets/css/bootstrap.min.css" rel="stylesheet" />
        <link rel="stylesheet" href="css/style.css"/>       
        <link href="assets/css/codemirror.css" rel="stylesheet">
        <link rel="stylesheet" href="assets/css/ace.min.css" />
        <link rel="stylesheet" href="assets/css/font-awesome.min.css" />
		<!--[if IE 7]>
		  <link rel="stylesheet" href="assets/css/font-awesome-ie7.min.css" />
		<![endif]-->
        <!--[if lte IE 8]>
		  <link rel="stylesheet" href="assets/css/ace-ie.min.css" />
		<![endif]-->
			<script src="assets/js/jquery.min.js"></script>
            <title>用户查看</title>
</head>
  
  <body>
<div class="member_show" >
<div class="member_jbxx clearfix" >
  <img class="img" src="images/user.png">
  <dl  class="right_xxln">
  <dt><span class="">${user.uname}</span> <span class="">余额</span></dt>
  <dd class="" style="margin-left:0">这家伙很懒，什么也没有留下</dd>
  </dl>
</div>
<div class="member_content">
  <ul>
   <li><label class="label_name">性别：</label><span class="name">${user.usex}</span></li>
   <li><label class="label_name">手机：</label><span class="name">${user.uphone}</span></li>
   <li><label class="label_name">固定电话：</label><span class="name">${user.utelephone}</span></li>
   <li><label class="label_name">邮箱：</label><span class="name">${user.uemail}</span></li>
   <li><label class="label_name">地址：</label><span class="name">${user.uaddress}</span></li>
   <li><label class="label_name">注册时间：</label><span class="name">${user.utime}</span></li>
   <li><label class="label_name">积分：</label><span class="name">${user.uintegral}</span></li>
   <li><label class="label_name">等级：</label><span class="name">${user.ugrade}</span></li>
   
  </ul>
</div>
</div>
</body>
</html>
