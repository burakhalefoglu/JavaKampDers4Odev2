package Concrete;

import Abstract.IRewardService;
import Entities.Customer;

public class StarbucksRewardManager implements IRewardService{

	@Override
	public void addStar(Customer customer) {
		System.out.printf("kupon eklendi...");
	}

}
