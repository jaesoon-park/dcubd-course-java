package ch07;

import java.util.Scanner;
public class Alphabet {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String s;
		char c;
		
		System.out.print("�ҹ��� ���ĺ� �ϳ��� �Է��Ͻÿ�. >>");
		s = sc.next();//s�� ���ڿ� �б�
		c = s.charAt(0);//s�� ù��° ���ڸ� c�� �Է�
		
		for(int i = 0; i<=c-'a'; i++) {
			for(char j = 'a'; j <= c -i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		sc.close();
	}

}
