package ValidationPack;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.HashSet;
import java.util.Map;

import DataPage.Customer;

public class Validations{
//
//	public Validations(int mobno, String name, String email, LocalDate date) {
//		super(mobno, name, email, date);
//		// TODO Auto-generated constructor stub
//	}
//	
	LocalDate localDate=LocalDate.now();
	DateTimeFormatter formator=DateTimeFormatter.ofPattern("DD-MM-YYYY");
	String stringDate = localDate.format(formator);
	
	
	
	public static Customer ValidateInputs(int mobno,String name, String email, String date,HashSet<Customer>cust) {
		LocalDate d1=LocalDate.parse(date);
		
		return new Customer(mobno, name, email,d1);
		
	}
	
	public static LocalDate parsedate(String date)
	{
		return LocalDate.parse(date);
	}
}
