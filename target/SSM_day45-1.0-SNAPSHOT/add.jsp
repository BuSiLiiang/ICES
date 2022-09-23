<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: besx
  Date: 2022/8/19
  Time: 15:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<fieldset>
    <legend>添加信息</legend>
    <form action="add.do" method="post">
        <table>
            <tr>
                <th>员工编号：</th>
                <th><input type="text" name="empno"></th>
            </tr>
            <tr>
                <th>员工姓名：</th>
                <td><input type="text" name="ename" ></td>
            </tr>
            <tr>
                <th>员工薪资：</th>
                <td><input type="text" name="sal"></td>
            </tr>
            <tr>
                <th>部门：</th>
                <td>
                    <select name="dept.deptno">
                        <option value="-1">--请选择--</option>
                        <c:forEach var="i" items="${sessionScope.deptList}">
                                    <option value="${i.deptno}">${i.dname}</option>
                        </c:forEach>
                    </select>
                </td>
            </tr>
            <tr>
                <td colspan="2">
                    <input type="submit" value="提交"/>
                    <input type="reset" value="重置">
                </td>
            </tr>
        </table>
    </form>
</fieldset>
</body>
</html>
