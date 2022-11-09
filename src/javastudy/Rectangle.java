package javastudy;

//추상 클래스 예시
public class Rectangle extends Shape {
	private int width, height;
	public void draw() {
		// 추상 메소드 구현
		System.out.println("사각형 그리기 메소드");
	}
}
