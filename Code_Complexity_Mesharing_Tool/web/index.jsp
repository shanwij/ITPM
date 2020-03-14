<%--

    Document   : index.jsp
    Created on : Mar 3, 2020, 11:37:47 PM
    Author     : Lahiru Sanka

--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js"></script>

        <link href="css/index.css" rel="stylesheet">

        <title>Home</title>
    </head>
    <body> 
        <%@include file="header.jsp" %>
        <div id="indexbody">

            <br><p  class="text-center"> <b>Select Your Programming Language &nbsp;&nbsp;&nbsp;&nbsp; <input  type="radio"> Java &nbsp;&nbsp;<input type="radio"> C++ </b></p>

            <div class="progress" id="progressbar">
                <div class="progress-bar progress-bar-striped progress-bar-animated" style="width:16.6%;height:20px"></div>
            </div> 

            <textarea id="tarea" placeholder=" Past Your Code Here"></textarea>

            <hr id="uploadHr"> <span id="uploadHrText"> Or Upload Your Program file here </span> <hr id="uploadhrlRight">

            <div class="custom-file" style="width: 98.3%">
                <input type="file" class="custom-file-input" id="customFile" name="filename">
                <label  class="custom-file-label" for="customFile">Choose file</label>
            </div>
            <button id="btnSubmit" type="button" class="btn btn-primary  "><b>Submit And Calculate</b> </button> 

        </div>

        <script>

        </script>
    </body>

</html>


