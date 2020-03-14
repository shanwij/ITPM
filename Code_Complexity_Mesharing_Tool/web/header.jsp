<%-- 
    Document   : header
    Created on : Mar 14, 2020, 1:33:16 PM
    Author     : Lahiru Sanka
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js"></script> 

        <link rel="stylesheet" href="css/header.css">
        <title>head</title>
    </head>
    <body>
        <div id="mainHeader">

            <label id="logo">Logo</label>
            <label id="Htext"  ><b> Code Complexity Measuring Tool </b></label>

        </div>
        <div id="headbdy">
            <ul class="nav navbar-nav">
                <li><a class="active" data-toggle="tab" href="index.jsp">Home</a></li>                 
                <li><a data-toggle="tab" href="#contact">Size - Variables - Methods</a></li>
                <li><a data-toggle="tab" href="#contact">Inheritance</a></li>
                <li><a data-toggle="tab" href="#contact">Coupling</a></li>
                <li><a data-toggle="tab" href="controlstructure.jsp">Control structures</a></li>
                <li><a data-toggle="tab" href="#contact">All The Factors</a></li>                 
            </ul>
            <div id="hrline"></div>
            
        </div>
    </body>
</html>
