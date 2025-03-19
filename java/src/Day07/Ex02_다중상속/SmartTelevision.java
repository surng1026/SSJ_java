package Day07.Ex02_다중상속;

import java.text.MessageFormat;

//다중 구현
//public class 클래스명, implements 인터페이스A,인터페이스B...{}
public class SmartTelevision implements SmartRemoteControl, Searchable{

	int volume;
	int channel;
	String keyword;
	int x,y;
	
	@Override
	public void tornOn() {
		System.out.println("전원 ON");
		
	}
	@Override
	public void tornOff() {
		// TODO Auto-generated method stub
		System.out.println("전원 OFF");
		
	}
	@Override
	public void setVolume() {
		// TODO Auto-generated method stub
		System.out.println("volume" + volume);
		
	}
	@Override
	public void setChannel() {
		// TODO Auto-generated method stub
		System.out.println("channel : " + channel);
		
	}
	@Override
	public String receiveVoice(String voice) {
		// TODO Auto-generated method stub
		System.out.println("음성입력 : " + voice);
		return "voice : " + voice;
	}
	@Override
	public int channelSearch(String keyword) {
		int channel = 0;
		switch (keyword) {
		case "SBS": channel =5; break;
		case "KBS": channel =7; break;
		case "MBS": channel =11; break;
		case "Mnet": channel =27; break;
		case "ENA": channel =30; break;
			
		
		}
		return channel;
	}
	@Override
	public String[] contentSearch(String keyword) {
		String[] movieContent = {"포레스트 검프", "신세계", "러덜리스", "마녀", "말할 수 없는 비밀"};
		String[] idolContents = {"아이브", "에스파", "블랭핑크", "BTS", "뉴진스"};
		String[] recommentContents = {"노바꾸", "경영자들", "핑계고", "굿데이", "알클"};
		String[] choiceContents
		switch (keyword) {
		case "영화":
			choiceContents = movieContent;
			break;
		case "아이돌":
			choiceContents = idolContents;
			break;
	
			break;

		
		}
		return choiceContents;
	}
	@Override
	public void touch(int x, int y) {
		this.x = x;
		this.y = y;
		System.out.println("(x,y) : " + MessageFormat.format("{}, {}, x,y")"));
	}
	
}
