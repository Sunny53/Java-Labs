package emailapp;

import java.util.Scanner;

public class Email {

	//Variables for email
	private String firstname;
	private String lastname;
	private String password;
	private String department;
	private String email;
	private int mailboxCapacity = 500;
	private int defaultPasswordLength = 10;
	private String alternativeEmail;
	private String companySuffix = "aeycompany.com";

	//Receiver for name
	public Email(String firstname, String lastname) {
		this.firstname = firstname;
		this.lastname = lastname;
		System.out.println("Email Created;" + this.firstname + " " + this.lastname);

		//Call a method call for department - return department
		this.department = setDepartment();
		System.out.println("Department: " + this.department);

		//Call a method that returns a random password
		this.password = randomPassword(defaultPasswordLength);
		System.out.println("Your password is: " + this.password );

		//generate email
		email = firstname.toLowerCase() + "." +lastname.toLowerCase() + "@" + department + "." + companySuffix;
		System.out.println("Your email is; " + email);

	}
	//Department
	private String setDepartment() {

		System.out.println("DEPARTMENT CODES \n1 for Sales \n2 for Development \n3 for Accounting \n0 for none\nEnter department code: ");

		Scanner in = new Scanner(System.in);
		int depChoice = in.nextInt();

		if (depChoice == 1) { return "sales"; }
		else if (depChoice == 2) {return "Development";}
		else if (depChoice == 3) {return "Accounting";}
		else {return "none";}
	}

	//Random string for password
	private String randomPassword(int length) {
		String passwordSet = "ABCEDEFGHIJKLMNOPQRSTUVWXYZ01234567890!@#$%";
		char[] password = new char[length];
		for(int i=0; i<length; i++) {
			int rand = (int) (Math.random() * passwordSet.length()); 
			password[i] = passwordSet.charAt(rand); 
		}
		return new String(password); 
	}

	//Set the mailbox capacity
	public void setMailboxCapacity(int capacity ) {
		this.mailboxCapacity = capacity;
	}


	//Define alternative email address
	public void setAlternativeEmail(String altEmail) {
		this.alternativeEmail = altEmail;
	}

	//Change passwords

	public void changePassword(String password) {
		this.password = password;
	}
	
	public int getMailboxCapacity() { return mailboxCapacity; }
	public String getAlternateEmail() { return alternativeEmail; }
	public String getPassword() { return password; }
	
	//Display Name method


	//Display email method

	
	
	
	//Display mailbox capacity method





}
