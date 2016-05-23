<%--
  Created by IntelliJ IDEA.
  User: zhengjiabin
  Date: 4/1/16
  Time: 2:00 PM
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
    <link rel="stylesheet" type="text/css" href="<c:url value="public/css/admin.css"/>">
</head>
<body>
<div class="container">
    <div class="row">
        <div class="col-md-offset-2 col-md-8">
            <div class="row jeff-nav jeff-bg-wheat-opacity" style="position: relative">
                <img src="<c:url value="public/img/logo.png"/>" class="jeff_nav_logo">
                <ul>
                    <li><a>管理招聘</a></li>
                    <li><a>新闻管理</a></li>
                    <li><a>菜单管理</a></li>
                </ul>
            </div>
            <div class="row" style="margin-top: 40px">
                <form class="form-horizontal">
                    <div class="form-group">
                        <label class="col-md-2 control-label">招聘岗位</label>
                        <div class="col-md-6">
                            <input type="text" class="form-control">
                        </div>
                    </div>
                    <div class="form-group">
                        <label class="col-md-2 control-label">工作地点</label>
                        <div class="col-md-6">
                            <input type="text" class="form-control">
                        </div>
                    </div>
                    <div class="form-group">
                        <label class="col-md-2 control-label">职位介绍</label>
                        <div class="col-md-6">
                            <textarea class="form-control" style="height: 100px"></textarea>
                        </div>
                    </div>
                    <div class="form-group">
                        <label class="col-md-2 control-label">其它</label>
                        <div class="col-md-6">
                            <textarea class="form-control" style="height: 100px"></textarea>
                        </div>
                    </div>
                    <div class="form-group">
                        <div class="col-md-offset-6 col-md-2">
                            <button type="submit" class="btn btn-primary" style="width: 100%">发布</button>
                        </div>
                    </div>
                </form>
            </div>
        </div>
    </div>
</div>
</body>
</html>
