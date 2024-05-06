package DataPage;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

import static ValidationPack.Validations.*;



public class Utils {
	public static Set<Customer> populateList() 
	{
		Set<Customer>cust=new HashSet<>();
	
		//parsedate()
		
		//(int mobno, String name, String email, LocalDate date)
 	Customer a = new Customer(123,"dinaries","din@",parsedate("12-09-1999"));
 	Customer b=new Customer(222, "lagartha ", "lag@ ",parsedate("11-08-1999"));
 	Customer c=new Customer(333, " johnsnow ", "john@ ",parsedate("15-05-1998"));
 	Customer d=new Customer(444, " ragner ", "rag@ ",parsedate("17-08-1997"));
 	cust.add(a);
 	cust.add(b);
 	cust.add(c);
 	cust.add(d);
 	
 	
 	
 	return cust;
 	
	
	}

	private static LocalDate parsedate(String date) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
