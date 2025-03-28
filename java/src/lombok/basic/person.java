package lombok.basic;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

// 롬복
//럼복은 어노테이션을 이영하며 코드를 자동 생성해준다.

//@NoArgsConstructor 기본 생성자
//@AllArgsConstructor 모든 매개변수 생성자
//@NonNuml필수 생성자
//
//@Getter getter의 매소드 자동완성
//@Setter setter의 매소드 자동완성
//@ToString @ToString의 메소드 자동완성
//@Data @NoArgsConstructor 
//
//@AllArgsConstructor @NonNuml




//@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
@ToString
public class person {

    @NonNull	private String name;
    @NonNull   private int age;
	private double height;
	private double weight;
}
