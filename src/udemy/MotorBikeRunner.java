package udemy;

public class MotorBikeRunner {

	public static void main(String[] args) {
		MotorBike kia = new MotorBike(100);
		MotorBike honda = new MotorBike(200);
		
		System.out.println(kia.getSpeed());
		System.out.println(honda.getSpeed());
		
		kia.start();
		honda.start();
		
		//kia.setSpeed(100);
		
		kia.increaseSpeed(100);
		kia.decreaseSpeed(50);

		honda.increaseSpeed(100);
		honda.decreaseSpeed(50);

		System.out.println(kia.getSpeed());
		System.out.println(honda.getSpeed());
		
	}

}
