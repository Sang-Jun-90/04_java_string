package step4_01.string;

import java.util.Arrays;

// # 정렬 (사전순으로 정렬해 보시오.)

public class StringEx13_정답 {

	public static void main(String[] args) {
		
		String[] names = {"홍길동", "김유신", "마동석", "자바킹", "서동요"};
		
		
		int cnt = 0;
		
		while (cnt < 5) {
			String temp = "";
			
			for (int i = cnt ; i < names.length; i++) {
				if(i+1 >= names.length) continue;
				if (names[i].compareTo(names[i+1]) > 0) {
					temp = names[i];
					names[i] = names[i+1];
					names[i+1] = temp;
				}
			}
			cnt++;
		}
		
		System.out.println(Arrays.toString(names));
		
		
		
		
	}
	
}
