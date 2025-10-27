import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class HiddenFieldDemo7C extends HttpServlet {
    public void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        String uname = request.getParameter("uname");

        out.println("<html><body style='text-align:center;'>");
        out.println("<h3>Welcome " + uname + "!</h3>");
        out.println("<form action='WelcomeHidden7C' method='post'>");
        out.println("<input type='hidden' name='user' value='" + uname + "'>");
        out.println("<input type='submit' value='Go to Cosmic comics Page'>");
        out.println("</form>");
        out.println("</body></html>");
    }
}
