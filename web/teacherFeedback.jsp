<%--
  Created by IntelliJ IDEA.
  User: zhengjiabin
  Date: 4/1/16
  Time: 2:15 PM
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
<body class="jeff-bg-wheat-opacity">
<div class="container">
    <div class="col-md-offset-1 col-md-10">
        <div class="row">
            <h3 class="jeff-color-brown">Xinghang Jiang</h3>
            <span>16 January</span>
        </div>
        <div class="row">
            <div class="col-md-6">
                <form class="form-horizontal">
                    <div class="form-group">
                        <label class="col-md-3 control-label">Temp</label>
                        <div class="col-md-9">
                            <input type="text"  class="form-control">
                        </div>
                    </div>
                    <div class="form-group">
                        <label class="col-md-3 control-label">Other Drink</label>
                        <div class="col-md-9">
                            <input type="text" class="form-control">
                        </div>
                    </div>
                    <div class="form-group">
                        <label class="col-md-3 control-label">Drink</label>
                        <div class="col-md-9">
                            <select class="form-control">
                                <option>Frequently</option>
                                <option>Fair</option>
                                <option>Little</option>
                            </select>
                        </div>
                    </div>
                    <div class="form-group">
                        <label class="col-md-3 control-label">Appetites</label>
                        <div class="col-md-9">
                            <select class="form-control">
                                <option>Frequently</option>
                                <option>Fair</option>
                                <option>Little</option>
                            </select>
                        </div>
                    </div>
                    <div class="form-group">
                        <label class="col-md-3 control-label">Nap</label>
                        <div class="col-md-9">
                            <select class="form-control">
                                <option>Frequently</option>
                                <option>Fair</option>
                                <option>Little</option>
                            </select>
                        </div>
                    </div>
                    <div class="form-group">
                        <label class="col-md-3 control-label">Feces</label>
                        <div class="col-md-9">
                            <div class="row">
                                <div class="col-md-10">
                                    <input type="text" class="form-control">
                                </div>
                                <label class="col-md-2 control-label">times</label>
                            </div>
                            <div class="row jeff-margin-top-offset" style="padding: 0 15px">
                                <select class="form-control">
                                    <option>Frequently</option>
                                    <option>Fair</option>
                                    <option>Little</option>
                                </select>
                            </div>
                        </div>
                    </div>
                    <div class="form-group">
                        <label class="col-md-3 control-label">Urine</label>
                        <div class="col-md-9">
                            <select class="form-control">
                                <option>Frequently</option>
                                <option>Fair</option>
                                <option>Little</option>
                            </select>
                        </div>
                    </div>
                </form>
            </div>
            <div class="col-md-6">
                <form class="form-horizontal">
                    <div class="form-group">
                        <label class="col-md-3 control-label">Emotion</label>
                        <div class="col-md-9">
                            <select class="form-control">
                                <option>Frequently</option>
                                <option>Fair</option>
                                <option>Little</option>
                            </select>
                        </div>
                    </div>
                    <div class="form-group">
                        <label class="col-md-3 control-label">Participation</label>
                        <div class="col-md-9">
                            <select class="form-control">
                                <option>Frequently</option>
                                <option>Fair</option>
                                <option>Little</option>
                            </select>
                        </div>
                    </div>
                    <div class="form-group">
                        <label class="col-md-3 control-label">Social Situation</label>
                        <div class="col-md-9">
                            <select class="form-control">
                                <option>Frequently</option>
                                <option>Fair</option>
                                <option>Little</option>
                            </select>
                        </div>
                    </div>
                    <div class="form-group">
                        <label class="col-md-3 control-label">Corporation</label>
                        <div class="col-md-9">
                            <select class="form-control">
                                <option>Frequently</option>
                                <option>Fair</option>
                                <option>Little</option>
                            </select>
                        </div>
                    </div>
                </form>
            </div>
        </div>
        <div class="row">
            <div class="col-md-12">
                <label class="control-label">New Knowledge</label>
                <textarea class="form-control" style="height: 100px"></textarea>
            </div>
        </div>
        <div class="row">
            <div class="col-md-12">
                <label class="control-label">Teacher's Observation</label>
                <textarea class="form-control" style="height: 100px"></textarea>
            </div>
        </div>
        <div class="row" style="margin: 30px 0">
            <div class="col-md-offset-9 col-md-3">
                <button class="btn btn-default">Save</button>
                <button class="btn btn-default">Discard</button>
            </div>
        </div>
    </div>
</div>
</body>
</html>
