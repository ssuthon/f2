public class Counter{
	private int initial;
	private int value;

	public Counter(){
		this(0);
	}

	public Counter(int initial){
		this.value = initial;
		this.initial = initial;
	}

	public void count(){
		value ++;
	}

	public int getValue(){
		return value;
	}

	public void reset(){
		value = initial;
	}
}