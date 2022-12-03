package udemy;

public class CustomerRunner {

	public static void main(String[] args) {
		
		Address homeAddress = new Address("line 1 ", "Seoul ","500035");
		Customer customer = new Customer("yumi", homeAddress );
		
		Address workAddress = new Address("line 1 for work ", "Seoul"," 500055");
		customer.setWorkAddress(workAddress);

		System.out.println(customer);
		
	}

}
