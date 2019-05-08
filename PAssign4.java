
public class PAssign4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		InternalCombustionEngine icEng = new InternalCombustionengine(6);
		ElectricEngine elEng = new ElectricEngine();

		Vehicle electricVeh = new Vehicle(elEng, "Toyabu", "Priata");
		Vehicle internalCombVeh = new Vehicle(icEng, "Hyunzda", "Sonius");

		System.out.println(electricVeh);
		System.out.println(internalCombVeh);

	}
}

class Vehicle{
	private Engine engine;
	private String make;
	private String model;
	
	public Vehicle() {
		this.engine = new Engine();
		this.setMake("Toyota");
		this.setModel("Priata");
		
	}
	public Engine getEngine() {
		return engine;
	}
	
	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	
	public String getMake() {
		return make;
	}
	
	public void setMake(String make) {
		this.make = make;
	}
	
	public String getModel() {
		return model;
	}
	
	public void setModel() {
		this.model = model;
	}
	
	public String toString() {
		return this.getMake() + " " + this.getModel() + "\n" + this.getEngine() + "/n";
	}
	
	class Engine {
		
	}
	
	class ElectricEngine {
		
	}
	
	class InternalCombustionEngine {
		
	}
	
}