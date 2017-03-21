<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
	String lkh = (String)request.getAttribute("lkh");
	if(lkh==null){
		lkh = request.getParameter("lkh");
		if(lkh==null || "".equals(lkh))
		lkh="A";
		request.setAttribute("lkh",lkh);
	}else{
		lkh = lkh.toString();
	}
%>
<!DOCTYPE html>
<html lang="zh-CN">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="author" content="dd" />
<meta name="viewport" content="width=device-width,initial-scale=1">
<meta http-equiv="refresh" content="600" />
<link rel="shortcut icon" href="<%=basePath%>icon.ico" type="image/x-icon">
<link href="<%=basePath%>plugin/bootstrap/css/bootstrap.min.css" rel="stylesheet">
<script type="text/javascript" src="<%=basePath%>plugin/jquery/jquery-2.2.3.min.js"></script>
<script type="text/javascript" src="<%=basePath%>plugin/bootstrap/js/bootstrap.min.js"></script>
<script type="text/javascript" src="<%=basePath%>static/js/kanban1.js"></script>
<title>库位看板</title>
<style type="text/css">
	/* div{border:1px solid gray;} */
	.header{position:fixed;width:100%; height:6%;text-align: center;}
	.main_bt{position:fixed;width:100%;height:10%;}
	.main_body{margin-top:0%;}
	.content{width:100%;height:85%;}
	
	.lk td{width:1%;height:2%;padding:2px 4px;font-size:1vw !important; }
	.tdh{background-color: gray;}
	.dkw{background-color: lightGray;}
	.lkrow{}
	
	.dh_head{border-width:1px;border-color:silver;border-radius: 2px 2px 2px 2px;}
	.skdiv{position:fixed;margin-right:10px;margin-top: 10%;}
	/* .skdiv li{width:100px;height:50px;margin:6px 0px;} */
	.sk{width:100%;;height:20%;;font-size:1vw;color:black;border:1px solid black;}
	.red{background-color:red;}
	.green{background-color:green;}
	.yellow{background-color:yellow;}
	.black{background-color:black;}
	.white{background-color:white;}
	.gray{background-color:gray;}
	.blue{background-color:blue;}
</style>
</head>
<body>
	<div>
		<div class="content" >
						<div class="main_bt">
							<h3 class="text-center"><%-- 立库看板<small>(<%= lkh%>)</small> --%></h3>
						</div>
						<hr>
						<div class="row main_body">
							<div class="col-xs-1" >
								<jsp:include page="lknav.jsp"></jsp:include>
							</div>
							<div class="col-xs-10" id="lk"></div>
							<div class="col-xs-1">
								<div class="navbar-collapse collapse skdiv">
									<ul class="nav">
										<li role="presentation" class="btn btn-default btn-sm sk green" disable="true">
											空闲
										</li>
										<li role="presentation" class="btn btn-default btn-sm sk yellow">
											锁定
										</li>
										<li role="presentation" class="btn btn-default btn-sm sk red">
											占用
										</li>
										<li role="presentation" class="btn btn-default btn-sm white">
											
										</li>
										<li role="presentation" class="btn btn-default btn-sm sk white">
											小库
										</li>
										<li role="presentation" class="btn btn-default btn-sm sk gray">
											大库
										</li>
										
									</ul>
								</div>
							</div>
						</div>
		</div>
	</div>
	<script type="text/javascript">
		var basePath = "<%=basePath %>"; 
		$(function(){
			$("#lk").html(create("<%= lkh%>"));
			findkwzt("<%=lkh%>");
		});
	</script>
</body>
</html>