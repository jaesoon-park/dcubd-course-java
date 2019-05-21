package ch08;

import ch08.RemoteControl;

public class Audio implements  RemoteControl{
	//�ʵ�
	private int volume;
	
	public void turnOn() {
		System.out.println("Audio�� �մϴ�.");
	}
	//turnOff()�߻� �޼ҵ��� ��ü �޼ҵ�
	public void turnOff() {
		System.out.println("Audio�� ���ϴ�.");
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
		System.out.println("���� Audio ����: "+ this.volume);
	}
	@Override
	public void setMute(boolean mute){
		if(mute) {
			System.out.println("Audio ���� ó���մϴ�.");
		}else {
			System.out.println("Audio ���� �����մϴ�");
		}
	}
}
