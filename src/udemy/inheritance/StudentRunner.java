package udemy.inheritance;

public class StudentRunner {

	public static void main(String[] args) {
//		Student student = new Student();
//		student.setName("yumi");
//		student.setEmailString("aaaa@yuum.link");
		
	/*	Person person = new Person();
		person.setName("yumi");
		person.setEmailString("aaaa@yuum.link");
		person.setPhoneNumber("010-000-1111");
		String value = person.toString();
		System.out.println(value);
		System.out.println(person);
	*/
		
		Employee employee = new Employee();
		employee.setName("yumi");
		employee.setEmail("aaaa@yuum.link");
		employee.setPhoneNumber("010-000-1111");
		employee.setEmployeeGrade('A');
		employee.setTitle("Programmer Analyst");
		
		System.out.println(employee);
		
	}

}
