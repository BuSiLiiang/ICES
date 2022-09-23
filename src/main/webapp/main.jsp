<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: besx
  Date: 2022/8/19
  Time: 14:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<a href="add.jsp">添加</a>
    <p>
        <form action="option.do" method="post">
                <span>部门：</span>
                <select name="dept.deptno">
                    <option value="-1">--请选择--</option>
                    <c:forEach var="i" items="${sessionScope.deptList}">
                        <c:choose>
                            <c:when test="${i.deptno eq deptno}">
                                <option value="${i.deptno}" selected="selected">${i.dname}</option>
                            </c:when>
                            <c:otherwise>
                                <option value="${i.deptno}">${i.dname}</option>
                            </c:otherwise>
                        </c:choose>
                    </c:forEach>
                </select>
                <input type="submit" value="查询">
        </form>
    </p>
    <table>
        <tr>
            <th>员工编号</th>
            <th>员工姓名</th>
            <th>员工薪资</th>
            <th>部门编号</th>
            <th>操作</th>
        </tr>
        <c:forEach var="i" items="${empList}">
            <tr>
                <td>${i.empno}</td>
                <td>${i.ename}</td>
                <td>${i.sal}</td>
                <td>${i.dept.dname}</td>
                <td>
                    <a href="Info.do?empno=${i.empno}">修改</a>
                    <a href="del.do?empno=${i.empno}">删除</a>
                </td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>
