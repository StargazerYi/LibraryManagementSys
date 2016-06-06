<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"
	import="org.apache.struts2.ServletActionContext"
	import="com.opensymphony.xwork2.ActionContext"
%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html lang="zh-CN">
<head>
	<title>信息管理</title>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0 ">
    <link rel="stylesheet" href="../bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" href="css/manage.css"> 
    <script src="http://libs.baidu.com/jquery/1.9.1/jquery.min.js"></script>
    <script src="js/manage.js"></script>
    <script src="../bootstrap/js/bootstrap.min.js"></script>
</head>
<body>
    <div class="container">
     <div class="outing">
      <div class="inner">
      	<div class="h2">登记借书/还书</div>
    	<form method="post" accept-charset="utf-8" action="borrowAndreturn" novalidate>
		  <div class="form-group">
		  	<div id="bookIdType">
			    <label for="bookIdInput" class="col-sm-2 control-label" id="bookId">书籍ID</label>
			    <input name="record.bookId" class="form-control" id="bookIdInput" placeholder="bookId">
			</div>
			<div id="bookIdType">
			    <label for="bookIdInput" class="col-sm-2 control-label" id="bookId">用户ID</label>
			    <input name="record.userId" class="form-control" id="bookIdInput" placeholder="bookId">
			</div>
		  <div id="radios">
		    <div class="radio">
			   	<label>
			        <input type="radio" name="actionType" id="optionsRadios1" value="borrow" checked>借书
			   </label>
			</div>
			<div class="radio">
			   <label>
			        <input type="radio" name="actionType" id="optionsRadios2" value="return">
			        还书
			   </label>
			</div>
		  </div>
		  <button type="submit" class="btn btn-primary" id="submit-button">修改</button>
		</form>
	  </div>
	 </div>
	  <!-- 模态框控制（Modal） -->
		<div class="successFlag" id="unsuccess" style="display:none">${status}</div>
		<!-- 模态框（Modal） -->
		<div class="modal fade" id="myModal" tabindex="-1" role="dialog" 
		   aria-labelledby="myModalLabel" aria-hidden="true">
		   <div class="modal-dialog">
		      <div class="modal-content">
		         <div class="modal-header">
		            <button type="button" class="close" 
		               data-dismiss="modal" aria-hidden="true">
		                  &times;
		            </button>
		         </div>
		         <div class="modal-body">
		         	<!-- 预约成功/失败信息及代码 -->
		         	<h4><%= ActionContext.getContext().get("status") %></h4> 
		            <h2 id="outputWords"></h2>
		         </div>
		         <div class="modal-footer">
		            <button type="button" class="btn btn-default" 
		               data-dismiss="modal">关闭
		            </button>
		         </div>
		      </div><!-- /.modal-content -->
			</div><!-- /.modal -->
		</div>
    </div>
</body>
</html>