import java.util.Random;
import java.util.Scanner;

public class Lab5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// question
		Scanner a = new Scanner(System.in);

		System.out.println("Enter integer:");
		int n = a.nextInt();
		int large = 0;
		int mode = 1;
		int number;
		Random rand = new Random();

		// Random

		for (int i = 1; i <= n; i++) {
			number = rand.nextInt(100) + 1;
			System.out.print(number + " ");
			if (number > large) {
				mode = 1;
				large = number;	
			} 
			else if (number == large)
				mode++;

		}

		System.out.println("\rThe largest number is " + large);

		System.out.println("Occurence count for " + large + " is " + mode);

	}

}
