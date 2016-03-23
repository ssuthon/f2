public class Rectangle extends Shape {	//concrete class
	private double width;
	private double height;

	public Rectangle(String name, double width, double height){
		super(name);
		this.width = width;
		this.height = height;
	}

	public double getWidth(){
		return width;
	}

	public void setWidth(double width){
		this.width = width;
	}

	public double getHeight(){
		return height;
	}

	public void setHeight(double height){
		this.height = height;
	}

	public double getArea(){
		return width * height;
	}

	public static void main(String[] args){
		Rectangle c = new Rectangle("R1", 2, 3);
		System.out.println("Area of " + c.getName() + " is " + c.getArea());
	}
}