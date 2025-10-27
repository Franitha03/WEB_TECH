import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class UrlRewriteDemo7B extends HttpServlet {
    public void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        String uname = request.getParameter("uname");

        out.println("<html><body style='text-align:center;'>");
        out.println("<h3>Welcome " + uname + "!</h3>");
        out.println("<a href='WelcomeUrl7B?user=" + uname + "'>Go to Comic Fan Page</a>");
        out.println("</body></html>");
    }
}
