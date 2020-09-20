<%@ include file="main_header.jsp" %>
	<div id="center">
		<center>
		<fieldset style="font-size: 30px"><legend style="font-size: 30px">User SignUp Form</legend>
		<form action="usersignup" method="post" style="font-size: 30px">
				<table>
					<tr>
						<td>Enter Full Name</td>
						<td><input type="text" placeholder="Enter Name" name="id" style="padding:5px  30px;font-size: 15px"></td>
					</tr>
					<tr>
						<td>Select Gender</td>
						<td><input type="radio"  value="Male" name="pasword" style="padding:5px  30px;font-size: 15px">Mail</td>
						<td><input type="radio"  value="Femail" name="pasword" style="padding:5px  30px;font-size: 15px">Femail</td>
					</tr>
					<tr>
						<td>Enter Mobile No</td>
						<td><input type="text" placeholder="Enter Mobile No" name="id" style="padding:5px  30px;font-size: 15px"></td>
					</tr>
					<tr>
						<td>Enter Email</td>
						<td><input type="text" placeholder="Enter Email" name="id" style="padding:5px  30px;font-size: 15px"></td>
					</tr>
					<tr>
						<td>Enter Password</td>
						<td><input type="text" placeholder="Enter Password" name="id" style="padding:5px  30px;font-size: 15px"></td>
					</tr>
					<tr>
						<td>Enter Password Again</td>
						<td><input type="text" placeholder="Re-Enter Password" name="id" style="padding:5px  30px;font-size: 15px"></td>
					</tr>
					<tr>
						<td colspan="2" align="center">
						<td><input type="submit" value="SubMit" style="padding:5px  30px;font-size: 15px"></td>
					</tr>
				</table>
			</form>
			</fieldset>
		</center>
	</div>
<%@ include file="main_footer.jsp"%>