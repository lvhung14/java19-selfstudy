package demo;

public class Ex02External {
	public static void main(String[] args) {
		Ex01TestVM.publicStaticMethod();
		Ex01TestVM instance = new Ex01TestVM();
		instance.publicMethod();
		
	}
	public static void publicEx2Method() {
		System.out.println("Method >> Some text...");
	}
}
