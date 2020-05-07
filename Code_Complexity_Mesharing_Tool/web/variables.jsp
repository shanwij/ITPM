<%-- 
    Document   : variables
    Created on : Mar 24, 2020, 7:09:14 PM
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

            <br><p  class="text-center"> <b>Code Complexity Measuring Of Your Program Due to Variables </b></p>

            <div class="progress" id="progressbar">
                <div class="progress-bar progress-bar-striped progress-bar-animated" style="width:33.3%;height:20px"></div>
            </div> 

            <div id="scrol">
                <table id="VariTable" class="table-bordered table-striped" >
                    <tr>
                        <th style="width: 65px;" >Line No</th>
                        <th>Program Statements</th>
                        <th style="width: 60px;">Wvs</th>
                        <th style="width: 60px;">Npdtv</th>
                        <th style="width: 60px;">Ncdtv</th>
                        <th style="width: 60px;">Cv</th>
                    </tr>
                     
                   
                    </tbody>

                </table>

            </div>
            
            <div>
              <a class="btn btn-info" href="http://localhost:8083/Code_Complexity_Mesharing_Tool/method.jsp">&laquo; Method</a>                 
              <a style="float:right; margin-right:15px;"class="btn btn-info" href="http://localhost:8083/Code_Complexity_Mesharing_Tool/size.jsp">Size &raquo;</a>           
            </div>
            <br>
            <table id="abbreviationtbl" class="table-striped">
                <tr>
                    <th colspan="2" style="text-align: center">- Abbreviation -</th>

                </tr>
                <tr>
                    <td >Cv</td>
                    <td>= Complexity of a program statement due to its variables </td>
                </tr>
                <tr>
                    <td>Wvs</td>
                    <td>= Weight due to variable scope </td>
                </tr>
                <tr>
                    <td>Wpdtv</td>
                    <td>= Weight of primitive data type variables</td>
                </tr>
                <tr>
                    <td>Npdtv</td>
                    <td>=  Number of primitive data type variables </td>
                </tr>
                 <tr>
                    <td>Wcdtv</td>
                    <td>= Weight of composite data type variables </td>
                </tr>
                 <tr>
                    <td>Ncdtv</td>
                    <td>= Number of composite data type variables </td>
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
                         
                         
                         $("#VariTable").find('tbody').append(res);

                    }
                };
                xmlHttp.open("POST", "main_servlet", true);
                xmlHttp.setRequestHeader("Content-Type", "application/x-www-form-urlencoded");
                xmlHttp.send("RqVari=FillForm&ctrl=ctrl");
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
