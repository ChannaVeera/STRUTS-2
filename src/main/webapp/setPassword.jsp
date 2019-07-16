
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib uri="/struts-tags" prefix="s"%>
<html>
<head>
<title>Insert title here</title>
</head>
<body>
	<s:form method="post" action="setpassword">

		<s:textfield name="userId" label="codeOTP" required="required"></s:textfield>
		<s:password name="password" label="password" required="required"></s:password>
		<s:password name="cpassword" label="ConfirmPassword" required="required"></s:password>
		<s:submit value="set"></s:submit>
	</s:form>

</body>
</html>