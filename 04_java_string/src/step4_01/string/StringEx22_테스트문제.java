package step4_01.string;

import java.util.Arrays;

//문제) 아래의 데이터는  각각의 회원이 물건을 구입했을때마다 기록한 내용이다.
//		 데이터를 아래와 같이 출력 하시요 (각 회원별 구입 총합 )	
/*
  =====================
	10001 김철수 2670
	10002 이영희 1950
	10003 유재석 4080
	10004 박명수 7130
   =====================		  
 */


public class StringEx22_테스트문제 {

	public static void main(String[] args) {
		
		String data = "10001/김철수/600\n";
		data += "10002/이영희/800\n";
		data += "10001/김철수/1400\n";
		data += "10003/유재석/780\n";
		data += "10002/이영희/950\n";
		data += "10004/박명수/330\n";
		data += "10001/김철수/670\n";
		data += "10003/유재석/3300\n";
		data += "10002/이영희/200\n";
		data += "10004/박명수/6800\n";
		
		String[] arr1 = data.split("\n");
		
		String[] customerNo = {"10001","10002","10003","10004"};
		String[] customerName = {"김철수","이영희","유재석","박명수"};
		int[] customerMoney = new int[customerNo.length];
		
		for (int i = 0; i < arr1.length; i++) {
			String[] temp = arr1[i].split("/");
			for (int j = 0; j < customerNo.length; j++) {
				if (temp[1].equals(customerName[j])) {
					customerMoney[j] += Integer.parseInt(temp[2]);
				}
			}
		}
		
		
		
		System.out.println("=====================");
		for (int i = 0; i < customerMoney.length; i++) {
			System.out.print(customerNo[i] + "\t");
			System.out.print(customerName[i] + "\t");
			System.out.print(customerMoney[i] + "\n");
		}
		System.out.println("=====================");
		

	}

}
