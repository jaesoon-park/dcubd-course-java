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
				System.out.println("스마트폰를 켭니다.");
			}
			//turnOff()추상 메소드의 실체 메소드
			public void turnOff() {
				System.out.println("스마트폰를 끕니다.");
			}
			//setVolume()추상 메소드의 실체 메소드

			public void setVolume(int volume) {
				if(volume>RemoteControl.MAX_VOLUME) {
					this.volume = RemoteControl.MAX_VOLUME;
				}
				else if(volume>RemoteControl.MIX_VOLUME) {
					this.volume = RemoteControl.MIX_VOLUME;
				}else {
					this.volume = volume;
				}
				System.out.println("현재 스마트폰 볼륨: "+ this.volume);
			}
		};
			rc.turnOn();
			rc.turnOff();
			rc.setMute(true);
		}
	}


