public class sort2{
	public static void main(String[] args){
		int[] array= {32, 87, 3, 589, 12, 8, 622, 127};
		for(int i=array.length; --i>=0;){
			for(int j=0; j<i;j++){
				if(array[j]>array[j+1]){
					int temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
				}
			}
		}
		System.out.println("Array.length="+array.length);
		for(int i = 0; i< array.length; i++){
		System.out.println(array[i]);
		}
	}
}

