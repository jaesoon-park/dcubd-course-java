package ch09;

public class MessgeListener implements Buttom.OnClickListener{
	@Override
	public void onClick() {
		System.out.println("메시지를 보냅니다.");
	}
}
