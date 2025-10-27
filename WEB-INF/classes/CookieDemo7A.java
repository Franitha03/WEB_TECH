import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class CookieDemo7A extends HttpServlet {
    public void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        String uname = request.getParameter("uname");

        Cookie ck = new Cookie("username", uname);
        response.addCookie(ck);

        out.println("<html><body style='text-align:center;'>");
        out.println("<h3>Welcome " + uname + "!</h3>");
        out.println("<a href='WelcomeCookie7A'>Go to Comic Fan Page</a>");
        out.println("</body></html>");
    }
}
