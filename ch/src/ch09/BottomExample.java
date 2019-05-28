package ch09;

public class BottomExample {

	public static void main(String[] args) {
		Buttom btn = new Buttom();
		
		btn.setOnClickListener(new CallListener());
		btn.touch();
		
		btn.setOnClickListener(new MessgeListener());
		btn.touch();
	}

}
