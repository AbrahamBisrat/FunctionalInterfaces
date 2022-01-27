package exercise1;

import java.util.function.Supplier;

public class playground {
	public static void main(String[] args) {
		
		Supplier<Double> number = Math::random;
		
//		for (int i = 0; i < 10; i++)
		
		System.out.println(number.get());
		
	}
}
