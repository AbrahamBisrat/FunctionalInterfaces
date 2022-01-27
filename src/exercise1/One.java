package exercise1;

import java.util.function.Supplier;

public class One {
	public static void main(String[] args) {
		// rewrite this method reference as a lambda function
		
		int min = 4;
		int max = 10;
		
		Supplier<Double> x = () -> Math.random();
		
		Supplier<Double> y = () -> Math.random();
		
		int loopCount = 3;
		
		System.out.println("\tlambdas\n");
		
		for(int i = 0; i < loopCount; i++)
			System.out.println(minMaxRanger(x.get(), min, max));
		
		// implementation using inner-class that implements Supplier<T>
		
		class SupplierFun implements Supplier<Double>{
			@Override
			public Double get() {
				return Math.random();
			}
		}
		
		SupplierFun sf = new SupplierFun();
		
		System.out.println("\n\tinner-class\n");
		
		for(int i = 0; i < loopCount; i++)
			System.out.println(minMaxRanger(sf.get(), min, max));
		
		
	}
	public static int minMaxRanger(double thisNum, int min, int max) {
		return (int) Math.floor(thisNum * (max - min) + min);
	}
}
