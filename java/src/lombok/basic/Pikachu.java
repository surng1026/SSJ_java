package lombok.basic;

import java.util.Scanner;

import lombok.Builder;
import lombok.Data;

@Data
@Builder //
//중첩클래스를 어떠 쓰냐? 
//^여기씀
public class Pikachu {

	int energy;
	String type;
	int level;
Scanner sc = new Scanner(System.in);
}
