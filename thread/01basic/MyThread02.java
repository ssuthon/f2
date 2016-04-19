class MyThread02 implements Runnable{
	public void run(){
		System.out.println("Hello from thread");
	}

	public static void main(String[] args){
		Runnable r = new MyThread02(); //no thread yet, ONLY object
		Thread t = new Thread(r);	//no thread yet, ONLY object
		t.start();			//threading now

		System.out.println("Hello from main");
	}
}