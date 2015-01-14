function loginvalidate(form){
	var userName=form.userName;
	var vil=true;
	if(userName.value.length==0)
	{
		document.getElementById("validateuser").innerHTML="<b>用户名不能为空</b>";
		userName.focus();
		vil=false;
	}
	else if(userName.value.length>8){
		document.getElementById("validateuser").innerHTML="<b>用户名的长度不能超过8位</b>";
		userName.focus();
		vil=false;
	}else
	{
		//在用户再次提交表单时，如果合法，取消前一次的验证不合法消息
		document.getElementById("validateuser").innerHTML="";
	}
	//验证密码输入是否合法
	var password=form.password;
	if(password.value.length==0)
	{
		document.getElementById("validatepassword").innerHTML="<b>密码不能为空</b>";
		password.focus();
		vil=false;
	}
	else if(password.value.length<6||password.value.length>8)
	{
		document.getElementById("validatepassword").innerHTML="<b>密码的长度应该介于6到8位之间</b>";
		password.focus();
		vil=false;
	}else
	{
		document.getElementById("validatepassword").innerHTML="";
	}
	return vil;
}