//关于数字和字母的验证并未完成
function validate(form){
   
    //验证用户名是否合法
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
	//验证确认密码的输入是否合法
	var password1=form.password1;
	if(password1.value.length==0)
	{
		document.getElementById("validatepassword1").innerHTML="<b>确认密码不能为空</b>";
		password1.focus();
		vil=false;
	}
	else if(password1.value!=password.value)
	{
		document.getElementById("validatepassword1").innerHTML="<b>确认密码和密码不一致,请确认</b>";
		password1.focus();
		vil=false;
	}else
	{
		document.getElementById("validatepassword1").innerHTML="";
	}
	//验证Email的输入是否合法
	var email=form.email;
	if(email.value.length!=0)
	{
		var emailvalue=email.value;
		//验证邮件地址中有且仅有一个.和一个@
		if(emailvalue.indexOf(".")==-1||emailvalue.indexOf(".")!=emailvalue.lastIndexOf(".")||emailvalue.indexOf("@")==-1||emailvalue.indexOf("@")!=emailvalue.lastIndexOf("@"))
		{
			document.getElementById("validateemail").innerHTML="<b>邮件地址不合法</b>";
			email.focus();
			vil=false;
		}
		//验证.和@的位置,@不能出现在第一个,.不能出现在最后一个,并且@必须出现在.前面,中间必须至少有一个字符
		else if(emailvalue.indexOf("@")==0||emailvalue.indexOf(".")==emailvalue.length-1||emailvalue.indexOf(".")-emailvalue.indexOf("@")<2)
		{
			document.getElementById("validateemail").innerHTML="<b>邮件地址不合法</b>";
			email.focus();
			vil=false;
		}else{
			document.getElementById("validateemail").innerHTML="";
		}
	}
	return vil;
}