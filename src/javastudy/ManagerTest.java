package javastudy;
//코딩 실습 직원과 매니저

public class ManagerTest {
	public static void main(String[] args) {
		Manager m = new Manager("Tom", "Seoul", 1000000, 123456, 50000);
		System.out.println(m);
		m.test();
	}
}
