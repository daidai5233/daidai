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
<script type="text/javascript" src="<%=basePath%>plugin/jquery/jquery-2.2.3.min.js"></script>
<script type="text/javascript" src="<%=basePath%>plugin/bootstrap/js/bootstrap.min.js"></script>
<title>测试页</title>
</head>
<body>
	<div class="container">
	<div class="row">
		<div class="span12">
			<div class="row">
				<div class="span12">
					<h3 class="text-center">
						测试
					</h3>
				</div>
			</div>
			<div class="row">
				<div class="span2">
				</div>
				<div class="span10">
					<div class="tabbable" id="tabs-602865">
						<ul class="nav nav-tabs">
							<li>
								<a href="#panel-641158" data-toggle="tab">第一部分</a>
							</li>
							<li class="active">
								<a href="#panel-898585" data-toggle="tab">第二部分</a>
							</li>
						</ul>
						<div class="tab-content">
							<div class="tab-pane" id="panel-641158">
								<p>
									第一部分内容.
								</p>
							</div>
							<div class="tab-pane active" id="panel-898585">
								<p>
									第二部分内容.
								</p>
							</div>
						</div>
					</div>
					<div class="row">
						<div class="span12">
							<div class="btn-group">
								 <button class="btn" type="button"><em class="icon-align-left"></em></button> <button class="btn" type="button"><em class="icon-align-center"></em></button> <button class="btn" type="button"><em class="icon-align-right"></em></button> <button class="btn" type="button"><em class="icon-align-justify"></em></button>
							</div>
						</div>
					</div>
					<div class="row">
						<div class="span2">
							<ul class="nav nav-tabs">
								<li class="active">
									<a href="#">首页</a>
								</li>
								<li>
									<a href="#">资料</a>
								</li>
								<li class="disabled">
									<a href="#">信息</a>
								</li>
								<li class="dropdown pull-right">
									 <a href="#" data-toggle="dropdown" class="dropdown-toggle">下拉<strong class="caret"></strong></a>
									<ul class="dropdown-menu">
										<li>
											<a href="#">操作</a>
										</li>
										<li>
											<a href="#">设置栏目</a>
										</li>
										<li>
											<a href="#">更多设置</a>
										</li>
										<li class="divider">
										</li>
										<li>
											<a href="#">分割线</a>
										</li>
									</ul>
								</li>
							</ul>
						</div>
						<div class="span10">
							<table class="table">
								<thead>
									<tr>
										<th>
											编号
										</th>
										<th>
											产品
										</th>
										<th>
											交付时间
										</th>
										<th>
											状态
										</th>
									</tr>
								</thead>
								<tbody>
									<tr>
										<td>
											1
										</td>
										<td>
											TB - Monthly
										</td>
										<td>
											01/04/2012
										</td>
										<td>
											Default
										</td>
									</tr>
									<tr class="success">
										<td>
											1
										</td>
										<td>
											TB - Monthly
										</td>
										<td>
											01/04/2012
										</td>
										<td>
											Approved
										</td>
									</tr>
									<tr class="error">
										<td>
											2
										</td>
										<td>
											TB - Monthly
										</td>
										<td>
											02/04/2012
										</td>
										<td>
											Declined
										</td>
									</tr>
									<tr class="warning">
										<td>
											3
										</td>
										<td>
											TB - Monthly
										</td>
										<td>
											03/04/2012
										</td>
										<td>
											Pending
										</td>
									</tr>
									<tr class="info">
										<td>
											4
										</td>
										<td>
											TB - Monthly
										</td>
										<td>
											04/04/2012
										</td>
										<td>
											Call in to confirm
										</td>
									</tr>
								</tbody>
							</table>
							<div class="pagination">
								<ul>
									<li>
										<a href="#">上一页</a>
									</li>
									<li>
										<a href="#">1</a>
									</li>
									<li>
										<a href="#">2</a>
									</li>
									<li>
										<a href="#">3</a>
									</li>
									<li>
										<a href="#">4</a>
									</li>
									<li>
										<a href="#">5</a>
									</li>
									<li>
										<a href="#">下一页</a>
									</li>
								</ul>
							</div>
						</div>
					</div>
					<div class="progress">
						<div class="bar">
						</div>
					</div>
				</div>
			</div>
			<div class="row">
				<div class="span12">
				</div>
			</div>
		</div>
	</div>
</div>
</body>
</html>