

package ma.proyecto1.controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletBuscarHoroscopo extends HttpServlet {

    
    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html=UTF-8");
         //response.setContentType("Application/vnd.ms-excel");
        PrintWriter out= response.getWriter();
        String nombre=request.getParameter("nombre");
        String signo=request.getParameter("signo");
        out.println("Bienvenido "+nombre+" a mi servlet, escogiste el signo "+signo+".");
        
    }
}