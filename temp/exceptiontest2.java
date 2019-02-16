public class exceptiontest2{
	public static void main(String[] argv){
		int a = 5;
		try{
		a = a/0;
		}
		catch(Exception e){
			System.out.println("Przypau");
		}
		finally{
			System.out.println("Finally przypauly");
		}

		System.out.println("a="+a);
	}
}
