package ch08;

import ch08.RemoteControl;

public class Televi {
	public class Television implements  RemoteControl{
		//�ʵ�
		private int volume;
		//turnOn() �߻� �żҵ��� ��ü �޼ҵ�
		public void turnOn() {
			System.out.println("Tv�� �մϴ�.");
		}
		//turnOff()�߻� �޼ҵ��� ��ü �޼ҵ�
		public void turnOff() {
			System.out.println("TV�� ���ϴ�.");
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
			System.out.println("���� TV ����: "+ this.volume);
		}
	}
}
