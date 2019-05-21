package ch08;

public class RemoteControlExample {

	public static void main(String[] args) {
		RemoteControl rc = null;
		rc = new Televi();
		rc.turnOn();
		rc.setMute(true);
		rc = new Audio();
		rc.turnOn();
		rc.setMute(true);

	}

}
