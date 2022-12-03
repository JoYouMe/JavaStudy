package udemy;

public class Rectangle {
	
	//state
	private int length;
	private int width;
	
	// creation
	// length,width에 대한 생성자
	public Rectangle(int length, int width) {
		this.length = length;
		this.width = width;
	}

	// operaions
	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}
	
	public int area() {
		return length * width;
	}
	
	public int parimeter(){
		return 2*(length + width);
	}
	
	public String toString() {
		return String.format("length - %d, width - %d, area - %d, parimeter - %d", length, width, area(), parimeter()); 
	}
	
	
}
