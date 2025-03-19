package Day07.Ex02_다중상속;

import java.util.Scanner;

public class Main {

		public static void main(String[] args) {
			SmartTelevision tv = new SmartTelevision();
			
			tv.turnOn();
			tv.setVolume(20);
			int channel = tv.channelSearch("SBS");
			tv.setChannel(setChannel);
			
			Scanner sc = new Scanner(System.in);
			System.out.println("검색할 컨텐츠 : ");
			String keyword = sc.nextLine();
			String content = tv.contentSearch(keyword);
			
			for (int i = 0; i < args.length; i++) {
				System.out.println(content[i]);
				if (i < content.length-1) 
				 System.out.println(", ");	
				
			}
			System.out.println();
			tv.receiveVoice("뉴스틀어줘");
			tv.turnoff();
			sc.close();
			
		}
}
