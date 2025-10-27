
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class WelcomeHidden7C extends HttpServlet {
    public void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        String uname = request.getParameter("user");

        out.println("<html><body style='text-align:center;'>");
        out.println("<h2>Welcome to Cosmic comics " + uname + "!</h2>");
        out.println("</body></html>");
    }
}
