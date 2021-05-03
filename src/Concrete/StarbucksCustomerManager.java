package Concrete;

import Abstract.BaseCustomerManager;
import Abstract.ICustomerCheckService;
import Entities.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager {

	ICustomerCheckService _customerCheckService;
	
	public StarbucksCustomerManager(ICustomerCheckService _customerCheckService) {
		super();
		this._customerCheckService = _customerCheckService;
	}
	
	public void add(Customer customer) {
		
		if(!_customerCheckService.checkCIfRealPerson(customer))
		{		
			System.out.printf("Kullanýcý doðrulanamadý!!!");
			return;
		}
		
		super.add(customer);

	}

	
}
