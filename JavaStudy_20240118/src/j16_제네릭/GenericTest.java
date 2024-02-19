package j16_제네릭;

import lombok.Data;


@Data

public class GenericTest<T> {	//T 제네릭 타입 T에는 기본 자료형을 들어올수가 없음
	private int number;
	private T data;
}
