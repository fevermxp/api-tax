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
	<div data-role="page" id="login">
	<script type="text/javascript">
		$(document).on("pageinit",function(event){
			//登陆按钮
			$('#login_button').click(function(){
				var login_method = $('#choose_box').val();
				if(login_method==1){
					$.ajax({
						type:'post',
						contentType: "application/json",
						datatype:'json',
						url:'${ctx}/user/signin_workcode.do',
						data:"{'workcode':'"+$('#loginid').val()+"','password':'"+$('#password').val()+"'}",
						success:function(data){
							if(data.result==1){
								$.mobile.changePage("${ctx}/interface.do", "slideup");
							}else if(data.result==2){
								document.getElementById('msg').innerHTML= "";
								document.getElementById('msg').innerHTML= "用户不存在！";
								document.getElementById('msg').style.display="";
							}else{
								document.getElementById('msg').innerHTML= "";
								document.getElementById('msg').innerHTML= "密码不正确！";
								document.getElementById('msg').style.display="";
							}
						}
					});
				}else{
					$.ajax({
						type:'post',
						contentType: "application/json",
						datatype:'json',
						url:'${ctx}/user/signin_oa.do',
						data:"{'loginid':'"+$('#loginid').val()+"','password':'"+$('#password').val()+"'}",
						success:function(data){
							if(data.result==1){
								$.mobile.changePage("${ctx}/interface.do", "slideup");
							}else if(data.result==2){
								document.getElementById('msg').innerHTML= "";
								document.getElementById('msg').innerHTML= "用户不存在！";
								document.getElementById('msg').style.display="";
							}else{
								document.getElementById('msg').innerHTML= "";
								document.getElementById('msg').innerHTML= "密码不正确！";
								document.getElementById('msg').style.display="";
							}
						}
					});
				}
			});
			$(document).off("pageinit");
		});
	</script>
		<div data-role="header" data-position="fixed">
			<h1>GREE手机登陆</h1>
		</div>
		<div data-role="content">
			<form id="loginform" action="">
				<div data-role="fieldcontain">
	            	<label for="loginid">账户</label>
	            	<input name="loginid" id="loginid" placeholder="" value="" type="text" data-mini="true">
	        	</div>
		        <div data-role="fieldcontain">
		            <label for="password">密码</label>
		            <input name="password" id="password" placeholder="" value="" type="password" data-mini="true">
		        </div>
		        <div data-role="fieldcontain">
		            <select id="choose_box" name="choose_box" data-mini="true">
		                <option value="1">人资登陆</option>
		                <option value="2">OA登陆</option>
		            </select>
		        </div>
		        <div style="display:none;" id="msg"></div>
	        </form>
        	<a data-role="button" href="#" id="login_button">登陆</a>
		</div>
		<div data-role="footer" data-position="fixed" data-mini="true">
			<h1>郑州格力·信息网络</h1>
		</div>
	</div>
</body>
</html>