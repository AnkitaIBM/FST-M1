package hello;

public class Car {
	//Varaiables
	String color;
	String transmission;
	int make;
	int tyres;
	int doors;
	
	//constructor
	 Car(){
		 
		 tyres = 4;
		 doors = 4;
	 }
	 
	 //create class methods
	 public void displayCharacterstics() {
		 System.out.println("color of the car: "+ color);
		 System.out.println("transmission of the car: "+ transmission);
		 System.out.println("make of the car: "+ make);
		 System.out.println("no.of tyres of the car: "+ tyres);
		 System.out.println("no.of doors of the car: "+ doors);
	 }
	 public void accelerate() {
		 System.out.println("car is moving forward");
	 }
	 public void brake() {
		 System.out.println("car is has stopped");
	 }

}