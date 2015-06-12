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
	<div data-role="page" id="index">
	<script type="text/javascript">
		$(document).on("pageinit",function(event){
			$("#main").bind("swiperight",function(){
				//alert(1231);
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
			//访问流程
			$('#qytags').click(function(){
				//alert("暂不开放");
				$.mobile.changePage("${ctx}/workflow/workflow.do?workflowid=115", "slideup");
			});
			$('#uploadfile').click(function(){
				$.mobile.changePage("${ctx}/tools/uploadpage.do", "slideup");
			});
			$('#confirmkaoqin').click(function(){
				$.mobile.changePage("${ctx}/hr/confirmkaoqin.do", "slideup");
			});
			$('#uploadwages').click(function(){
				$.mobile.changePage("${ctx}/hr/uploadwagespage.do", "slideup");
			});
			
			$(document).off("pageinit");
		});
	</script>
		<div data-role="header" data-position="fixed">
			<a id="exit" data-role="button" href="#" class="ui-btn-right">注销</a>
			<h1>GREE手机主页</h1>
		</div>
		<div id="main" data-role="content">
			<c:if test="${login_method == 'OA' }">
				<div data-role="collapsible-set">
					<div data-role="collapsible" data-collapsed="true">
		                <h3>个人信息</h3>
		                <p>姓名：${ user.lastname}</p>
		                <p>工号：${ user.workcode}</p>
		                <p>状态：${ user.status}</p>
		                <p>登录方式：OA</p>
		            </div>
		            <div data-role="collapsible" data-collapsed="true">
		                <h3>全部功能</h3>
		                <ul data-role="listview" data-divider-theme="b" data-inset="false">
			                <li data-theme="c">
			                        <a id="qytags" href="#" data-transition="slide">全员提案改善</a>
			                </li>
		                    <li data-theme="c">
		                        <a id="uploadfile" href="#" data-transition="slide">图片上传内网</a>
		                    </li>
		                    <li data-theme="c">
		                        <a href="#" data-transition="slide">更多功能...</a>
		                    </li>
		                </ul>
		            </div>
		        </div>
	        </c:if>
	        <c:if test="${login_method == 'WC' }">
	        	<c:if test="${news !=''&&news!=null }">
		        	<c:forEach var="n" items="${news }">
		        		<p><img src="${ctx}/images/news.gif" alt="image" style="width:25px;height:15px;vertical-align:middle;">您有${n.name }信息未核对，请<a href="${ctx}/${n.url }" data-transition="fade">点击</a>核对！</p>
		        	</c:forEach>
		        </c:if>
	       		<div data-role="collapsible-set">
					<div data-role="collapsible" data-collapsed="true">
		                <h3>个人信息</h3>
		                <p>姓名：${ user.a0101}</p>
		                <p>工号：${ user.e0127}</p>
		                <p>部门：${ user.e0122}</p>
		                <p>登录方式：人力资源</p>
		            </div>
		            <div data-role="collapsible" data-collapsed="true">
		                <h3>全部功能</h3>
		                <ul data-role="listview" data-divider-theme="b" data-inset="false">
		                    <li data-theme="c">
		                        <a id="uploadfile" href="#" data-transition="slide">图片上传内网</a>
		                    </li>
		                    <li data-theme="c">
		                        <a id="confirmkaoqin" data-transition="slide">考勤确认</a>
		                    </li>
		                    <li data-theme="c">
		                        <a id="uploadwages" data-transition="slide">上传考勤</a>
		                    </li>
		                    <li data-theme="c">
		                        <a href="#" data-transition="slide">更多功能...</a>
		                    </li>
		                </ul>
		            </div>
		        </div>
	        </c:if>
		</div>
		<div data-role="footer" data-position="fixed" data-mini="true">
			<h1>郑州格力·信息网络</h1>
		</div>
	</div>
</body>
</html>