<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'modifysuccess.jsp' starting page</title>
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
    
  </body>
    <script type="text/javascript">
    var index = parent.layer.getFrameIndex(window.name);
	layer.confirm('修改成功,请返回刷新查看', function(index){
		  //do something
		  
		  parent.layer.close(index);
		});  
    </script>
</html>
