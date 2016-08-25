<%@ include file="/WEB-INF/views/template/header.jsp" %>

<br>
<br>

<center>
     <div class="container" style="margin-top:40px">
		<div class="row">
			<div class="col-sm-6 col-md-4 col-md-offset-4">
				<div class="panel panel-default">
					<div class="panel-heading">
						<strong> Login to continue</strong>
					</div>
					<div class="panel-body">


            <c:if test="${not empty msg}">
                <div class="msg">${msg}</div>
            </c:if>
						<form role="form" action="<c:url value="/j_spring_security_check" />" method="post">
						<c:if test="${not empty error}">
                    <div class="error" style="color: #ff0000;">${error}</div>
                </c:if>
						
							<fieldset>
								
								<div class="row">
									<div class="col-sm-12 col-md-10  col-md-offset-1 ">
										<div class="form-group">
											<div class="input-group">
												<span class="input-group-addon">
													<i class="glyphicon glyphicon-user"></i>
												</span> 
												<input class="form-control" placeholder="Username" name="username" type="text" autofocus />
											</div>
										</div>
										<div class="form-group">
											<div class="input-group">
												<span class="input-group-addon">
													<i class="glyphicon glyphicon-lock"></i>
												</span>
												<input class="form-control" placeholder="Password" name="password" type="password" value="" />
											</div>
										</div>
										<div class="form-group">
											<input type="submit" class="btn btn-lg btn-primary btn-block" value="Login">
											 <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" />
										</div>
									</div>
								</div>
							</fieldset>
						</form>
					</div>
					<div class="panel-footer ">
						Don't have an account! <a href="/register" onClick=""> Register Here </a>
					</div>
                </div>
			</div>
		</div>
	</div>
	</center>   
<%@ include file="/WEB-INF/views/template/footer.jsp" %>
