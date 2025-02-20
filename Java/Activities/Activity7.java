package hello;

public class Activity7 {
	public static void main(String[] args) {
		MountainBike bike =new MountainBike(3,0,25);
		System.out.println(bike.bicycleDesc());
		bike.speedUp(20);
		bike.applyBrake(5);
		bike.setHeight(30);
        System.out.println(bike.bicycleDesc());
		
	}

}