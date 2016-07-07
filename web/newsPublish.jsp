<%--
  Created by IntelliJ IDEA.
  User: zhengjiabin
  Date: 4/1/16
  Time: 1:42 PM
  To change this template use File | Settings | File Templates.
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no">
    <meta http-equiv="content-type" content="text/html;charset=UTF-8">
    <title>JeffKindergarten</title>

    <script src="<c:url value="/public/lib/jquery/dist/jquery.js"/>"></script>
    <script src="<c:url value="/public/lib/jquery_form/jquery.form.min.js"/> "></script>
    <link rel="stylesheet" type="text/css" href="<c:url value="/public/lib/bootstrap/dist/css/bootstrap-theme.min.css"/>">
    <link rel="stylesheet" type="text/css" href="<c:url value="/public/lib/bootstrap/dist/css/bootstrap.min.css"/>">
    <script src="<c:url value="/public/lib/bootstrap/dist/js/bootstrap.min.js"/>"></script>
    <link rel="stylesheet" type="text/css" href="<c:url value="/public/css/component.css"/>">
    <link rel="stylesheet" type="text/css" href="<c:url value="/public/css/admin.css"/>">
    <script src="<c:url value="/public/js/util.js"/> "></script>
</head>
<body>
<div class="container">
    <div class="row">
        <div class="col-md-offset-2 col-md-8">
            <div class="row jeff-nav jeff-bg-wheat-opacity" style="position: relative">
                <img src="<c:url value="/public/img/logo.png"/>" class="jeff_nav_logo">
                <ul>
                    <li><a>管理招聘</a></li>
                    <li><a>新闻管理</a></li>
                    <li><a>菜单管理</a></li>
                </ul>
            </div>
            <div class="row" style="margin-top: 40px">
                <form id="newsForm" class="form-horizontal" enctype="multipart/form-data">
                    <div class="form-group">
                        <label class="col-md-2 control-label">新闻标题</label>
                        <div class="col-md-6">
                            <input type="text" class="form-control" name="name" id="name" value="">
                        </div>
                    </div>
                    <div class="form-group">
                        <label class="col-md-2 control-label">新闻内容</label>
                        <div class="col-md-6">
                            <textarea class="form-control" style="height: 100px" name="intro" id="intro" value=""></textarea>
                        </div>
                    </div>
                    <div class="form-group">
                        <label class="col-md-2 control-label">配图</label>
                        <div class="col-md-10">
                            <input type="file" name="files" id="file1">
                        </div>
                        <div class="col-md-10 col-md-offset-2">
                            <input type="file" name="files" id="file2">
                        </div>
                        <div class="col-md-10 col-md-offset-2">
                            <input type="file" name="files" id="file3">
                        </div>
                    </div>
                </form>
                <div class="form-group">
                    <div class="col-md-offset-6 col-md-2">
                        <button id="btnPublish" type="button" class="btn btn-primary" style="width: 100%" value="upload">发布</button>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>
<script type="text/javascript">

    $(document).ready(function() {

        $('#btnPublish').click(function() {

            // make sure that the length of images uploaded must be three
            var elements = $("input[type='file']");
            for (var index = 0; index <  elements.length; index ++) {
                if ($(elements[index]).val() == '') {
                        alert('Upload All Images');
                        return;
                }
            }


            var sitePoint = getSitePoint();

            $('#newsForm').ajaxSubmit({
                url: sitePoint + '/api/news/addNews?token=testToken',
                type: 'post',
                success: function(s) {
                    if (s.callStatus == 'SUCCEED') {
                        window.location.href = sitePoint + '/home';
                        alert('Success');
                    }
                    else alert('Server Error');
                },
                error: function(e) {
                    alert('Publish Error')
                }
            });
        });

    });

</script>

</body>
</html>