public class exceptStack{
	public static void main(String[] args) {
	//	            StackTraceExample example = new StackTraceExample();
		exceptStack example = new exceptStack();	            
		    example.method1();
	}

	public void method1() {
		method2();
	}

	public void method2() {
		method3();
	}

	public void method3() {
		throw new RuntimeException("BUM! BUM! BUM!");
	}
}
