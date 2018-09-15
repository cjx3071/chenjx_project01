<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>编辑</title>
<meta name="renderer" content="webkit|ie-comp|ie-stand">
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
<meta http-equiv="Cache-Control" content="no-siteapp" />
<link href="<%=basePath %>assets/css/bootstrap.min.css" rel="stylesheet" />
<link rel="stylesheet" href="<%=basePath %>css/style.css" />
<link href="<%=basePath %>assets/css/codemirror.css" rel="stylesheet">
<link rel="stylesheet" href="<%=basePath %>assets/css/ace.min.css" />
<link rel="stylesheet" href="<%=basePath %>font/css/font-awesome.min.css" />
<!--[if lte IE 8]>
		  <link rel="stylesheet" href="assets/css/ace-ie.min.css" />
		<![endif]-->
<script src="<%=basePath %>js/jquery-1.9.1.min.js"></script>
<script src="<%=basePath %>assets/js/bootstrap.min.js"></script>
<script type="text/javascript" src="<%=basePath %>Widget/Validform/5.3.2/Validform.min.js"></script>
<script src="<%=basePath %>assets/js/typeahead-bs2.min.js"></script>
<script src="<%=basePath %>assets/js/jquery.dataTables.min.js"></script>
<script src="<%=basePath %>assets/js/jquery.dataTables.bootstrap.js"></script>
<script src="<%=basePath %>assets/layer/layer.js" type="text/javascript"></script>
<script src="<%=basePath %>js/lrtk.js" type="text/javascript"></script>
<script src="<%=basePath %>assets/laydate/laydate.js" type="text/javascript"></script>
<script type="text/javascript" src="js/H-ui.js"></script> 
<script type="text/javascript" src="js/H-ui.admin.js"></script> 
  </head>
  
  <body>
  <form action="<%=basePath%>admin/updateAdminInfo2" method="get"
			id="form-admin-modify">
			<div class="form-group">
				<label class="form-label"><span class="c-red">*</span>管理员id：</label>
				<div class="formControls">
					<input type="text" class="input-text" value="${admin_modify.a_id }" placeholder=""
						id="a_id" name="a_id" datatype="n1-4"  readonly="readonly">
				</div>
				<div class="col-4">
					<span class="Validform_checktip"></span>
				</div>
			</div>
			<div class="form-group">
				<label class="form-label"><span class="c-red">*</span>管理员名称：</label>
				<div class="formControls">
					<input type="text" class="input-text" value="${admin_modify.a_username }" placeholder=""
						id="user-name" name="a_username" datatype="*2-16"
						nullmsg="用户名不能为空">
				</div>
				<div class="col-4">
					<span class="Validform_checktip"></span>
				</div>
			</div>
			<div class="form-group">
				<label class="form-label"><span class="c-red">*</span>初始密码：</label>
				<div class="formControls">
					<input type="password" placeholder="${admin_modify.a_password }" name="a_password"
						autocomplete="off" value="" class="input-text" datatype="*6-20"
						nullmsg="密码不能为空">
				</div>
				<div class="col-4">
					<span class="Validform_checktip"></span>
				</div>
			</div>
			<div class="form-group">
				<label class="form-label "><span class="c-red">*</span>确认密码：</label>
				<div class="formControls ">
					<input type="password" placeholder="${admin_modify.a_password }" autocomplete="off"
						class="input-text Validform_error" errormsg="您两次输入的新密码不一致！"
						datatype="*" nullmsg="请再输入一次新密码！" recheck="a_password"
						id="newpassword2" name="">
				</div>
				<div class="col-4">
					<span class="Validform_checktip"></span>
				</div>
			</div>
			<div class="form-group">
				<label class="form-label "><span class="c-red">*</span>性别：</label>
				<div class="formControls  skin-minimal">
					<label><input name="a_sex" type="radio" class="ace"
						 value="女" checked="checked"><span class="lbl">女</span></label>&nbsp;&nbsp;
					<label><input name="a_sex" type="radio" class="ace" value="男"><span
						class="lbl">男</span></label>&nbsp;&nbsp; <label>
						<!-- <input name="a_sex" type="radio" class="ace"><span class="lbl" value="保密" >保密</span></label> -->
				</div>

				</div>
			<div class="form-group">
				<label class="form-label"><span class="c-red">*</span>年龄:</label>
				<div class="formControls">
					<input type="text" class="input-text" value="${admin_modify.a_age}" placeholder=""
						id="a_age" name="a_age" datatype="n1-2" nullmsg="年龄不能为空">
						
				</div>
				<div class="col-4">
					<span class="Validform_checktip"></span>
				</div>
			</div>
			<div class="form-group">
				<label class="form-label "><span class="c-red">*</span>手机：</label>
				<div class="formControls ">
					<input type="text" class="input-text" value="${admin_modify.a_mobilePhone }" placeholder=""
						id="user-tel" name="a_mobilePhone" datatype="m" nullmsg="手机不能为空">
				</div>
				<div class="col-4">
					<span class="Validform_checktip"></span>
				</div>
			</div>
			<div class="form-group">
				<label class="form-label"><span class="c-red">*</span>邮箱：</label>
				<div class="formControls ">
					<input type="text" class="input-text" placeholder="" value="${admin_modify.a_email }"
						name="a_email" id="email" datatype="e" nullmsg="请输入邮箱！">
				</div>
				<div class="col-4">
					<span class="Validform_checktip"></span>
				</div>
			</div>
			<div class="form-group">
				<label class="form-label"><span class="c-red">*</span>QQ：</label>
				<div class="formControls ">
					<input type="text" class="input-text" placeholder="" value="${admin_modify.a_qq }"
						name="a_qq" id="a_qq" datatype="*6-16" nullmsg="请输入qq！">
				</div>
				<div class="col-4">
					<span class="Validform_checktip"></span>
				</div>
			</div>
			<div class="form-group">
				<label class="form-label"><span class="c-red">*</span>角色：</label>
				<div class="formControls ">
					<span class="select-box" style="width:150px;"> <select
						class="select" name="a_grade" size="1">
							<option value="超级管理员">超级管理员</option>
							<option value="管理员">管理员</option>
					</select>
					</span>
				</div>
			</div>
			<div class="form-group">
				<label class="form-label"><span class="c-red">*</span>注册时间：</label>
				<div class="formControls ">
					<input value="${admin_modify.a_registerTime }" name="a_registerTime" class="inline laydate-icon" id="start" style=" margin-left:10px;">
				</div>
				<div class="col-4">
					<span class="Validform_checktip"></span>
				</div>
			</div>
			<div>
				<input class="btn btn-primary radius" type="submit"
					id="Modify_Administrator" value="&nbsp;&nbsp;提交&nbsp;&nbsp;">
		   </div>
		</form>
  </body>
  <script type="text/javascript">
	//初始化宽度、高度  
	$(".widget-box").height($(window).height() - 215);
	$(".table_menu_list").width($(window).width() - 260);
	$(".table_menu_list").height($(window).height() - 215);
	//当文档窗口发生改变时 触发  
	$(window).resize(function() {
		$(".widget-box").height($(window).height() - 215);
		$(".table_menu_list").width($(window).width() - 260);
		$(".table_menu_list").height($(window).height() - 215);
	})
	laydate({
		elem : '#start',
		event : 'focus'
	});
	/* $("#Modify_Administrator").on('click', function() {
		layer.alert('修改成功!', {
			title : '提示框',
			icon : 0,

		}); */
/* 		var index = parent.layer.getFrameIndex(window.name);
		setInterval(function(){
			location.reload();
        parent.layer.close(index);  
		}, 2000 )
		location.reload(); */
	/* }) */
	$("#form-admin-modify").Validform({

		tiptype : 2,

		callback : function(data) {
			//form[0].submit();
			if (data.status == 1) {
				layer.msg(data.info, {
					icon : data.status,
					time : 1000
				}, function() {
					location.reload();//刷新页面 
				});
			} else {
				layer.msg(data.info, {
					icon : data.status,
					time : 3000
				});
			}
			     
			/* var index = parent.layer.getFrameIndex(window.name);
			parent.layer.close(index); 
			var index = parent.layer.getFrameIndex(window.name);
			layer.confirm('修改成功', function(index){
				  //do something
				  
				  parent.layer.close(index);
				});  */
			//
		}

	});

  </script>
</html>
