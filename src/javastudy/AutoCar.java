package javastudy;

public class AutoCar implements OperateCar {

	@Override
	public void start() {
		System.out.println("�ڵ����� ����մϴ�");

	}

	@Override
	public void stop() {
		System.out.println("�ڵ����� �����մϴ�");

	}

	@Override
	public void setSpeed(int speed) {
		System.out.println("�ڵ����� �ӵ���" + speed + "km/h�� �����մϴ�");

	}

	@Override
	public void turn(int degree) {
		System.out.println("�ڵ����� ������" + degree + "�� ��ŭ �����մϴ�");

	}

}
