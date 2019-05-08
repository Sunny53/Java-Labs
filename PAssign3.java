//Sunny Patel
//CSCI 1302
//Assignment 3
//Detail: Java program to define and test a Vehicle class that aggregates and 
//		  Engine Class(which is manufactured individually)
import java.util.Scanner;

public class PAssign3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub				
	}

}

class Vehicle {

	static int engine = 4;
	static String make = "Toyabu";
	static String model = "Priata";

	public Vehicle() {
		this.engine = engine;
		this.make = make;
		this.model = model;
	}
	
		
	
}

class Engine {

	public int cylinders;
	
	public void setCylinders() {
		this.cylinders = cylinders;
	}
	
}