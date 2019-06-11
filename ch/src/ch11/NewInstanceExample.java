package ch11;

public class NewInstanceExample {

	public static void main(String[] args) {
		try {
			Class clazz = Class.forName("ch11.SendAction");
			
			Action action = (Action) clazz.newInstance();
			action.execute();
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}catch(InstantiationException e) {
			e.printStackTrace();
		}catch(IllegalAccessException e) {
			e.printStackTrace();
		}
	}

}
