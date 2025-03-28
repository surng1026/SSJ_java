package Day12.Collection.Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapEx {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		//요소 추가
		map.put("해원", 100);
		map.put("설윤", 100);
		map.put("릴리", 100);
		map.put("지우", 100);
		map.put("지니", 100);
		map.put("규진", 100);
		map.put("배이", 100);
		
		//기존에 있는 key "해원"을 중복해서 추가
		// 중복해서 ket를 추가하면, 마지막에 추가한 값으로 지정된다.
		map.put("해원",99);
		
		System.out.println("총 개수 : " map.size());
		System.out.println();
		System.out.println("해원의 코딩 성적 : " + map.get("해원"));
		System.out.println("설윤의 코딩 성적 : " + map.get("설윤"));
		
		
		//요소 제거
		map.remove("조은");
		//map 반복 1
		Set<String> keySet = map.keySet();
		for (String key : keySet) {
			Integer value = map.get(key);
			System.out.println(key + " : " + value);
		}
		
//		map 반복2 - integer 사용
		//map.entrySet() : iterator() 메소드를 가진 Set 객체 반환
		//entrySet.iterator() : Map 컬렉션을 순차검색할 수 있는 iterator 객체 반환
		//Entry : 키와 값(key, value)를 한 쌍으로 지정한 자료구조
		
		Set<Map.Entry<String,Integer>> entrySet = map.entrySet();
		Iterator<Map.Entry<String, Integer>> entryIterator = entrySet.iterator();
		
		while (entryIterator.hasNext()) {
			Map.Entry<String,Integer> entry = entryIterator.next();
			String key = entry.getKey();
			Integer value = entry.getValue();
			System.out.println(keey + " : " + value);
			
		
		}
		System.out.println();
		//map 반복 3 formap
		formap : ctrl + 
		
	
	
	}
}
