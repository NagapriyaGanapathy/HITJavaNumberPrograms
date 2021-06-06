package source.code;

public class SwapTwoNumbers {
	public static void main(String[] args) {
		int first = 120, second = 200;
		System.out.println("--Before swap--");
		System.out.println("First Number = "+ first);
		System.out.println("Second Number = "+ second);
		int temporary= first;
		first = second;
		second = temporary;
		System.out.println("--After swap--");
		System.out.println("First Number = "+ first);
		System.out.println("Second Number = "+ second);
	}
}
