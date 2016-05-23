<%--
  Created by IntelliJ IDEA.
  User: zhengjiabin
  Date: 15/12/5
  Time: 下午1:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
  <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no">
  <meta http-equiv="content-type" content="text/html;charset=UTF-8">
  <title>JeffKindergarten</title>
  <script src="<c:url value="public/lib/jquery/dist/jquery.js"/>"></script>
  <link rel="stylesheet" type="text/css" href="<c:url value="public/lib/bootstrap/dist/css/bootstrap-theme.min.css"/>">
  <link rel="stylesheet" type="text/css" href="<c:url value="public/lib/bootstrap/dist/css/bootstrap.min.css"/>">
  <script src="<c:url value="public/lib/bootstrap/dist/js/bootstrap.min.js"/>"></script>
  <link rel="stylesheet" type="text/css" href="<c:url value="public/css/component.css"/>">
  <link rel="stylesheet" type="text/css" href="<c:url value="public/css/homepage.css"/>">
</head>
<body>
<div class="container">
  <div class="row">
    <div class="col-md-offset-1 col-md-10 jeff-nav jeff-bg-wheat-opacity">
      <ul>
        <li><a>Sign in / Register</a></li>
        <li><a>News</a></li>
        <li><a>About Us</a></li>
        <li><a>Forum</a></li>
        <li><a>Cam</a></li>
        <li><a>Contact</a></li>
      </ul>
    </div>
  </div>
  <div class="row">
    <div class="col-md-offset-1 col-md-10">
      <div class="row jeff-bg-blue-opacity jeff-color-white">
        <div class="col-md-2">
          <img src="<c:url value="public/img/logo.png"/>" width="94" height="135" style="margin: -20px 10px 20px 10px">
        </div>
        <div class="col-md-10" style="margin-top: 20px">
          <div class="row jeff-font-family-Arail jeff-font-md">Jeff's House Kindergarten</div>
          <div class="row jeff-font-family-Arail jeff-font-lg">杰夫幼儿园</div>
        </div>
      </div>
      <div class="row jeff-bg-wheat-opacity jeff-margin-top-offset jeff-padding-offset">
        <h3>工作名称</h3>
        <div class="col-md-12">
          <div class="row">
            <h4>工作内容介绍：blablablablablbalblablablab</h4>
          </div>
          <div class="row">
            <h4>工作时间：balbalblablablablabl</h4>
          </div>
          <div class="row">
            <h4>工作balblablablbalb</h4>
          </div>
        </div>
      </div>
      <div class="row jeff-bg-wheat-opacity jeff-margin-top-offset jeff-padding-offset">
        <h3 class="text-center">申请表</h3>
        <div class="col-md-6 col-md-offset-1">
          <form class="form-horizontal">
            <div class="form-group">
              <label class="col-md-3 control-label">姓名</label>
              <div class="col-md-8">
                <input type="text" class="form-control">
              </div>
            </div>
            <div class="form-group">
              <label class="col-md-3 control-label">性别</label>
              <div class="col-md-8">
                <select class="form-control">
                  <option>男</option>
                  <option>女</option>
                </select>
              </div>
            </div>
            <div class="form-group">
              <label class="col-md-3 control-label">出生年月</label>
              <div class="col-md-8">
                <input class="form-control" type="date">
              </div>
            </div>
            <div class="form-group">
              <label class="col-md-3 control-label">最高学历</label>
              <div class="col-md-8">
                <select class="form-control">
                  <option>博士</option>
                  <option>硕士</option>
                  <option>本科</option>
                </select>
              </div>
            </div>
            <div class="form-group">
              <label class="col-md-3 control-label">地址</label>
              <div class="col-md-8">
                <input class="form-control" type="text">
              </div>
            </div>
            <div class="form-group">
              <label class="col-md-3 control-label">电话</label>
              <div class="col-md-8">
                <input class="form-control" type="text">
              </div>
            </div>
            <div class="form-group">
              <label class="col-md-3 control-label">邮箱</label>
              <div class="col-md-8">
                <input class="form-control" type="email">
              </div>
            </div>
            <div class="form-group">
              <label class="col-md-3 control-label">简历</label>
              <div class="col-md-8">
                <input type="file">
              </div>
            </div>
          </form>
        </div>
        <div class="col-md-4">
          <h3>个人照片</h3>
          <img src="<c:url value="public/img/portrait.png"/>">
        </div>
      </div>
    </div>
  </div>
  <div class="row jeff-contact jeff-bg-blue-opacity jeff-no-margin jeff-padding-offset" style="margin-top: 30px;">
    <div class="col-md-5 jeff-color-white" style="padding: 50px">
      <div class="row jeff-font-lg">Get in Touch</div>
      <div class="row jeff-font-md">Tel:&nbsp;+86&nbsp;22&nbsp;23310236</div>
      <div class="row jeff-font-md">Fax:&nbsp;+86&nbsp;22&nbsp;23310636</div>
      <div class="row jeff-font-md">Email:&nbsp;jeff@jeffhouse.net</div>
    </div>
    <div class="col-md-7">
      <div id="mapContainer" style="height: 400px"></div>
    </div>
  </div>
  <div class="row jeff-footer jeff-no-margin">
    <img src="<c:url value="public/img/footer.png"/>">
  </div>
</div>

<script type="text/javascript">
  $(function() {
    $('.carousel').carousel();
    // 百度地图API功能
    var map = new BMap.Map("mapContainer");
    map.centerAndZoom(new BMap.Point(117.212694, 39.116151), 17);
    // 添加带有定位的导航控件
    var navigationControl = new BMap.NavigationControl({
      // 靠左上角位置
      anchor: BMAP_ANCHOR_TOP_LEFT,
      // LARGE类型
      type: BMAP_NAVIGATION_CONTROL_LARGE,
      // 启用显示定位
      enableGeolocation: true
    });
    map.addControl(navigationControl);
    map.addControl(new BMap.ScaleControl());
    map.addControl(new BMap.MapTypeControl());
    map.enableScrollWheelZoom();

    var local = new BMap.LocalSearch(map, {
      renderOptions:{map: map}
    });
    local.search("杰夫幼儿园");
  });
</script>
<script src="http://api.map.baidu.com/api?v=2.0&ak=8ISSk3V3dafhgbYCLrFh9SWG"></script>
</body>
</html>
