<%@ page language="java" import="java.util.*,com.zxx.beans.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
     <base href="<%=basePath%>">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="renderer" content="webkit|ie-comp|ie-stand">
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
<meta http-equiv="Cache-Control" content="no-siteapp" />
 <link href="<%=basePath%>assets/css/bootstrap.min.css" rel="stylesheet" />
        <link rel="stylesheet" href="<%=basePath%>css/style.css"/>       
        <link href="<%=basePath%>assets/css/codemirror.css" rel="stylesheet">
        <link rel="stylesheet" href="<%=basePath%>assets/css/ace.min.css" />
        <link rel="stylesheet" href="<%=basePath%>font/css/font-awesome.min.css" />
        <!--[if lte IE 8]>
		  <link rel="stylesheet" href="assets/css/ace-ie.min.css" />
		<![endif]-->
		<script src="<%=basePath%>js/jquery-1.9.1.min.js"></script>
        <script src="<%=basePath%>assets/js/bootstrap.min.js"></script>
		<script src="<%=basePath%>assets/js/typeahead-bs2.min.js"></script> 
        <script type="text/javascript" src="<%=basePath%>js/H-ui.js"></script>      	
		<script src="<%=basePath%>assets/js/jquery.dataTables.min.js"></script>
		<script src="<%=basePath%>assets/js/jquery.dataTables.bootstrap.js"></script>
        <script src="<%=basePath%>assets/layer/layer.js" type="text/javascript" ></script>          
        <script src="<%=basePath%>assets/laydate/laydate.js" type="text/javascript"></script>
        <script src="<%=basePath%>assets/js/jquery.easy-pie-chart.min.js"></script>
        <script src="<%=basePath%>js/lrtk.js" type="text/javascript" ></script>
<title>订单详细</title>

  </head>
  
 <body>
<div class="margin clearfix">
<!-- <div class="Order_Details_style">
<div class="Numbering">订单编号:<b></b></div></div> -->
 <div class="detailed_style">
 	
    </div>
    <!--订单信息-->
    <div class="product_style">
    <div class="title_name">产品信息</div>
    <div class="Info_style clearfix">
      <div class="product_info clearfix">
      <!-- <a href="#" class="img_link"><img src="products/p_3.jpg" /></a>
      <span>
      <a href="#" class="name_link">美果汇 美国进口嘎啦果苹果6粒装 加力果 姬娜果 伽利果 新鲜应季水果</a>
      <b>也称为姬娜果，饱满色艳，个头小</b>
      <p>规格：500g/斤</p>
      <p>数量：2kg</p>
      <p>价格：<b class="price"><i>￥</i>56</b></p>  
      <p>状态：<i class="label label-success radius">有货</i></p>   
      </span>
      </div>
      <div class="product_info clearfix">
      <a href="#" class="img_link"><img src="products/p_5.jpg" /></a>
      <span>
      <a href="#" class="name_link">美果汇 美国进口嘎啦果苹果6粒装 加力果 姬娜果 伽利果 新鲜应季水果</a>
      <b>也称为姬娜果，饱满色艳，个头小</b>
      <p>规格：39.9/5kg</p>
      <p>数量：2</p>
      <p>价格：<b class="price"><i>￥</i>69.9</b></p>  
      <p>状态：<i class="label label-success radius">有货</i></p>   
      </span>
      </div>
       <div class="product_info clearfix">
      <a href="#" class="img_link"><img src="products/p_8.jpg"/></a>
      <span>
      <a href="#" class="name_link">美果汇 美国进口嘎啦果苹果6粒装 加力果 姬娜果 伽利果 新鲜应季水果</a>
      <b>也称为姬娜果，饱满色艳，个头小</b>
      <p>规格：500g/斤</p>
      <p>数量：2kg</p>
      <p>价格：<b class="price"><i>￥</i>56</b></p>  
      <p>状态：<i class="label label-success radius">有货</i></p>   
      </span> -->
      	<%-- <p style="color:blue">产品编号:</p><br/>
      	<h4>${oop.p_id }</h4><br/>
      	<p style="color:blue">产品名称:</p><br/>
      	<h4>${oop.productname }</h4><br/>
      	产品数量<h4>${oop.onum }</h4><br/>
      	<p style="color:blue">订单时间:</p><br/>
      	<h4>${oop.otime }</h4><br/>
      	<p style="color:blue">价格:</p><br/>
      	<h4>${oop.nowtheprice }</h4><br/> --%>
      	<br/>
      	
      	
      	<table cellpadding="5px" cellspacing="5px" border="1" width="90%" align="center" style="text-align: center;">
      		<tbody>
      		<c:forEach items="${ooplist2 }" var="ooplist2">
      			<tr style="height: 35px" >
      				<td style="color:blue">订单编号:</td>
      				<td>${ooplist2.oid }</td>
      			</tr>
      			<tr style="height: 35px">
      				<td style="color:blue">商品名称:</td>
      				<td>${ooplist2.productname }</td>
      			</tr>
      			<tr style="height: 35px">
      				<td style="color:blue">订单时间:</td>
      				<td>${ooplist2.otime }</td>
      			</tr>
      			<tr style="height: 35px">
      				<td style="color:blue">商品价格:</td>
      				<td>${ooplist2.nowtheprice }</td>
      			</tr>
      			<tr style="height: 35px">
      				<td style="color:blue">商品数量:</td>
      				<td>${ooplist2.onum }</td>
      			</tr>
      			<tr style="height: 35px">
      				<td style="color:blue">商品总价格:</td>
      				<td>${ooplist2.price }</td>
      			</tr>
      			</c:forEach>
      		</tbody>
      	</table>
      </div>
    </div>
    </div>
   <!--总价-->
   <div class="Total_style">
      <div class="Total_m_style"><span class="Total_price">总价：<b>${total}</b>元</span></div>
    </div>
    
   
<div class="Button_operation">
				<button id="btn1" class="btn btn-primary radius" type="button"><i class="icon-save "></i>返回上一步</button>
				
				<button onclick="layer_close();" class="btn btn-default radius" type="button">&nbsp;&nbsp;取消&nbsp;&nbsp;</button>
			</div>
            
            
 </div>
</div>
</body>
</html>
<script type="text/javascript">
	$(function(){
		$("#btn1").click(function(){
			window.location.href="<%=basePath%>order/testSelectAllOrder2";
		})
	})


</script>