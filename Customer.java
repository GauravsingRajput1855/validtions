package DataPage;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Customer {
	private int mobno;
	private String name;
	private String email;
	private LocalDate  date;
	
	
	//---------------------------------------------------------------------------------------------
	
	public Customer(int mobno, String name, String email, LocalDate date) {
		super();
		this.mobno = mobno;
		this.name = name;
		this.email = email;
		this.date = date;
	}

	//--------------------------------------------------------------------------------------------------
	//------getters and setters ----------------------------------

	public int getMobno() {
		return mobno;
	}

	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}


	public void setMobno(int mobno) {
		this.mobno = mobno;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	
	
	//---equals method------------------------------------------------------------------------------------
	
	
	LocalDate localDate=LocalDate.now();
	DateTimeFormatter formator=DateTimeFormatter.ofPattern("DD-MM-YYYY");
	String stringDate = localDate.format(formator);


	@Override
	public String toString() {
		return "Customer [mobno=" + mobno + ", name=" + name + ", email=" + email + ", date=" + date + "]";
	}
	
	
	
	
	
	

}
