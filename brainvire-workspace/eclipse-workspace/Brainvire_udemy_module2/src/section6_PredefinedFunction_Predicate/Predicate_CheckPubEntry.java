package section6_PredefinedFunction_Predicate;

class Customer
{
	int cust_age;
	String cust_name;
	boolean ishavingGF;
	
	public Customer(int cust_age, String cust_name, boolean ishavingGF) {
		
		this.cust_age = cust_age;
		this.cust_name = cust_name;
		this.ishavingGF = ishavingGF;
	}

	@Override
	public String toString() {
		return "Customer [cust_name = " + cust_name +"]";
	}
	
}

public class Predicate_CheckPubEntry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer [] list = {
				new Customer(21, "Swapnil Limgude", false),
				new Customer(22, "Narendra Borhade", true),
				new Customer(25, "Sahil Borhade", true),
				new Customer(30, "Devendra Shinde", true)
		};
		
		Predicate<Customer> predicate = c -> c.cust_age>=18 && c.ishavingGF==true;
		
		for(Customer c :list)
		{
			if(predicate.test(c))
			{
				System.out.println("Allowed :"+c);
			}
		}

	}

}
