<%--
  Created by IntelliJ IDEA.
  User: zhengjiabin
  Date: 15/10/6
  Time: 上午1:27
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
      <div id="carouselDiv" class="row carousel slide" data-ride="carousel" style="height: 400px">
        <!-- Indicators -->
        <ol class="carousel-indicators">
          <li data-target="#carouselDiv" data-slide-to="0" class="active"></li>
          <li data-target="#carouselDiv" data-slide-to="1"></li>
          <li data-target="#carouselDiv" data-slide-to="2"></li>
        </ol>

        <!-- Wrapper for slides -->
        <div class="carousel-inner" role="listbox">
          <div class="item active">
            <img src="<c:url value="public/img/pic1.png"/>" alt="...">
          </div>
          <div class="item">
            <img src="<c:url value="public/img/pic2.png"/>" alt="...">
          </div>
          <div class="item">
            <img src="<c:url value="public/img/pic3.png"/>" alt="...">
          </div>
        </div>

        <!-- Controls -->
        <a class="left carousel-control" href="#carouselDiv" role="button" data-slide="prev">
          <span class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
          <span class="sr-only">Previous</span>
        </a>
        <a class="right carousel-control" href="#carouselDiv" role="button" data-slide="next">
          <span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
          <span class="sr-only">Next</span>
        </a>
      </div>
      <div class="row jeff-bg-blue-opacity jeff-color-white jeff-padding-offset">
        <p class="jeff-text-center jeff-font-lg">WELCOME TO JEFF'S HOUSE</p>
        <p class="jeff-font-md jeff-auto-word-break">CHILDREN ARE WHAT WE CARE ABOUT
          BLABLABLA BALBALBALBALBALBALBLALBALBLABLALBALBLALBALBL
          BALBLALBALBALBLALBALBLALBALBALBLALBALBAL
          ABLALBALBALBLALBALBLALB</p>
      </div>
      <div class="row jeff-padding-top-offset jeff-padding-bottom-offset jeff-color-brown jeff-font-lg jeff-text-center jeff-bg-white-opacity">
        Some of Jeff's Family
      </div>
      <div id="jeff-family-show" class="row jeff-bg-blue-opacity">
        <div class="col-md-12">
          <div class="row jeff-show-item">
            <div class="col-md-7">
              <img src="<c:url value="public/img/picFamily1.png"/>">
            </div>
            <div class="col-md-5">
              <div class="jeff-description jeff-color-white jeff-font-md">
                <p>
                  CHILDREN ARE WHAT WE CARE ABOUT BLABLALBALBA
                </p>
                <p>
                  CHILDREN ARE WHAT WE CARE ABOUT BLABLALBALBA
                </p>
              </div>
            </div>
          </div>
          <div class="row jeff-show-item">
            <div class="col-md-4">
              <img src="<c:url value="public/img/picFamily2.png"/>">
            </div>
            <div class="col-md-4">
              <div class="jeff-description jeff-color-white jeff-font-md">
                <p>
                  CHILDREN ARE WHAT WE CARE ABOUT BLABLALBALBA
                </p>
                <p>
                  CHILDREN ARE WHAT WE CARE ABOUT BLABLALBALBA
                </p>
              </div>
            </div>
            <div class="col-md-4">
              <img src="<c:url value="public/img/picFamily3.png"/>">
            </div>
          </div>
          <div class="row jeff-show-item">
            <div class="col-md-5">
              <img src="<c:url value="public/img/picFamily4.png"/>">
            </div>
            <div class="col-md-7">
              <img src="<c:url value="public/img/picFamily5.png"/>">
            </div>
          </div>
          <div class="row jeff-show-item">
            <div class="col-md-8">
              <img src="<c:url value="public/img/picFamily6.png"/>">
            </div>
            <div class="col-md-4">
              <div class="jeff-description jeff-color-white jeff-font-md">
                <p>
                  CHILDREN ARE WHAT WE CARE ABOUT BLABLALBALBA
                </p>
                <p>
                  CHILDREN ARE WHAT WE CARE ABOUT BLABLALBALBA
                </p>
              </div>
            </div>
          </div>
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