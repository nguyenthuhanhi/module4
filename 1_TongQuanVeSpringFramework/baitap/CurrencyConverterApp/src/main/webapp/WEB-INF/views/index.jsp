<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/5.2.0/css/bootstrap.min.css"
      crossorigin="anonymous">
<!DOCTYPE html>
<html>
<head>
    <title>Chuyển đổi tiền tệ</title>
    <style>
        body{
            font-size: 25px;
        }
    </style>
</head>
<body>
<h1  style="color: red ; text-align: center" >Ứng dụng chuyển đổi tiền tệ</h1>
<form action="currency" method="post">
    <div class="mb-3 mt-3">
        <label for="usd" class="form-label">Nhập USD:</label>
        <input type="usd" class="form-control" id="usd" placeholder="Enter USD" name="usd">
    </div>
    <div class="mb-3">
        <label class="form-label">Enter:</label>
        <label>${result} VND</label>
    </div>
    <button type="submit" class="btn btn-primary">Submit</button>
</form>
</body>
</html>