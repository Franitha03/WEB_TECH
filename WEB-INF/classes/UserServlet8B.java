import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class UserServlet8B extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        // Get or create session for this user
        HttpSession session = request.getSession();

        Integer userVisits = (Integer) session.getAttribute("visitCount");
        if (userVisits == null) {
            userVisits = 1; // first visit
        } else {
            userVisits++;
        }
        session.setAttribute("visitCount", userVisits);

        out.println("<html>");
        out.println("<head>");
        out.println("<title>Cosmic Comics Tracker</title>");
        out.println("<link href='https://fonts.googleapis.com/css2?family=Comic+Neue:wght@700&display=swap' rel='stylesheet'>");
        out.println("</head>");
        out.println("<body style=\"font-family: 'Comic Neue', cursive; background-image: url('https://w0.peakpx.com/wallpaper/491/535/HD-wallpaper-cosmos-stars-fantasy-planet-nebula-dark-space-vadim-sadovski-cosms-luminos.jpg'); background-size: cover; color: white; text-align: center; padding-top: 60px;\">");

        out.println("<h2 style='font-size: 40px; text-shadow: 2px 2px #ff2e63;'>🚀 Cosmic Visit Tracker 🌟</h2>");
        out.println("<p style='font-size: 24px;'>🪐 <b>Your Intergalactic Visit Count:</b> " + userVisits + "</p>");
        out.println("<p style='font-size: 18px;'>This number increases every time you warp into this cosmic boutique page!</p>");

        out.println("<a href='UserServlet8B' style='display: inline-block; background-color: #ff2e63; color: white; padding: 12px 24px; text-decoration: none; border-radius: 10px; margin: 10px; font-size: 18px; box-shadow: 2px 4px 8px rgba(0,0,0,0.6);'>🔄 Refresh Page</a><br>");

        out.println("<a href='HomeEx8.html' style='display: inline-block; background-color: #3f72af; color: white; padding: 12px 24px; text-decoration: none; border-radius: 10px; margin: 10px; font-size: 18px; box-shadow: 2px 4px 8px rgba(0,0,0,0.6);'>🏠 Back to Home</a>");

        out.println("</body></html>");
    }
}
