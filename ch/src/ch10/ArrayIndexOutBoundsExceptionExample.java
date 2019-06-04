package ch10;

public class ArrayIndexOutBoundsExceptionExample {

	public static void main(String[] args) {
		if(args.length == 2) {
		String data1 = args[0];
		String data2 = args[1];
		
		System.out.println("args[0]: " + data1);
		System.out.println("args[1]: " + data2);
		}else {
			System.out.println("[실행 방법]");
			System.out.print("java  ArrayIndexOutBoundsExceptionExample ");
			System.out.print("값 1 값2");
		}
		
	}
}
