public class MyThread01 extends Thread {

	public void run(){
		System.out.println("Hello from thread");
	}

	public static void main(String[] args){
		Thread t = new MyThread01();	//no thread yet, ONLY object
		t.start();			//threading now

		System.out.println("Hello from main");
	}

}