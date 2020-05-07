<%-- 
    Document   : method
    Created on : Mar 24, 2020, 7:28:45 PM
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

            <br><p  class="text-center"> <b>Code Complexity Measuring Of Your Program Due to Method </b></p>

            <div class="progress" id="progressbar">
                <div class="progress-bar progress-bar-striped progress-bar-animated" style="width:33.3%;height:20px"></div>
            </div> 

            <div id="scrol">
                <table id="MethTable" class="table-bordered table-striped" >
                    <tr>
                        <th style="width: 65px;" >Line No</th>
                        <th>Program Statements</th>
                        <th style="width: 60px;">Wmrt</th>
                        <th style="width: 60px;">Npdtp</th>
                        <th style="width: 60px;">Ncdtp</th>
                        <th style="width: 60px;">Cm</th>
                    </tr>
                      
                    </tbody>
                    
                </table>

            </div>
            
            <div>
              <a class="btn btn-info" href="http://localhost:8083/Code_Complexity_Mesharing_Tool/size.jsp">&laquo; Size</a>                 
              <a style="float:right; margin-right:15px;"class="btn btn-info" href="http://localhost:8083/Code_Complexity_Mesharing_Tool/variables.jsp">Variables &raquo;</a>           
            </div>
            <br>
            <table id="abbreviationtbl" class="table-striped">
                <tr>
                    <th colspan="2" style="text-align: center">- Abbreviation -</th>

                </tr>
                <tr>
                    <td >Cm</td>
                    <td>= Complexity of a line which includes a method </td>
                </tr>
                <tr>
                    <td>Wmrt</td>
                    <td>= Weight due to method return type </td>
                </tr>
                <tr>
                    <td>Wpdtp</td>
                    <td>= Weight of primitive data type parameters</td>
                </tr>
                <tr>
                    <td>Npdtp</td>
                    <td>= Number of primitive data type parameters </td>
                </tr>
                 <tr>
                    <td>Wcdtp</td>
                    <td>= Weight of composite data type parameters </td>
                </tr>
                 <tr>
                    <td>Ncdtp</td>
                    <td>= Number of composite data type parameters </td>
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
                         
                         
                         $("#MethTable").find('tbody').append(res);

                    }
                };
                xmlHttp.open("POST", "main_servlet", true);
                xmlHttp.setRequestHeader("Content-Type", "application/x-www-form-urlencoded");
                xmlHttp.send("RqMeth=FillForm&ctrl=ctrl");
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
