<%-- 
    Document   : menu
    Created on : 12-abr-2016, 19:43:40
    Author     : GERMAN
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
     <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="style1.css">
        <link rel="stylesheet" href="http://www.w3schools.com/lib/w3.css">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Lobster">
        <script src="js/script.js"></script>
      
        <title>TIENDA VIRTUAL</title>
        
       
       <!--<style>
        .w3-lobster {
        font-family: "Lobster", serif;
        }
        </style>-->
       
       <style>
       .mySlides {display:none;}
       </style>
       
       <style>
       .mySlides1 {display:none;}
       </style>
    
    </head>
    
    <body>
        
        <header> 
            
             <img src="img/logo2.jpg" class="w3-round-jumbo" id="logo5" alt="Norway" style="width:40%">
            <div class="w3-content w3-section" style="max-width:1400px">
                
                    <img class="mySlides" src="img/Lamborghini1.jpg" style="width:50%" id="slider">
                    <img class="mySlides" src="img/Lamborghini2.jpg" style="width:50%" id="slider">
                    <img class="mySlides" src="img/Lamborghini3.jpg" style="width:50%" id="slider">
                    <img class="mySlides" src="img/Lamborghini4.jpg" style="width:50%" id="slider">
                    <img class="mySlides" src="img/Lamborghini5.jpg" style="width:50%" id="slider">
                    <img class="mySlides" src="img/Lamborghini6.jpg" style="width:50%" id="slider">
                    <img class="mySlides" src="img/Lamborghini7.jpg" style="width:50%" id="slider">
                    
            </div>
                    
            
        <script>
            var myIndex = 0;
            carousel();

            function carousel() {
             var i;
             var x = document.getElementsByClassName("mySlides");
             for (i = 0; i < x.length; i++) {
             x[i].style.display = "none";  
            }
             myIndex++;
             if (myIndex > x.length) {myIndex = 1}    
             x[myIndex-1].style.display = "block";  
             setTimeout(carousel, 2000);    
            }
        </script>
                
     </header>
        
    </body>
</html>
