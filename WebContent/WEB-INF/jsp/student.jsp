<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>   
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
     <table>
        <tr>
           <td>编号</td>
           <td>姓名</td>
           <td>年龄</td>
        </tr>
        <c:forEach items="StudentList" var="student">
           <tr>
              <td>${student.id}</td>
              <td>${student.name}</td>
              <td>${student.age}</td>
           </tr>
        
        </c:forEach>
     </table>
</body>
</html>