<%-- 
    Document   : index
    Created on : 05-abr-2016, 11:05:05
    Author     : GERMAN
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="style.css">
        <link rel="stylesheet" href="http://www.w3schools.com/lib/w3.css">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Lobster">
        <script src="js/script.js"></script>
        <body class="w3-container">
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
            
            <img src="img/logo.jpg" class="w3-round-jumbo" id="logo5" alt="Norway" style="width:36%">
            
            <div class="w3-content w3-section" style="max-width:980px">
                
                    <img class="mySlides" src="img/Lamborghini1.jpg" style="width:55%" id="slider">
                    <img class="mySlides" src="img/Lamborghini2.jpg" style="width:55%" id="slider">
                   <img class="mySlides" src="img/Lamborghini3.jpg" style="width:55%" id="slider">
                    <img class="mySlides" src="img/Lamborghini4.jpg" style="width:55%" id="slider">
                    <img class="mySlides" src="img/Lamborghini5.jpg" style="width:55%" id="slider">
                    <img class="mySlides" src="img/Lamborghini6.jpg" style="width:55%" id="slider">
                    <img class="mySlides" src="img/Lamborghini7.jpg" style="width:55%" id="slider">
                    
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
        </br></br></br></br>
       
        <section>
            <form action="Autenticacion" method="POST">
                
          <div class="w3-card-8 w3-dark-grey w3-margin"id="formulario" style="width:30%">

            <div class="w3-container w3-center">
                   
              <div class="w3-container w3-lobster font-effect-brick-sign">
                    
                  
                    <p class="w3-xxxlarge">Registrarse</p>
            </br>
              </div> 
                    
                    <img src="img/2.jpg" alt="Avatar" style="width:25%">  
                   
                    <BR></BR>
                     <p>
                         <button class="w3-btn w3-green">ENTRAR</button>
                         <button class="w3-btn w3-red">SALIR</button>
                    </p>
            </div>

          </div>       
                
            <div class="w3-card-12 w3-margin" id="formulario2" style="width:29%">
              <img src="img/1.jpg" alt="Norway" style="width:25%">
                 <div class="w3-container w3-center w3-purple">
                        <p>LOGUIN</p>
                 </div>
                   
                    <br></br>    
                    E-mail <input type="test" name="user" id="user" size="24"  maxlength="40">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<br></br>
                    Contraseña <input type="password" name="pass" id="pass" size="20" maxlength="40">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<br></br>

                <input class="w3-btn w3-hover-purple w3-purple w3-large" type="submit" name="Entrar" id="Entrar" size="60" align="center" value="Entrar">
            </div>



            </form>
        </section>
            
      
       
    </body>
    
    
</html>
