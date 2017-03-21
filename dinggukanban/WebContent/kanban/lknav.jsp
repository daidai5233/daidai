<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title></title>
<style type="text/css">
	.dht{position:fixed;margin-top:2%;z-index: 10;}
	.dht li{width:100%;height:50%;margin:5% 0;}
</style>
</head>
<body>
	<!-- 立库看板导航条 -->
    <div class="navbar-collapse collapse dht">
		<ul class="nav">
			<li role="presentation" class="btn btn-default btn-sm <%="A".equals(request.getAttribute("lkh"))?"active":"" %>"><a href="kanban1.jsp?lkh=A">立库A</a></li>
	  		<li role="presentation" class="btn btn-default btn-sm <%="B".equals(request.getAttribute("lkh"))?"active":"" %>"><a href="kanban1.jsp?lkh=B">立库B</a></li>
	  		<li role="presentation" class="btn btn-default btn-sm <%="C".equals(request.getAttribute("lkh"))?"active":"" %>"><a href="kanban1.jsp?lkh=C">立库C</a></li>
	  		<li role="presentation" class="btn btn-default btn-sm <%="D".equals(request.getAttribute("lkh"))?"active":"" %>"><a href="kanban1.jsp?lkh=D">立库D</a></li>
	  		<li role="presentation" class="btn btn-default btn-sm <%="E".equals(request.getAttribute("lkh"))?"active":"" %>"><a href="kanban1.jsp?lkh=E">立库E</a></li>
	  		<li role="presentation" class="btn btn-default btn-sm <%="F".equals(request.getAttribute("lkh"))?"active":"" %>"><a href="kanban1.jsp?lkh=F">立库F</a></li>
	  		<li role="presentation" class="btn btn-default btn-sm <%="G".equals(request.getAttribute("lkh"))?"active":"" %>"><a href="kanban1.jsp?lkh=G">立库G</a></li>
	  		<li role="presentation" class="btn btn-default btn-sm <%="H".equals(request.getAttribute("lkh"))?"active":"" %>"><a href="kanban1.jsp?lkh=H">立库H</a></li>
	  		<!-- 小按钮样式btn btn-default btn-sm -->
	  		
		</ul>
	</div>
</body>
</html>