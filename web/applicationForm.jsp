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
      <div class="row jeff-bg-white-opacity" style="padding: 20px;">
        <h1 class="text-center">入园申请表</h1>
      </div>
      <div class="row jeff-bg-wheat-opacity" style="padding: 20px">
        <h3>疫苗记录</h3>
        <div class="col-md-12">
          <table class="table">
            <thead>
            <tr>
              <th><h4>疫苗</h4></th>
              <th><h4 class="text-center">1st</h4></th>
              <th><h4 class="text-center">2nd</h4></th>
              <th><h4 class="text-center">3rd</h4></th>
              <th><h4 class="text-center">4th</h4></th>
              <th><h4 class="text-center">5th</h4></th>
            </tr>
            </thead>
            <tbody>
            <tr>
              <th scope="row"><h4>小儿麻痹症</h4></th>
              <td><input class="form-control"></td>
              <td><input class="form-control"></td>
              <td><input class="form-control"></td>
              <td><input class="form-control"></td>
              <td><input class="form-control"></td>
            </tr>
            <tr>
              <th scope="row"><h4>白喉破伤风</h4></th>
              <td><input class="form-control"></td>
              <td><input class="form-control"></td>
              <td><input class="form-control"></td>
              <td><input class="form-control"></td>
              <td><input class="form-control"></td>
            </tr>
            <tr>
              <th scope="row"><h4>麻疹/腮腺炎/风疹</h4></th>
              <td><input class="form-control"></td>
              <td><input class="form-control"></td>
              <td><input class="form-control"></td>
              <td><input class="form-control"></td>
              <td><input class="form-control"></td>
            </tr>
            <tr>
              <th scope="row"><h4>甲型肝炎</h4></th>
              <td><input class="form-control"></td>
              <td><input class="form-control"></td>
              <td><input class="form-control"></td>
              <td><input class="form-control"></td>
              <td><input class="form-control"></td>
            </tr>
            <tr>
              <th scope="row"><h4>乙型肝炎</h4></th>
              <td><input class="form-control"></td>
              <td><input class="form-control"></td>
              <td><input class="form-control"></td>
              <td><input class="form-control"></td>
              <td><input class="form-control"></td>
            </tr>
            <tr>
              <th scope="row"><h4>日本脑炎</h4></th>
              <td><input class="form-control"></td>
              <td><input class="form-control"></td>
              <td><input class="form-control"></td>
              <td><input class="form-control"></td>
              <td><input class="form-control"></td>
            </tr>
            <tr>
              <th scope="row"><h4>狂犬疫苗</h4></th>
              <td><input class="form-control"></td>
              <td><input class="form-control"></td>
              <td><input class="form-control"></td>
              <td><input class="form-control"></td>
              <td><input class="form-control"></td>
            </tr>
            <tr>
              <th scope="row"><h4>肺结核</h4></th>
              <td><input class="form-control"></td>
              <td><input class="form-control"></td>
              <td><input class="form-control"></td>
              <td><input class="form-control"></td>
              <td><input class="form-control"></td>
            </tr>
            <tr>
              <th scope="row"><h4>伤寒</h4></th>
              <td><input class="form-control"></td>
              <td><input class="form-control"></td>
              <td><input class="form-control"></td>
              <td><input class="form-control"></td>
              <td><input class="form-control"></td>
            </tr>
            </tbody>
          </table>
        </div>
      </div>
      <div class="row jeff-bg-white-opacity" style="padding: 20px">
        <h5>我们非常关心孩子的健康，所以一旦孩子的健康状况或者疫苗情况出现变化请及时告知我们</h5>
      </div>
      <div class="row jeff-bg-wheat-opacity" style="padding: 20px">
        <h3>紧急联系人（除父母外）</h3>
        <div class="col-md-12">
          <div class="row"><h4 class="text-center">紧急情况第一联系人</h4></div>
          <div class="row">
            <div class="col-md-offset-1 col-md-2">
              <div class="row">
                <h4>与孩子关系</h4>
              </div>
              <div class="row">
                <h4>工作电话</h4>
              </div>
            </div>
            <div class="col-md-3">
              <div class="row">
                <input class="form-control" type="text">
              </div>
              <div class="row" style="margin-top: 10px">
                <input class="form-control" type="text">
              </div>
            </div>
            <div class="col-md-2">
              <div class="row">
                <h4 style="padding-left: 30px;">移动电话</h4>
              </div>
              <div class="row">
                <h4 style="padding-left: 30px;">家庭电话</h4>
              </div>
            </div>
            <div class="col-md-3">
              <div class="row">
                <input class="form-control" type="text">
              </div>
              <div class="row" style="margin-top: 10px">
                <input class="form-control" type="text">
              </div>
            </div>
          </div>
        </div>
        <div class="col-md-12">
          <div class="row"><h4 class="text-center">紧急情况第二联系人</h4></div>
          <div class="row">
            <div class="col-md-offset-1 col-md-2">
              <div class="row">
                <h4>与孩子关系</h4>
              </div>
              <div class="row">
                <h4>工作电话</h4>
              </div>
            </div>
            <div class="col-md-3">
              <div class="row">
                <input class="form-control" type="text">
              </div>
              <div class="row" style="margin-top: 10px">
                <input class="form-control" type="text">
              </div>
            </div>
            <div class="col-md-2">
              <div class="row">
                <h4 style="padding-left: 30px;">移动电话</h4>
              </div>
              <div class="row">
                <h4 style="padding-left: 30px;">家庭电话</h4>
              </div>
            </div>
            <div class="col-md-3">
              <div class="row">
                <input class="form-control" type="text">
              </div>
              <div class="row" style="margin-top: 10px">
                <input class="form-control" type="text">
              </div>
            </div>
          </div>
        </div>
      </div>
      <div class="row jeff-bg-wheat-opacity" style="margin-top: 20px;padding: 20px;">
        <h3>保险信息</h3>
        <h5>您可以在幼儿园为幼儿购买团体意外险。</h5>
        <h5>如果您的孩子有其他的保险卡，请提供卡的复印件。</h5>
        <div class="col-md-12">
          <div class="row">
            <div class="col-md-offset-1 col-md-2">
              <h4>保险公司</h4>
            </div>
            <div class="col-md-4">
              <input class="form-control" type="text">
            </div>
          </div>
          <div class="row">
            <div class="col-md-offset-1 col-md-2">
              <h4>保险单号码</h4>
            </div>
            <div class="col-md-4">
              <input class="form-control" type="text">
            </div>
          </div>
          <div class="row">
            <div class="col-md-offset-1 col-md-2">
              <h4>保险项目</h4>
            </div>
            <div class="col-md-4">
              <input class="form-control" type="text">
            </div>
          </div>
        </div>
      </div>
      <div class="row jeff-bg-wheat-opacity" style="margin-top: 20px;padding: 20px;">
        <h3>条款</h3>
        <label>
          <input type="checkbox">如果幼儿园不能与我孩子的父母/监护人或紧急情况联系人取得联系，我允许幼儿园为我的孩子寻求医疗救助，我将负担
          因此产生的一切费用。
        </label>
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
