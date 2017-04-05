<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/views/common/common.jspf"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>login</title>
</head>
<body style="margin: 0 auto;">

	<div id="win" class="easyui-window" title="系统登陆"  style="width:340px;height:200px;text-align:center;"  data-options="border:false,modal:true,collapsible:false,minimizable:false,maximizable:false,closable:false,draggable:false,resizable:false">   
    	<form id="user_loginUI_form" method="post" action="" class="easyui-form" data-options="novalidate:true">
    		<table cellpadding="10">
    			<tr>
    				<td>
    					<input id="user_loginUI_loginName" name=loginName class="easyui-textbox" data-options="iconCls:'icon-man',height:30,prompt:'登录名',required:true,missingMessage:'请输入登录名',iconAlign:'left'" style="width:300px;"> 
    				</td>
    			</tr>
    			<tr>
    				<td>
    					<input id="user_loginUI_pwd" name="password" class="easyui-textbox" data-options="iconCls:'icon-lock',height:30,type:'password',prompt:'密码',required:true,missingMessage:'请输入密码',iconAlign:'left'" style="width:300px" > 
    				</td>
    			</tr>
    		</table>
    	</form>
    	<div style="text-align:center;padding:5px">
	    	<a href="javascript:void(0)" id="loginBtn" class="easyui-linkbutton" data-options="iconCls:'icon-ok'" onclick="submitForm()">登录</a>
	    	<a href="javascript:void(0)" id="regBtn" class="easyui-linkbutton" data-options="iconCls:'icon-add'" onclick="regForm()">注册</a>
	    </div>
	</div>
	
	<script type="text/javascript">
		var submitForm = function(){
			$('#user_loginUI_form').form('enableValidation');
			if ($('#user_loginUI_form').form('validate')) {
				$('#loginBtn').linkbutton('disable');
				$('#regBtn').linkbutton('disable');
				$.post('${pageContext.request.contextPath}/user/login',$('#user_loginUI_form').serialize(),function(r) {
					if (r.success) {
						$.messager.show({
							title : '提示',
							msg : r.msg
						});
						location.replace('${pageContext.request.contextPath}/home/index');
	
					} else {
						$.messager.alert(
							'错误提示',
							r.msg,
							'error',
							function(){
								$('#user_loginUI_pwd').textbox('clear').textbox('textbox').focus();//密码框获得焦点
								$('#loginBtn').linkbutton('enable');
								$('#regBtn').linkbutton('enable');
							}
						);
						
					}
				}, 'json');
			}
		}
	
	</script>
</body>
</html>