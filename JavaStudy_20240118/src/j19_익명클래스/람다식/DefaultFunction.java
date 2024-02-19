package j19_익명클래스.람다식;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class DefaultFunction {

	public static void main(String[] args) {

		Runnable runnable = () -> {
			System.out.println("runnable 인터페이스를 활용한 람다식");
			System.out.println("실행문 여러개 가능");
			
		};
		
		runnable.run();
		
		Supplier<Integer> supplier = () -> 200;
		Supplier<Integer> supplier2 = () -> {
			System.out.println("서플라이어");
			return 100;
		};
		
		System.out.println(supplier.get());
		System.out.println(supplier2.get());
		
		Consumer<String> consumer = name ->{
			System.out.println("이름 : " + name);
		};
		
		consumer.accept("홍길동");
		
		Function<Integer,Integer> function = num -> num*num;
		System.out.println(function.apply(100));
		Predicate<String> predicate = str -> str ==null || str.isBlank();
		System.out.println(predicate.test(""));
		System.out.println(predicate.test("홍길동"));
		System.out.println(predicate.test(null));

	}

}
