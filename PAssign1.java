
public class PAssign1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Fan fan1 = new Fan();
	fan1.speed = 3;
	fan1.radius = 10;
	fan1.color = "yellow";
	System.out.println(fan1.getInfo());
	Fan fan2 = new Fan();
	fan2.speed = 2;
	fan2.radius = 5;
	fan2.color = "blue";
	System.out.println(fan2.getInfo());
	
	Fan fan3 = new Fan();
	System.out.println(fan3.getInfo());
	
	
	}
}

class Fan {
	public int speed;
	
	public double radius;
	public String color;
	
	public Fan() {
		// TODO Auto-generated constructor stub
	speed = 1;
	radius = 1;
	color = "green";
	}

	public String getInfo()
	{
	return "A "+ radius+" inch "+ color + " fan at a speed of "+ speed;
	}
	
}