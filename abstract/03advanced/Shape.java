public abstract class Shape extends Sprite implements Zoomable{

	public Shape(String name){
		super(name);
	}

	public abstract double getArea();
}