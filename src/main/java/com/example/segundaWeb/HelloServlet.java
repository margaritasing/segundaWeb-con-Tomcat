package com.example.segundaWeb;

import java.io.*;

import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class HelloServlet extends HttpServlet {
    private String message;

    public void init() {
        message = "Hello World!";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        String paramNombre = request.getParameter("nombre");
        String paramCurso = request.getParameter("curso");

        Alumna alumna = new Alumna("juli", "front");

        PrintWriter out = response.getWriter();
        out.println("<html><head><link rel='stylesheet' href='css/estilos.css' /></head>");
        out.println("<body>");
        out.println("<h1 class='titulo'>Listado de alumnas del curso " + paramCurso + "</h1>");
        for (int contador = 1; contador < 11; contador++)
            out.println("<i>" + contador + ") " + paramNombre + "</i><br/>");

        out.println("<p>Alumna: " + alumna.getNombre() + " pertenece al curso de " + alumna.getCurso() + "</p>");

        out.println("</body></html>");
    }

    public void destroy() {
    }

}