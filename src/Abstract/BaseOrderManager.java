package Abstract;

import Entities.Customer;
import Entities.Order;

public abstract class BaseOrderManager {

	public void addOrder(Customer customer, Order order) {
		
		System.out.printf(customer.name + " müþterisinin " + order.Key + " no lu spariþi alýndý");
	}
	
}
