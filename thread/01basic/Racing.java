// Before running any code -- guess the result.
// 1. Try to run this code
// 2. Try to uncomment code in main function.
// 3. Try to uncomment code in Counter class.

class Racing implements Runnable{
	private Counter counter;
	public Racing(Counter counter){
		this.counter = counter;		
	}

	public void run(){
		for(int i = 0; i < 5000; i++){
			counter.count();
		}
	}

	public static void main(String[] args){
		Counter counter = new Counter();

		Racing racing = new Racing(counter);
		Thread threads[] = new Thread[10];
		for(int i = 0; i < 10; i++){
			threads[i] = new Thread(racing);
			threads[i].start();
		}

		for(int i = 0; i < 10; i++){			
			try { threads[i].join(); }catch(InterruptedException ie){}
		}

		System.out.println("Value = " + counter.value);
	}

	static class Counter{
		private int value = 0;
		public /*synchronized*/ void count(){			
			int v = value;			
			value = v + 1;
		}
	}
}

