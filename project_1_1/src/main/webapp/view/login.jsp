<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<link href="assets/css/bootstrap.min.css" rel="stylesheet" />
<link rel="stylesheet" href="assets/css/font-awesome.min.css" />
<!--[if IE 7]>
		  <link rel="stylesheet" href="assets/css/font-awesome-ie7.min.css" />
		<![endif]-->
<link rel="stylesheet" href="assets/css/ace.min.css" />
<link rel="stylesheet" href="assets/css/ace-rtl.min.css" />
<link rel="stylesheet" href="assets/css/ace-skins.min.css" />
<link rel="stylesheet" href="css/style.css" />
<!--[if lte IE 8]>
		  <link rel="stylesheet" href="assets/css/ace-ie.min.css" />
		<![endif]-->
<script src="assets/js/ace-extra.min.js"></script>
<!--[if lt IE 9]>
		<script src="assets/js/html5shiv.js"></script>
		<script src="assets/js/respond.min.js"></script>
		<![endif]-->
<script src="js/jquery-1.9.1.min.js"></script>
<script src="assets/layer/layer.js" type="text/javascript"></script>
<title>登陆</title>
<style type="text/css">
	h1 {
		font-weight: bolder;
		color: black;
	}
	#yanzhengma{
	 height:39px;
	 width:80px;
	}
</style>
</head>

<body class="login-layout Reg_log_style">
	<%
		String errorInfo = (String) request.getSession().getAttribute("loginError"); // 获取错误属性
		if (errorInfo != null) {
			
	%>
	<script type="text/javascript" language="javascript">
		
		layer.alert("用户名或者密码错误，登录失败")		
		
	</script>

	<%
		}
		request.getSession().removeAttribute("loginError");
	%>
	<div class="logintop">
		<span>欢迎后台管理界面平台</span>
		<ul>
			<li><a href="#">返回首页</a></li>
			<li><a href="#">帮助</a></li>
			<li><a href="#">关于</a></li>
		</ul>
	</div>
	<div class="loginbody">
		<div class="login-container">
			<div class="center">
				<h1>XX商城后台管理系统</h1>
			</div>

			<div class="space-6"></div>

			<div class="position-relative">
				<div id="login-box" class="login-box widget-box no-border visible">
					<div class="widget-body">
						<div class="widget-main">
							<h4 class="header blue lighter bigger">
								<i class="icon-coffee green"></i> 管理员登陆
							</h4>

							<div class="login_icon">
								<img src="images/login.png" />
							</div>

							<form action="<%=basePath %>admin/adminLogin"
								method="post">
								<fieldset>
									<ul>
										<li class="frame_style form_error"><label
											class="user_icon"></label><input name="username" type="text"
											id="username" /><i>用户名</i></li>
										<li class="frame_style form_error"><label
											class="password_icon"></label><input name="password"
											type="password" id="userpwd" /><i>密码</i></li>
										<li class="frame_style form_error"><label
											class="Codes_icon"></label><input name="验证码" type="text"
											id="Codes_text" /><i>验证码</i>
											<div class="Codes_region">
												<span onclick="javascript:changeImage();"> <img
													src="${pageContext.request.contextPath }/admin/getVerifyCode"
													width="80" height="40" id="verifyCodeImage">
												</span>
											</div></li>

									</ul>
									<div class="space"></div>

									<div class="clearfix">
										<label class="inline"> <input type="checkbox"
											class="ace"> <span class="lbl">保存密码</span>
										</label>

										<button type="submit"
											class="width-35 pull-right btn btn-sm btn-primary"
											id="login_btn">
											<i class="icon-key"></i> 登陆
										</button>
									</div>

									<div class="space-4"></div>
								</fieldset>
							</form>

							<div class="social-or-login center">
								<span class="bigger-110">通知</span>
							</div>

							<div class="social-login center">本网站系统不再对IE8以下浏览器支持，请见谅。</div>
						</div>
						<!-- /widget-main -->

						<div class="toolbar clearfix"></div>
					</div>
					<!-- /widget-body -->
				</div>
				<!-- /login-box -->
			</div>
			<!-- /position-relative -->
		</div>
	</div>
	<div class="loginbm">
		版权所有 2017 <a href="">苏州大数据培训二班</a>
	</div>
	<strong></strong>
</body>
</html>

<script type="text/javascript">
	var massage = false;
	$(document).ready(
			function() {
				function login(massage){
					var str = "";
					var user_input_verifyCode = $("#Codes_text").val();
					$.ajax({
						type : 'post',
						url : "${pageContext.request.contextPath}/admin/login",
						async : false,
						contentType:"application/x-www-form-urlencoded;charset:utf-8",
						success : function(data) {
							if (user_input_verifyCode != data) {
								massage = false;
							} else {
								massage = true;
							}
						},
						error : function() {
							alert("查询失败");
						}
					});
				return massage;
				}
				$('#login_btn').on('click', function() {
					massage = login(massage);
					var num = 0;
					var str = "";
					$("input[type$='text'],input[type$='password']").each(function(n) {
						if ($(this).val() == "") {
							layer.alert(str += "" + $(this).attr("name") + "不能为空！\r\n", {
								title : '提示框',
								icon : 0,
							});
							num++;
							return false;
						} else if(!massage) {
							layer.alert(str += "" + $("#Codes_text").attr("name")
									+ "错误！", {
								title : '提示框',
								icon : 0,
							});
							num++;
							return false;
						}
					});
					if (num > 0) {
						return false;
					}
				});
				$("#Codes_text").blur(function(massage){
					var str = "";
					var user_input_verifyCode = $("#Codes_text").val();
					$.ajax({
						type : 'post',
						url : "${pageContext.request.contextPath}/admin/login",
						async : false,
						success : function(data) {
							if (user_input_verifyCode != data) {
								layer.alert(str += "" + $("#Codes_text").attr("name")
										+ "错误！", {
									title : '提示框',
									icon : 0,
								});
							}
						},
						error : function() {
							alert("查询失败");
						}
					});
				})
				$("input[type='text'],input[type='password']").blur(
						function() {
							var $el = $(this);
							var $parent = $el.parent();
							$parent.attr('class', 'frame_style').removeClass(
									' form_error');
							if ($el.val() == '') {
								$parent.attr('class', 'frame_style').addClass(
										' form_error');
							}
						});
				$("input[type='text'],input[type='password']").focus(
						function() {
							var $el = $(this);
							var $parent = $el.parent();
							$parent.attr('class', 'frame_style').removeClass(
									' form_errors');
							if ($el.val() == '') {
								$parent.attr('class', 'frame_style').addClass(
										' form_errors');
							} else {
								$parent.attr('class', 'frame_style')
										.removeClass(' form_errors');
							}
						});
			});

	function genTimestamp() {
		var time = new Date();
		return time.getTime();
	}
	function changeImage() {
		$("#verifyCodeImage").attr(
				"src",
				"${pageContext.request.contextPath }/admin/getVerifyCode?timestamp="
						+ genTimestamp());
	}
</script>
