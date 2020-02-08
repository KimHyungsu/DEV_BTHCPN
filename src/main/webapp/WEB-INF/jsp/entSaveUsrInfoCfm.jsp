<%@ page language="java" contentType="text/html; charset=utf-8"
         pageEncoding="utf-8" isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
    String path = request.getContextPath();
    System.out.println(path);
%>
<!DOCTYPE html>
<html >
<head>
    <meta charset="UTF-8">
    <title>대출정보 입력</title>
    <link href="https://fonts.googleapis.com/css?family=Open+Sans" rel="stylesheet">

    <link rel="stylesheet" type="text/css" href="css/style2.css">

</head>

<body>

<div class="container">
    <div class="wrapper">
        <ul class="steps">
            <li>Step 1</li>
            <li>Step 2</li>
            <li>Step 3</li>
        </ul>
        <form class="form-wrapper" >
            <fieldset class="section is-active">
                <h3>대출 정보 입력이 완료되었습니다</h3>
                <p>심사당당자가 확인 후 조속히 연락드리겠습니다</p>

                <a href="<%=path%>/index" class="button">확인</a>

            </fieldset>
        </form>
    </div>
</div>

<script src='https://cdnjs.cloudflare.com/ajax/libs/jquery/3.1.0/jquery.min.js'></script>


</body>
</html>
