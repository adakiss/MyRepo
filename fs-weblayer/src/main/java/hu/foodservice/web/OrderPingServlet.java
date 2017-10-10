package hu.foodservice.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import hu.foodservice.ejb.CustomerOrderStub;
import hu.foodservice.ejb.OrderFacade;

@WebServlet("/OrderPing")
public class OrderPingServlet extends HttpServlet {
	
	@EJB
	OrderFacade facade;

	@Override
	protected void doGet(HttpServletRequest arg0, HttpServletResponse arg1) throws ServletException, IOException {
		// TODO Auto-generated method stub
		CustomerOrderStub custOrder = this.facade.getCustomerOrder("A0000001");
		
		arg1.setCharacterEncoding("UTF-8");
		PrintWriter out = arg1.getWriter();
		out.println(custOrder.toString());
		out.close();
	}
	
	
	
}
