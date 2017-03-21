<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<!DOCTYPE html>
<html lang="zh-CN">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="author" content="dd" />
<meta name="viewport" content="width=device-width,initial-scale=1">
<meta name="description" content="jsp" />
<meta name="keywords" content="dd, HTML5, CSS3, JavaScript" />
<meta http-equiv="refresh" content="600" />
<link rel="shortcut icon" href="<%=basePath%>icon.ico" type="image/x-icon">
<link href="<%=basePath%>plugin/bootstrap/css/bootstrap.min.css" rel="stylesheet">
<link href="<%=basePath%>static/css/system/main.css" rel="stylesheet">
<script type="text/javascript" src="<%=basePath%>plugin/jquery/jquery-2.2.3.min.js"></script>
<script type="text/javascript" src="<%=basePath%>plugin/bootstrap/js/bootstrap.min.js"></script>
<title>jsp</title>
</head>
<body>
	<div class="header"></div>
	<nav class="main-navigation">
		<div class="container">
			<div class="row">
				<div class="col-sm-12">
					
                    <div class="collapse navbar-collapse" id="main-menu">
                        <ul class="menu list-unstyled">
					        <li  role="presentation"><a href="<%=basePath%>test/tt.do">测试</a></li>
					        <li  role="presentation"><a href="<%=basePath%>kanban/kanban1.jsp">看板显示</a></li>
						</ul>   
                    </div>
				</div>
			</div>
		</div>
	</nav>
</body>
</html>