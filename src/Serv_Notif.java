// disscussion code here.

import java.io.IOException;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.http.*;

import connect.ConnectionProvider;

public class Serv_Notif extends HttpServlet
{

    public Serv_Notif()
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
            servletoutputstream.println("<html><head><title>Welcome to Intra-Organization communication System</title></head>");
            servletoutputstream.println("<body bgcolor=white background='INDTEXTB.JPG' text=blue> <pre>");
            
            servletoutputstream.println("</body></html>");
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