package com.example.segundaWeb;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@WebServlet(name = "detalleCursoServlet", value = "/detallesCurso")
public class detalleCursoServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        String curso = request.getParameter("curso");

        out.println("<html><head><link rel='stylesheet' href='css/estilos.css' /></head><body>");
        out.println("<h1 class='titulo'>Alumnas del curso "+curso+"</h1>");
        List<Alumna> alumnas = AlumnaDAO.getAlumnas();
        for(Alumna alumna: alumnas){
            if(alumna.getCurso().equals(curso)){
                out.println("<p>"+alumna.getNombre()+"</p>");
            }
        }
        out.println("</body></html>");

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
