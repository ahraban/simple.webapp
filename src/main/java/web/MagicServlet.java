package web;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author adam.hraban
 */
public class MagicServlet extends HttpServlet 
{
    
    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException
    {   
        //read parameters from HTTP GET method on form submit in magicweb.html
        String color = request.getParameter("Color");
        String animal = request.getParameter("Animal");
        String genre = request.getParameter("Genre");
        
      
        // select music, pass it to variable used in output page
        String deathmetal ;
        MusicSelector selector = new MusicSelector ();
        deathmetal = selector.musicSelection(genre); 
        
        
        //generate output page
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) 
        {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Magic Result</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<center>");
            out.println("<br>");
            out.println("<h3>Conjuring is succesfully finished</h3>");
            out.println("<br>");
            out.println("<br>");
            out.println("<a>Music that will make your day magic is: </a>");
            out.println("<br>");
            out.println("<a href=\"");
            out.println(deathmetal);
            out.println("\"> HERE </a>");
            out.println("<br>");
            out.println("<br>");
            out.println("<br>");
            out.println("<a><i>NOTE: The space flow has been taken in consideration during output generation </i></a>");
            out.println("</center>");
            out.println("</body>");
            out.println("</html>");
            out.close();
        }
    }
}