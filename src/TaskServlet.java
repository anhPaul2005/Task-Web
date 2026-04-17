import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class TaskServlet extends HttpServlet {

    private List<String> tasks = new ArrayList<>();

    
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String title = request.getParameter("title");
        tasks.add(title);

        response.sendRedirect("index.html");
    }

    
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        out.println("<h2>Task List</h2>");
        for (int i = 0; i < tasks.size(); i++) {
            out.println("<p>" + (i+1) + ". " + tasks.get(i) + "</p>");
        }

        out.println("<br><a href='index.html'>Back</a>");
    }
}
