package learning.java.core.day1;

public class Rectangle {
	float length, breadth;

	public Rectangle(float length, float breadth) {
		super();
		this.length = length;
		this.breadth = breadth;
	}

	public void calculateArea() {
		float area = length * breadth;
		System.out.println("Area of Rectangle is " + area);
	}

	public float getLength() {
		return length;
	}

	public void setLength(float length) {

		this.length = length;
	}

	public float getBreadth() {
		return breadth;
	}

	public void setBreadth(float breadth) {
		this.breadth = breadth;
	}


}
