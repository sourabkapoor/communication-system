//the first page after signin that says go to inbox.

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.*;

public class description extends HttpServlet
{

    public description()
    {
    }

    public void service(HttpServletRequest httpservletrequest, HttpServletResponse httpservletresponse)
        throws IOException, ServletException
    {
        PrintWriter printwriter = httpservletresponse.getWriter();
        httpservletresponse.setContentType("Text/Html");
        HttpSession httpsession = httpservletrequest.getSession(true);
        String s = httpsession.getValue("name").toString();
        printwriter.println("<html>");
        printwriter.println("<body background='background.jpg' align='center'>");         //to change background->image 1280*800  
        printwriter.println("<br>");
        printwriter.println("<center><h1><font color=brown> Welcome " + s + "<h2>" );
        //printwriter.println("<img src='Images/"+s+".jpg' align='left' border=0>");
        printwriter.println("<font color=red>GoTo <a href='Serv_Inbox'> Inbox</a>");
        //printwriter.println("<h2><b><i></i></b></h2>");
        printwriter.println("</body></html>");
    }
}
