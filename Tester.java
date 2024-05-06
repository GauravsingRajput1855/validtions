package DataPage;
import static DataPage.Utils.*;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

//import ValidationPack.Validations.*;
//import ValidationPack.Validations;
import static ValidationPack.Validations.*;
import static ValidationPack.Validations.ValidateInputs;

public class Tester {
	public static void main(String [] args )
	{
		try(Scanner sc=new Scanner(System.in))
		{
			HashSet<Customer> cust=new HashSet<Customer>();
			boolean flag=false;
			while(!flag)
			{
				try {
					System.out.println(" ");
					System.out.println(" ");
					System.out.println(" ");
					System.out.println(" ");
					System.out.println(" ");
					switch(sc.nextInt())
					{
					
					case 1:
//						System.out.println("Enter a/c details -  acctNo,  firstName,"
//
//								+ " lastName,  acType,  dob, creationDate, balance");
//						BankAccount acct = validateInputs(sc.nextInt(), sc.next(), sc.next(), sc.next(), sc.next(),
//								sc.next(), sc.nextDouble(), accounts);
//						// add acct ref to the List
//						accounts.put(acct.getAcctNo(), acct);
//						System.out.println("A/c created !");
//						break;
//						
						Set<Customer>custm=populateList();
						
						
						Customer custmr=ValidateInputs(sc.nextInt(),sc.next(),sc.next(),sc.next(),cust);
						cust.add(custmr.getName());
						System.out.println("account created ");
						
						break;
					case 2:
						
						for(Customer c: cust.)
							System.out.println(c);
						break;
					case 3:
						break;
					case 4:
						break;
					}
					
				
					
				}catch(Exception e)
				{
					e.printStackTrace();
					sc.next();
				}
			}
			
		}
	}

}
