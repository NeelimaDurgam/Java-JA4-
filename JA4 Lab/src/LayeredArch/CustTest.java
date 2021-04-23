package LayeredArch;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CustTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Customer> cstList = new ArrayList<Customer>();
		while(true) {
			
			System.out.println("Enter id");
			int id = sc.nextInt();
			System.out.println("Enter name");
			String name = sc.next();
			System.out.println("Enter location");
			String loc = sc.next();
			System.out.println("Do you want to add more data y/n");
			String opt = sc.next();
			
			if(id != 0 && name != null && loc != null) {
				Customer cst = new Customer(id, name, loc);
				
				cstList.add(cst);
			}
			if(opt.contains("n")) {
				break;
			}
		}
		CustDao cdao =new CustDao();
		cdao.addCustomer(cstList);
		
		List<Customer> csList = cdao.listAll();
		for(Customer cst : csList) {
			System.out.println("Customer ID : "+ cst.getId()+ " Customer name : "+ cst.getName() + " Customer Location : " + cst.getLoc());
		}
	}
}
