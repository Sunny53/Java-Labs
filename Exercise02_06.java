import java.util.Scanner;
public class Exercise02_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

int number;
int sum;
		
System.out.println("Enter number between 0 and 1000");
Scanner num = new Scanner(System.in);
number = num.nextInt();

sum = (number % 10) + (number / 100) + (number % 100)/10;
		
System.out.println("The sum of the digits is " + sum) ;		
	}

}
