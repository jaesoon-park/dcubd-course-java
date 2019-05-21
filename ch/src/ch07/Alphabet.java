package ch07;

import java.util.Scanner;
public class Alphabet {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String s;
		char c;
		
		System.out.print("소문자 알파벳 하나를 입력하시요. >>");
		s = sc.next();//s에 문자열 읽기
		c = s.charAt(0);//s의 첫번째 문자를 c에 입력
		
		for(int i = 0; i<=c-'a'; i++) {
			for(char j = 'a'; j <= c -i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		sc.close();
	}

}
