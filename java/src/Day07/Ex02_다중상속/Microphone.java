package Day07.Ex02_다중상속;

public interface Microphone {

	int inputVolumeMax = 50;
	int inputVolumeMin = 50;
	
	//음성인식
	String receiveVoice(String voice);
	
}
