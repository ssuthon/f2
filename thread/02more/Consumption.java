//See tutorials about Java Threading
//Try to move waiting part to consume function

public class Consumption {
	public static void main(String[] args){
		Producer producer = new Producer();		
		Consumer consumer = new Consumer(producer);
	
		producer.start();
		consumer.start();		
	}
}

class Consumer extends Thread{
	private Producer producer;
	public Consumer(Producer producer){
		this.producer = producer;
	}

	public void run(){		
		while(true){
			System.out.println("I have to wait for producer to finish producing.");
			synchronized(producer){
				try{ producer.wait(); }catch(InterruptedException ie){}
				int data = producer.consume();
				System.out.println(data);
			}
		}
	}
}

class Producer extends Thread {
	private int data = 1;
	public int consume(){
		return data;
	}

	public void run(){	
		while(true){
			System.out.println("I need time to produce.");
			try{ Thread.sleep(1000); }catch(InterruptedException ie){}
			data++;
			synchronized(this){
				notify();
			}
		}
	}
}