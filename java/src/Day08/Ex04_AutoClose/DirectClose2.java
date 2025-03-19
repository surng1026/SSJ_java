package Day08.Ex04_AutoClose;

/**
 * test,txt 파일을 입력하여 텍스트파일의 내용을 출력하는 프로그램
 */


public class DirectClose2 {

	public static void main(String[] args) {
		
		FileInputStream fis = null;
		InputStreamReader in = null;
		
		// test.xtx 파일을 입력할 수 있도록 연결
		fis = new FileInputStream("test.txt");
		in = new InputStreamReader(fis, "UTF-8");
				
	}
	
}
