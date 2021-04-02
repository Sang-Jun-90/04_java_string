package step4_01.string;

import java.util.Arrays;
import java.util.Scanner;

/*
 * # 단어 검색
 * 
 * 1. 단어를 입력받아 text변수 문장 속에 해당 단어가 있는지 검색한다.
 * 2. 단어가 존재하면 true
 *    단어가 없으면 false를 출력한다.
 */

public class StringEx16_정답 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		String text = "Life is too short.";
		System.out.println(text);
		
		char[] textChar = new char[text.length()];
		
		for (int i = 0; i < textChar.length; i++) {
			textChar[i] = text.charAt(i);
		}
		
		System.out.println(Arrays.toString(textChar));
		
		System.out.print("입력 : ");
		String input = scan.next();
		
		int inputL = input.length();
		boolean isSame = false;
		
		for (int i = 0; i < textChar.length-inputL+1; i++) {
			int correctCnt = 0;
			for (int j = 0; j < inputL; j++) {
				if (textChar[i+j] == input.charAt(j)) {
					correctCnt += 1;
				}
			}
			if(correctCnt == inputL) isSame = true;
		}
		
		// 공부다시해보기 
		
		if (isSame == true) System.out.println("wjdekq");
		else if (isSame == false) System.out.println("false");

	}

}
