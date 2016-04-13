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
        <!--<link rel="stylesheet" type="text/css" href="style1.css">-->
        <link rel="stylesheet" href="http://www.w3schools.com/lib/w3.css">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <!--<link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Lobster">-->
        <script src="js/script.js"></script>
        <link rel="stylesheet" type="text/css" href="main.css">
        <meta name="viewport" content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
        <title>TIENDA VIRTUAL</title>
        
      </head>
      <body>
          
     <header> 
           
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
        
        <div class="menu_bar">
            <a href="" class="bt-menu">Menu</a>
        </div>
 
         <nav>
           <ul>
             <li><a href="menu.jsp"><span class="icon-house"></span>INICIO</a></li>
             <li><a href="productos.jsp"><span class="icon-suitcase"></span>PRODUCTOS</a></li>
             <li><a href="#"><span class="icon-rocket"></span>TECNOLOGIA</a></li>
             <li><a href="#"><span class="icon-earth"></span>PRECIOS</a></li>
          
           </ul>
         </nav>
            
        </header>     
        
          <div class="gallery">
            <figure class="gallery-item">
              <a href="http://www.nba.com"><img class="fotos" src="img/Lamborghini1.jpg"></a>
            </figure>
    
            <figure class="gallery-item">
            <a href="https://www.lebronjames.com/"> <img class="fotos" src="img/Lamborghini2.jpg"></a>
            </figure>
    
            <figure class="gallery-item">
            <a href="http://www.kobebryant.com"> <img class="fotos" src="img/Lamborghini3.jpg"></a>
            </figure>
    
            <figure class="gallery-item">
            <a href="http://www.michaeljordansworld.com"> <img class="fotos" src="img/Lamborghini4.jpg"></a>
            </figure>
    
            <figure class="gallery-item">
            <a href="https://es.wikipedia.org/wiki/Tony_Parker"> <img class="fotos" src="img/Lamborghini5.jpg"></a>
            </figure>
    
            <figure class="gallery-item">
            <a href="http://www.dennisrodman.com"> <img class="fotos" src="img/Lamborghini6.jpg"></a>
            </figure>
  
          </div> 
          
          
          
        <section>  
  
            <div class="w3-content w3-section" style="max-width:1400px">
                
                    <img class="mySlides" src="img/Lamborghini1.jpg"  id="slider">
                    <img class="mySlides" src="img/Lamborghini2.jpg"  id="slider">
                    <img class="mySlides" src="img/Lamborghini3.jpg"  id="slider">
                    <img class="mySlides" src="img/Lamborghini4.jpg"  id="slider">
                    <img class="mySlides" src="img/Lamborghini5.jpg"  id="slider">
                    <img class="mySlides" src="img/Lamborghini6.jpg"  id="slider">
                    <img class="mySlides" src="img/Lamborghini7.jpg"  id="slider">
                    
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
         
        
 
            <div class="text">
           1963-1964
La historia de "Lamborghini Automobili" comienza oficialmente en 1963. Sin embargo, debemos remontarnos a las raíces lejanas de este evento, que no son otras que las raíces de Ferruccio Lamborghini. Nacido en 1916 bajo el signo de Tauro, este hombre hábil, impetuoso y de fuerte carácter fue el verdadero protagonista de la fundación de la empresa y de las etapas iniciales de su extraordinaria historia.

Cuando decidió construir una fábrica de coches deportivos de lujo, Ferruccio ya era un hombre muy rico. En el período posterior la Segunda Guerra Mundial, fundó su fábrica de tractores, la cual puso en marcha con energía y determinación, creando un importante punto de referencia en esta industria. Después llevó a cabo otros negocios, lo que le permitió amasar su fortuna en el momento perfecto, antes de su quincuagésimo cumpleaños. A principios de los años sesenta, Lamborghini era un hombre poderoso y con mucho éxito que sabía exactamente lo que quería, pero cuando dijo que construiría un superdeportivo para competir con Ferrari, mucha gente pensó que estaba loco. Construir ese tipo de coche fue visto como una extravagancia inexplicable, un salto peligroso en la oscuridad y, en definitiva, algo que le haría dilapidar su fortuna sin obtener beneficio alguno.

Empezó a trabajar en este proyecto a finales de 1962 y antes de mayo de 1963 ya había fundado ‘Automobili Ferruccio Lamborghini’, comprando una gran parcela de terreno en Sant’Agata Bolognese, a unos 25 kilómetros de Bolonia, para construir una fábrica ultramoderna y de grandes dimensiones. Gracias a la experiencia que había adquirido con sus otras empresas, se encontraba en condiciones de montar las mejores instalaciones para su propósito: una estructura muy funcional que, en aquel momento, no tenía rivales en su campo. El enorme y luminoso edificio central estaba junto al edificio de oficinas, de manera que la dirección podía tener constantemente bajo control la situación de la producción. Esto era ideal para Lamborghini, que a menudo se remangaba las mangas de la camisa y se ponía a trabajar personalmente en los coches cuando veía que algo no se estaba haciendo como él quería.

El primer modelo vio la luz, como es natural, en muy poco tiempo, dado que solo había unos meses de diferencia entre la fecha en que Lamborghini decidió construir la fábrica y la fecha fijada para su presentación oficial. El evento elegido para la ocasión fue la cita habitual de aquella época, el Salón del Automóvil de Turín programado para principios de noviembre de 1963. El hecho de tener una idea muy clara de lo que quería permitió a Lamborghini no perder tiempo en buscar a la gente adecuada. Para el motor, que tenía que ser el mejor V12 fabricado en la zona y, por lo tanto, en el mundo, recurrió inmediatamente a Giotto Bizzarrini, que había diseñado algunos de los motores más recientes de Ferrari. Para el resto del coche y para poner en marcha la producción, contrató a dos jóvenes ingenieros muy prometedores, Giampaolo Dallara y Giampaolo Stanzani. Esto suponía un gran esfuerzo y no había mucho tiempo. Sin embargo, cuando se presentó el 350 GTV, ya era una obra maestra.

En retrospectiva, 1964 fue un año extraordinario. Nació el 350 GT La inmediata y casi inevitable evolución del 350 GT, del cual se fabricaron 120 unidades, fue el 400 GT. Su motor se incrementó a un modelo de cuatro litros y contaba con la primera caja de cambios diseñada internamente en Lamborghini. El 400 GT, que inicialmente estaba basado en una carrocería de dos asientos y que más tarde desembocaría en el 400 GT 2+2 con dos asientos adicionales ubicados detrás de los dos habituales, alcanzó la respetable cifra de producción total de 273 unidades.

        </section>



        <footer>
        
            <div class="gallery">
            <figure class="gallery-item">
              <a href="http://www.nba.com"><img class="fondo" src="img/logo3.jpg"></a>
            </figure>
    
            <figure class="gallery-item">
            <a href="https://www.lebronjames.com/"> <img class="fondo" src="img/logo5.jpg"></a>
            </figure>
    
            <figure class="gallery-item">
            <a href="http://www.kobebryant.com"> <img class="fondo" src="img/logo6.jpg"></a>
            </figure>
    
            <figure class="gallery-item">
            <a href="http://www.michaeljordansworld.com"> <img class="fondo" src="img/logo8.jpg"></a>
            </figure>
    
            <figure class="gallery-item">
            <a href="https://es.wikipedia.org/wiki/Tony_Parker"> <img class="fondo" src="img/logo7.jpg"></a>
            </figure>
    
            <figure class="gallery-item">
            <a href="http://www.dennisrodman.com"> <img class="fondo" src="img/logo1.jpg"></a>
            </figure>
  
          </div> 
        </footer>        
     
        
    </body>
</html>
