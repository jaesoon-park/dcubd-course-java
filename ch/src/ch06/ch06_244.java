package ch06;

public class ch06_244 {

	public static void main(String[] args) {
		ch06_244_1 obj1 = ch06_244_1.getInstance();
		ch06_244_1 obj2 = ch06_244_1.getInstance();
		
		if(obj1 == obj2) {
			System.out.println("같은  ch06_244_1 객체 입니다.");
		}else {
			System.out.println("다른  ch06_244_1 객체 입니다.");
		}

	}

}
