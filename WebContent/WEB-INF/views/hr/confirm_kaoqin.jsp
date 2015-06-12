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
	<script >
	
	</script>
	<meta name="viewport" content="width=device-width, initial-scale=1">
</head>

<body>
	<div data-role="page" id="upload">
	<script type="text/javascript">
		
	</script>
		<div data-role="header" data-position="fixed">
			<h1>考勤核对</h1>
		</div>
		<div data-role="content">
			<c:if test="${empty kaoqin  }">
				没有需要确认的信息！
			</c:if>
			<c:if test="${!empty kaoqin  }">
				考勤月份：2015.6<br/>
				员工编号：${kaoqin.workcode }<br/>
				员工姓名：${kaoqin.realname }<br/>
				应出勤天数：${kaoqin.ycqts }<br/>
				工作日出勤天数：${kaoqin.gzrcqts }<br/>
				实际出勤天数：${kaoqin.sjcqts }<br/>
				生产合计天数：${kaoqin.schjts }<br/>
				月出勤总小时数：${kaoqin.ycqzxss }<br/>
				平日加班小时数：${kaoqin.prjbxs }<br/>
				假日加班小时数：${kaoqin.jiarjbxs }<br/>
				节日加班小时数：${kaoqin.jierjbxs }<br/>
				节日和假日上班天数：${kaoqin.jjrsbts }<br/>
				公司培训天数：${kaoqin.gspxts }<br/>
				分厂培训天数：${kaoqin.fcpxts }<br/>
				餐补天数：${kaoqin.cbts }<br/>
				年休假：${kaoqin.nxjts }<br/>
				病假：${kaoqin.bjts }<br/>
				事假：${kaoqin.sjts }<br/>
				产假：${kaoqin.cjts }<br/>
				计划生育假：${kaoqin.jhsyjts }<br/>
				工伤假：${kaoqin.gsjts }<br/>
				婚假：${kaoqin.hjts }<br/>
				丧假：${kaoqin.sangjts }<br/>
				哺乳假：${kaoqin.brjts }<br/>
				旷工：${kaoqin.kgts }<br/>
				补休：${kaoqin.bxts }<br/>
				预调休：${kaoqin.ytxts }<br/>
				出差天数：${kaoqin.ccts }<br/>
				白班天数：${kaoqin.bbts }<br/>
				中班天数：${kaoqin.zbts }<br/>
				晚班天数：${kaoqin.wbts }<br/>
				年休假结余天数：${kaoqin.nxjjyts }<br/>
				加班留休小时：${kaoqin.jblxxs }<br/>
				未进入公司天数：${kaoqin.wjrgsts }<br/>
				轮休天数：${kaoqin.lxts }<br/>
				公休：${kaoqin.gxts }<br/>
				合计：${kaoqin.hj }<br/>
			</c:if>
		</div>
		<div data-role="footer" data-position="fixed" data-mini="true">
			<h1>郑州格力·信息网络</h1>
		</div>
	</div>
</body>
</html>