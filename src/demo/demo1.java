package demo;

import java.util.Arrays;
import java.util.List;

import functional.tools.f;
import functional.tools.operator;

public class demo1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		double b = f.reduce(Math.class,"max",1,3);
		System.out.println(b);
		
		Double a = f.reduce(Math.class,"abs",-2.2);
		System.out.println(a);

		List<Integer> x = Arrays.asList(1,2,3,4,5,6,7);
		
		Integer c = (Integer) f.reduce(operator.class, "add", x.toArray());
		System.out.println(c);

		Integer d = (Integer) f.reduce(operator.class, "mul",x.toArray(),2);
		System.out.println(d);

	}

}