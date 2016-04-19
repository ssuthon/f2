class Ex01{
	public static void main(String[] args){
		String s = "s";
		//handle
		try{
			int v = Integer.parseInt(s);
			System.out.println(v);
		}catch(NumberFormatException e){
			System.out.println("Invalid!");
		}
	}
}