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
        <li class="is-active">Step 1</li>
        <li>Step 2</li>
        <li>Step 3</li>
      </ul>
      <form class="form-wrapper" method="POST" action="/sendSaveUsrInfo">

        <fieldset class="section is-active">
          <h3>이름과 이메일 주소를 입력해주세요</h3>
          <input type="text" name="name" id="name" placeholder="Name">
          <input type="text" name="email" id="email" placeholder="Email">
          <input type="text" name="phone" id="phone" placeholder="phone">
          <div class="button">Next</div>
        </fieldset>
        <fieldset class="section">
          <h3>직업을 선택하세요</h3>
          <div class="row cf">
            <div class="four col">
              <input type="radio" name="r1" id="r1" value="전문직" checked>
              <label for="r1">
                <h4>전문직</h4>
              </label>
            </div>
            <div class="four col">
              <input type="radio" name="r1" id="r2" value="개발자"><label for="r2">
                <h4>개발자</h4>
              </label>
            </div>
            <div class="four col">
              <input type="radio" name="r1" id="r3" value="공무원"><label for="r3">
                <h4>공무원</h4>
              </label>
            </div>
          </div>
          <div class="row cf">
            <div class="four col">
              <input type="radio" name="r1" id="r4" value="프리랜서"><label for="r4">
              <h4>프리랜서</h4>
            </label>
            </div>
            <div class="four col">
              <input type="radio" name="r1" id="r5" value="회사원"><label for="r5">
              <h4>회사원</h4>
            </label>
            </div>
            <div class="four col">
              <input type="radio" name="r1" id="r6" value="전문직"><label for="r6">
              <h4>전문직</h4>
            </label>
            </div>
          </div>
          <div class="row cf">
            <div class="four col">
              <input type="radio" name="r1" id="r7" value="기타"><label for="r7">
              <h4>기타</h4>
            </label>
            </div>
          </div>
          <div class="button">Next</div>
        </fieldset>
        <fieldset class="section">
          <h3>소득정보를 입력해주세요</h3>
          <input type="text" name="inAmt" id="inAmt" placeholder="소득 금액">
          <input type="text" name="outAmt" id="outAmt" placeholder="희망 대출금액">
          <input class="submit button" type="submit" value="제출">
        </fieldset>
      </form>
    </div>
  </div>

  <script src='https://cdnjs.cloudflare.com/ajax/libs/jquery/3.1.0/jquery.min.js'></script>

    <script type="text/javascript" src="js/index.js"></script>

</body>
</html>
