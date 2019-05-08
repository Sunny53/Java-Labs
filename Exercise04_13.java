import java.util.Scanner;

public class Exercise04_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i = 0;
		
		//question
		System.out.println("Enter a letter: ");
		Scanner input = new Scanner(System.in);
		char letter = input.next().charAt(0);
		
		switch(letter)
		{
		case 'a' :
		case 'e' :
		case 'i' :
		case 'o' :
		case 'u' :
		case 'A' :
		case 'E' :
		case 'I' :
		case 'O' :
		case 'U' : i++;
		}
		
		if(i==1)
			System.out.println(letter + " is a vowel");
		
		else
			
			if((letter >= 'a' && letter <= 'z') || (letter >= 'A' && letter <= 'Z'))		
			System.out.println(letter + " is a consonant");
			
			else
				System.out.println(letter + " is an invalid input");
		


	}

}
