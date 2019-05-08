
public class Exercise5_35 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double sum = 0;
		
		for(double i=1; i<=624; i++)
		{
			double a = 1 / (Math.sqrt(i) + Math.sqrt(i+1));
			sum += a;
		}

		System.out.println(sum);
	}



}
