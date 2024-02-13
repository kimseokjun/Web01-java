package j14_lombok;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data	//게터 세터 이꿜스 투스트링 다 들어있다고합니다!
@lombok.Builder

public class Computer {

	private int code;
	private String name;
	private int year;
	
}
