import java.util.ArrayList;

public class Main {
	public static void main(String[] args){
		//polymorhism

		ArrayList<Shape> shapes = new ArrayList<Shape>();
		shapes.add(new Rectangle("R1", 2, 8));
		shapes.add(new Rectangle("R2", 3, 5));
		shapes.add(new Circle("C1", 3));

		double total = 0.0;
		for(Shape shape : shapes){
			total += shape.getArea();
		}

		System.out.printf("Total area = %.2f\n", total);
	}
}