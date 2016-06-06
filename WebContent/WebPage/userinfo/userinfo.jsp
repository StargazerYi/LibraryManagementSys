<!DOCTYPE html>
<html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"
	import="org.apache.struts2.ServletActionContext"
	import="com.opensymphony.xwork2.ActionContext"
%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<head>
  <meta charset="utf-8"/>
  <title>userinfo</title>
  <!-- <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
  -->
  <link rel="stylesheet" type="text/css" href="../bootstrap/css/bootstrap.css" />
  <link rel="stylesheet" type="text/css" href="./userinfo.css" />

</head>

<body>

  <div class="content" role="main">

    <div class="container">

      <div class="row">


      <!-- 右上角返回标签 -->
        <div class="nav">
          <div class="return col-md-1 col-md-offset-10">
            <a href="">return</a>
          </div>
          <div class="userinfo col-md-1">
            <form action="">
              <button class="user-info-button">
                <span class="glyphicon glyphicon-user" aria-hidden="true">13331253</span>
              </button>
            </form>
          </div>

        </div>

        <!-- 个人信息面板 -->
        <div class="col-md-8 col-md-offset-2 userinfo-content ">
          <div class="panel panel-default panel-equal z-depth-1">
            <div class="panel-body text-center">
              <div class="col-md-3">
                <img src="./photo.jpg" alt="..." class="img-circle"></div>
              <div class="col-md-8">
                <form class="form-horizontal">
                  <div class="form-group">
                    <label class="col-sm-2 control-label">Email</label>
                    <div class="col-sm-10">
                      <p class="form-control-static">email@example.com</p>
                    </div>
                  </div>
                  <div class="form-group">
                    <label for="inputPassword" class="col-sm-2 control-label">username</label>
                    <div class="col-sm-10">
                      <p class="form-control-static">xxxx</p>
                    </div>
                  </div>
                  <div class="form-group">
                    <label for="inputPassword" class="col-sm-2 control-label">userid</label>
                    <div class="col-sm-10">
                      <p class="form-control-static">213124123</p>
                    </div>
                  </div>
                </form>
              </div>
            </div>
          </div>
        </div>



        <!-- 书籍信息列表 -->
        <div class="col-md-8 col-md-offset-2 userinfo-content">
          <ul id="userinfo-myTab" class="nav nav-tabs">
            <li class="active">
              <a href="#userinfo-booking-tab" data-toggle="tab">预订</a>
            </li>
            <li>
              <a href="#userinfo-booked-tab" data-toggle="tab">已借</a>
            </li>

          </ul>
          <!-- tab框 -->
          <div id="user-info-myTabContent" class="tab-content">
          <!-- 预订框 -->
            <div class="tab-pane fade in active" id="userinfo-booking-tab">
              <div class="panel panel-default ">

                <div class="userinfo-booked tab-pane">
                  <div class="media user-booinfo">

                    <div class="media-body">
                      <div class="col-md-6">
                        <h4 class="media-heading">bookname</h4>
                      </div>
                      <div class="col-md-3">
                        <h6 >借书日期:xxx/xxx/xxx</h6>

                      </div>
                      <div class="col-md-3">
                        <h6>应还日期:xxx/xxx/xxx</h6>
                      </div>
                      Cras sit amet nibh libero, in gravida nulla. Nulla vel metus scelerisque ante sollicitudin commodo. Cras purus odio, ve
                    </div>
                    <div class="col-md-2 col-md-offset-10">
                      <form action="">
                        <input type="text" value="xxx" style="display:none">
                        <input type="submit" class="btn btn-primary" value="取消预约" ></form>
                    </div>
                  </div>

                </div>

              </div>
            </div>



            <!-- 已借框 -->
            <div class="tab-pane fade" id="userinfo-booked-tab">
              <div class="panel panel-default ">
                <div class="userinfo-booking tab-pane active" id="userinfo-booking-tab">
                  <div class="media user-booinfo">

                    <div class="media-body">
                      <div class="col-md-6">
                        <h4 class="media-heading">bookname</h4>
                      </div>
                      <div class="col-md-3">
                        <h6 >借书日期:xxx/xxx/xxx</h6>

                      </div>
                      <div class="col-md-3">
                        <h6>应还日期:xxx/xxx/xxx</h6>
                      </div>
                      Cras sit amet nibh libero, in gravida nulla. Nulla vel metus scelerisque ante sollicitudin commodo. Cras purus odio, ve
                    </div>
                    
                  </div>

                </div>

                <div class="userinfo-booked tab-pane" id="userinfo-booked-tab">
                  <div class="media user-booinfo">

                    <div class="media-body">
                      <div class="col-md-6">
                        <h4 class="media-heading">bookname</h4>
                      </div>
                      <div class="col-md-3">
                        <h6 >借书日期:xxx/xxx/xxx</h6>

                      </div>
                      <div class="col-md-3">
                        <h6>应还日期:xxx/xxx/xxx</h6>
                      </div>
                      Cras sit amet nibh libero, in gravida nulla. Nulla vel metus scelerisque ante sollicitudin commodo. Cras purus odio, ve
                    </div>
                    
                  </div>

                </div>

              </div>
            </div>
          </div>

        </div>
      </div>
    </div>
    <section class="sheet sheet--padding"></section>

  </div>

  <!-- close #content -->

  <script src="../jquery.js"></script>
  <!-- <script src="//api.filepicker.io/v2/filepicker.js"></script>
-->
<script src="../bootstrap/js/bootstrap.js"></script>
<script src="./userinfo.js"></script>

</body>
</html>