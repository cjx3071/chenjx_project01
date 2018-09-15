<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="renderer" content="webkit|ie-comp|ie-stand">
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
<meta name="viewport" content="width=device-width,initial-scale=1,minimum-scale=1.0,maximum-scale=1.0,user-scalable=no" />
<meta http-equiv="Cache-Control" content="no-siteapp" />
 		<link href="<%=basePath%>assets/css/bootstrap.min.css" rel="stylesheet" />
        <link rel="stylesheet" href="<%=basePath%>css/style.css"/>       
        <link rel="stylesheet" href="<%=basePath%>assets/css/ace.min.css" />
        <link rel="stylesheet" href="<%=basePath%>assets/css/font-awesome.min.css" />
        <link href="<%=basePath%>Widget/icheck/icheck.css" rel="stylesheet" type="text/css" />
		<!--[if IE 7]>
		  <link rel="stylesheet" href="assets/css/font-awesome-ie7.min.css" />
		<![endif]-->
        <!--[if lte IE 8]>
		  <link rel="stylesheet" href="assets/css/ace-ie.min.css" />
		<![endif]-->
	    <script src="<%=basePath%>js/jquery-1.9.1.min.js"></script>
        <script src="<%=basePath%>assets/js/bootstrap.min.js"></script>
        <script src="<%=basePath%>assets/js/typeahead-bs2.min.js"></script>
       
		<!-- page specific plugin scripts -->
		<script src="<%=basePath%>assets/js/jquery.dataTables.min.js"></script>
		<script src="<%=basePath%>assets/js/jquery.dataTables.bootstrap.js"></script>
        <script type="text/javascript" src="<%=basePath%>js/H-ui.js"></script> 
        <script type="text/javascript" src="<%=basePath%>js/H-ui.admin.js"></script> 
        <script src="<%=basePath%>assets/layer/layer.js" type="text/javascript" ></script>
        <script src="<%=basePath%>assets/laydate/laydate.js" type="text/javascript"></script>
        <script src="<%=basePath%>assets/dist/echarts.js"></script>
        <script src="<%=basePath%>js/lrtk.js" type="text/javascript"></script>
<title>品牌管理</title>
</head>

<body>
<div class="page-content clearfix">
  <div id="brand_style">
    <div class="search_style">
     <form action="<%=basePath%>bc/fuzzyQuery" method="post">
      <ul class="search_content clearfix">
       <li><label class="l_f">品牌名称</label><input name="brandname" type="text"  class="text_add" placeholder="输入品牌名称"  style=" width:250px"/></li>
       <li><label class="l_f">添加时间</label><input name="jointime" class="inline laydate-icon" id="start" style=" margin-left:10px;"></li>
       <li><select name="" class="text_add"><option  value="1">国内品牌</option><option value="2">国外品牌</option></select></li>
       <li style="width:90px;"><i class="icon-search"></i><input type="submit" class="btn_search" value="查询"></li>
      </ul>
      </form>
    </div>
     <div class="border clearfix">
       <span class="l_f">
        <a href="<%=basePath%>view/brand/Add_Brand.jsp"  title="添加品牌" class="btn btn-warning Order_form"><i class="icon-plus"></i>添加品牌</a>
        <a href="javascript:ovid()" class="btn btn-danger" id="brand_a_delect"><i class="icon-trash"></i>批量删除</a>
       </span>
       <span class="r_f">共：<b>234</b>个品牌</span>
     </div>
    <!--品牌展示-->
     <div class="brand_list clearfix" id="category">
     <div class="show_btn" id="rightArrow"><span></span></div>
     <div class="chart_style side_content">
     <div class="side_title"><a title="隐藏" class="close_btn"><span></span></a></div>
         <div id="main" style="height:300px;" class="side_list"></div>
     </div>
     <!--品牌列表-->
      <div class="table_menu_list">
       <table class="table table-striped table-bordered table-hover" id="sample-table">
		<thead>
		 <tr>
				<th width="25px"><label><input type="checkbox" class="ace"><span class="lbl"></span></label></th>
				<th width="80px">ID</th>
				<th width="50px">排序</th>
				<th width="120px">品牌LOGO</th>
				<th width="120px">品牌名称</th>
				<th width="130px">所属地区/国家</th>
				<th width="350px">描述</th>
				<th width="180px">加入时间</th>
				<th width="70px">状态</th>                
				<th width="200px">操作</th>
			</tr>
		</thead>
	<tbody>
		<c:forEach items="${brandlist }" var="brand">
		<tr>
          <td width="25px"><label><input type="checkbox" class="ace" value="${brand.brandId}"><span class="lbl"></span></label></td>
          <td width="80px">${brand.brandId}</td>
          <td width="50px"><input type="text" class="input-text text-c" value="1" style="width:60px"></td>
          <td><img src="<%=path%>/loge/${brand.brandimage}"  width="130"/></td>
          <td><a href="javascript:ovid()" name="<%=basePath%>pc/forpagingQuery" style="cursor:pointer" class="text-primary brond_name" onclick="generateOrders('${brand.brandId}');" title="玉兰油OLAY">${brand.brandname}</a></td>
          <td>${brand.eachdistrict}</td>
          <td class="text-l">${brand.branddescription}</td>
          <td>${brand.jointime}</td>
          <td class="td-status"><span class="label label-success radius">${brand.according}</span></td>
          <td class="td-manage">
          <a onClick="member_stop(this,'10001')"  href="javascript:;" title="停用"  class="btn btn-xs btn-success"><i class="icon-ok bigger-120"></i></a> 
          <a title="编辑" onclick="member_edit('编辑','<%=basePath%>view/brand/update_Brand.jsp?brandname=${brand.brandname}&brandId=${brand.brandId}&eachdistrict=${brand.eachdistrict}','4','','1000')" href="javascript:;"  class="btn btn-xs btn-info" ><i class="icon-edit bigger-120"></i></a> 
          <a title="删除" href="javascript:;"  onclick="member_del(this,${brand.brandId})" class="btn btn-xs btn-warning" ><i class="icon-trash  bigger-120"></i></a>
          
          </td>
		</tr>
       </c:forEach>
        </tbody>
        </table>
        </div>
     </div>
    
  </div>
</div>
</body>
</html>
<script>
jQuery(function($) {
		var oTable1 = $('#sample-table').dataTable( {
		"aaSorting": [[ 1, "desc" ]],//默认第几个排序
		"bStateSave": true,//状态保存
		"aoColumnDefs": [
		  //{"bVisible": false, "aTargets": [ 3 ]} //控制列的隐藏显示
		  {"orderable":false,"aTargets":[0,1,3,4,5,6,8,9]}// 制定列不参与排序
		] } );
				
				
				$('table th input:checkbox').on('click' , function(){
					var that = this;
					$(this).closest('table').find('tr > td:first-child input:checkbox')
					.each(function(){
						this.checked = that.checked;
						$(this).closest('tr').toggleClass('selected');
					});
						
				});
			
			
				$('[data-rel="tooltip"]').tooltip({placement: tooltip_placement});
				function tooltip_placement(context, source) {
					var $source = $(source);
					var $parent = $source.closest('table')
					var off1 = $parent.offset();
					var w1 = $parent.width();
			
					var off2 = $source.offset();
					var w2 = $source.width();
			
					if( parseInt(off2.left) < parseInt(off1.left) + parseInt(w1 / 2) ) return 'right';
					return 'left';
				}
			});


//初始化宽度、高度  
 $(".chart_style").height($(window).height()-215);
  $(".table_menu_list").height($(window).height()-215);
  $(".table_menu_list ").width($(window).width()-440);
  //当文档窗口发生改变时 触发  
    $(window).resize(function(){
	 $(".chart_style").height($(window).height()-215);
	 $(".table_menu_list").height($(window).height()-215);
	 $(".table_menu_list").width($(window).width()-440);
	});	
	//图层隐藏限时参数		 
$(function() { 
	$("#category").fix({
		float : 'left',
		//minStatue : true,
		skin : 'green',	
		durationTime :false,
		stylewidth:'400',
		spacingw:30,//设置隐藏时的距离
	    spacingh:440,//设置显示时间距
	});
});
//面包屑返回值
var index = parent.layer.getFrameIndex(window.name);
parent.layer.iframeAuto(index);
$('.Order_form ,.brond_name').on('click', function(){
	var cname = $(this).attr("title");
	var cnames = parent.$('.Current_page').html();
	var herf = parent.$("#iframe").attr("src");
    parent.$('#parentIframe span').html(cname);
	parent.$('#parentIframe').css("display","inline-block");
    parent.$('.Current_page').attr("name",herf).css({"color":"#4c8fbd","cursor":"pointer"});
	//parent.$('.Current_page').html("<a href='javascript:void(0)' name="+herf+">" + cnames + "</a>");
    parent.layer.close(index);
	
});
function generateOrders(id){
	window.location.href = "<%=basePath%>pc/forpagingQuery";
};
/*品牌-查看*/
function member_show(title,url,id,w,h){
	layer_show(title,url,w,h);
}
/*品牌-停用*/
function member_stop(obj,id){
	layer.confirm('确认要停用吗？',function(index){
		$(obj).parents("tr").find(".td-manage").prepend('<a style="text-decoration:none" class="btn btn-xs " onClick="member_start(this,id)" href="javascript:;" title="启用"><i class="icon-ok bigger-120"></i></a>');
		$(obj).parents("tr").find(".td-status").html('<span class="label label-defaunt radius">已停用</span>');
		$(obj).remove();
		layer.msg('已停用!',{icon: 5,time:1000});
	});
}

/*用户-启用*/
function member_start(obj,id){
	layer.confirm('确认要启用吗？',function(index){
		$(obj).parents("tr").find(".td-manage").prepend('<a style="text-decoration:none" class="btn btn-xs btn-success" onClick="member_stop(this,id)" href="javascript:;" title="停用"><i class="icon-ok bigger-120"></i></a>');
		$(obj).parents("tr").find(".td-status").html('<span class="label label-success radius">已启用</span>');
		$(obj).remove();
		layer.msg('已启用!',{icon: 6,time:1000});
	});
}
/*品牌-编辑*/
function member_edit(title,url,id,w,h){
	layer_show(title,url,w,h);
}

/*品牌-删除*/
function member_del(obj,brandId){
	layer.confirm('确认要删除吗？',function(index){
		$(obj).parents("tr").remove();
		layer.msg('已删除!',{icon:1,time:1000});
		
		var path="<%=basePath%>bc/delectById";
		$.ajax({
			url:path,
			data:{"brandId":brandId},
		})
	});
}
laydate({
    elem: '#start',
    event: 'focus' 
});
$("#brand_a_delect").on("click",function(){
	var s=new Array();
	$(":checkbox:checked").each(function(){
		var str=$(this).val();
		s.push(str);
	})
	var url="<%=basePath%>bc/batchDelete";
	//alert(url);
	$.ajax({
		url:url,
		data:{"s":s},
		complete:function(){
			location.reload(true);
		}
	});
});


</script>
<script type="text/javascript">
        require.config({
            paths: {
                echarts: './assets/dist'
            }
        });
        require(
            [
                'echarts',
                'echarts/chart/pie',   // 按需加载所需图表，如需动态类型切换功能，别忘了同时加载相应图表
                'echarts/chart/funnel'
            ],
            function (ec) {
                var myChart = ec.init(document.getElementById('main'));
			
			option = {
    title : {
        text: '国内国外品牌比例',
        subtext: '',
        x:'center'
    },
    tooltip : {
        trigger: 'item',
        formatter: "{a} <br/>{b} : {c} ({d}%)"
    },
    legend: {
        orient : 'vertical',
        x : 'left',
        data:['国内品牌','国外品牌']
    },
    toolbox: {
        show : false,
        feature : {
            mark : {show: false},
            dataView : {show: false, readOnly: false},
            magicType : {
                show: true, 
                type: ['pie', 'funnel'],
                option: {
                    funnel: {
                        x: '25%',
                        width: '50%',
                        funnelAlign: 'left',
                        max: 545
                    }
                }
            },
            restore : {show: true},
            saveAsImage : {show: true}
        }
    },
    calculable : true,
    series : [
        {
            name:'品牌数量',
            type:'pie',
            radius : '55%',
            center: ['50%', '60%'],
            data:[
                {value:335, name:'国内品牌'},
                {value:210, name:'国外品牌'},

            ]
        }
    ]
};
   myChart.setOption(option);
			}
);
</script>
