class Ex03{
	public static void main(String[] args){
		String s = "s";
		//handle
		try{
			int v = Integer.parseInt(s);
			Thread.sleep(2000);
			System.out.println(v);
		}catch(NumberFormatException e1){
			System.out.println("Invalid!");
		}/*catch(InterruptedException e2){

		}*/catch(Exception e3){

		}
		//beware: unreachable code in multiple catches
	}
}