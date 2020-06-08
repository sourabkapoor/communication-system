<%--LOGIN PAGE --%>

<script language=JavaScript>
function check()
{
	if(document.form1.uname1.value=="")
		alert("Enter Valid UserName");	
	
	else
	if(document.form1.pwd1.value=="")
		alert("Enter Valid Password");
	else
	{
		form1.method="post";
		form1.action="Serv_SignUp";
	}
}
</script>
<html>
<head><title>Intranet Mailing System</title>
<meta name="Microsoft Theme" content="copy-of-industrial 011">
</head>
<body leftmargin=0 Topmargin=0 background="login_Back.png" bgcolor="#FFFFFF" text="#BC5461" link="#BC54FF" vlink="#FF54FF" alink="#FF5400">
<center>
<form name=form1>
<table cellpadding="0" cellspacing="0">
	<center><img border="0" src="aaa.png" width="950" height="70">
		<td colspan="2">
		</td>
	</tr>
	<%--  ajeeb se animation 1
	<tr>
 		<td align="center">
 			<marquee direction="right" behavior="scroll" ><font color="peachpuff" size="8"> INTRANET MAIL SYSTEM</font></marquee>
 			<img border="0" src="Images/emp.gif" width="360" height="200" align="top"/>
 		</td>
 		
 		<td align="center">
 		<marquee direction="left" behavior="scroll"><font color="peachpuff" size="8"> INTRANET MAIL SYSTEM</font></marquee>
 		<img border="0" src="Images/ims.gif" width="360" height="200" align="top"/>
 			
 		</td>
 	
 	</tr>  
 	--%>
 	
 	<br>
 	<br>
 	<br>
 	<br>
 	<br>
 	<br>

	<tr >
		<td colspan="2" align="center">
		<table width="400" align="center" bgcolor="bisque" height="200">
			
			<tr>
				<td width="82"><font size="2" color="#000080"><b><font face="Verdana">User Name</font></b>&nbsp;</font></td>
				<td width="150"><input type=text name=uname1></td>
			</tr>
			<tr>
				<td width="82"><b><font face="Verdana" size="2" color="#000080">Password</font></b></td>
				<td width="150"><input type=password name=pwd1> </td>
			</tr>
			
			<tr>
				<td colspan="2" align="center"><input type=image src="Images/Login1.jpg" height=25 width=91  value="Login" onclick=check()></td>
			</tr>
			<tr>
				<td colspan="2" align="center"><h2><b><sup><sup><sup><%--<font color=red><img src="Images/NEW.GIF"> </font>--%></sup></sup></sup><font color="#000080" size="5"><sup><sup><sup><font face="Verdana">New User</font>?&nbsp;</sup></sup></sup></font><sup><sup><sup><font color="#000080" size="6">&nbsp;</font></sup></sup></sup><font color="#000080"><sup><sup><sup>
</sup></sup></sup></font></b><font color=red><a href="signmeup.jsp"><img src="sign_up_button.jpg" height=54 width=69 border=0></a></form></font></center></td>
			</tr>
		</table>
		
		</td>

	</tr>
	<tr>
		<td>
		</td>
	</tr>

</table>

</body></html>
