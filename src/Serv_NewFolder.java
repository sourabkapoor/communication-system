import java.io.IOException;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.http.*;

import connect.ConnectionProvider;

public class Serv_NewFolder extends HttpServlet
{

    public Serv_NewFolder()
    {
    }

    public void service(HttpServletRequest httpservletrequest, HttpServletResponse httpservletresponse)
        throws ServletException, IOException
    {
        try
        {
          //  Class.forName("oracle.jdbc.driver.OracleDriver");
          //  con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "ojasvi");
            con=ConnectionProvider.getConnection();
            st = con.createStatement();
            scon = getServletContext();
            HttpSession httpsession = httpservletrequest.getSession(true);
            uname = httpsession.getValue("name").toString();
            ServletOutputStream servletoutputstream = httpservletresponse.getOutputStream();
            servletoutputstream.println("<html><head><title>Welcome to Intra-Organization Communication System</title>");
            servletoutputstream.println("<link rel=\"stylesheet\" type=\"text/css\" href=\"chat.css\"></head>");
                 
            servletoutputstream.println("<body>");
            servletoutputstream.println("<h1><center><b>welcome to news <div id='name'>"+ uname +"</div> </b></h1>");
            //ResultSet resultset1 = st.executeQuery("select * from news");
            //System.out.println( resultset1);
            //servletoutputstream.println("<br><br><br><br><h2><center>Sorry we are under construction! <form method=post action='Serv_Post' enctype='multipart/form-data'>Put the body code here</form>");
            servletoutputstream.println("<ul> </ul>");
            servletoutputstream.println("<input type='text' id=\"text\" name='news' placeholder='Type your updates to share with everyone!' class='poz'> ");
            servletoutputstream.println("<button id=\"button\" type=submit class='post' name='post'>POST</button>");
            servletoutputstream.println("<script type=\"text/javascript\" src=\"script.js\"></script></body></html>");

            
        }
        catch(Exception exception)
        {
            exception.printStackTrace();
        }
    }

	Connection con;
    Statement st;
    ServletContext scon;
    String uname;
}
