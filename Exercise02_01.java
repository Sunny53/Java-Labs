import java.util.Scanner;

public class Exercise02_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	double C;
	double F;
		
		
	System.out.println("Enter a degree in Celsius: ");
	Scanner Cel = new Scanner(System.in);
	C = Cel.nextDouble();
	
	F = (9.0/5) * C + 32;
	System.out.println(C + " is " + F + " Fahrenheit");
	
	
	}

	
	

	
	
	
}
