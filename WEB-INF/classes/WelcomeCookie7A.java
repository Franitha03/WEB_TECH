import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class WelcomeCookie7A extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        Cookie ck[] = request.getCookies();
        String name = "";
        for (Cookie c : ck) {
            if (c.getName().equals("username"))
                name = c.getValue();
        }

        out.println("<html><body style='text-align:center;'>");
        out.println("<h2>Welcome to Comic Fan " + name + "!</h2>");
        out.println("</body></html>");
    }
}
