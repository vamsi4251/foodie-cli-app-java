import com.exemple.foodiecli.repository.CustomerRepository;


public class Main {

	public static void main(String[] args) {
		
		CustomerRepository cr = new CustomerRepository();
		System.out.println(cr.getAllCustomers());
	}

}
