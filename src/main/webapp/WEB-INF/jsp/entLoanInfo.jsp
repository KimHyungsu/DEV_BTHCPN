<%@ page language="java" contentType="text/html; charset=utf-8"
         pageEncoding="utf-8" isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html >
<head>
    <meta charset="UTF-8">
    <title>Interactive Form</title>
    <link href="https://fonts.googleapis.com/css?family=Open+Sans" rel="stylesheet">
    <link rel="stylesheet" href="css/style-entloaninfo.css">

</head>

<body>
<div class="container">
    <h3>아래 정보를 입력하시면 적합한 대출상품을 추천해드립니다.</h3>
    <div>
        <h6>이름</h6>
        <input type="text" name="usernm" id="usernm" placeholder="ex)홍길동">
    </div>
    <div>
        <h6>휴대전화번호</h6>
        <input type="text" name="userPhone" id="userPhone" placeholder="ex)01012345678">
    </div>
    <div>
        <h6>소득정보(천만)</h6>
        <input type="text" name="inAmt" id="inAmt" placeholder="ex) 4000">
    </div>
    <form method="POST" action="/send">
        <h6>희망대출금액</h6>
        <input type="text" name="param1" id="param1" placeholder="ex) 6000">
        <input class="submit button" type="submit" value="입력완료">
    </form>

</div>
<script src='https://cdnjs.cloudflare.com/ajax/libs/jquery/3.1.0/jquery.min.js'></script>
<script src="js/jquery.js"></script>
<script src="js/entloaninfo.js"></script>

</body>
</html>
