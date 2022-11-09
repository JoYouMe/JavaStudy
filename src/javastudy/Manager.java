package javastudy;
// 코딩 실습 직원과 매니저

public class Manager extends Employee {
	private int bonus;
	
	// 클래스명과 동일안 생성자 생성
	public Manager(String name, String address, int salary, int rrn, int bonus) {
		super(name, address, salary, rrn);
		this.bonus = bonus;
	}

	void test() {
		System.out.println("name=" + name);
		System.out.println("address" + address);
		System.out.println("salary=" + salary);
// System.out.println("rrn="+rrn);
	}
}
