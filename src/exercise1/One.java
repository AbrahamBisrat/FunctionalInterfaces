package exercise1;

import java.util.function.Supplier;

public class One {
	public static void main(String[] args) {
		// rewrite this method reference as a lambda function
		
		Supplier<Double> x = () -> Math.random() * 100;
		
		Supplier<Double> y = () -> Math.random();
		
		int loopCount = 10;
		
		for(int i = 0; i < loopCount; i++)
			System.out.println(x.get());
		
	}
}
