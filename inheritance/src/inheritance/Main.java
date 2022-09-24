package inheritance;

public class Main {

	public static void main(String[] args) {
		
		Customer customer=new Customer();
		customer.firtName="fýrat";
		Employee employee=new Employee();
		employee.firtName="okþak";
		
		EmployeeManager employeeManager=new EmployeeManager();
		CustomerManager customerManager=new CustomerManager();
		employeeManager.add(employee);
		customerManager.add(customer);

	}

}
