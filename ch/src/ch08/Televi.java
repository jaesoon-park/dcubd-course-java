package ch08;

import ch08.RemoteControl;

public class Televi implements  RemoteControl{
	private int volume;
	
	public void turnOn() {
		System.out.println("Televi�� �մϴ�.");
	}
	//turnOff()�߻� �޼ҵ��� ��ü �޼ҵ�
	public void turnOff() {
		System.out.println("Televi�� ���ϴ�.");
	}
	//setVolume()�߻� �޼ҵ��� ��ü �޼ҵ�

	public void setVolume(int volume) {
		if(volume>RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		}
		else if(volume>RemoteControl.MIX_VOLUME) {
			this.volume = RemoteControl.MIX_VOLUME;
		}else {
			this.volume = volume;
		}
		System.out.println("���� Televi ����: "+ this.volume);
	}
}

