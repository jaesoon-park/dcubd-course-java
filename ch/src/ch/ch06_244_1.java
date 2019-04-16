package ch;

public class ch06_244_1 {
	
	private static ch06_244_1 singleton = new ch06_244_1();
	
	private ch06_244_1() {}
	
	static ch06_244_1 getInstance() {
		return singleton;
	}
}
