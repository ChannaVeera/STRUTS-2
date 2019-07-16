
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib uri="/struts-tags" prefix="s"%>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<s:form method="post" action="login">
		<table align="center" style="color: red">
			<tr>
				<td colspan="2" align="center" style="color: black"><h2>Login</h2></td>
			</tr>
			<tr>

				<td><s:textfield name="Email" label="Email" required="required"></s:textfield></td>
			</tr>
			<tr>

				<td><s:password name="password" label="Password"
						required="required"></s:password></td>
			</tr>
			<tr>
				<td></td>
				<td><s:submit value="login"></s:submit></td>
			</tr>


		</table>
</</s:form>
	<p align="center">
		<a href="ForgetPassword.jsp"><input type="submit"
			value="ForgotPassword"></a>
	</p>
</body>
</html>