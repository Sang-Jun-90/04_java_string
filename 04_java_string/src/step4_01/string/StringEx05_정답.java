package step4_01.string;


public class StringEx05_정답 {

	public static void main(String[] args) {

		String jumin = "890101-2012932";
		// 문제 1) 나이 출력
		// 정답 1) 32세
		
		String birth = "19"+jumin.substring(0,2);

		int age = 2020 - Integer.parseInt(birth);
		
		System.out.println(age+1 + "세");
		
		// 문제 2) 성별 출력
		// 정답 2) 여성
		
		String sexNum = jumin.substring(7,8);
		int num = Integer.parseInt(sexNum);

		if (num == 1) System.out.println("남성");
		else if (num == 2) System.out.println("여성");
		
		/////////////////////////////////////
		
		char sex = jumin.charAt(7);
		
		if (sex == '1') System.out.println("남성");
		else if (sex == '2') System.out.println("여성");
		

	}

}
