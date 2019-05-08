import java.util.Scanner;

public class Exercise03_09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

System.out.println("Enter the first nine digits of an ISBM as integer: ");
		Scanner input = new Scanner(System.in);
		int digit = input.nextInt();
		
		int d1 = digit / 100000000 % 10;
		int d2 = digit / 10000000 % 10;
		int d3 = digit / 1000000 % 10;
		int d4 = digit / 100000 % 10;
		int d5 = digit / 10000 % 10;
		int d6 = digit / 1000 % 10;
		int d7 = digit / 100 % 10;	
		int d8 = digit / 10 % 10;
		int d9 = digit % 10;
		int d10 = (d1*1+d2*2+d3*3+d4*4+d5*5+d6*6+d7*7+d8*8+d9*9) % 11;
		
		if(d10 == 10)
		{
			System.out.println("The ISBN-10 number is: "+ d1+d2+d3+d4+d5+d6+d7+d8+d9 + "X");
		}
		else
			System.out.println("The ISBN-10 number is: " + d1+d2+d3+d4+d5+d6+d7+d8+d9 + d10);
	}

}
