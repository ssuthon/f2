//Producer & Consumer
public class Consumption{
	public static void main(String[] args){
		Storage s = new Storage();
		Producer p = new Producer(s);
		Consumer c = new Consumer(s);
		p.start();
		c.start();
	}
}

class Storage{
	private Integer value = null;
	public synchronized void setValue(int v){  //executed by Producer
		value = v;
		notify(); //to consumer
	}
	public synchronized int getValue(){	//executed by Consumer
		if(value == null){
			try{ 
				//System.out.println("Consumer waiting");
				wait(); 
			}catch(Exception e){}
		}
		
		int v = value;
		value = null;

		notify();	 //to producer
		return v;
	}
	public void waitIfFull(){ //executed by Producer
		if(value != null)
			try{
				//System.out.println("Producer waiting"); 
				wait(); 
			}catch(Exception e){}
	}
}

class Producer extends Thread{
	private Storage s;
	private int value = 1;
	public Producer(Storage s){
		this.s = s;
	}
	public void run(){
		while(true){
			s.waitIfFull();
			System.out.println("Producing " + value);
			try{ Thread.sleep(1000); }catch(Exception e){}
			s.setValue(value++);
		}
	}
}

class Consumer extends Thread{
	private Storage s;
	public Consumer(Storage s){
		this.s = s;
	}
	public void run(){
		while(true){
			int v = s.getValue();
			System.out.println("Consuming " + v);
		}
	}
}
