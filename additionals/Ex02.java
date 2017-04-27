class Ex02{
	public static void main(String[] args){
		//Java Exception has 2 main types
		// 1) Unchecked Exception: Exceptions that extends RuntimeException
		// 2) Checked Exception
		try{
			Thread.sleep(2000);
			System.out.println("Ok!");	
		}catch(InterruptedException e){

		}
	}
}
