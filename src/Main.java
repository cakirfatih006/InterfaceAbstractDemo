import java.time.LocalDate;

import Abstract.BaseCustomerManager;

import Concrete.NeroCustomerManager;
import Concrete.StarbucksCustomerManager;
import Entities.Customer;

public class Main {

	public static void main(String[] args) {
		
		Customer customer = new Customer(1, "fatih", "cakir", LocalDate.of(1995, 5, 5), "555");
		
		BaseCustomerManager baseCustomerManager = new NeroCustomerManager();
		baseCustomerManager.Save(customer);
		
		BaseCustomerManager baseCustomerManager2 = new StarbucksCustomerManager();
		baseCustomerManager2.Save(customer);
		
		System.out.println();
	}

}
