<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Aplicación web con MVC básica</h1>
        <form action="horoscopo.xls" method="post">
            <p>Escribe tu nombre</p>
            <input type="text" name="nombre"/><br>
            <select name="signo">
                <option>Aries</option>
                <option>Tauro</option>
                <option>Géminis</option>
                <option>Cancer</option>
                <option>Leo</option>
                <option>Virgo</option>
                <option>Libra</option>
                <option>Escorpión</option>
                <option>Sagitario</option>
                <option>Capricornio</option>
                <option>Acuario</option>
                <option>Piscis</option>
            </select>
            <input type="submit" value="Apachurrame"/>
        
        
        </form>
    </body>
</html>

