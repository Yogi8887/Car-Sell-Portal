<%@ include file="main_header.jsp" %>
	<div id="center">
		<center>
		<fieldset><legend style="font-size: 30px">Login Form</legend>
		<form action="adminlogin" method="post" style="font-size: 30px">
				<table>
					<tr>
						<td>Enter Login ID</td>
						<td><input type="text" placeholder="Enter Login ID" name="id" style="padding:5px  30px;font-size: 15px"></td>
					</tr>
					<tr>
						<td>Enter Login Password</td>
						<td><input type="password"  placeholder="Enter password" name="pasword" style="padding:5px  30px;font-size: 15px"></td>
					</tr>
					<tr>
						<td colspan="2" align="center">
						<td><input type="submit" value="Login" style="padding:5px  30px;font-size: 15px"></td>
					</tr>
				</table>
			</form>
			</fieldset>
		</center>
	</div>
<%@ include file="main_footer.jsp"%>