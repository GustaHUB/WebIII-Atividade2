package br.edu.ifpr.atividade2;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/requisicao")
public class RequestServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        PrintWriter writer = resp.getWriter();

        String metodo = req.getMethod();
        String uri = req.getRequestURI();
        String protocolo = req.getProtocol();
        String endrecoRemoto = req.getRemoteAddr();

        writer.println("<html>");

            writer.println("<p>" + metodo + "</p>");
            writer.println("<p>" + uri + "</p>");
            writer.println("<p>" + protocolo + "</p>");
            writer.println("<p>" + endrecoRemoto + "</p>");

        writer.println("</html>");
    }
}
