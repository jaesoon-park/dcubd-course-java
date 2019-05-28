package ch09;

public class Buttom {
	OnClickListener listener;
	
	void setOnClickListener(OnClickListener listener) {
		this.listener = listener;
	}


	void touch() {
		listener.onClick();
	}

	interface OnClickListener{
		void onClick();
	}
}