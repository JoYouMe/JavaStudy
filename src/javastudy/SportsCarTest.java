package javastudy;

public class SportsCarTest {

	public static void main(String[] args) {
		// 상속받은 필드와 메소드의 사용
		SportsCar obj = new SportsCar();
		
		obj.speed = 10;
		obj.setSpeed(60);
		obj.setTurbo(true);

	}

}
