package DataPage;

import java.util.Comparator;

public class CustomerDobComparator  implements Comparator<Customer>{

	@Override
	public int compare(Customer o1, Customer o2) {
		
		System.out.println(" inside the equals " );
		int retDate=o1.getDate().compareTo(o2.getDate());
		if(retDate==0);
		
		return o1.getName().compareTo(o2.getName());
	}

}
