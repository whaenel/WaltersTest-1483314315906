package wasdev.sample.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SimpleServlet
 */
@WebServlet("/SimpleServlet")
public class SimpleServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
<<<<<<< Upstream, based on master
        response.getWriter().println("Hello MyGitWorld!");
=======
        response.getWriter().print("Hello Walters GitWorld!");
>>>>>>> 259d6c5 resolution
        response.getWriter().print("2 wAnother text!");
<<<<<<< Upstream, based on master
        response.getWriter().print("Hello Walters GitWorld!");
        response.getWriter().print("Another text!");
        response.getWriter().print("Hello Walters GitWorld!");
        response.getWriter().print("Another text!");
=======

>>>>>>> 259d6c5 resolution
    }

}
