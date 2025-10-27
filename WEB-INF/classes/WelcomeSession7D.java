import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class WelcomeSession7D extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        HttpSession session = request.getSession(false);
        String uname = (String) session.getAttribute("user");

        out.println("<html><body style='text-align:center;'>");
        out.println("<h2>Welcome Cosmic comics " + uname + "!</h2>");
        out.println("</body></html>");
    }
}
