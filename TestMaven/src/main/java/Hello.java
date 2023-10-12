import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/servlet")
public class Hello extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        String user = req.getParameter("username");
        HttpSession session = req.getSession();
        session.setAttribute("username", user);
        PrintWriter out = resp.getWriter();
        resp.setContentType("text/html");
        out.println("<a href=\"target\">Servlet</a");
    }
}
