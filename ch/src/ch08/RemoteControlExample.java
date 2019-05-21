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
		
		rc = new RemoteControl() {
			private int volume;
			
			public void turnOn() {
				System.out.println("����Ʈ���� �մϴ�.");
			}
			//turnOff()�߻� �޼ҵ��� ��ü �޼ҵ�
			public void turnOff() {
				System.out.println("����Ʈ���� ���ϴ�.");
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
				System.out.println("���� ����Ʈ�� ����: "+ this.volume);
			}
		};
			rc.turnOn();
			rc.turnOff();
			rc.setMute(true);
		}
	}


