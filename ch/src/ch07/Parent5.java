package ch07;

public class Parent5 {
	public String nation;
	
	public Parent5() {
		this("���ѹα�");
		System.out.println("Parent5() call");
	}
	public Parent5(String nation) {
		this.nation = nation;
		System.out.println("Parent(String nation) call");
	}
}
