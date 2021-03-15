package step4_01.string;

import java.util.Arrays;

/*
 * 
 *  문제) 전체 성적(총점)이 1등인 학생 이름 출력
 * 
 *  - 학생 정보와 성적이 담긴 데이터
 * 	student => 1.id 2.주소 3.번호
 *  score   => 1.번호 2.국어 3.수학 4.영어 점수
 *  
 *  
 *  
 * */

public class StringEx20_테스트문제 {

	public static void main(String[] args) {
			
		String [][] students = {
								{"제임스 고슬링","신촌","1001"}, 
								{"스티브워즈니악","강남","1002" },
								{"데니스리치" ,"대치", "1003"}, 
								{"팀버너스리" , "강동","1004"}
							   };
		String[][] score = {
				{"번호" ,"과목" , "점수"},
				{"1001" ,"국어","20"},
				{"1002" ,"국어","50"},
				{"1003" ,"국어","60"},
				{"1004" ,"국어","17"},
				{"1001" ,"수학","65"},
				{"1002" ,"수학","15"},
				{"1003" ,"수학","80"},
				{"1004" ,"수학","70"},
				{"1001" ,"영어","43"},
				{"1002" ,"영어","90"},
				{"1003" ,"영어","30"},
				{"1004" ,"영어","70"}
		};		
		
		int size = students.length;
		int[] reScore = new int[size];
		
		for (int i = 0; i < score.length; i++) {
			if (students[i][2].equals(score[i][0])) {
				int location = Integer.parseInt(students[i][2]) % 1001;
				reScore[location] += Integer.parseInt(score[i][2]);
			}
		}
		System.out.println(Arrays.toString(reScore));
		
	}

}
