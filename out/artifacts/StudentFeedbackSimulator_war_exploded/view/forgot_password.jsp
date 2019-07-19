<jsp:include page="header.jsp"/>
<div class="collapse navbar-collapse" id="navbarResponsive">
    <ul class="navbar-nav text-uppercase ml-auto">
        <li class="nav-item">
            <a class="js-scroll-trigger"
               style="cursor: pointer;font-family: Montserrat,-apple-system,BlinkMacSystemFont,'Segoe UI',Roboto,'Helvetica Neue',Arial,sans-serif,'Apple Color Emoji','Segoe UI Emoji','Segoe UI Symbol','Noto Color Emoji';text-decoration: none;color: white"
               href="../index.jsp">Login</a>
        </li>
    </ul>
</div>
</div>
</nav>
<div style="margin-top: 80px;margin-left: 30px;margin-right: 30px">
    <div class="row">
        <div class="col-3">
            Student ID :
        </div>
        <div class="col-7">
            <input class="form-control" type="text" id="studentId">
        </div>
        <div class="col-2">
            <button id="btnSendEmail" class="btn" style="background-color: #ffbf05;width: 100%" disabled>Send</button>
        </div>
    </div>
    <div class="row" style="margin-top: 20px">
        <div class="col-3">
            Confirmation Code :
        </div>
        <div class="col-9">
            <input class="form-control" type="text" id="confirmationCode">
        </div>
    </div>

    <hr style="margin-top: 50px;margin-bottom: 50px;background-color: #b0b0b0">

    <div class="row">
        <div class="col-12" style="font-size: 32px;text-align: center">
            Reset Password
        </div>
    </div>
    <div class="row" style="margin-top: 20px">
        <div class="col-3">
            New Password :
        </div>
        <div class="col-9">
            <input class="form-control" type="password" id="nPassword" disabled>
        </div>
    </div>
    <div class="row" style="margin-top: 20px">
        <div class="col-3">
            Confirm Password :
        </div>
        <div class="col-9">
            <input class="form-control" type="password" id="cPassword" disabled>
        </div>
    </div>
    <div class="row" style="margin-top: 50px;margin-bottom: 30px">
        <div class="col-2" style="float: none;margin: 0 auto">
            <button id="btnResetPassword" class="btn" style="background-color: #ffbf05;position: relative;left: 50%;transform: translateX(-50%)" disabled>Reset Password</button>
        </div>
    </div>
</div>
</div>
<jsp:include page="footer.jsp"/>