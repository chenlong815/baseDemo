<%--
  Created by IntelliJ IDEA.
  User: chenlong
  Date: 2016/8/25
  Time: 16:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>JS Test</title>
    <script src="js/js001.js"></script>

    <script src="jquery/jquery-1.12.3.min.js"></script>
    <script src="jquery/jquery.cookie.js"></script>

    <script src="js/ajax.js"></script>
</head>
<body>
<script>
    document.write("<h1>This is a heading</h1>");
    document.write("<p>This is a paragraph</p>");

</script>

<button id="demo" type="button" onclick="changeEleValue()">点击这里</button>

<%--<form action="/testDo.do" method="post">--%>
    <%--</br></br>用户名：<input type="text" id="userName" name="userName">--%>
    <%--</br>密码：<input type="password" id="passWord" name="passWord">--%>
    <%--<input type="submit" value="登录">--%>
<%--</form>--%>

</br></br>用户名：<input type="text" id="userName" name="userName">
</br>密码：<input type="password" id="passWord" name="passWord">
<input type="button" id="enterbtn" value="Ajax登录">

<%--Ajax--%>
<script>
    $('#enterbtn').click(function() {
        var uname = $('#userName').val();
        var upsw = $('#passWord').val();

        $.ajax({
            url: '/testDo.do',
            type: 'POST',
            data: {userName: uname, passWord: upsw},
            dataType: "json",
            success: function (data) {
                // // var x=$("#uname").val();
                // var x=$("input").eq(0).val();

                 $.cookie('userName', uname);

                 $.cookie('passWord', upsw);

                if(data.state == 1){
                    window.location.assign("jsTestCookieGet.jsp");
                }
                if(data.state<0){
                    alert("登录失败","请重新输入","error");
                }
            }
        })
    })
</script>
</body>
</html>