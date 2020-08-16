import java.io.IOException;
import java.io.PrintStream;
import java.sql.*;
import java.util.Date;
import java.util.StringTokenizer;
import javax.servlet.*;
import javax.servlet.http.*;

import com.oreilly.servlet.MultipartRequest;

import connect.ConnectionProvider;

public class Serv_Post extends HttpServlet
{

    public Serv_Post()
    {
        stmt = null;
        st1 = null;
        st2 = null;
        st3 = null;
        con = null;
        rs = null;
        rs1 = null;
        scon = null;
        sos = null;
        mfrom = null;
        flag = true;
        str1 = null;
        mdate = "";
    }

    public void service(HttpServletRequest httpservletrequest, HttpServletResponse httpservletresponse)
        throws ServletException, IOException
    {
        try
        {
           System.out.println("Driver Loaded");
	        con=ConnectionProvider.getConnection();
            System.out.println("Connection created");
            stmt = con.createStatement();
            scon = getServletContext();
            HttpSession httpsession = httpservletrequest.getSession(true);
            mfrom = httpsession.getValue("name").toString();
            ServletOutputStream servletoutputstream = httpservletresponse.getOutputStream();
            String path=scon.getRealPath("attachment");
            MultipartRequest mpr=new MultipartRequest(httpservletrequest,path,500*1024*1024);
           
			System.out.println("File uploaded successffully");

			String fname=mpr.getOriginalFileName("file");

			path =path+"\\"+fname;

			System.out.println("Attached file "+path);
			
			httpsession.setAttribute("attach",fname);

			System.out.println("attached file setted into the session");
        
            String s1 = mpr.getParameter("news");
            StringTokenizer stringtokenizer = new StringTokenizer(s1, ",");
            
            mdate = String.valueOf(new Date());

            while(stringtokenizer.hasMoreTokens()) 
            {
                str1 = "";
                i++;
                st3 = con.createStatement();
                System.out.println("news successful");
                int k = st3.executeUpdate("insert into news values(" + mfrom + ",'" + s1 + "','" + mdate + ")");
                if(k > 0)
                    servletoutputstream.println("<html><head><link rel=\"stylesheet\" type=\"text/css\" href=\"back.css\"></head><body>");
                st3.close();
                servletoutputstream.println("<input type='text' id=\"text\" name='news' placeholder='Type your updates to share with everyone!' class='poz'>");
            servletoutputstream.println("<button id=\"button\" type=submit class='post' name='post'>POST</button>");
            servletoutputstream.println("<script type=\"text/javascript\" src=\"script.js\"></script></body></html>");
            }
        }
        catch(Exception exception)
        {
            exception.printStackTrace();
        }
    }
int ml=0;
		String mch=null;

	HttpSession session;
    Statement stmt;
    Statement st1;
    Statement st2;
    Statement st3;
    Connection con;
    ResultSet rs;
    ResultSet rs1;
    int i;
    ServletContext scon;
    ServletOutputStream sos;
    boolean bool;
    String mfrom;
    boolean flag;
    String str1;
    String mdate;
}
