package emailapp;

public class emailapp {

	public static void main(String[] args) { 
		Email em1 = new Email("John","Smith");
		em1.setAlternativeEmail("js@gmail.com");
		System.out.println(em1.getAlternateEmail());
	}
}
