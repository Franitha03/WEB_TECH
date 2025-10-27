import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class GlobalServlet8A extends HttpServlet {
    private static int totalVisits = 0; // Shared by all users

    public void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        totalVisits++; // Increment count on every access

        out.println("<html>");
        out.println("<head>");
        out.println("<title>Cosmic Visitor Dashboard</title>");
        out.println("<link href='https://fonts.googleapis.com/css2?family=Comic+Neue:wght@700&display=swap' rel='stylesheet'>");
        out.println("</head>");
        out.println("<body style=\"font-family: 'Comic Neue', cursive; background-image: url('https://m.media-amazon.com/images/I/91DDbxTC7AL._UF1000,1000_QL80_.jpg'); background-size: cover; background-attachment: fixed; text-align: center; color: white; padding-top: 60px;\">");

        out.println("<h2 style='font-size: 40px; text-shadow: 2px 2px #e94560;'>🌠 Cosmic Visitor Dashboard 🌌</h2>");
        out.println("<p style='font-size: 24px;'>🛸 <b>Total Page Visits by All Users:</b> " + totalVisits + "</p>");
        out.println("<p style='font-size: 18px;'>Every galactic traveler adds to this count! 🚀</p>");

        out.println("<a href='GlobalServlet8A' style='display: inline-block; background-color: #ff2e63; color: white; padding: 12px 24px; text-decoration: none; border-radius: 10px; margin: 10px; font-size: 18px; box-shadow: 2px 4px 8px rgba(0,0,0,0.6);'>🔄 Refresh Page</a><br>");

        out.println("<a href='HomeEx8.html' style='display: inline-block; background-color: #3f72af; color: white; padding: 12px 24px; text-decoration: none; border-radius: 10px; margin: 10px; font-size: 18px; box-shadow: 2px 4px 8px rgba(0,0,0,0.6);'>🏠 Back to Home</a>");

        out.println("</body></html>");
    }
}
