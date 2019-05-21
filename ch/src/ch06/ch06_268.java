package ch06;

public class ch06_268 {

	public static void main(String[] args) {
		ch06_267 mych06_267 = new ch06_267();

		mych06_267.setSpeed(-50);
		
		System.out.println("현재 속도: " +mych06_267.getSpeed());
		
		mych06_267.setSpeed(60);
		
		if(!mych06_267.isStop()) {
			mych06_267.setStop(true);
		}
		
		System.out.println("현재 속도: " + mych06_267.getSpeed());
	}

}
