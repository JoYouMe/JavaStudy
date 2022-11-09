package javastudy;
// 상속 예제 Animal

public class AnimalTest {
	public static void main(String[] args) {
		Lion lion = new Lion();
		lion.eat();
		lion.sleep();
		lion.roar();
		Eagle eagle = new Eagle();
		eagle.eat();
		eagle.sleep();
		eagle.fly();
	}
}
