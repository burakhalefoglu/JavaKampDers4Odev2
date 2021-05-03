package Concrete;
import Abstract.BaseOrderManager;
import Abstract.IRewardService;
import Entities.Customer;
import Entities.Order;


public class StarbucksOrderManager extends BaseOrderManager{
	
	IRewardService _rewardService;
	
	public StarbucksOrderManager(IRewardService _rewardService) {
		super();
		this._rewardService = _rewardService;
	}

	public void addOrder(Customer customer, Order order) {
			
			_rewardService.addStar(customer);
			super.addOrder(customer, order);
		}
	
}
