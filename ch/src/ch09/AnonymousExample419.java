package ch09;

public class AnonymousExample419 {

	public static void main(String[] args) {
		Anonymous418 anony = new Anonymous418();
		anony.field.run();
		anony.method1();
		anony.method2(
				new Vehicle() {
					@Override
					public void run() {
						System.out.println("Ʈ���� �޸��ϴ�.");
					}
				}
				);
	}

}
