// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   Serv_List.java

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.*;
import javax.servlet.http.*;

import connect.ConnectionProvider;

public class Serv_List extends HttpServlet
{

    public Serv_List()
    {
        scon = null;
        newfol = null;
        f1 = null;
        uname = null;
        sub = null;
        from = null;
        date1 = null;
        folder = null;
    }
    
    public void init()
	{
		con = ConnectionProvider.getConnection();
		try {
			st=con.createStatement();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

    public void service(HttpServletRequest httpservletrequest, HttpServletResponse httpservletresponse)
        throws ServletException, IOException
    {
        try
        {	//st.executeQuery("delete from message");
            scon = getServletContext();
            HttpSession httpsession = httpservletrequest.getSession(true);
            uname = httpsession.getValue("name").toString();
           // uname=(String) httpsession.getAttribute("uname");
            httpsession.setAttribute("uname", uname);
            ServletOutputStream servletoutputstream = httpservletresponse.getOutputStream();
            servletoutputstream.println("<html><head><title>Welcome To Intra-Organization communication System</title><!--mstheme-->");
            servletoutputstream.println("<meta name=Microsoft Theme content=copy-of-industrial 1111><link rel=\"stylesheet\" type=\"text/css\" href=\"style2.css\">");
            servletoutputstream.println("</head><body background='left_back.jpg' Topmargin=0><!--table cellpadding=16 align=center-->");
           
            servletoutputstream.println("<center><div class='myStyle'><pre><i><b><a href=Serv_NewFolder target=in2><img src='notif1.png'></div></a>");
            servletoutputstream.println("<div class='myStyle'><a href=Serv_Inbox target=in2><img src='ims%20images/inbox.png'></a></div>");
            servletoutputstream.println("<div class='myStyle'><a href=Serv_Compose target=in2><img src='ims%20images/compose.png'></div></a><font color=#FFFFFF></font><i><b>");
            servletoutputstream.println("<div class='myStyle'><a href=Serv_Option target=in2><img src='ims%20images/options.png'></a></div><font color=#FFFFFF></font><br>");
            servletoutputstream.println("<div class='myStyle'><pre><i><b><a href=Serv_Logout target=_parent><img src='ims%20images/logout.png'></a></div></pre></center>");
            //servletoutputstream.println("<a href=Serv_C1 target=in1><img src='ims%20images/startchat.jpg' border=0 width=100 height=100></a>");
            //servletoutputstream.println("<a href=Serv_C target=in2><img src='ims%20images/chatbox.jpg' border=0 width=100 height=100></a>");
        }
        catch(Exception exception)
        {
            exception.printStackTrace();
        }
    }

    ServletContext scon;
    String newfol;
    String f1;
    String uname;
    String sub;
    String from;
    String date1;
    String folder;
    Connection con;
    Statement st;
}
