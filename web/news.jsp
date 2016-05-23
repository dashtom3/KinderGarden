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
  <link rel="stylesheet" type="text/css" href="<c:url value="public/lib/bootstrap-datetimepicker/css/bootstrap-datetimepicker.css"/>">
  <script src="<c:url value="public/lib/bootstrap-datetimepicker/js/bootstrap-datetimepicker.js"/>"></script>
  <link rel="stylesheet" type="text/css" href="<c:url value="public/css/component.css"/>">
  <link rel="stylesheet" type="text/css" href="<c:url value="public/css/news.css"/>">
</head>
<body>
<div class="container">
  <div class="row">
    <div class="col-md-offset-1 col-md-10 ">
      <div class="row jeff-nav jeff-bg-wheat-opacity">
        <ul>
          <li><a>Sign in / Register</a></li>
          <li><a>News</a></li>
          <li><a>About Us</a></li>
          <li><a>Forum</a></li>
          <li><a>Cam</a></li>
          <li><a>Contact</a></li>
        </ul>
      </div>
      <div class="row jeff-bg-blue-opacity jeff-color-white">
        <div class="col-md-2">
          <img src="<c:url value="public/img/logo.png"/>" width="94" height="135" style="position: relative; top: -20px;">
        </div>
        <div class="col-md-10" style="position: relative;left: -50px;top: 20px;">
          <span class="jeff-font-family-Arail jeff-font-md">Jeff's House Kindergarten</span><br>
          <span class="jeff-font-family-Arail jeff-font-lg">杰夫幼儿园</span>
        </div>
      </div>
      <div class="row jeff-margin-top-offset jeff-padding-offset jeff-bg-blue-opacity jeff-color-white jeff-font-md">
        Hello Hanghang's Mom / Dad!
      </div>
      <div class="row jeff-margin-top-offset">
        <div class="col-md-7 jeff-bg-wheat-opacity" style="height: 350px; padding: 30px;">
          <div class="row">
            <div class="col-md-5">
              <img src="<c:url value="public/img/picFamily2.png"/>" height="250" width="200">
            </div>
            <div class="col-md-6 jeff-color-brown jeff-font-md">
              <div class="row">Hanghang Jiang</div>
              <div class="row">15 / 8 / 1990</div>
              <div class="row">24y 8mo</div>
              <div class="row">Class 506A</div>
              <div class="row">Teachers:</div>
              <div class="row">
                <div class="col-md-9">
                  <span>Youli Wang</span><br>
                  <span>Da Gan</span>
                </div>
                <div class="col-md-3">
                  <div class="row">
                    <span class="glyphicon glyphicon-envelope"></span>
                    <span class="glyphicon glyphicon-bullhorn"></span>
                  </div>
                  <div class="row">
                    <span class="glyphicon glyphicon-envelope"></span>
                    <span class="glyphicon glyphicon-bullhorn"></span>
                  </div>
                </div>
              </div>
            </div>
            <div class="col-md-1">
              <span class="glyphicon glyphicon-plus jeff-font-md jeff-color-brown"></span><br>
              <span class="glyphicon glyphicon-minus jeff-font-md jeff-color-brown"></span>
            </div>
          </div>
        </div>
        <div class="col-md-4 col-md-offset-1 jeff-bg-blue-opacity jeff-padding-offset" style="height: 350px">
          <div class="row">
            <div class="col-md-10">
              <div id="datetimepicker" class="jeff-bg-white"></div>
            </div>
            <div class="col-md-2">
              <span class="glyphicon glyphicon-plus jeff-font-md jeff-color-white"></span><br>
              <span class="glyphicon glyphicon-minus jeff-font-md jeff-color-white"></span>
            </div>
          </div>
        </div>
      </div>
      <div class="row jeff-margin-top-offset ">
        <div class="col-md-6 jeff-bg-blue-opacity jeff-padding-offset">
          <div class="row">
            <div class="col-md-3 jeff-font-md jeff-color-white">Inbox</div>
            <div class="col-md-2 pull-right jeff-no-padding">
              <span class="glyphicon glyphicon-plus jeff-font-md jeff-color-white"></span>
              <span class="glyphicon glyphicon-minus jeff-font-md jeff-color-white"></span>
            </div>
          </div>
          <div class="row jeff-bg-white">
            <table class="table">
              <thead>
              <tr>
                <th>#</th>
                <th>Column heading</th>
                <th>Column heading</th>
                <th>Column heading</th>
              </tr>
              </thead>
              <tbody>
              <tr class="active">
                <th scope="row">1</th>
                <td>Column content</td>
                <td>Column content</td>
                <td>Column content</td>
              </tr>
              <tr>
                <th scope="row">2</th>
                <td>Column content</td>
                <td>Column content</td>
                <td>Column content</td>
              </tr>
              <tr class="success">
                <th scope="row">3</th>
                <td>Column content</td>
                <td>Column content</td>
                <td>Column content</td>
              </tr>
              <tr>
                <th scope="row">4</th>
                <td>Column content</td>
                <td>Column content</td>
                <td>Column content</td>
              </tr>
              <tr class="info">
                <th scope="row">5</th>
                <td>Column content</td>
                <td>Column content</td>
                <td>Column content</td>
              </tr>
              <tr>
                <th scope="row">6</th>
                <td>Column content</td>
                <td>Column content</td>
                <td>Column content</td>
              </tr>
              <tr class="warning">
                <th scope="row">7</th>
                <td>Column content</td>
                <td>Column content</td>
                <td>Column content</td>
              </tr>
              <tr>
                <th scope="row">8</th>
                <td>Column content</td>
                <td>Column content</td>
                <td>Column content</td>
              </tr>
              <tr class="danger">
                <th scope="row">9</th>
                <td>Column content</td>
                <td>Column content</td>
                <td>Column content</td>
              </tr>
              </tbody>
            </table>
          </div>
        </div>
        <div class="col-md-5 col-md-offset-1">
          <div class="row">
            <div class="col-md-12 jeff-bg-wheat-opacity jeff-padding-offset">
              <div class="row">
                <div class="col-md-3 jeff-font-md jeff-color-brown">Inbox</div>
                <div class="col-md-2 pull-right jeff-no-padding">
                  <span class="glyphicon glyphicon-plus jeff-font-md jeff-color-brown"></span>
                  <span class="glyphicon glyphicon-minus jeff-font-md jeff-color-brown"></span>
                </div>
              </div>
              <div class="row jeff-bg-white">
                <table class="table">
                  <thead>
                  <tr>
                    <th>#</th>
                    <th>Column heading</th>
                    <th>Column heading</th>
                    <th>Column heading</th>
                  </tr>
                  </thead>
                  <tbody>
                  <tr class="active">
                    <th scope="row">1</th>
                    <td>Column content</td>
                    <td>Column content</td>
                    <td>Column content</td>
                  </tr>
                  <tr class="success">
                    <th scope="row">3</th>
                    <td>Column content</td>
                    <td>Column content</td>
                    <td>Column content</td>
                  </tr>
                  <tr class="info">
                    <th scope="row">5</th>
                    <td>Column content</td>
                    <td>Column content</td>
                    <td>Column content</td>
                  </tr>
                  </tbody>
                </table>
              </div>
            </div>
          </div>
          <div class="row jeff-padding-offset jeff-bg-blue-opacity jeff-margin-top-offset" style="height: 200px">
            <div class="col-md-4 jeff-menu-item jeff-no-padding" style="height: 100%">
              <img src="<c:url value="public/img/menuMon.jpg"/>">
              <div class="jeff-description jeff-bg-blue-opacity jeff-color-white jeff-font-md">MON</div>
            </div>
            <div class="col-md-4 jeff-no-padding" style="height: 100%">
              <div class="row jeff-menu-item" style="height: 50%">
                <img src="<c:url value="public/img/menuTue.jpg"/>">
                <div class="jeff-description jeff-bg-blue-opacity jeff-color-white jeff-font-md">TUE</div>
              </div>
              <div class="row jeff-menu-item" style="height: 50%">
                <img src="<c:url value="public/img/menuWed.jpg"/>">
                <div class="jeff-description jeff-bg-blue-opacity jeff-color-white jeff-font-md">WED</div>
              </div>
            </div>
            <div class="col-md-4 jeff-no-padding" style="height: 100%">
              <div class="row jeff-menu-item" style="height: 50%">
                <img src="<c:url value="public/img/menuFri.jpg"/>">
                <div class="jeff-description jeff-bg-blue-opacity jeff-color-white jeff-font-md">FRI</div>
              </div>
              <div class="row jeff-menu-item" style="height: 50%">
                <img src="<c:url value="public/img/menuThu.jpg"/>">
                <div class="jeff-description jeff-bg-blue-opacity jeff-color-white jeff-font-md">THU</div>
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

    $('#datetimepicker').datetimepicker('show');

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