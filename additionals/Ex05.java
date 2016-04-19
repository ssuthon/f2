class Ex05{
	//Not practical!, for example only
	private static String p;
	public static void doIt()
		//throws IllegalStateException
	{
		if(p == null){
			throw new IllegalStateException("p must be defined first");
		}
		System.out.println(p.length());
	}

	public static void main(String[] args){
		//p = "Hello";
		try{
			doIt();
		}catch(Exception e){ //or IllegalStateException
			System.out.println("something wrong.");
		}
	}
}