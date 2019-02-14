public class except{
	public static void main(String[] args){
		int a = 5;
		System.out.println("a="+a);
		try{
		a = a/0;
		}
		catch(Exception e)
		{
			System.out.println("Dzielono przez zero");
		}
		finally
		{
			System.out.println("wykonuje blok finally");
		}

		
	}
}

