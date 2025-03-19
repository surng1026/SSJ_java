package Day08.Ex04_AutoClose;

import java.io.FileNotFoundException;

/**
 * test,txt 파일을 입력하여 텍스트파일의 내용을 출력하는 프로그램
 */


public class AutoClose {

	public static void main(String[] args) {
		
		FileInputStream fis = null;
		InputStreamReader in = null;
		
		//AutoClose
		//try (자동으로 자원해제할 객체 생성 ) {}
		//finally 구문에서 close()하지 않아도, 자동으로 자원해제 해준다.
		//AutoClosable 인터페이스를 구현한 클래스이어야 자동으로 자원해제 가능
	try {	FileInputStream fis = new FileInputStream("test.txt");
	InputStreamReader in = new InputStreamReader(fis, "UTF-8");
				
			int read = 0;
			while((read =in.read()) != -1);
			System.out.println((char) read );
	}	catch (FileNotFoundException e) {
		e.printStackTrace();
		System.err.println("파일을 찾을 수 없습니다.");
	}
	}	catch (UnsupportedEncodingException e) {
		e.printStackTrace();
		System.err.println("지원하지 않는 인코딩 타입입니다.");
	}
	}	catch (IOException e) {
		e.printStackTrace();
		System.err.println("입출력 관련 예외가 발생했습니다.");
	}
	
	finally {
		if (fis != null) {
			try {
				fis.close();
			}catch (Exception e) {
				e.printStackTrace();
			}
		}
		if (in != null) {
			try {
				in.close();
			e.printStackTrace();
			}
			
		}
	
	
	
	}
	
}
