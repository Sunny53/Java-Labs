
public class Lab5_17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int count = 0;
		int num = 2;		

		while(count<50)
		{

			boolean isPrime=true;
			for(int div = 2; div<num; div++)
			{
				if(num%div==0)
				{
					isPrime = false;
					break;
				}
				if(isPrime)
				{
					count++;
					System.out.print(num + " ");
				}
			}
		}
	}

}
