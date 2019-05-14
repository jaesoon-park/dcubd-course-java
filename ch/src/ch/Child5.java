package ch;

public class Child5 extends Parent5{
	private String name;
	
	public Child5() {
		this("ȫ�浿");
		System.out.println("Child() call");
	}
	
	public Child5(String name) {
		this.name = name;
		System.out.println("Child(String name) call");
	}
}
