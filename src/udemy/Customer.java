package udemy;

public class Customer {
	// state
	// 필수 요소인지, 아닌지를 판단해 생성자에 포함할것인지를 판단
	private String name;
	// 클래스 디자인할 때 다른 객체의 관계를 살펴봐야함
	private Address homeAddress;
	private Address workAddress;
	 
	// creating
	public Customer(String name, Address homeAddress) {
		this.name = name;
		this.homeAddress = homeAddress;
	}

	
	// operations
	// 사용자 관점에서 어떤게 필요한지 생각해봄
	// 변경 가능한 요소는 getter,setter
	// 변경 불가능한 요소는 getter만
	public Address getHomeAddress() {
		return homeAddress;
	}
	
	public void setHomeAddress(Address homeAddress) {
		this.homeAddress = homeAddress;
	}
	
	public Address getWorkAddress() {
		return workAddress;
	}
	
	public void setWorkAddress(Address workAddress) {
		this.workAddress = workAddress;
	}
	
	public String toString() {
		return String.format("name - [%s] home address - [%s] work address - [%s]", name, homeAddress, workAddress);
	}
	
}

