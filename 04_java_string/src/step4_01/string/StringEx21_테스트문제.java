package step4_01.string;

import java.util.Arrays;
import java.util.Iterator;

//문제) moneyData 와 nameData 를 조합해서 userData를 아래와같이 만들어보세요

/*
* 100001/이만수/600
* 100003/유재석/7000
* 100001/이만수/100
* 100002/이영희/400
* 100001/이만수/600
* 100004/박명수/900
* 100001/이만수/130
* 100003/유재석/200
* 100002/이영희/700
* 100002/이영희/900
* 100004/박명수/800
*/



public class StringEx21_테스트문제 {

	public static void main(String[] args) {
		
		String nameData = "";
		nameData+=	"100001/이만수";nameData += "\n";		
		nameData += "100002/이영희";nameData += "\n";
		nameData += "100003/유재석";nameData += "\n";
		nameData += "100004/박명수";nameData += "\n";
		nameData += "100005/최여정";nameData += "\n";
		nameData += "100006/박병욱";
		
		String  moneyData = "";
		moneyData += "100001/600";moneyData += "\n";	
		moneyData += "100003/7000";moneyData += "\n";		
		moneyData += "100001/100";moneyData += "\n";		
		moneyData += "100002/400";moneyData += "\n";		
		moneyData += "100001/600";moneyData += "\n";		
		moneyData += "100004/900";moneyData += "\n";		
		moneyData += "100001/130";moneyData += "\n";		
		moneyData += "100003/200";moneyData += "\n";		
		moneyData += "100002/700";moneyData += "\n";	
		moneyData += "100002/900";moneyData += "\n";
		moneyData += "100004/800";

		String userData = "";
		
		String[] temp = nameData.split("\n");
		String[] temp2 = moneyData.split("\n");
		String[] name = new String[temp2.length];
		
		for (int i = 0; i < temp2.length; i++) {
			String[] temp3 = temp2[i].split("/");
			for (int j = 0; j < temp.length; j++) {
				String[] temp4 = temp[j].split("/");
				if(temp3[0].equals(temp4[0])) {		
					name[i] = temp4[1];
				}
				
			}
			temp2[i] = temp3[0] + "/" + name[i] + "/" + temp3[1];
			System.out.println(temp2[i]);
		}
		
		

	}

}
