package hu.foodservice.ejb;

import java.util.Date;

import javax.ejb.Stateless;

@Stateless(mappedName = "ejb/orderFacade")
public class OrderFacadeImpl implements OrderFacade {

	@Override
	public CustomerOrderStub getCustomerOrder(String orderCode) {
		
		CustomerStub cust = new CustomerStub();
		cust.setCustName("John Doe");
		cust.setCustAddress("1066, Budapest Teréz körút 58 fsz. 2");
		cust.setCustTelNumber(706225466);
		
		MenuStub menu = new MenuStub();
		
		Date date = new Date();
		
		CustomerOrderStub custOrder = new CustomerOrderStub();
		custOrder.setBuyer(cust);
		custOrder.setOrderedMenu(menu);
		custOrder.setDeadLine(date);
		custOrder.setOrderCode(orderCode);
		
		return custOrder;
	}

}
