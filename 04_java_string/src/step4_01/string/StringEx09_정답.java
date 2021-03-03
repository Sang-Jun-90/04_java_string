package step4_01.string;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/*
 * # 타자연습 게임[1단계]
 * 
 * 1. 문제를 섞는다.(shuffle)
 * 2. 순서대로 문제를 출제하고, 문제를 다 맞추면 게임 종료
 * 예)
 * 문제 : mysql
 * 입력 : mydb
 * 문제 : mysql
 * 입력 : mysql	<--- 정답을 맞추면, 다음 문제 제시
 * 문제 : jsp
 */

public class StringEx09_정답 {

	public static void main(String[] args) {
		
		Random ran = new Random();
		Scanner scan = new Scanner(System.in);
		
		String[] words = {"java", "mysql", "jsp", "spring"};
		
		int i = 0;
		
		while(i < 1000) {
			
			int j = ran.nextInt(4);
			String temp;
			temp = words[j];
			words[j] = words[0];
			words[0] = temp;
			temp = "";
			i++;
		}
		
		System.out.print(Arrays.toString(words));
		
		int cnt = 0;
		while(cnt < 4) {
			System.out.println("문제 : "+ words[cnt]);
			System.out.print("정답 : ");
			String input = scan.next();
			if(input.equals(words[cnt])) cnt++;
			
		}
		

	}

}
