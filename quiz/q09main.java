import java.lang.reflect.*;

public class q09main{
	public static void main(String[] argv)
	{
		try{
		Class classByName = Class.forName("q09getclass");
		Constructor c1 = classByName.getDeclaredConstructor();
		c1.setAccessible(true);
		c1.newInstance();

		Class classByObject =  q09getclass.class;
		Constructor c2 = classByObject.getConstructor(int.class);
		c2.newInstance(6);
	
		}
		catch(Exception e)
		{
			System.out.println(e.toString());
		}
	}
}
