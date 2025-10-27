import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class WelcomeUrl7B extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        String uname = request.getParameter("user");

        out.println("<html><body style='text-align:center;'>");
        out.println("<h2>Welcome to Comic Fan " + uname + "!</h2>");
        out.println("</body></html>");
    }
}
