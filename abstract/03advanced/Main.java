import java.util.ArrayList;

public class Main {
	
	public static void main(String[] args){
		//polymorhism

		ArrayList<Sprite> sprites = new ArrayList<Sprite>();
		Rectangle r1 = new Rectangle("R1", 2, 8);
		sprites.add(r1);
		sprites.add(new Rectangle("R2", 3, 5));
		sprites.add(new Circle("C1", 3));
		sprites.add(new Dot());

		zoomAll(sprites, 2.0);

		System.out.println(r1.getName() + " has width = " + r1.getWidth());
		
	}

	public static void zoomAll(ArrayList<Sprite> sprites, double factor){
		for(Sprite s : sprites){
			if(s instanceof Zoomable){
				Zoomable z = (Zoomable)s;
				z.zoom(factor);
			}
		}

	}
}