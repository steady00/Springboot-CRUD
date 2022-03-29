<!doctype html>
<html lang="en">
<head>
	<meta charset="UTF-8" />
	<title>Login</title>
</head>
<body>
	<h1>Welcome Home</h1>
		<form action="/login" method="post">
			<p>
				<label for="username">Username: </label>
				<input id="username" name="username"/>
			</p>
			<p>
				<label for="password">Password: </label>
				<input id="password" name="password"/>
			</p>
			<p>
				<button type="submit" class="btn btn-success">LOGIN</button>
			</p>
			${SPRING_SECURITY_LAST_EXCEPTION.message}
		</form>
</body>
</html>