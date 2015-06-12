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
		/* $(document).on("pagebeforecreate",function(event){
			$(document).off('pageinit', '#upload', initPage2);
			alert("注:上传完成后请在以下共享寻找文件：\\\\172.73.0.168\\临时文件\\phoneupload\\日期\\工号");
		}); */
		$(document).on('pageinit','#upload',initPage);
		function initPage(event){
			$(document).off('pageinit','#upload',initPage);
			alert("注:上传完成后请在以下共享寻找文件：\\\\172.73.0.168\\临时文件\\phoneupload\\日期\\工号");
		}
        function fileSelected() {
            var file = document.getElementById('file').files[0];
            if (file) {
                var fileSize = 0;
                if (file.size > 1024 * 1024)
                    fileSize = (Math.round(file.size * 100 / (1024 * 1024)) / 100).toString() + 'MB';
                else
                    fileSize = (Math.round(file.size * 100 / 1024) / 100).toString() + 'KB';
                
                document.getElementById('fileName').innerHTML = '文件名称: ' + file.name;
                document.getElementById('fileSize').innerHTML = '文件大小: ' + fileSize;
                document.getElementById('fileType').innerHTML = '文件类型: ' + file.type;
            }
        }

        function uploadFile() {
        	var file = document.getElementById('file').files[0];
        	if(file.size > 4*1024 * 1024){
            	alert("文件不能超过4M！");
            	return false;
            }
        	$('#uploadbutton').attr({"disabled":"disabled"});
            var fd = new FormData();
            fd.append("upfile", document.getElementById('file').files[0]);
            var xhr = new XMLHttpRequest();
            xhr.upload.addEventListener("progress", uploadProgress, false);
            xhr.addEventListener("load", uploadComplete, false);
            xhr.addEventListener("error", uploadFailed, false);
            xhr.addEventListener("abort", uploadCanceled, false);
            xhr.open("POST", "${ctx }/hr/uploadwages.do");
            xhr.send(fd);
        }
        function uploadProgress(evt) {
            if (evt.lengthComputable) {
                var percentComplete = Math.round(evt.loaded * 100 / evt.total);
                document.getElementById('progressNumber').innerHTML = percentComplete.toString() + '%';
            }
            else {
                document.getElementById('progressNumber').innerHTML = 'unable to compute';
            }
        }
        function uploadComplete(evt) {
            alert(evt.target.responseText);
            $.mobile.changePage("${ctx}/interface.do", "slideup");
        }
        function uploadFailed(evt) {
            alert("上传出错！");
        }
        function uploadCanceled(evt) {
            alert("用户取消或连接关闭！");
        }
	</script>
		<div data-role="header" data-position="fixed">
			<h1>OA上传附件</h1>
		</div>
		<div data-role="content">
			<form id="uploadform" action="" enctype="multipart/form-data" method="POST">
		        <div class="row">
				    <label for="file">文件上传:（上传文件不能超过4M）</label>
				    <input type="file" name="file" id="file"  multiple="multiple" onchange="fileSelected();" />
				</div>
				<div id="fileName">
				</div>
				<div id="fileSize">
				</div>
				<div id="fileType">
				</div> 
				<div id="progressNumber">
				</div>
				<div class="row">
				     <input id="uploadbutton" type="button" onclick="uploadFile()" value="上传文件" />
				</div>
	        </form>
		</div>
		<div data-role="footer" data-position="fixed" data-mini="true">
			<h1>郑州格力·信息网络</h1>
		</div>
	</div>
</body>
</html>