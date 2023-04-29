<html>
<body bgcolor="tomato">
	<form action="registerForm">
		<table border="4">
			<tr>
				<td colspan="2" align="center">STUDENT FORM</td>
			</tr>
			<tr>
				<td>NAME :</td>
				<td><input type="text" name="sName"></td>
			</tr>
			<tr>
				<td>AGE :</td>
				<td><input type="text" name="sAge"></td>
			</tr>
			<tr>
				<td>BRANCH :</td>
				<td><input type="radio" name="sBranch" value="CSE"> CSE
					<input type="radio" name="sBranch" value="IT"> IT 
					<input type="radio" name="sBranch" value="ECE"> ECE
				</td>
			</tr>
			<tr>
				<td>PHONE :</td>
				<td><input type="text" name="sPhone"></td>
			</tr>
			
			<tr>
				<td>ADDRESS :</td>
				<td><textarea rows="6" cols="30" name="sAddress">
				
				</textarea></td>
			</tr>
			<tr>
				<td>PARENT PHONE :</td>
				<td><input type="text" name="sParentPhone"></td>
			</tr>
			<tr>
				<td colspan="2" align="center"><input type="submit" name="sSubmit" value="Register"></td>
			</tr>
				
		</table>

	</form>

</body>
</html>
