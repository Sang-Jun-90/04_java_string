package step4_01.string;

import java.util.Scanner;

/*
 * # 단어 교체하기(replace)
 * 
 * 1. text변수 문장 속에서 변경하고 싶은 단어를 입력받아,
 * 2. 교체해주는 기능을 구현한다.
 * 예)
 * 		Life is too short.
 * 		변경하고 싶은 단어입력 : Life
 * 		바꿀 단어입력 : Time
 * 
 * 		Time is too short.
 */


public class StringEx17_정답 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		String text = "Life is too short.";
		System.out.println(text);
		
		System.out.print("변경하고 싶은 단어를 입력하세요 : ");
		String word = scan.nextLine();
		
		int wordLength = word.length();
		

		for (int i = 0; i < text.length()-wordLength; i++) {

			int cnt = 0;
			for (int j = 0 ; j < wordLength; j++) {
				
				
				
			}
			if (cnt == wordLength) {
				System.out.print("넣을 단어를 입력하세요 : ");
				String inputWord = scan.nextLine();
				for (int k = 0; k < inputWord.length(); k++) {
					
				}
				break;
			}
			
		}
		
		
		
		
		
	}

}
