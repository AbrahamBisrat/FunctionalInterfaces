package exercise1;

import java.util.function.Supplier;

public class Supplier_hands {
	public static void main(String[] args) {
		
		int min = 2;
		int max = 15;
		
		Supplier<Double> thisWorks = Math::random;
		
		int loopCount = 10;
		
		
		for(int i = 0; i < loopCount; i++)
			System.out.println((int)Math.floor((thisWorks.get() * 10) * (max - min) + min));
	}
}
