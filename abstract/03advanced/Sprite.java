public abstract class Sprite {
	private String name;
	protected int x;
	protected int y;

	public Sprite(String name){
		this.name = name;
		x = 0;
		y = 0;
	}

	public int getX(){
		return x;
	}

	public int getY(){
		return y;
	}

	public void moveTo(int x, int y){
		this.x = x;
		this.y = y;
	}

	public String getName(){
		return name;
	}
}