package com.mockup.product;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mockup.product.pojo.*;
import com.mockup.product.service.*;
import com.mockup.product.service.impl.*;

public class productListServlet extends HttpServlet {

	@Override
	
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		try{
			productServiceimpl productservice = new productServiceimpl();
			
			List productList = productservice.getproductList();

			toproductList(resp, productList);
		} catch (Exception e){
			toError(resp,e.getMessage());
		}
		
	}
	
	private void toError(HttpServletResponse resp, String message) throws IOException {
		PrintWriter out = resp.getWriter();
		
		out.println("<html>");
		out.println("<head>");
		out.println("	<title>Error</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("	<h2 align=\"center\">Error</h2>");
		out.println("	<hr>");
		out.println("	System Error," + message + "!");
		out.println("</body>");
		out.println("</html>");
		
		out.close();
	}
	
	private void toproductList(HttpServletResponse resp, List productList)
			throws IOException {
		PrintWriter out = resp.getWriter();
		resp.setContentType("text/html;charset=utf-8");
		resp.setCharacterEncoding("UTF-8");
		PrintWriter out1=resp.getWriter();
		out1.println("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">");
		out1.println("<html>");
		out1.println("	<head>");
		out1.println("		<title>达内电子商务门户</title>");
		out1.println("		<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\">");
		out1.println("		<meta name=\"description\" content=\"达内电子商务门户\">");
		out1.println("		<link href=\"../../css/tarena.css\" rel=stylesheet>");
		out1.println("	</head>");
		out1.println("	<body topmargin=\"0\" leftmargin=\"0\" rightmargin=\"0\" bottommargin=\"0\">");
		out1.println("<!-- Header Start -->");
		out1.println("		<table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\" id=\"table2\">");
		out1.println("			<tr>");
		out1.println("				<td align=\"left\" width=\"7%\" background=\"images/top_bg.gif\"><img src=\"images/logo.gif\" width=\"286\" height=\"58\"></td>");
		out1.println("				<td width=\"62%\" background=\"images/top_bg.gif\">　</td>");
		out1.println("				<td width=\"31%\" background=\"images/top_bg.gif\" align=\"right\"><img src=\"images/top_r.gif\" width=\"352\" height=\"58\" border=\"0\"></td>");
		out1.println("			</tr>");
		out1.println("		</table>");
		out1.println("		<table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">");
		out1.println("			<tr>");
		out1.println("				<td background=\"images/dh_bg.gif\" align=\"left\" height=\"12\">");
		out1.println("					<table width=\"100\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\" align=\"center\">");
		out1.println("						<tr>");
		out1.println("							<td width=\"5%\"></td>");
		out1.println("							");
		out1.println("          <td width=\"10%\"><a href=\"productlist\"><img name=\"Image1\" border=\"0\" src=\"images/index.gif\" width=\"90\" height=\"36\"></a></td>");
		out1.println("							");
		out1.println("          <td width=\"10%\"><a href=\"usermanage\"><img name=\"Image2\" border=\"0\" src=\"images/reg.gif\" width=\"92\" height=\"36\"></a></td>");
		out1.println("							");
		out1.println("          <td width=\"10%\"><a href=\"shoppingcart\"><img name=\"Image4\" border=\"0\" src=\"images/cart.gif\" width=\"92\" height=\"36\"></a></td>");
		out1.println("							");
		out1.println("          <td width=\"10%\"><a href=\"orderlist\"><img name=\"Image5\" border=\"0\" src=\"images/order.gif\" width=\"92\" height=\"36\"></a></td>");
		out1.println("							");
		out1.println("          <td width=\"10%\"><a href=\"productlist\"><img name=\"Image6\" border=\"0\" src=\"images/exit.gif\" width=\"92\" height=\"36\"></a></td>");
		out1.println("						</tr>");
		out1.println("					</table>");
		out1.println("				</td>");
		out1.println("			</tr>");
		out1.println("		</table>");
		out1.println("		<table cellspacing=\"1\" cellpadding=\"3\" align=\"center\" border=\"0\" width=\"98%\">");
		out1.println("			<tr>");
		out1.println("				<td width=\"65%\"><br>");
		out1.println("					>> 欢迎访问 <b>达内电子商务门户</b>");
		out1.println("				</td>");
		out1.println("				<td width=\"35%\" align=\"right\">");
		out1.println("				</td>");
		out1.println("			</tr>");
		out1.println("		</table>");
		out1.println("<!-- Header End -->");
		out1.println("<!-- Body Start -->");
		out1.println("		<table cellspacing=\"1\" cellpadding=\"3\" align=\"center\" class=\"tableBorder2\">");
		out1.println("			<tr>");
		out1.println("				<td height=\"25\" valign=\"middle\">");
		out1.println("					<img src=\"images/Forum_nav.gif\" align=\"absmiddle\">");
		out1.println("					<a href=../../index.jsp>达内电子商务门户</a> →<img border=\"0\" src=\"images/dog.gif\" width=\"19\" height=\"18\">欢迎<font color=\"red\">admin</font>光临！");
		out1.println("				</td>");
		out1.println("			</tr>");
		out1.println("		</table>");
		out1.println("		<br>");
		out1.println("		<table cellpadding=\"3\" cellspacing=\"1\" align=\"center\" class=\"tableborder1\">");
		out1.println("			<tr>");
		out1.println("				<td valign=\"middle\" align=\"center\" height=\"25\" background=\"images/bg2.gif\" width=\"8%\">");
		out1.println("					<font color=\"#ffffff\">");
		out1.println("						<b>序号</b>");
		out1.println("					</font>");
		out1.println("				</td>");
		out1.println("				<td valign=\"middle\" align=\"center\" height=\"25\" background=\"images/bg2.gif\" width=\"60%\">");
		out1.println("					<font color=\"#ffffff\">");
		out1.println("						<b>产品名称</b>");
		out1.println("					</font>");
		out1.println("				</td>");
		out1.println("				<td valign=\"middle\" align=\"center\" height=\"25\" background=\"images/bg2.gif\" width=\"8%\">");
		out1.println("					<font color=\"#ffffff\">");
		out1.println("						<b>价格</b>");
		out1.println("					</font>");
		out1.println("				</td>");
		out1.println("				<td valign=\"middle\" align=\"center\" height=\"25\" background=\"images/bg2.gif\" width=\"24%\">");
		out1.println("					<font color=\"#ffffff\">");
		out1.println("						<b>操作</b>");
		out1.println("					</font>");
		out1.println("				</td>");
		out1.println("			</tr>");
		for(Iterator<product> it = productList.iterator();it.hasNext();){
			product product = it.next();
		out1.println("			<tr>");
		out1.println("				<td class=tablebody2 valign=\"middle\" align=\"center\" width=\"8%\">");
		out1.println("					+ product.getProductid() +");
		out1.println("				</td>");
		out1.println("				");
		out1.println("    <td class=tablebody1 valign=\"middle\" width=\"60%\"> &nbsp;&nbsp;<a href=\"productdetail\">+ product.getname() +</a> ");
		out1.println("    </td>");
		out1.println("				<td class=tablebody2 valign=\"middle\" align=\"center\" width=\"8%\">");
		out1.println("					+ product.getBasePrice() +");
		out1.println("				</td>");
		out1.println("				");
		out1.println("    <td class=tablebody1 valign=\"middle\" align=\"center\" width=\"24%\"> <a href=\"shoppingcart\"><img border=\"0\" src=\"images/car_new.gif\" width=\"97\" height=\"18\"></a> ");
		out1.println("    </td>");
		out1.println("			</tr>");
		out1.println("		</table>");
		out1.println("<!-- Body End -->");
		out1.println("<!-- Footer Start -->");
		out1.println("		<table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\" align=\"center\" height=\"28\">");
		out1.println("			<tr>");
		out1.println("				<td height=\"17\" background=\"images/bot_bg.gif\">");
		out1.println("				</td>");
		out1.println("			</tr>");
		out1.println("		</table>");
		out1.println("		<table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\" align=\"center\">");
		out1.println("			<tr>");
		out1.println("				<td bgcolor=\"#f1f1f6\" height=\"53\" valign=\"center\">");
		out1.println("					<p align=\"center\">");
		out1.println("						Copyright &copy;2004 - 2005 <a href=\"http://www.tarena.com.cn\"><b>Tarena</b><font color=\"red\">.com.cn</font></a>");
		out1.println("					</p>");
		out1.println("				</td>");
		out1.println("			</tr>");
		out1.println("		</table>");
		out1.println("<!-- Footer End -->");
		out1.println("	</body>");
		out1.println("</html>");}
	}

	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		/*resp.setContentType("text/html;charset=utf-8");
		resp.setCharacterEncoding("UTF-8");
		PrintWriter out=resp.getWriter();
		out.println("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">");
		out.println("<html>");
		out.println("	<head>");
		out.println("		<title>达内电子商务门户</title>");
		out.println("		<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\">");
		out.println("		<meta name=\"description\" content=\"达内电子商务门户\">");
		out.println("		<link href=\"../../css/tarena.css\" rel=stylesheet>");
		out.println("	</head>");
		out.println("	<body topmargin=\"0\" leftmargin=\"0\" rightmargin=\"0\" bottommargin=\"0\">");
		out.println("<!-- Header Start -->");
		out.println("		<table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\" id=\"table2\">");
		out.println("			<tr>");
		out.println("				<td align=\"left\" width=\"7%\" background=\"images/top_bg.gif\"><img src=\"images/logo.gif\" width=\"286\" height=\"58\"></td>");
		out.println("				<td width=\"62%\" background=\"images/top_bg.gif\">　</td>");
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
		out.println("					>> 欢迎访问 <b>达内电子商务门户</b>");
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
		out.println("					<a href=../../index.jsp>达内电子商务门户</a> →<img border=\"0\" src=\"images/dog.gif\" width=\"19\" height=\"18\">欢迎<font color=\"red\">admin</font>光临！");
		out.println("				</td>");
		out.println("			</tr>");
		out.println("		</table>");
		out.println("		<br>");
		out.println("		<table cellpadding=\"3\" cellspacing=\"1\" align=\"center\" class=\"tableborder1\">");
		out.println("			<tr>");
		out.println("				<td valign=\"middle\" align=\"center\" height=\"25\" background=\"images/bg2.gif\" width=\"8%\">");
		out.println("					<font color=\"#ffffff\">");
		out.println("						<b>序号</b>");
		out.println("					</font>");
		out.println("				</td>");
		out.println("				<td valign=\"middle\" align=\"center\" height=\"25\" background=\"images/bg2.gif\" width=\"60%\">");
		out.println("					<font color=\"#ffffff\">");
		out.println("						<b>产品名称</b>");
		out.println("					</font>");
		out.println("				</td>");
		out.println("				<td valign=\"middle\" align=\"center\" height=\"25\" background=\"images/bg2.gif\" width=\"8%\">");
		out.println("					<font color=\"#ffffff\">");
		out.println("						<b>价格</b>");
		out.println("					</font>");
		out.println("				</td>");
		out.println("				<td valign=\"middle\" align=\"center\" height=\"25\" background=\"images/bg2.gif\" width=\"24%\">");
		out.println("					<font color=\"#ffffff\">");
		out.println("						<b>操作</b>");
		out.println("					</font>");
		out.println("				</td>");
		out.println("			</tr>");
		out.println("			<tr>");
		out.println("				<td class=tablebody2 valign=\"middle\" align=\"center\" width=\"8%\">");
		out.println("					1");
		out.println("				</td>");
		out.println("				");
		out.println("    <td class=tablebody1 valign=\"middle\" width=\"60%\"> &nbsp;&nbsp;<a href=\"productdetail\">精通Hibernate：Java对象持久化技术详解</a> ");
		out.println("    </td>");
		out.println("				<td class=tablebody2 valign=\"middle\" align=\"center\" width=\"8%\">");
		out.println("					59.0");
		out.println("				</td>");
		out.println("				");
		out.println("    <td class=tablebody1 valign=\"middle\" align=\"center\" width=\"24%\"> <a href=\"shoppingcart\"><img border=\"0\" src=\"images/car_new.gif\" width=\"97\" height=\"18\"></a> ");
		out.println("    </td>");
		out.println("			</tr>   ");
		out.println("			<tr>");
		out.println("				<td class=tablebody2 valign=\"middle\" align=\"center\" width=\"8%\">");
		out.println("					2");
		out.println("				</td>");
		out.println("				");
		out.println("    <td class=tablebody1 valign=\"middle\" width=\"60%\"> &nbsp;&nbsp;<a href=\"productdetail\">Effective ");
		out.println("      Java中文版</a> </td>");
		out.println("				<td class=tablebody2 valign=\"middle\" align=\"center\" width=\"8%\">");
		out.println("					39.0");
		out.println("				</td>");
		out.println("				");
		out.println("    <td class=tablebody1 valign=\"middle\" align=\"center\" width=\"24%\"> <a href=\"shoppingcart\"><img border=\"0\" src=\"images/car_new.gif\" width=\"97\" height=\"18\"></a> ");
		out.println("    </td>");
		out.println("			</tr>");
		out.println("			<tr>");
		out.println("				<td class=tablebody2 valign=\"middle\" align=\"center\" width=\"8%\">");
		out.println("					3");
		out.println("				</td>");
		out.println("				");
		out.println("    <td class=tablebody1 valign=\"middle\" width=\"60%\"> &nbsp;&nbsp;<a href=\"productdetail\">精通Spring</a> ");
		out.println("    </td>");
		out.println("				<td class=tablebody2 valign=\"middle\" align=\"center\" width=\"8%\">");
		out.println("					39.0");
		out.println("				</td>");
		out.println("				");
		out.println("    <td class=tablebody1 valign=\"middle\" align=\"center\" width=\"24%\"> <a href=\"shoppingcart\"><img border=\"0\" src=\"images/car_new.gif\" width=\"97\" height=\"18\"></a> ");
		out.println("    </td>");
		out.println("			</tr>");
		out.println("			<tr>");
		out.println("				<td class=tablebody2 valign=\"middle\" align=\"center\" width=\"8%\">");
		out.println("					4");
		out.println("				</td>");
		out.println("				");
		out.println("    <td class=tablebody1 valign=\"middle\" width=\"60%\"> &nbsp;&nbsp;<a href=\"productdetail\">深入浅出Hibernate</a> ");
		out.println("    </td>");
		out.println("				<td class=tablebody2 valign=\"middle\" align=\"center\" width=\"8%\">");
		out.println("					59.0");
		out.println("				</td>");
		out.println("				");
		out.println("    <td class=tablebody1 valign=\"middle\" align=\"center\" width=\"24%\"> <a href=\"shoppingcart\"><img border=\"0\" src=\"images/car_new.gif\" width=\"97\" height=\"18\"></a> ");
		out.println("    </td>");
		out.println("			</tr>");
		out.println("			<tr>");
		out.println("				<td class=tablebody2 valign=\"middle\" align=\"center\" width=\"8%\">");
		out.println("					5");
		out.println("				</td>");
		out.println("				");
		out.println("    <td class=tablebody1 valign=\"middle\" width=\"60%\"> &nbsp;&nbsp;<a href=\"productdetail\">JAVA编程思想：第3版</a> ");
		out.println("    </td>");
		out.println("				<td class=tablebody2 valign=\"middle\" align=\"center\" width=\"8%\">");
		out.println("					95.0");
		out.println("				</td>");
		out.println("				");
		out.println("    <td class=tablebody1 valign=\"middle\" align=\"center\" width=\"24%\"> <a href=\"shoppingcart\"><img border=\"0\" src=\"images/car_new.gif\" width=\"97\" height=\"18\"></a> ");
		out.println("    </td>");
		out.println("			</tr>");
		out.println("			<tr>");
		out.println("				<td class=tablebody2 valign=\"middle\" align=\"center\" width=\"8%\">");
		out.println("					6");
		out.println("				</td>");
		out.println("				");
		out.println("    <td class=tablebody1 valign=\"middle\" width=\"60%\"> &nbsp;&nbsp;<a href=\"productdetail\">Java ");
		out.println("      2核心技术（第6版） 卷I：基础知识 </a> </td>");
		out.println("				<td class=tablebody2 valign=\"middle\" align=\"center\" width=\"8%\">");
		out.println("					75.0");
		out.println("				</td>");
		out.println("				");
		out.println("    <td class=tablebody1 valign=\"middle\" align=\"center\" width=\"24%\"> <a href=\"shoppingcart\"><img border=\"0\" src=\"images/car_new.gif\" width=\"97\" height=\"18\"></a> ");
		out.println("    </td>");
		out.println("			</tr>");
		out.println("			<tr>");
		out.println("				<td class=tablebody2 valign=\"middle\" align=\"center\" width=\"8%\">");
		out.println("					7");
		out.println("				</td>");
		out.println("				");
		out.println("    <td class=tablebody1 valign=\"middle\" width=\"60%\"> &nbsp;&nbsp;<a href=\"productdetail\">Tomcat与Java ");
		out.println("      Web开发技术详解</a> </td>");
		out.println("				<td class=tablebody2 valign=\"middle\" align=\"center\" width=\"8%\">");
		out.println("					45.0");
		out.println("				</td>");
		out.println("				");
		out.println("    <td class=tablebody1 valign=\"middle\" align=\"center\" width=\"24%\"> <a href=\"shoppingcart\"><img border=\"0\" src=\"images/car_new.gif\" width=\"97\" height=\"18\"></a> ");
		out.println("    </td>");
		out.println("			</tr> ");
		out.println("			<tr>");
		out.println("				<td class=tablebody2 valign=\"middle\" align=\"center\" width=\"8%\">");
		out.println("					8");
		out.println("				</td>");
		out.println("				");
		out.println("    <td class=tablebody1 valign=\"middle\" width=\"60%\"> &nbsp;&nbsp;<a href=\"productdetail\">Java与模式</a> ");
		out.println("    </td>");
		out.println("				<td class=tablebody2 valign=\"middle\" align=\"center\" width=\"8%\">");
		out.println("					88.0");
		out.println("				</td>");
		out.println("				");
		out.println("    <td class=tablebody1 valign=\"middle\" align=\"center\" width=\"24%\"> <a href=\"shoppingcart\"><img border=\"0\" src=\"images/car_new.gif\" width=\"97\" height=\"18\"></a> ");
		out.println("    </td>");
		out.println("			</tr>");
		out.println("		</table>");
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
		out.println("</html>");*/
	}

}
