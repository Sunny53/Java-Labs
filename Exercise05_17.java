import java.util.Scanner;

public class Exercise05_17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter the number of lines: ");
		
		Scanner input = new Scanner(System.in);
		int lines = input.nextInt();
		
		int i, j, h;
		
		for(i = 1; i <= lines; i++)
		{
			for(j = lines; j >= 2; j--)
			{	
				if(j > i)
					System.out.print("   ");
				else
					System.out.print(j + "  ");	
			}
			for(j = 1; j <= i; j++)
			{
				System.out.print(j + "  ");
			}
			System.out.println("\r");
			
			
		}
		
		
		
		
	}

}
