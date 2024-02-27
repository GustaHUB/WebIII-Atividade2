package br.edu.ifpr.atividade2;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/cabecalhos")
public class HeadersServlet extends HelloServlet{

    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        PrintWriter writer = resp.getWriter();

        String host = req.getHeader("host");
        String client = req.getHeader("user-agent");
        String encode = req.getHeader("accept-encoding");
        String language = req.getHeader("accept-language");

        writer.println("<html>");

        writer.println("<p>" + host + "</p>");
        writer.println("<p>" + client + "</p>");
        writer.println("<p>" + encode + "</p>");
        writer.println("<p>" + language + "</p>");

        writer.println("</html>");

    }
}
