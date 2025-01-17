<%-- 
    Document   : size
    Created on : Mar 20, 2020, 9:13:49 PM
    Author     : Laskshan Wijewardana
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">   
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
        <link rel="stylesheet" href="css/SizeVariablesMethod.css">
        <title>JSP Page</title>
    </head>
    <body>
       <%@include file="header.jsp" %>
       
       
        <div id="SizeDiv">

            <br><p  class="text-center"> <b>Code Complexity Measuring Of Your Program Due to Size </b></p>

            <div class="progress" id="progressbar">
                <div class="progress-bar progress-bar-striped progress-bar-animated" style="width:33.3%;height:20px"></div>
            </div> 

            <div id="scrol">
                <table id="ctrlSize" class="table-bordered table-striped" >
                    <tbody><tr>
                        <th style="width: 70px;" >Line No</th>
                        <th>Program Statements</th>
                        <th style="width: 60px;">Nkw</th>
                        <th style="width: 60px;">Nid</th>
                        <th style="width: 60px;">Nop</th>
                        <th style="width: 60px;">Nnv</th>
                        <th style="width: 60px;">Nsl</th>
                        <th style="width: 60px;">Cs</th>
                    </tr>
                      
                    </tbody> -->
                </table>

            </div>
            
            <div>
              <a class="btn btn-info" href="http://localhost:8083/Code_Complexity_Mesharing_Tool/method.jsp">&laquo; Method</a>                 
              <a style="float:right; margin-right:15px;"class="btn btn-info" href="http://localhost:8083/Code_Complexity_Mesharing_Tool/variables.jsp">Variables &raquo;</a>           
            </div>
            <br>
            <table id="abbreviationtbl" class="table-striped">
                <tr>
                    <th colspan="2" style="text-align: center">- Abbreviation -</th>

                </tr>
                <tr>
                    <td >Nkw</td>
                    <td>= Number of keywords or reserved words in the program statement </td>
                </tr>
                <tr>
                    <td>Nid</td>
                    <td>= Number of identifiers in the program statement </td>
                </tr>
                <tr>
                    <td>Nop</td>
                    <td>= Number of operators in the program statement</td>
                </tr>
                <tr>
                    <td>Nnv</td>
                    <td>= Number of numerical values in the program statement </td>
                </tr>
                 <tr>
                    <td>Nsl</td>
                    <td>= Number of string literals in the program statement </td>
                </tr>
                 <tr>
                    <td>Cs</td>
                    <td>= Complexity of a program statement due to its size </td>
                </tr>
            </table>
            <p id="tt"></p>

        </div>

        <script>

           

            $(document).ready(function () {
                var url = window.location;
                $('ul.nav a[href="' + url + '"]').parent().addClass('active');
                $('ul.nav a').filter(function () {
                    return this.href === url;
                }).parent().addClass('active');
            });

            var xmlHttp;
            if (window.XMLHttpRequest) {
                xmlHttp = new XMLHttpRequest();
            } else if (window.ActiveXObject) {
                xmlHttp = new ActiveXObject("Microsoft.XMLHTTP");
            } else {
                alert("Browser Doesnt Support Ajax!");
            }
            if (xmlHttp !== null) {
                xmlHttp.onreadystatechange = async function () {
                    if (xmlHttp.readyState === 4) {
                        var res = xmlHttp.responseText;
                         
                         
                         $("#ctrlSize").find('tbody').append(res);

                    }
                };
                xmlHttp.open("POST", "main_servlet", true);
                xmlHttp.setRequestHeader("Content-Type", "application/x-www-form-urlencoded");
                xmlHttp.send("RqSize=FillForm&ctrl=ctrl ");
            }




//            var lines = [];
//            $('#my_textarea_selector').val().split("\n").each(function ()
//            {
//            if (parseInt($(this) != 'NaN')
//                lines[] = parseInt($(this));
//            }




        </script>
    </body>
</html>
