// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   Serv_Compose.java

import java.io.IOException;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.http.*;

import connect.ConnectionProvider;

public class Serv_Compose extends HttpServlet
{

    public Serv_Compose()
    {
        con = null;
        st = null;
        scon = null;
        rs = null;
        sos = null;
    }

    public void service(HttpServletRequest httpservletrequest, HttpServletResponse httpservletresponse)
        throws ServletException, IOException
    {
        try
        {
      //      Class.forName("oracle.jdbc.driver.OracleDriver");
      //      con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "ojasvi");

	con=ConnectionProvider.getConnection();

            st = con.createStatement();
            scon = getServletContext();
            String s = null;
            HttpSession httpsession = httpservletrequest.getSession(true);
            s = httpsession.getValue("name").toString();
            ServletOutputStream servletoutputstream = httpservletresponse.getOutputStream();
            servletoutputstream.println("<html><title>Intra Organization Communication System</title>");
            servletoutputstream.println("<body background='background.jpg' text=blue><center></center>");
            servletoutputstream.println("<pre>");
            servletoutputstream.println("<form name=form4 method=post action='Serv_Send' enctype='multipart/form-data'>");
            servletoutputstream.println("To                  :<input type=text name=to required><br>");
            servletoutputstream.println("Subject             :<input type=text name=subject value=''><br><br>");
            
            servletoutputstream.println("Upload Your File    :<input type='file' name='file'/>");
            
            servletoutputstream.println("<textarea name=maildata rows=10 cols=60></textarea><br>");
            servletoutputstream.println("<input type=submit name=submit1 value='SEND'><br>");
            rs = st.executeQuery("select actname,emailid from address where uname='" + s + "'");
            if(rs.next())
            {
                servletoutputstream.println("<SELECT name=se onclick=getName(value) style=\"LEFT: 400px; POSITION: absolute; TOP: 160px; BACKGROUND-COLOR:#b464ff;width:130px;FONT-WEIGHT:BOLD\"");
                servletoutputstream.println("SIZE=5 name=List1 value=\"List1\">");
                do
                    servletoutputstream.println("<OPTION value=" + rs.getString(2) + " >" + rs.getString(1) + "</OPTION>");
                while(rs.next());
                servletoutputstream.println("</SELECT>");
            }
            servletoutputstream.println("</form></body></html>");
            servletoutputstream.println("<script language=javascript>");
            servletoutputstream.println("function getName(Myname){");
            servletoutputstream.println("document.form4.to.value=Myname");
            servletoutputstream.println("}</script>");
        }
        catch(Exception exception)
        {
            exception.printStackTrace();
        }
    }

    Connection con;
    Statement st;
    ServletContext scon;
    ResultSet rs;
    ServletOutputStream sos;
}
