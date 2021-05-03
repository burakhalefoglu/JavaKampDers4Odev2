package Abstract;

import Entities.Customer;
import Entities.Order;

public abstract class BaseOrderManager {

	public void addOrder(Customer customer, Order order) {
		
		System.out.printf(customer.name + " m��terisinin " + order.Key + " no lu spari�i al�nd�");
	}
	
}
