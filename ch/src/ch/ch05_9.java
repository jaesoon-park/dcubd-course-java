package ch;
import java.util.Scanner;

public class ch05_9 {

	public static void main(String[] args) {
		boolean run = true;
		int studentNum = 0;
		int[] scores = null;
		Scanner scanner = new Scanner(System.in);
		
		while(run) {
			System.out.println("---------------------------------------------");
			System.out.println("1.�л��� | 2.�����Է� | 3.��������Ʈ | 4.�м� | 5.����");
			System.out.println("---------------------------------------------");
			System.out.print("���� >");
			
			int selectNo = scanner.nextInt();
			
			if(selectNo == 1) {
				System.out.print("�л��� >");
				studentNum = scanner.nextInt();
			}
			if(selectNo == 2) {
				scores = new int [studentNum];
				for(int i = 0; i < studentNum; i++) {
					System.out.print("scores[" + i + "] >");
					scores[i] = scanner.nextInt();
				}
			}
			if(selectNo == 3) {
				for(int i = 0; i < scores.length; i++) {
					System.out.println("scores[" + i + "] >" + scores[i]);
					
				}
			}
			if(selectNo == 4) {
				int max = scores[0];
				double sum = 0;
				for(int i = 0; i < scores.length; i++) {
					if(scores[0] > max) {
						max = scores[i];
					}
					sum += scores[i];
				}
				System.out.println("�ְ����� : " +max);
				System.out.println("������� : " +(sum/scores.length));
			}
			if(selectNo == 5) {
				run = false;
			}
			
		}
	
		System.out.println("���α׷� ����");
	}

}
