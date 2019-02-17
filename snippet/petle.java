public class petle{
	public static void main(String[] argv){
		String[] tab = {"a","b","c","d"};
		System.out.println("zainicjalizowano tablice a,b,c,d");
		
		for(int i=0;i<tab.length;i++)
			System.out.println(tab[i]);

		for(String tmp : tab)
			System.out.println(tmp);
	}
}
		//tab.forEach(System.out::println);
