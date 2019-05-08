import java.util.Scanner;

public class Exercise2_17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//inputs		
		double temp;		
		double speed;
		double wsi;

		//user input temperature
		System.out.println("Enter the temperature in Fahrenheit between -58*F and 41*F:	");
		Scanner input = new Scanner(System.in);
		temp = input.nextDouble();

		//user input wind speed 
		System.out.println("Enter the wind speed (>=2) in miles per hour: ");
		speed = input.nextDouble();

		//equation
		wsi = 35.74 + (0.6215 * temp) - (35.75 * Math.pow(speed, 0.16)) + 0.4275 * temp * Math.pow(speed, 0.16) ;

		//Solution
		System.out.println("The wind chill is " + wsi);




	}

}
