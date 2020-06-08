<html>
<head><title>Welcome to Intra Organization Communication System</title>
<script>
function check()
{
	 
	var u=window.document.signmeup.uname.value;
   	var p=window.document.signmeup.pwd.value;
   	var newp=window.document.signmeup.pwd1.value;
    	var a=window.document.signmeup.age.value;
    	var pi=window.document.signmeup.pin.value;
		var c=window.document.signmeup.city.value;
   	if(u=="")
   	{
   		alert("Please enter the username");
   		window.document.signmeup.uname.focus();
   		return false;
   	}
   	else if(!isNaN(u))
   	{
   		alert("Please enter the name in characters");
   		document.signmeup.uname.focus();
   		return false;
   	}
  	else  if(p=="")
   	{
   		alert("Please enter the password");
   		window.document.signmeup.pwd.focus();
   		return false;
   	}
    else  if(!isNaN(p))
    {
			alert("Please enter the password in characters");
			document.signmeup.pwd.focus();
			return false;
    }
    else if (p.length<4)
    {
		alert("Please enter the password in minlength 4 characters");
		document.signmeup.pwd.focus();
		return false;
}
    

   	else if(a=="")
   	{
   		alert("Please enter the age column");
   		window.document.signmeup.age.focus();
   		return false;
   	}
    	else if(isNaN(a))
    	{
    		alert("Please enter the age in numbers");
    		document.signmeup.age.focus();
    		return false;
    	}
    else if (isNaN(a) || a< 18 || a>100)
    { 
    	alert("The age must be a number between 18 and 100");
    	return false;
    }
	if(c=="")
   	{
   		alert("Please enter the city");
   		window.document.signmeup.uname.focus();
   		return false;
   	}
   	else if(!isNaN(c))
   	{
   		alert("Please enter the city in characters");
   		document.signmeup.uname.focus();
   		return false;
   	}
	
  	else if(pi=="")
   	{
   		alert("Please enter the pincode ");
   		window.document.signmeup.pin.focus();
   		return false;
   	}
    	else  if(isNaN(pi))
    	{
    		alert("Please enter the pincode in numbers");
    		document.signmeup.pin.focus();
    		return false;
    	}
    	else if(p!=newp)
   	{
		alert("Password Doesn't match");
		document.signmeup.pwd.value="";
		document.signmeup.pwd1.value="";
    		document.signmeup.pwd.focus();
    		return false;
	}		
	 

}
</script>
<meta name="Microsoft Theme" content="copy-of-industrial 011">
</head>
<body leftmargin=0 Topmargin=0 bgcolor=#FFFFFF text=#BC5461 background="login_Back.png" link="#BC54FF" vlink="#FF54FF" alink="#FF5400"> <font size=+2 >
<body leftmargin=0 Topmargin=0 bgcolor="#a9a9a9" text=#BC5461 link="#BC54FF" vlink="#FF54FF" alink="#FF5400"> <font size=+2 >
<blink>
<center>
</center>
</blink>
<center><img border="0" src="aaa.png" width="950" height="70">

<table  width="70%" height="100%" align="center">
<tr>
	<td  width="43%" align="justify">
	
	<%--<img alt="Register  yourself" src="Images/reg.gif" width="295" height="150">   Gif --%>
	
	</td>
	<td>
	<form method=post name=signmeup action="Serv_SignMeUp" onsubmit="return check()">
	<!--Strat Table tag-->
<table cellpadding=10 bgcolor="peachpuff" width="400" height="600" align="right">
<tr>
	<td> 
		<font face="Verdana" color="#000080"><b>User Name</b></font>
	</td>
	<td>
		<font face="Verdana" color="#000080"><b><input type =text name =uname value="" ></b></font>
	</td>
</tr>

<tr>
	<td>
		<font face="Verdana" color="#000080"><b>Password&nbsp;</b></font>
	</td>
	<td>
		<font face="Verdana" color="#000080"><b><input type =password name =pwd   ></b></font>
	</td>
</tr>

<tr>
	<td>
		<font face="Verdana" color="#000080"><b>Retype Password</b></font>
	</td>
	<td>
		<font face="Verdana" color="#000080"><b><input type =password name =pwd1 value="" ></b></font>
	</td>
</tr>

<tr>
	<td>
		<font face="Verdana" color="#000080"><b>Age</b></font>
	</td>
	<td>
		<font face="Verdana" color="#000080"><b><input type =text name=age></b></font>
	</td>
</tr>

<tr>
	<td> 
		<font face="Verdana" color="#000080"><b> Sex</b></font>
	</td>
	<td>
		<font face="Verdana" color="#000080"><b><input type =radio name =r1 value=Male checked >Male
         <input type =radio name =r1 value=Female>Female</b></font>
	</td>
</tr>

<tr>
	          <td> 
	          <font face="Verdana" color="#000080"><b>City</b></font>
	          </td>
	              <td>
				      <font face="Verdana" color="#000080"><b><input type =text name=city></b></font> 
				      </td>
				      </tr>
	
<tr>
	<td>          
				<font face="Verdana" color="#000080"><b>          State&nbsp;</b></font>
	</td>
		<td>
				<select name=state>
            <option value="ND"> new Delhi</option>
            <option value="BR"selected> Bihar</option>
            <option value="JH"> Jharkhand</option>
            <option value="AP"> Andhra Pradesh</option>
            <option value="SK" > sikkim</option>
            <option value="PB"> Punjab</option>
            <option value="HR"> Hariyana</option>
            <option value="HP"> Himanchal Pradesh</option>
            <option value="GJ"> Gujrat</option>
            <option value="MP"> Madhya Pradesh</option>
            <option value="JK"> jammu kashmir</option>
            <option value="MH"> Maharashtra</option>
            <option value="RJ"> Rajasthan</option>
            <option value="KA"> Karnatka</option>
            <option value="KR"> Kerala</option>
            <option value="UP"> Uttar Pradesh</option>
        </select> 
		</td>
</tr>

<tr>
	<td>          
		<font face="Verdana" color="#000080"><b>Pin Code&nbsp;</b></font>
	</td>
	<td>
		<input type =text name =pin maxlength=6 value=""  >
	</td>
</tr>
<tr>
	<td>          
		<font face="Verdana" color="#000080"><b>          Nation&nbsp;</b></font>
	</td>
		<td>
			<select name=nation>
                      <option selected> India</option>
                      </select>
		</td>
</tr>
                      
              <tr>
                 	<td colspan="2" align="center">
                 		<font size="2" color="#000080">
<input type =submit name =regis value="Register"  style="color: #000080; font-family: Verdana; font-weight: bold">&nbsp;&nbsp;
&nbsp;&nbsp;&nbsp;&nbsp;
</font>
<font size=+2 >&nbsp;&nbsp; <input type =Reset name =reset value="Reset" style="color: #000080; font-family: Verdana; font-weight: bold"></font>
                 	</td>
			</tr>
</table> 
<!--Closing Table tag-->
</form>

	</td>
</tr>
<table>
</body>
</html>