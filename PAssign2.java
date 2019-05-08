// Written by Sunny Patel
//CSCI 1302
//Assignment #2
//Detail: Java program to create and test Octagon class that will be
//        used to produce properly sized signs (in inches).


public class PAssign2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//octagon array
		double[] Octagon = { 4.5, 7.2, 3.7, 10.0, 2.1 };
		printOctagon(Octagon);


	}

	static void printOctagon(double[] Octagon) {

		
		for(int i=0; i <  Octagon.length;i++)
		{
		Octagon oct = new Octagon();
		oct.sideLength = Octagon[i];
		double area = oct.getArea();
		double perimeter = oct.getPerimeter();
		
		System.out.printf("Octagon "+(i+1)+ "\rSide Length: "+ oct.sideLength + " inches\r");
		System.out.printf("Area: %.2f" + " inches^2\r", area);
		System.out.printf("Perimeter: %.2f + inches\r\r", perimeter);
		}

	}

}


class Octagon {
	public double sideLength;
	
	public Octagon()
	{
		sideLength = 1.0;
	}

	public double getArea()
	{
		return 2*(1+ Math.sqrt(2))*Math.pow(sideLength, 2);
	}

	public double getPerimeter()
	{
		return 8*sideLength;
	}




}