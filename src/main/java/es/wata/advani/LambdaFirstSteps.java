/***
Created by Javier Advani
on May 28, 2018
***/
package es.wata.advani;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.apache.commons.math3.util.Precision;

public class LambdaFirstSteps {

	public static void main(String[] args) {
		LambdaFirstSteps app = new LambdaFirstSteps();
		app.orderListOfNamesWithLambdas();
		System.out.println(app.computeWithLambdas());

	}

	private double computeWithLambdas() {
		Operation operation = (x, y) -> {
			return x + y;
		};

		return Precision.round(operation.compute(2, 3), 2);

	}

	public List<String> usarRemoveIf() {
		List<String> names = new ArrayList<>();
		names.add("Frank");
		names.add("Anne");
		names.add("Nick");
		names.add("Jake");
		names.removeIf(x -> x.equals("Nick"));

		return names;
	}

	private void orderListOfNamesWithLambdas() {

		List<String> names = usarRemoveIf();
		usarSort(names);
		names.forEach(System.out::println);
		// names.forEach(x -> System.out.println(x));

	}

	private void usarSort(List<String> names) {
		Collections.sort(names, (n1, n2) -> n1.compareTo(n2));
	}
}
