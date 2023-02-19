package nibm.ead2.serv;



import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
 
@WebServlet("/counter")
public class InitParams extends HttpServlet {
    private static final String COUNTER_KEY = "COUNTER_KEY";
 
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        HttpSession session = req.getSession();
        PrintWriter out = resp.getWriter();
 
        Integer counter = 0;
        out.println("<html><body>");
        if (session.getAttribute(COUNTER_KEY) == null) {
            out.println("<div> Session created : <b>" + counter + "</b></div>");
        } else {
            counter = (Integer) session.getAttribute(COUNTER_KEY);
            counter++;
            out.println("<div> Counter increased : <b>" + counter + "</b></div>");
        }
 
        session.setAttribute(COUNTER_KEY,counter);

        out.println("</body></html>");
    }
}
