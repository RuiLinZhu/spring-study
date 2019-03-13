<%--
  Created by IntelliJ IDEA.
  User: User
  Date: 2018/11/26
  Time: 10:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<html>
<head>
    <base href="<%=basePath%>">

    <title>用户登录</title>
    <meta http-equiv="pragma" content="no-cache">
    <meta http-equiv="cache-control" content="no-cache">
    <meta http-equiv="expires" content="0">
    <link rel="stylesheet" type="text/css" href="CSS/style.css">
    <script language="javascript">
        function check(form){
            if(form.user.value==""){
                alert("请输入用户名！");form.user.focus();return false;
            }
            if(form.pwd.value==""){
                alert("请输入密码！");form.pwd.focus();return false;
            }
        }
    </script>
</head>

<body>
<form name="form1" method="post" action="UserServlet?action=login" onSubmit="return check(this)">
    <table width="617" height="314" border="0" align="center" cellpadding="0" cellspacing="0" background="images/login.jpg">
        <tr>
            <td width="121" height="145">&nbsp;</td>
            <td width="496">&nbsp;</td>
        </tr>
        <tr>
            <td>&nbsp;</td>
            <td align="left" valign="top"><table width="303" border="0" cellpadding="0" cellspacing="0">
                <tr>
                    <td width="66" height="27" align="center" class="wordRed">用户名：</td>
                    <td colspan="2"><input name="user" type="text" size="30">            </td>
                </tr>
                <tr>
                    <td height="27" align="center" class="wordRed">密&nbsp;&nbsp;码：</td>
                    <td colspan="2"><input name="pwd" type="password" id="pwd" size="30"></td>
                </tr>
                <tr>
                    <td height="50">&nbsp;</td>
                    <td width="81"><input name="Submit" type="submit" class="btn_bg" value="登 录"></td>
                    <td width="156">&nbsp;<a href="register.jsp" class="login">注册新用户</a></td>
                </tr>
                <tr>
                    <td colspan="3" align="center"><a href="register.jsp"></a></td>
                </tr>
            </table></td>
        </tr>
    </table>
</form>
</body>
</html>

