package udemy;

public class Customer {
	// state
	// �ʼ� �������, �ƴ����� �Ǵ��� �����ڿ� �����Ұ������� �Ǵ�
	private String name;
	// Ŭ���� �������� �� �ٸ� ��ü�� ���踦 ���������
	private Address homeAddress;
	private Address workAddress;
	 
	// creating
	public Customer(String name, Address homeAddress) {
		this.name = name;
		this.homeAddress = homeAddress;
	}

	
	// operations
	// ����� �������� ��� �ʿ����� �����غ�
	// ���� ������ ��Ҵ� getter,setter
	// ���� �Ұ����� ��Ҵ� getter��
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

