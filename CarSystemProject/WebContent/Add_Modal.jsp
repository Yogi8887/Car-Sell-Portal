<%@ include file="admin_header.jsp" %>
<div id="center">
			<center>
		<fieldset weidth="75%" height="100%"><legend style="font-size: 30px">Add Modal Form</legend>
		<center>
			<font color="black"  size="10" style="text-align:left:weidth:75%" >Add Modal Here</font>
		</center>
		<form action="Add_Modal" mathod="post" style="font-size: 25px">
			<table>
			<tr>
				<td>Brand</td>
				<td><input type="text" maxlength="11" size="40" name="brand" placeholder="Enter Brand Name" style="padding:5px  30px;"></td>
			</tr>
			<tr>
				<td>Modal </td>
				<td><input type="text" maxlength="11" size="40" name="modal" placeholder="Enter Modal Name" style="padding:5px  30px;"></td>
			</tr>
			<tr>
				<td>Price</td>
				<td><input type="text" maxlength="11" size="40" name="price" placeholder="Enter Price" style="padding:5px  30px;"></td>
			</tr>
			<tr>
				<td>Milage </td>
				<td><input type="text" maxlength="11" size="40" name="milage" placeholder="Enter Milage" style="padding:5px  30px;"></td>
			</tr>
			<tr>
				<td>Sitting Capacity</td>
				<td><input type="text" maxlength="11" size="40" name="sitNo" placeholder="Enter Sitting Capacity" style="padding:5px  30px;"></td>
			</tr>
			<tr>
				<td>Image </td>
				<td><input type='file' value="Load" name="image" style="padding:5px  30px;font-size: 15px"></td>
			</tr>
			<tr>
				<td><input type='reset' value="clear all" style="padding:5px  30px;font-size: 15px"></td>
				<td><input type='submit'  value="Add" style="padding:5px  30px;font-size: 15px"></td>
			</tr>
		</table>
 
 </form>
</fieldset>
	</center>

				
</div>
<%@ include file="admin_footer.jsp"%>
