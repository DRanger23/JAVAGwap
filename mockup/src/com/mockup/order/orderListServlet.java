package com.mockup.order;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class orderListServlet extends HttpServlet {

	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		resp.setContentType("text/html;charset=utf-8");
		resp.setCharacterEncoding("UTF-8");
		PrintWriter out =resp.getWriter();
		out.println("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">");
		out.println("<html>");
		out.println("	<head>");
		out.println("		<title>���ڵ��������Ż�</title>");
		out.println("		<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">");
		out.println("		<meta name=\"description\" content=\"���ڵ��������Ż�\">");
		out.println("		<link href=\"../../css/tarena.css\" rel=stylesheet>");
		out.println("	</head>");
		out.println("	<body topmargin=\"0\" leftmargin=\"0\" rightmargin=\"0\" bottommargin=\"0\">");
		out.println("<!-- Header Start -->");
		out.println("		<table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\" id=\"table2\">");
		out.println("			<tr>");
		out.println("				<td align=\"left\" width=\"7%\" background=\"images/top_bg.gif\"><img src=\"images/logo.gif\" width=\"286\" height=\"58\"></td>");
		out.println("				<td width=\"62%\" background=\"images/top_bg.gif\">��</td>");
		out.println("				<td width=\"31%\" background=\"images/top_bg.gif\" align=\"right\"><img src=\"images/top_r.gif\" width=\"352\" height=\"58\" border=\"0\"></td>");
		out.println("			</tr>");
		out.println("		</table>");
		out.println("		<table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">");
		out.println("			<tr>");
		out.println("				<td background=\"images/dh_bg.gif\" align=\"left\" height=\"12\">");
		out.println("					<table width=\"100\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\" align=\"center\">");
		out.println("						<tr>");
		out.println("							<td width=\"5%\"></td>");
		out.println("							");
		out.println("          <td width=\"10%\"><a href=\"productlist\"><img name=\"Image1\" border=\"0\" src=\"images/index.gif\" width=\"90\" height=\"36\"></a></td>");
		out.println("							");
		out.println("          <td width=\"10%\"><a href=\"usermanage\"><img name=\"Image2\" border=\"0\" src=\"images/reg.gif\" width=\"92\" height=\"36\"></a></td>");
		out.println("							");
		out.println("          <td width=\"10%\"><a href=\"shoppingcart\"><img name=\"Image4\" border=\"0\" src=\"images/cart.gif\" width=\"92\" height=\"36\"></a></td>");
		out.println("							");
		out.println("          <td width=\"10%\"><a href=\"orderlist\"><img name=\"Image5\" border=\"0\" src=\"images/order.gif\" width=\"92\" height=\"36\"></a></td>");
		out.println("							");
		out.println("          <td width=\"10%\"><a href=\"productlist\"><img name=\"Image6\" border=\"0\" src=\"images/exit.gif\" width=\"92\" height=\"36\"></a></td>");
		out.println("						</tr>");
		out.println("					</table>");
		out.println("				</td>");
		out.println("			</tr>");
		out.println("		</table>");
		out.println("		<table cellspacing=\"1\" cellpadding=\"3\" align=\"center\" border=\"0\" width=\"98%\">");
		out.println("			<tr>");
		out.println("				<td width=\"65%\"><br>");
		out.println("					>> ��ӭ���� <b>���ڵ��������Ż�</b>");
		out.println("				</td>");
		out.println("				<td width=\"35%\" align=\"right\">");
		out.println("				</td>");
		out.println("			</tr>");
		out.println("		</table>");
		out.println("<!-- Header End -->");
		out.println("<!-- Body Start -->");
		out.println("		<table cellspacing=\"1\" cellpadding=\"3\" align=\"center\" class=\"tableBorder2\">");
		out.println("			<tr>");
		out.println("				<td height=\"25\" valign=\"middle\">");
		out.println("					<img src=\"images/Forum_nav.gif\" align=\"absmiddle\">");
		out.println("					<a href=../../index.jsp>���ڵ��������Ż�</a> ��<img border=\"0\" src=\"images/dog.gif\" width=\"19\" height=\"18\"> �����б�");
		out.println("				</td>");
		out.println("			</tr>");
		out.println("		</table>");
		out.println("		<br>");
		out.println("		<table cellpadding=\"3\" cellspacing=\"1\" align=\"center\" class=\"tableborder1\">");
		out.println("			<tr>");
		out.println("				<td valign=middle align=center height=25 background=\"images/bg2.gif\"><font color=\"#ffffff\"><b>���</b></font></td>");
		out.println("				<td valign=middle align=center height=25 background=\"images/bg2.gif\"><font color=\"#ffffff\"><b>�������</b></font></td>");
		out.println("				<td valign=middle align=center height=25 background=\"images/bg2.gif\"><font color=\"#ffffff\"><b>�������</b></font></td>");
		out.println("				<td valign=middle align=center height=25 background=\"images/bg2.gif\"><font color=\"#ffffff\"><b>����״̬</b></font></td>");
		out.println("				<td valign=middle align=center height=25 background=\"images/bg2.gif\"><font color=\"#ffffff\"><b>���ʽ</b></font></td>");
		out.println("				<td valign=middle align=center height=25 background=\"images/bg2.gif\"><font color=\"#ffffff\"><b>����</b></font></td>");
		out.println("			</tr>");
		out.println("			<tr>");
		out.println("				<td class=tablebody2 valign=middle align=center>1</td>");
		out.println("				<td class=tablebody1 valign=middle>&nbsp;&nbsp;<a href=\"orderdetail\">389</a></td>");
		out.println("				<td class=tablebody2 valign=middle align=left>&nbsp;&nbsp;��59.0</td>");
		out.println("				<td class=tablebody1 valign=middle align=center>pending</td>");
		out.println("				<td class=tablebody2 valign=middle align=left>&nbsp;&nbsp;�������� </td>");
		out.println("				<td class=tablebody1 valign=middle align=center>");
		out.println("					<input type=\"button\" value=\"ɾ��\" onclick=\"javascript:window.location='orderlist';\">&nbsp;");
		out.println("					<input type=\"button\" value=\"��ϸ\" onclick=\"javascript:window.location='orderdetail';\">");
		out.println("				</td>");
		out.println("			</tr>");
		out.println("			<tr>");
		out.println("				<td class=tablebody2 valign=middle align=center>2</td>");
		out.println("				<td class=tablebody1 valign=middle>&nbsp;&nbsp;<a href=\"orderdetail\">389</a></td>");
		out.println("				<td class=tablebody2 valign=middle align=left>&nbsp;&nbsp;��137.0</td>");
		out.println("				<td class=tablebody1 valign=middle align=center>pending</td>");
		out.println("				<td class=tablebody2 valign=middle align=left>&nbsp;&nbsp;�ʾֻ�� </td>");
		out.println("				<td class=tablebody1 valign=middle align=center>");
		out.println("					<input type=\"button\" value=\"ɾ��\" onclick=\"javascript:window.location='orderlist';\">&nbsp;");
		out.println("					<input type=\"button\" value=\"��ϸ\" onclick=\"javascript:window.location='orderdetail';\">");
		out.println("				</td>");
		out.println("			</tr>");
		out.println("		</table>");
		out.println("		<br>");
		out.println("<!-- Body End -->");
		out.println("<!-- Footer Start -->");
		out.println("		<table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\" align=\"center\" height=\"28\">");
		out.println("			<tr>");
		out.println("				<td height=\"17\" background=\"images/bot_bg.gif\">");
		out.println("				</td>");
		out.println("			</tr>");
		out.println("		</table>");
		out.println("		<table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\" align=\"center\">");
		out.println("			<tr>");
		out.println("				<td bgcolor=\"#f1f1f6\" height=\"53\" valign=\"center\">");
		out.println("					<p align=\"center\">");
		out.println("						Copyright &copy;2004 - 2005 <a href=\"http://www.tarena.com.cn\"><b>Tarena</b><font color=\"red\">.com.cn</font></a>");
		out.println("					</p>");
		out.println("				</td>");
		out.println("			</tr>");
		out.println("		</table>");
		out.println("<!-- Footer End -->");
		out.println("	</body>");
		out.println("</html>");
		out.close();
		 
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doPost(req, resp);
	}

}
