
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib uri="/struts-tags" prefix="s"%>
<html>
<head>
<title>Insert title here</title>
</head>
<body>
	<s:form method="post" action="forgot">
		<table align="center" style="color: red">
			<tr>
				<td colspan="2" align="center" style="color: black"><h1>FogotPassword</h1></td>
			</tr>
			<tr>

				<td><s:textfield name="Email" label="Email" required="required"></s:textfield></td>
			</tr>

			<tr>
				<td></td>
				<td><s:submit value="forgot"></s:submit></td>
			</tr>


		</table>
</</s:form>


</body>
</html>