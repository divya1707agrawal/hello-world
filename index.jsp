<html>
<body>
<h2><center>shoppingcart</center></h2>
existing user<a href="login">login here</a>
new user<a href="register">register here</a><hr>
${successMessage}
${registrationMessage}
<!-- if the error msg is there,I have to open login.jsp -->
<c:if test="${not empty errorMessage}">
<jsp:include page="login.jsp"></jsp:include>
</c:if>

<!-- if the user login link,I have to login.jsp -->
<c:if test="${isUserClickedLogin}">
<jsp:include page="login.jsp"></jsp:include>
</c:if>

<c:if test="${isUserlickedLogin}">
<jsp:include page="login.jsp"></jsp:include>
</c:if>

<c:if test="${isUserclickedRegister}">
<jsp"include page="register.jsp"></jsp>
</c:if>
</body>
</html>
