<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<c:set var="ctx" value="${pageContext.request.contextPath}" />
<!DOCTYPE html>
<html>
<head>
<title></title>
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<link rel="stylesheet" href="${ctx }/jquerymobile_1.4.5/jquery.mobile-1.4.5.min.css" />
	<script src="${ctx }/jquery/jquery-2.1.3.min.js"></script>
	<script src="${ctx }/jquerymobile_1.4.5/jquery.mobile-1.4.5.min.js"></script>
	<meta name="viewport" content="width=device-width, initial-scale=1">
</head>
<body>
	<div data-role="page" id="workflow115">
	<script type="text/javascript">
		$(document).on("pageinit",function(event){
			//右侧滑动
			$("#main").bind("swiperight",function(){
				$.mobile.changePage("${ctx}/interface.do", "slideup");
		    });
			
			//注销按钮
			$('#exit').click(function(){
				$.ajax({
				    url: '${ctx}/user/signout.do',
				    type: 'GET',
				    success: function(data){
				    	$.mobile.changePage("${ctx}/user/signin.do", "slideup");
				    }
				});
			});

			//表单提交
			$('#workflow_fm').submit(function(){
 				if($('#tarxm').val()==''||$('#tamc').val()==''||$('#tarlxfs').val()==''||$('#gsqxzms').val()==''||$('#gsjy').val()==''||$('#gshyjxg').val()==''||$('#targh').val()==''){
 					alert("内容未填写完整！");
 					return false;
				}
 				if(isNaN($('#tarlxfs').val())){
 					alert("联系方式必须为数字！");
 					return false;
 				}
 				if($('#targh').val().length!=6){
 					alert("工号必须是六位！");
 					return false;
 				}
 				$.ajax({
				    url: '${ctx}/workflow/workflow_115.do',
				    type: 'POST',
				    data: $('#workflow_fm').serializeArray(),
				    beforeSend: function() {
				    	showLoader('提交中...');
	                },
				    error: function(request) {
				    	hideLoader();
	                    alert("连接出错！");
	                },
				    success: function(data){
				    	hideLoader();
				    	alert(data.result);
				    	$.mobile.changePage("${ctx}/interface.do", "slideup");
				    	//$.mobile.changePage("${ctx}/workflow/uploadpage.do", "slideup");
				    }
				});
				return false;
			});
			
			$(document).off("pageinit");
		});
		
		//显示加载器
	    function showLoader(msg) {
	        //显示加载器.for jQuery Mobile 1.2.0
	        $.mobile.loading('show', {
	            text: msg, //加载器中显示的文字
	            textVisible: true, //是否显示文字
	            theme: 'a',        //加载器主题样式a-e
	            textonly: false,   //是否只显示文字
	            html: ""           //要显示的html内容，如图片等
	        });
	    }
	    //隐藏加载器.for jQuery Mobile 1.2.0
	    function hideLoader()
	    {
	        //隐藏加载器
	        $.mobile.loading('hide');
	    }
	</script>
		<div data-role="header" data-position="fixed">
			<a id="exit" data-role="button" href="#" class="ui-btn-right">注销</a>
			<h1>全员提案改善</h1>
		</div>
		<div id="main" data-role="content">
			<form action="" id="workflow_fm" enctype="multipart/form-data">
			<div data-role="fieldcontain">
				<input id="dlrx" name="dlrx" type="hidden" value="${user.workcode }"/>
				<input id="xtdlr" name="xtdlr" type="hidden" value="${user.lastname }"/>
				<input id="tarszdw" name="tarszdw" type="hidden" value="${user.departmentid }"/>
			</div>
				<div data-role="fieldcontain">
		            <label for="targh">提案人工号<font color="red">*</font></label>
		            <input name="targh" id="targh" placeholder="" value="" data-mini="true"
		            type="text">
		        </div>
		        <div data-role="fieldcontain">
		            <label for="tarxm">提案人姓名<font color="red">*</font></label>
		            <input name="tarxm" id="tarxm" placeholder="" value="" data-mini="true"
		            type="text">
		        </div>
				<div data-role="fieldcontain">
		            <label for="tarznsx">提案人职能属性<font color="red">*</font></label>
		            <select id="tarznsx" name="tarznsx" data-mini="true">
		                <option value="0">管理</option>
		                <option value="1">一线</option>
		            </select>
		        </div>
		        <div data-role="fieldcontain">
		            <label for="talx">提案类型<font color="red">*</font></label>
		            <select id="talx" name="talx" data-mini="true">
		                <option value="0">质量改善类</option>
		                <option value="1">工艺优化类</option>
		                <option value="2">成本控制类</option>
		                <option value="3">效率提升类</option>
		                <option value="4">设备改造类</option>
		                <option value="5">物料管理类</option>
		                <option value="6">方法优化类</option>
		                <option value="7">安全改善类</option>
		                <option value="8">环境改善类</option>
		                <option value="9">员工福利类</option>
		                <option value="10">其他</option>
		            </select>
		        </div>
		        
				<div data-role="fieldcontain">
		            <label for="tamc">提案名称<font color="red">*</font></label>
		            <input name="tamc" id="tamc" placeholder="" value="" data-mini="true"
		            type="text">
		        </div>
		        
		        <div data-role="fieldcontain">
		            <label for="tarlxfs">提案人联系方式<font color="red">*</font></label>
		            <input name="tarlxfs" id="tarlxfs" placeholder="" value="" data-mini="true"
		            type="tel">
		        </div>
		        
		        <div data-role="fieldcontain">
		            <label for="banzu">班组</label>
		            <input name="banzu" id="banzu" placeholder="" value="" data-mini="true" type="text">
		        </div>
		        
		        <div data-role="fieldcontain">
		            <label for="gsqxzms">改善前现状描述<font color="red">*</font></label>
		            <textarea name="gsqxzms" id="gsqxzms" placeholder="" data-mini="true"></textarea>
		        </div>
		        
		        <div data-role="fieldcontain">
		            <label for="gsyj">改善建议<font color="red">*</font></label>
		            <textarea name="gsyj" id="gsyj" placeholder="" data-mini="true"></textarea>
		        </div>
		        
		        <div data-role="fieldcontain">
		            <label for="gshyjxg">改善后预计效果<font color="red">*</font></label>
		            <textarea name="gshyjxg" id="gshyjxg" placeholder="" data-mini="true"></textarea>
		        </div>
		        <input value="提交" type="submit">
			</form>
		</div>
		<div data-role="footer" data-position="fixed" data-mini="true">
			<h1>郑州格力·信息网络</h1>
		</div>
	</div>
</body>
</html>