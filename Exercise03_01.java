import java.util.Scanner;

public class Exercise03_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//Input
		System.out.println("Enter output for a, b, c:");
		Scanner input = new Scanner(System.in);
		
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();
		
		//equations
		double disc = Math.pow(b, 2) - 4 * a * c;
		double r1 = (-b + Math.pow(disc, .5))/(2 * a);
		double r2 = (-b - Math.pow(disc, .5))/(2 * a);
		//if statements
		
		if(disc > 0)
		{
			System.out.println("The equation has two roots: " + r1 + "and " + r2);
		}
		else if(disc == 0)
		{
			System.out.println("The equation has one root: " + r1);
		}
		else
		{
			System.out.println("The equation has no real roots");
		}
	}

}
