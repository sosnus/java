import java.util.List;
import java.util.ArrayList;

public class q23arraylist{
	public static void main(String[] argv){
		List<String> myList = new ArrayList<>();
		myList.add("napis1");
		myList.add("napis2");
		myList.add("n3");
		System.out.println(myList.get(myList.size()-1));
	}
}

