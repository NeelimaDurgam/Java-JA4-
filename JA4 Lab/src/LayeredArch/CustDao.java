package LayeredArch;
import java.util.List;

public class CustDao {
	
	List<Customer> listCust;
	public List<Customer> addCustomer(List<Customer> listCust){
		this.listCust=listCust;
		return listCust;
	}
	
	public List<Customer> listAll(){
		return listCust;
	}

}
