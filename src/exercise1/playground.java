package exercise1;

import java.util.function.BiFunction;
import java.util.function.Supplier;

public class playground {
	public static void main(String[] args) {
		
		Supplier<Double> number = Math::random;
		
//		for (int i = 0; i < 10; i++)
		
		System.out.println(number.get());
		
		
		BiFunction<Integer, Integer, Integer> biGames = (x, y) -> x + y;
		
		System.out.println(biGames.apply(1, 2));
		
		
		TriFunction<Integer, Integer, Integer, Integer> tri = (x, y, z, r) -> x + y + z;
		
	}
}
