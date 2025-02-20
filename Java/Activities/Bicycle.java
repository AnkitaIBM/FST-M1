package hello;

public class Bicycle implements BicycleParts,BicycleOperations{
	int gears;
	int CurrentSpeed;
	public Bicycle(int gears,int CurrentSpeed) {
		this.gears=gears;
		this.CurrentSpeed=CurrentSpeed;
	}
	
	public void applyBrake(int decrement) {
		CurrentSpeed-=decrement;
		System.out.println("Bicycle reduces the speed by: "+CurrentSpeed);
	}
	
	public void speedUp(int increment) {
		CurrentSpeed+=increment;
		System.out.println("Bicycle increases the speed by: "+CurrentSpeed);
	}
	public String bicycleDesc() {
		return("No of gears are "+ gears + "\nSpeed of bicycle is " + CurrentSpeed);
	}
}