package hello;

public class MountainBike extends Bicycle {
	int seatHeight;
	public MountainBike(int gears,int CurrentSpeed,int seatHeight) {
		super(gears,CurrentSpeed);
		this.seatHeight=seatHeight;
	}
	public void setHeight(int newValue) {
		seatHeight=newValue;
	}
	@Override
	public String bicycleDesc() {
		return(super.bicycleDesc()+"\nthe seat height of mountainbike: "+seatHeight);
	}

}