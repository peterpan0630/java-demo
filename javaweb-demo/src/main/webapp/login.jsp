<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>login</title>
<script src="http://passport.oa.com/Scripts/jquery-1.9.0.min.js"></script>
</head>
<body>

	<div>
		帐号：<input type="text" id="name">
		密码：<input type="password" id="pwd">
		<button id="login">登录</button>
	</div>
	
	<script type="text/javascript">
		$('#login').click(function(){
			//TODO
			
			$.post('/login', {
				name: $('#name').val(),
				pwd: $('#pwd').val()			
			}, function(res){
				console.log(res);
				if(res.code == 0){
					location.href="index.jsp";					
				}else{
					alert(res.msg);
				}
			}, 'json')
			
		})
	</script>

</body>
</html>