<%-- 
    Document   : registrarusuario.jsp
    Created on : 14-abr-2016, 9:12:55
    Author     : GERMAN
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    
 <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <!--<link rel="stylesheet" type="text/css" href="style1.css">-->
        <link rel="stylesheet" href="http://www.w3schools.com/lib/w3.css">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <!--<link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Lobster">-->
        <script src="js/script.js"></script>
        <link rel="stylesheet" type="text/css" href="main2.css">
        <meta name="viewport" content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
        <link rel="stylesheet" type="text/css" href="formulario.css">
        
        <script type="text/javascript" src="ejercicio validacion/validacionformulario.js">
        </script>
  
        <script type="text/javascript">

        function validacion(){

        if()  {
          //Si no se cumple la validacion
        alert('[ERROR] El campo debe tener un valor de ...');
        return false;

        }

      }

        </script> 
    </head>
      
    <body>
          
    <header> 
           
            
        <div class="menu_bar">
            <a href="" class="bt-menu">Menu</a>
        </div>
 
         <nav>
           <ul>
             <li><a href="menu.jsp"><span class="icon-house"></span>INICIO</a></li>
             <li><a href="productos.jsp"><span class="icon-suitcase"></span>PRODUCTOS</a></li>
             <li><a href="tecnologia.jsp"><span class="icon-rocket"></span>TECNOLOGIA</a></li>
             <li><a href="precios.jsp"><span class="icon-earth"></span>PRECIOS</a></li>
          
           </ul>
         </nav>
            
    </header>     
        
          <div class="gallery">
            <figure class="gallery-item">
              <a href="http://www.lamborghini.com/es/inicio/"><img class="fotos" src="img/Lamborghini1.jpg"></a>
            </figure>
    
            <figure class="gallery-item">
            <a href="http://www.lamborghini.com/es/inicio/"> <img class="fotos" src="img/Lamborghini2.jpg"></a>
            </figure>
    
            <figure class="gallery-item">
            <a href="http://www.lamborghini.com/es/inicio/"> <img class="fotos" src="img/Lamborghini3.jpg"></a>
            </figure>
    
            <figure class="gallery-item">
            <a href="http://www.lamborghini.com/es/inicio/"> <img class="fotos" src="img/Lamborghini4.jpg"></a>
            </figure>
    
            <figure class="gallery-item">
            <a href="http://www.lamborghini.com/es/inicio/"> <img class="fotos" src="img/Lamborghini5.jpg"></a>
            </figure>
    
            <figure class="gallery-item">
            <a href="http://www.lamborghini.com/es/inicio/"> <img class="fotos" src="img/Lamborghini6.jpg"></a>
            </figure>
  
          </div> 
          
          
          
        <section>  
            
            <form action="RegistrarUsuarios" method="POST" id="formulario" name="formulario" onsubmit="return validacion()"" autofocus required autocomplete="off">
                <p>Nombre</p>
                <label for="nombre"></label>  <input id="" class="nom" type="nombre" name="nombre" size="20" value="" required  autocomplete="off"> 
                
                <p>Apellidos</p>
                <label for="nombre"></label>  <input id="" class="apellidos" type="apellidos" name="apellidos" size="20" value="" required  autocomplete="off"> 
                
                          
                <p>Email:</p>
                <label for="Telefono"></label><input id="" class="mail" type="email" name="mail" size="40" value="" autofocus required autocomplete="off"> 
                  
                
                <p>Nacimiento</p> 
                <label for="nacimiento"></label> <input type="date" name="fecha_r" > 
                <p>Direccion</p>
                <label for="Direccion"> </label> <input id="" class="dire" type="direccion" name="direccion" size="40" maxlength="40" value="" autofocus required autocomplete="off">
                <p>Provincia:</p>
                <label for="Provincia"> </label> 
                  
                <select name="Provincia" size="1">
                  <option value="">Barcelona</option></br>
                  <option value="">Madrid</option></br>
                  <option value="">Sevilla</option></br>
                  <option value="">Ibiza</option>
                </select></br>
                 
                <p>Ciudad:</p>
                <label for="Ciudad"> </label><input id="" class="ciud" type="ciudad" name="pass" size="40" maxlength="40" maxlength="40" value="" required  autocomplete="off">
                 
                <p>Código Postal:</p>
                <input id="" class="codP" type="codigoPostal" name="user" size="10" value="" autofocus required autocomplete="off"></br>            
                
                <p>Sexo</p>
                <input name="" type="checkbox"  
                 <p>Femenino:</p>
                <input name="" type="checkbox" 
                <p>Masculino</p>

                                 
                <p>Telefono:</p>
                <label for="Telefono"></label> <input id="tele" class="" type="" name="" size="7" value="" autofocus required autocomplete="off">
                  
                <p>Nif:</p>
                <label for="Nif"> </label> <input id="" class="Nif" type="Nif" name="Nif" size="10" maxlength="20" value="" autofocus required autocomplete="off"> 
                
                <br></br>
                
                <label for="comentario">COMENTARIO:</label> <textarea id="comentario" class="campo"></textarea> <br /> 
                
                <label for="Validar"> </label><input type="submit" class="submit" name="validar" value=" Validar ">

                <input type="reset" class="reset" name="borrar" value=" Borrar ">
                
                  
                              


                </form>
               



         
        </section>
                    
            
       
        
 


        <footer>
        
            <div class="gallery">
            <figure class="gallery-item">
              <a href="http://www.lamborghini.com/es/inicio/"><img class="fondo" src="img/logo3.jpg"></a>
            </figure>
    
            <figure class="gallery-item">
            <a href="http://www.lamborghini.com/es/inicio/"> <img class="fondo" src="img/logo5.jpg"></a>
            </figure>
    
            <figure class="gallery-item">
            <a href="http://www.lamborghini.com/es/inicio/"> <img class="fondo" src="img/logo6.jpg"></a>
            </figure>
    
            <figure class="gallery-item">
            <a href="http://www.lamborghini.com/es/inicio/"> <img class="fondo" src="img/logo8.jpg"></a>
            </figure>
    
            <figure class="gallery-item">
            <a href="http://www.lamborghini.com/es/inicio/"> <img class="fondo" src="img/logo7.jpg"></a>
            </figure>
    
            <figure class="gallery-item">
            <a href="http://www.lamborghini.com/es/inicio/"> <img class="fondo" src="img/logo1.jpg"></a>
            </figure>
  
          </div> 
        </footer>        
     
        
    </body>

</html>
