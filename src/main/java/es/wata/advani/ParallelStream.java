/***
Created by Javier Advani
on May 29, 2018
***/
package es.wata.advani;

import java.util.ArrayList;
import java.util.List;

public class ParallelStream {

	private List<Integer> numbers;

	public void fill() {
		numbers = new ArrayList<>();
		for (int i = 1; i <= 10; i++) {
			numbers.add(i);
		}

	}

	public void classicStream() {
		numbers.stream().forEach(x -> System.out.println(x));

	}

	/*
	 * puede ayudar, pero peligroso para apps con java ee containers, en ambiente
	 * asíncrono etc streams paralelos pueden empeorar rendimiento
	 * 
	 * No conviene en ambientes en que se usa JPA y cosas así
	 */
	public void testParallelStream() {
		numbers.parallelStream().forEach(x -> System.out.println(x));
	}

	public static void main(String[] args) {
		ParallelStream test = new ParallelStream();
		test.fill();
//		test.classicStream();
		test.testParallelStream();
	}
}
