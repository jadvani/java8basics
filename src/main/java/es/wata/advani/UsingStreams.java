/***
Created by Javier Advani
on May 28, 2018
***/
package es.wata.advani;

import java.util.ArrayList;
import java.util.List;

public class UsingStreams {
	List<String> numbers = new ArrayList<>();
	List<String> names = new ArrayList<>();

	public UsingStreams() {
		numbers.add("1");
		numbers.add("2");
		numbers.add("3");
		numbers.add("4");
		numbers.add("1");
		numbers.add("5");

		names.add("Frank");
		names.add("Anne");
		names.add("Nick");
		names.add("Jake");
		names.add("Javier");

	}

	public static void main(String[] args) {

		UsingStreams example = new UsingStreams();
		System.out.println("filterElementsBeginningByJ");
		example.filterElementsBeginningByJ();
		System.out.println("orderNumberByDescending");
		example.orderNumberByDescending();
		System.out.println("transformToUpperCase");
		example.transformToUpperCase();
		System.out.println("limitToFirstTwoElementsOfList");
		example.limitToFirstTwoElementsOfList();

	}

	private void filterElementsBeginningByJ() {
		names.stream().filter(x -> x.startsWith("J")).forEach(System.out::println);

	}

	private void orderNumberByDescending() {
		numbers.stream().sorted((x, y) -> y.compareTo(x)).forEach(System.out::println);

	}

	/*
	 * 1.transform all the alphabetic characters of a String to UpperCase .........
	 * 2. add 1 to each number of numbers list
	 */
	private void transformToUpperCase() {
		names.stream().map(String::toUpperCase).forEach(System.out::println);
		// trad way
		// for (String number : numbers) {
		// int num = Integer.parseInt(number) + 1;
		// System.out.println(num);
		//
		// }

		numbers.stream().map(x -> Integer.parseInt(x) + 1).forEach(System.out::println);
	}

	private void limitToFirstTwoElementsOfList() {
		numbers.stream().limit(2).forEach(System.out::println);
	}

}
