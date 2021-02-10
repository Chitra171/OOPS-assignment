package Shape;


import Shape.Rectangle;
import Shape.Square;

public class TestShape {

	public static void main(String[] args) {
		Square square=new Square(5);
		Rectangle rect = new Rectangle(12, 8);
		square.calcArea();
		square.calcPeri();
		rect.calcArea();
		rect.calcPeri();

	}

}
