package Day12.Compare.Comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
class Book  implements Comparable<Book>{
	
	/**
	 * 
	 * 책(Book) 을 가격순으로 오름차순 정렬
	 * Comparable 인터페이스르 ㄹ구현
	 * compareTo() 메소드 오버라이딩
	 * 비교기준에 따라 양수, 0, 음수 변환
	 * Collections.sort() 메소드로 정렬
	 */
	
	String title;
	String author;
	int price;
	
	/**]
	 * compareTo()
	 * 해당 객체 this 와 비교 객체 o의 크기기준을 선정하여
	 * 반환하는 메소드
	 * return
	 * 		양수 (1) : 해당객체 > 비교객체
	 * 		0       : 해당객체 = 비교객체
	 *		음수(-1) :해당객체 < 비교객체
	 *
	 */
	
	@Override
	public int compareTo(Book o) {
		//가격순으로 오름차순 정렬
		int thisPrice = this.getPrice();
		int comPrice = o.getPrice();
		
		//두 가격을 비교하여, 비교기준에 따라 리턴해보세요.
		if (thisPrice > comPrice) {
			return 1;
			
		} else if(thisPrice < comPrice) {
			return -1;
		}
		else {
		return 0;
		}
		
	}
	
}

public class ComparableEx {

	public static void main(String[] args) {
		List<Book> bookList = new ArrayList<Book>();
		bookList.add( new Book("책1", "저자1", 10000));
		bookList.add( new Book("책2", "저자2", 30000));
		bookList.add( new Book("책3", "저자3", 50000));
		bookList.add( new Book("책4", "저자4", 40000));
		bookList.add( new Book("책5", "저자5", 20000));
		
		//정렬 전
		System.out.println("정렬 전" );
		for (Book book : bookList) {
			System.out.println(book);
		}
		//정렬
		//Book클래스에 구현한 compareTo()메소드의 비교기준에 따라 정렬된다.
		Collections.sort(bookList);
		//정렬 후
		System.out.println("정렬 후");
		for(Book book : bookList) {
			System.out.println(book);
			
		}
	System.out.println("----------------------------------");
	}
}
