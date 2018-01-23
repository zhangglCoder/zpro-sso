<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>登录页面</title>
</head>
<body>

<center>
<h1>SSO-登录认证中心</h1>

<form action="/login" method="post">
    <table>
        <tr>
            <td>用户名称</td>
            <td><input type="text" id="userId" name="userId"/></td>
        </tr>
        <tr>
            <td>用户密码</td>
            <td><input type="password" id="userPwd" name="userPwd"/></td>
        </tr>
        <tr>
            <td colspan="2">
                <input type="submit" value="登录" />
            </td>
        </tr>
    </table>
</form>
</center>
</body>
</html>