package javastudy;

import java.util.Date;

public class Welcome {

	public static void main(String[] args) {
		// 시간에 따라 인사말 출력하기
		
		Date date = new Date();
		int currentHour = date.getHours();

		System.out.println("현재시간은 " + date);
		if(currentHour < 11) {
			System.out.println("Good morning");
		}else if(currentHour < 15) {
			System.out.println("Good afternoon");
		}else if(currentHour < 20) {
			System.out.println("Good evening");
		}else {
			System.out.println("Good night");
		}
	}

}
