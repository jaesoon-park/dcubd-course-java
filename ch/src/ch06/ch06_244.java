package ch06;

public class ch06_244 {

	public static void main(String[] args) {
		ch06_244_1 obj1 = ch06_244_1.getInstance();
		ch06_244_1 obj2 = ch06_244_1.getInstance();
		
		if(obj1 == obj2) {
			System.out.println("����  ch06_244_1 ��ü �Դϴ�.");
		}else {
			System.out.println("�ٸ�  ch06_244_1 ��ü �Դϴ�.");
		}

	}

}
