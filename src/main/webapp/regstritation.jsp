
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib uri="/struts-tags" prefix="s"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>User Registration</title>
</head>
<body>

	<div align="center">
		<s:form action="registration" >
			<table align="center" style="color: blue">
				<tr>
					<td colspan="2" align="center" style="color: green"><b>User
							Registration</b></td>
				</tr>
				<tr>

					<td><s:textfield name="Name" label="Name"  required="required" ></s:textfield></td>
				</tr>
				<tr>
					<td>Date of Birth :</td>
					<td><input type="date" name="doB"></td>
				</tr>
				<tr>
					<td><s:textfield name="userName" label="UserName" required="required" ></s:textfield></td>
				</tr>
				<tr>

					<td><s:password name="password" label="Password" required="required" ></s:password>
					</td>
				</tr>
				<tr>
					<td><s:textfield name="Phone" label="PhoneNumber" required="required" ></s:textfield></td>
				</tr>
				<tr>

					<td><s:textfield name="Email" label="Email" required="required" ></s:textfield></td>
				</tr>
				<tr>
					<td align="center"><s:submit value="register"></s:submit></td>
					<td align="center"><input type="reset" name="Reset Form"></td>
				</tr>
			</table>
		</s:form>
	</div>
</body>
</html>




