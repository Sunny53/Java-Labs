import java.util.Scanner;

public class Exercise05_47 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter the first 12 digits of an ISBN-13 as a string");
		
		Scanner input = new Scanner(System.in);
		String isbn = input.nextLine();
		
		int checkSum=0;
		
		if (isbn.length() != 12)
		{
			System.out.println(isbn + " is an invalid input.");
		}
	
		for (int i = 0; i < isbn.length(); i++) {

            if ((i + 1) % 2 == 0) {
		{
			checkSum = isbn.charAt(i) - '0' * 3;
			System.out.println(checkSum);
		}

		
            }
		}
	}

		}
