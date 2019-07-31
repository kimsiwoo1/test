package kr.or.ddit;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Hello extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html; charset=UTF-8"); //타입
		Date date = new Date();
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-DD-mm");
		PrintWriter pw = resp.getWriter(); //printWriter을 리턴함
		pw.write("<html>");
		pw.write("	<head>");
		pw.write("		<title>helloServlet</title>");
		pw.write("	</head>");
		pw.write("	<body>");
		pw.write("		<h1>hello, today : "+sdf.format(date) +"</h1>");
		pw.write("	</body>");
		pw.write("</html>");
	}
	}

