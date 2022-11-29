package udemy;

public class MotorBike {
	// state
	private int speed; // member variable
	
	MotorBike(int speed){
		this.speed = speed;
	}
	
	void setSpeed(int speed) { // localvariable
		if(speed > 0)
		this.speed = speed;
	}
	
	int getSpeed() {
		return this.speed;
	}
	
	public void increaseSpeed(int howMuch) {
		setSpeed(this.speed + howMuch);
	}
	
	public void decreaseSpeed(int howMuch) {
		setSpeed(this.speed - howMuch);
	}
	
	void start() {
		System.out.println("Bike start");
	}
}
