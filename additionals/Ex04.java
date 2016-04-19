class Ex04{
	public static void main(String[] args){
		try{
			Thread.sleep(2000);
			System.out.println("Ok!");	
		}catch(InterruptedException e){

		} finally {
			System.out.println("Done!");
		}
	}
}
