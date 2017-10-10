package hu.foodservice.ejb;

import javax.ejb.Local;

@Local
public interface OrderFacade {
	
	CustomerOrderStub getCustomerOrder(String orderCode);
	
}
