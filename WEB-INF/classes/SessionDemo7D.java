import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class SessionDemo7D extends HttpServlet {
    public void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        String uname = request.getParameter("uname");
        HttpSession session = request.getSession();
        session.setAttribute("user", uname);

        out.println("<html><body style='text-align:center;'>");
        out.println("<h3>Welcome " + uname + "!</h3>");
        out.println("<a href='WelcomeSession7D'>Go to Cosmic comics Page</a>");
        out.println("</body></html>");
    }
}
