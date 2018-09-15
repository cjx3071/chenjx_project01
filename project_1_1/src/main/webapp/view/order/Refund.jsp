<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
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
		<script src="<%=basePath%>js/H-ui.js" type="text/javascript"></script>  
        <script src="<%=basePath%>assets/js/bootstrap.min.js"></script>
		<script src="<%=basePath%>assets/js/typeahead-bs2.min.js"></script>           	
		<script src="<%=basePath%>assets/js/jquery.dataTables.min.js"></script>
		<script src="<%=basePath%>assets/js/jquery.dataTables.bootstrap.js"></script>
        <script src="<%=basePath%>assets/layer/layer.js" type="text/javascript" ></script>          
        <script src="<%=basePath%>assets/laydate/laydate.js" type="text/javascript"></script>
          
        <script src="<%=basePath%>js/lrtk.js" type="text/javascript" ></script>
<title>退款管理</title>
  </head>
  

<body>
<div class="margin clearfix">
 <div id="refund_style">
   <div class="search_style">
     <form action="<%=basePath%>order/selectOrderById3">
      <ul class="search_content clearfix">
       <li><label class="l_f">订单编号</label><input name="order_id" type="text" class="text_add" placeholder="输入产品名称" style=" width:250px"></li>
       <li><label class="l_f">退款时间</label><input name="otime" class="inline laydate-icon" id="start" style=" margin-left:10px;"></li>
       <li style="width:90px;"><button type="submit" class="btn_search"><i class="fa fa-search"></i>查询</button></li>
      </ul>
      </form>
    </div>
 <div class="border clearfix">
       <span class="l_f">
        <a href="javascript:ovid()" class="btn btn-success Order_form" id="waitpay"><i class="fa fa-check-square-o"></i>&nbsp;已退款订单</a>
        <a href="javascript:ovid()" class="btn btn-warning Order_form" id="nopay"><i class="fa fa-close"></i>&nbsp;未退款订单</a>
        <a href="javascript:ovid()" class="btn btn-danger" id="deletesome"><i class="fa fa-trash"></i>&nbsp;批量删除</a>
       </span>
       <span class="r_f"></span>
     </div>
     <!--退款列表-->
     <div class="refund_list">
        <table class="table table-striped table-bordered table-hover" id="sample-table">
		<thead>
		 <tr>
				<th width="25px"><label><input type="checkbox" class="ace"><span class="lbl"></span></label></th>
				<th width="120px">订单编号</th>
				<th width="250px">产品名称</th>
				<th width="100px">交易金额</th>				
                <th width="100px">交易时间</th>				
				<th width="100px">退款金额</th>
                <th width="80px">退款数量</th>
				<th width="70px">状态</th>
                <th width="200px">说明</th>                
				<th width="200px">操作</th>
			</tr>
		</thead>
        <tbody>
	
	<c:forEach items="${orderlist}" var="orderlist">
		<tr>
			<td><label><input type="checkbox" class="ace" value=${orderlist.oid }><span class="lbl"></span></label></td>
			<td>${orderlist.oid }</td>
			<td>${orderlist.productname }</td>
			<td>${orderlist.price}</td>
			<td>${orderlist.otime }</td>
			<td>${orderlist.price}</td>
			<td>${orderlist.onum }</td>
			<td class="td-status"><span class="label label-success radius">${orderlist.waitpay }</span></td>
			<td>${orderlist.explain }</td>
			
			 <td>
			 	<c:if test="${orderlist.waitpay =='未退款'}">
			 		<a onClick="Delivery_stop(this,${orderlist.oid})"  href="javascript:;" title="退款"  class="btn btn-xs btn-success"><i class="fa fa-cubes bigger-120"></i></a> 
			 	</c:if>
			 	
			 	
    			<!-- <a onClick="Delivery_stop(this,'10003')"  href="javascript:;" title="发货"  class="btn btn-xs btn-success"><i class="fa fa-cubes bigger-120"></i></a>  -->
     			<a title="订单详细"  href="<%=basePath%>order/selectDail3?id=${orderlist.oid}" class="btn btn-xs btn-info order_detailed" ><i class="fa fa-list bigger-120"></i></a> 
     			<a title="删除" href="javascript:;"  onclick="Order_form_del(this,${orderlist.oid})" class="btn btn-xs btn-warning" ><i class="fa fa-trash  bigger-120"></i></a>    
    		 </td>
		</tr>
	</c:forEach>
    
     </tbody>
    </table> 
     
     </div>
 </div>
</div>
<!--发货-->
 <div id="Delivery_stop" style=" display:none">
  	
 </div>
</body>
</html>
<script>
$(function(){
	$("#waitpay").click(function(){
		window.location.href="<%=basePath%>order/selectBadOrderBypay"
	})
	
	$("#nopay").click(function(){
		window.location.href="<%=basePath%>order/selectNoPay"
	})
	
	$("#deletesome").click(function(){
		var array=new Array();
		var $checkbox=$(":checkbox:checked");
		/* alert($checkbox.length); */
		$(":checkbox:checked").each(function(){
			array.push($(this).val());
		})
		/* alert(array); */
		var url="<%=basePath%>order/deleteOrderByArray";
		$.ajax({
			url:url,
			data:{"array":array},
			success:function(data){
				location.reload(true);
			}
		})
	})
})



/**退款**/
function Delivery_stop(obj,id){
	layer.open({
        type: 1,
        title: '退款',
		maxmin: true, 
		shadeClose:false,
        area : ['500px' , ''],
        content:$('#Delivery_stop'),
		btn:['确定','取消'],
		yes: function(index, layero){		
			 layer.confirm('退款成功！',function(index){
				$(obj).parents("tr").find(".td-manage").prepend('<a style=" display:none" class="btn btn-xs btn-success" onClick="member_stop(this,id)" href="javascript:;" title="已退款"><i class="fa fa-cubes bigger-120"></i></a>');
				$(obj).parents("tr").find(".td-status").html('<span class="label label-success radius">已退款</span>');
				$(obj).remove();
			layer.msg('已退款!',{icon: 6,time:1000});
		});  
			layer.close(index);    		  
		}
	})
	
	var url="<%=basePath%>order/updateBadOrder";
	$.ajax({
		url:url,
		data:{"id":id}
	})
};

//时间选择
laydate({
   elem: '#start',
   event: 'focus' 
});

/*订单-删除*/
function Order_form_del(obj,id){
	layer.confirm('确认要删除吗？',function(index){
		$(obj).parents("tr").remove();
		layer.msg('已删除!',{icon:1,time:1000});
		
		var url="<%=basePath%>order/deleteOrderByid";
		$.ajax({
			url:url,
			data:{"id":id},
			success:function(data){
				location.reload(true);
			}
		})
	}); 
	/* alert(id) */
	
}

 //订单列表
jQuery(function($) {
		var oTable1 = $('#sample-table').dataTable( {
		"aaSorting": [[ 1, "desc" ]],//默认第几个排序
		"bStateSave": true,//状态保存
		"aoColumnDefs": [
		  //{"bVisible": false, "aTargets": [ 3 ]} //控制列的隐藏显示
		  {"orderable":false,"aTargets":[0,2,3,4,5,6,8,9]}// 制定列不参与排序
		] } );
                 //全选操作
				$('table th input:checkbox').on('click' , function(){
					var that = this;
					$(this).closest('table').find('tr > td:first-child input:checkbox')
					.each(function(){
						this.checked = that.checked;
						$(this).closest('tr').toggleClass('selected');
					});
						
				});
			});
function Delivery_Refund(obj,id){
			
			 layer.confirm('是否退款当前商品价格！',function(index){
		$(obj).parents("tr").find(".td-manage").prepend('<a style=" display:none" class="btn btn-xs btn-success" onClick="member_stop(this,id)" href="javascript:;" title="已退款">退款</a>');
		$(obj).parents("tr").find(".td-status").html('<span class="label label-defaunt  radius">已退款</span>');
		$(obj).remove();
		layer.msg('已退款!',{icon: 6,time:1000});
			});  
			  
		  
};
//面包屑返回值
var index = parent.layer.getFrameIndex(window.name);
parent.layer.iframeAuto(index);
$('.Refund_detailed').on('click', function(){
	var cname = $(this).attr("title");
	var chref = $(this).attr("href");
	var cnames = parent.$('.Current_page').html();
	var herf = parent.$("#iframe").attr("src");
    parent.$('#parentIframe').html(cname);
    parent.$('#iframe').attr("src",chref).ready();;
	parent.$('#parentIframe').css("display","inline-block");
	parent.$('.Current_page').attr({"name":herf,"href":"javascript:void(0)"}).css({"color":"#4c8fbd","cursor":"pointer"});
	//parent.$('.Current_page').html("<a href='javascript:void(0)' name="+herf+" class='iframeurl'>" + cnames + "</a>");
    parent.layer.close(index);
	
});
</script>