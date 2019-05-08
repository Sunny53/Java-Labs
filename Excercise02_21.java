import java.text.DecimalFormat;
import java.util.Scanner;

public class Excercise02_21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DecimalFormat d2 = new DecimalFormat("#.##");

		//Investment amount
		System.out.println("Enter Investment amount");
		Scanner input = new Scanner(System.in);
		double InvestA = input.nextDouble();

		//Annual interest rate in prct
		System.out.println("Enter annual interest rate in percentage:");
		double intR = input.nextDouble();

		//Number of years
		System.out.println("Enter number of years:");
		double years = input.nextDouble();

		//Accumulated value
		double intM = (intR/12) * .01;

		double exponent1 = 1+intM;
		double exponent2 = years * 12;

		double value = InvestA * Math.pow(exponent1,exponent2);

		//double finalVal = InvestA * value;

		System.out.println("Accumulated value is $ " + d2.format(value));


	}

}
