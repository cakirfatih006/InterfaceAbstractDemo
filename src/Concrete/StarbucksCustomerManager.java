package Concrete;

import Abstract.BaseCustomerManager;
import Abstract.PersonCheckService;
import Entities.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager {

	private PersonCheckService personCheckService;

	
	@Override
	public void Save(Customer customer) {
		
		if (personCheckService.CheckIfRealPerson(customer)==true) {
			
		super.Save(customer);
		}
		
		else {
			
			System.out.println("geçerli bir kiþi deðil");
			
		}
		
	}

	
	
}
