import java.util.Scanner;

public class Exercise04_23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//variables		
		Scanner a = new Scanner(System.in);

		System.out.println("Enter employee's name: ");
		String name = a.nextLine();	
		System.out.println("Enter number of hours worked in a week: ");
		int hours = a.nextInt();
		System.out.println("Enter hourly pay rate: ");
		double pRate = a.nextDouble();
		System.out.println("Enter federal tax witholding rate: ");
		double fedTax = a.nextDouble();
		System.out.println("Enter state tax withholding rate: ");		
		double steTax = a.nextDouble();


		double wHours = hours;
		double gPay = pRate * hours;
		double fWith = gPay * fedTax;
		double sWith = gPay * steTax;
		double tDeduc = fWith + sWith;
		double netPay = gPay - tDeduc;

		System.out.println("Employee Name: " + name);
		System.out.println("Hours worked: " + wHours);
		System.out.println("Pay Rate: $" + pRate);
		System.out.println("Gross Pay: $" + gPay);
		System.out.println("Deductions:");
		System.out.println("   Federal Withholding (20.0%): $" + fWith);
		System.out.println("   State Withholding (9.0%): $" + sWith);
		System.out.println("Total Deduction : $" + tDeduc);
		System.out.println("Net Pay: $" + netPay);
	}

}
