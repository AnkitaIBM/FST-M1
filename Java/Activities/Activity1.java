package hello;

public class Activity1 {
	public static void main(String[] args) {
		//create an object for car class
	Car BMW = new Car();
	 //Assign values to variables
	BMW.make = 2024;
	BMW.color = "White";
	BMW.transmission = "Automatic";
	
	//call method in the Car class
	BMW.displayCharacterstics();
	BMW.accelerate();
	BMW.brake();

}
}