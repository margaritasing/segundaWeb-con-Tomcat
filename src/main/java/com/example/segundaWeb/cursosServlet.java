package com.example.segundaWeb;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "cursos", value = "/cursos")
public class cursosServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();


        out.println("<html><head><link rel='stylesheet' href='css/estilos.css' /></head><body>");
        out.println("<h1 class='titulo'>Listado de cursos</h1>");
        out.println("<table>");
        out.println("<tr><td>Curso</td><td>Listado de alumnas</td></tr>");
        out.println("<tr><td>Frontend 8</td><td><a href='detallesCurso?curso=front8'>click para ver detalles</a></td></tr>");
        out.println("<tr><td>Backend 5</td><td><a href='detallesCurso?curso=back5'>click para ver detalles</a></td></tr>");
        out.println("</table>");
        out.println("</body></html>");


    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
