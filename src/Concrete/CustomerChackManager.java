package Concrete;

import Abstract.ICustomerCheckService;
import Entities.Customer;

public class CustomerChackManager implements ICustomerCheckService {

	@Override
	public boolean checkCIfRealPerson(Customer customer) {
		System.out.printf("Kullancı doğrulanamadı!!!");
		return false;
	}

}
