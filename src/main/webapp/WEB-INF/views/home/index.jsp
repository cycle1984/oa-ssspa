<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/views/common/common.jspf"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>index</title>
</head>
<body style="margin: 0 auto;">
	<div id="home_index" class="easyui-layout" style="width:90%;height:100%;margin:0 auto;">   
	    <div data-options="region:'north',split:true" style="height:98px;">
	    	<jsp:include page="north.jsp"></jsp:include>
	    </div>   
	    <div data-options="region:'south',split:true," style="height:50;"><jsp:include page="south.jsp"></jsp:include></div> 
	    <div id="home_index_west_div" data-options="region:'west',split:true" style="width:150px;padding: 1px"></div>   
	    <div id="home_index_main_div" data-options="region:'center'" style="background:#eee;padding: 1px"></div>   
	</div>
</body>
</html>