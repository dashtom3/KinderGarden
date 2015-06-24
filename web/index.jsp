<%--
  Created by IntelliJ IDEA.
  User: zhengjiabin
  Date: 15/3/24
  Time: 下午7:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no">
    <meta http-equiv="content-type" content="text/html;charset=UTF-8">
    <title>JeffKindergarten</title>
    <link rel="stylesheet" type="text/css" href="<c:url value="public/lib/bootstrap/dist/css/bootstrap-theme.css"/> ">
    <link rel="stylesheet" type="text/css" href="<c:url value="public/lib/bootstrap/dist/css/bootstrap.css"/> ">
    <link rel="stylesheet" href="<c:url value="public/css/main.css"/> ">
    <script src="<c:url value="public/lib/jquery/dist/jquery.js"/> "></script>
    <script src="<c:url value="public/lib/bootstrap/dist/js/bootstrap.js"/> "></script>
    <script src="<c:url value="public/js/main.js"/> "></script>
</head>
<body>
<div id="container">
    <div id="navigator">
        <ul>
            <li><a>Sign in / Register</a></li>
            <li><a>News</a></li>
            <li><a>About Us</a></li>
            <li><a>Forum</a></li>
            <li><a>Cam</a></li>
            <li><a>Contact</a></li>
        </ul>
    </div>
    <div class="logoRow"></div>
    <div class="logoRow logoImgRow">
        <img src="<c:url value="public/img/logo.png"/>" width="94px" height="135px">

        <p class="fontStyle"><span>Jeff's House Kindergarten<span></p>

        <p class="fontStyle"><span>杰夫幼儿园<span></p>
    </div>
    <div id="carouselDiv" class="carousel slide" data-ride="carousel">
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
    <div class="introBackgroundRow"></div>
    <div class="introBackgroundRow introRow fontStyle">
        <h3>WELCOME TO JEFF'S HOUSE</h3>

        <p>CHILDREN ARE WHAT WE CARE ABOUT
            BLABLABLA BALBALBALBALBALBALBLALBALBLABLALBALBLALBALBL
            BALBLALBALBALBLALBALBLALBALBALBLALBALBAL
            ABLALBALBALBLALBALBLALB</p>
    </div>

    <div id="familyDiv">
        <div id="familyHeader" class="fontStyle">
            <p>Some of Jeff's Family</p>
        </div>
        <div class="row" style="height: 300px;">
            <div class="col-md-7">
                <img src="<c:url value="public/img/picFamily1.png"/> ">
            </div>
            <div class="col-md-5">
                <div class="description fontStyle">
                    <p>CHILDREN ARE WHAT WE CARE ABOUT BLABLALBALBA</p>
                    <br>

                    <p>BLABLALBALBABLABLALBALBVLALBALBLABLALBALBALBLABLAL</p>
                </div>
            </div>
        </div>
        <div class="row" style="height: 400px;">
            <div class="col-md-4">
                <img src="<c:url value="public/img/picFamily2.png"/> ">
            </div>
            <div class="col-md-4">
                <div class="description fontStyle">
                    <p>CHILDREN ARE WHAT WE CARE ABOUT BLABLALBALBA</p>
                    <br>

                    <p>BLABLALBALBABLABLALBALBVLALBALBLABLALBALBALBLABLAL</p>
                </div>
            </div>
            <div class="col-md-4">
                <img src="<c:url value="public/img/picFamily3.png"/> ">
            </div>
        </div>
        <div class="row" style="height: 400px;">
            <div class="col-md-5">
                <img src="<c:url value="public/img/picFamily4.png"/> ">
            </div>
            <div class="col-md-7">
                <img src="<c:url value="public/img/picFamily5.png"/> ">
            </div>
        </div>
        <div class="row" style="height: 400px;">
            <div class="col-md-8">
                <img src="<c:url value="public/img/picFamily6.png"/> ">
            </div>
            <div class="col-md-4">
                <div class="description fontStyle">
                    <p>CHILDREN ARE WHAT WE CARE ABOUT BLABLALBALBA</p>
                    <br>

                    <p>BLABLALBALBABLABLALBALBVLALBALBLABLALBALBALBLABLAL</p>
                </div>
            </div>
        </div>
    </div>
</div>
<div id="contactDiv" class="row">
    <div id="contactMsg" class="col-md-5">
        <p><span>Get in Touch</span></p>

        <p><span>Tel:&nbsp;+86&nbsp;22&nbsp;23310236</span></p>

        <p><span>Fax:&nbsp;+86&nbsp;22&nbsp;23310636</span></p>

        <p><span>Email:&nbsp;jeff@jeffhouse.net</span></p>
    </div>
    <div class="col-md-7">
        <div id="mapContainer"></div>
    </div>
</div>
<div id="contactFooter">
    <img src="<c:url value="public/img/footer.png"/> ">
</div>
<script type="text/javascript">
    $(function () {
        $('.carousel').carousel();
    });
</script>
<script src="http://api.map.baidu.com/api?v=2.0&ak=8ISSk3V3dafhgbYCLrFh9SWG"></script>
</body>
</html>
