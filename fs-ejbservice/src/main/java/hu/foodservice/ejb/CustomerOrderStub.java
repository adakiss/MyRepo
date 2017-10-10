package hu.foodservice.ejb;

import java.util.Date;

public class CustomerOrderStub {

	private String orderCode;
	
	private CustomerStub buyer;
	
	private MenuStub orderedMenu;
	
	private Date deadLine;

	public String getOrderCode() {
		return orderCode;
	}

	public void setOrderCode(String orderCode) {
		this.orderCode = orderCode;
	}

	public CustomerStub getBuyer() {
		return buyer;
	}

	public void setBuyer(CustomerStub buyer) {
		this.buyer = buyer;
	}

	public MenuStub getOrderedMenu() {
		return orderedMenu;
	}

	public void setOrderedMenu(MenuStub orderedMenu) {
		this.orderedMenu = orderedMenu;
	}

	public Date getDeadLine() {
		return deadLine;
	}

	public void setDeadLine(Date deadLine) {
		this.deadLine = deadLine;
	}
	
	

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Order code: " + this.orderCode + ", " + this.buyer.getCustName() + ", " + this.orderedMenu.getMenuName() + ", " + this.deadLine.toString(); 
	}
	
}
