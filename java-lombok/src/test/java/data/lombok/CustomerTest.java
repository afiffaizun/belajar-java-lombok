package data.lombok;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CustomerTest {
	
	@Test
	void testCustomer() {
		var customer = new Customer();
		customer.setId("200");
		customer.setName("Afif");
		
		System.out.println(customer.getId());
		System.out.println(customer.getName());
		
	}
	
	@Test
	void testCustomerConstructor() {
		
		var customer = new Customer("ID", "NAME");
		Assertions.assertEquals("ID", customer.getId());
		Assertions.assertEquals("NAME", customer.getName());
	}
	
	@Test
	void testEquals() {
		
		var customer1 = new Customer("ID", "NAME");
		var customer2 = new Customer("ID", "NAME");
		
		Assertions.assertEquals(customer1, customer2);
		Assertions.assertEquals(customer1.hashCode(), customer2.hashCode());
	}
}
