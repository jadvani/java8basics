/***
Created by Javier Advani
on May 29, 2018
***/
package es.wata.advani;

import java.util.Optional;

public class OptionalApp {

	private void checkBasicOptionalFunctionality(String valor) {
		// System.out.println(valor.contains("mito"));

		Optional<String> op = Optional.empty();
		op.get();

	}

	private void orElse(String valor) {
		Optional<String> op = Optional.of(valor);
		// si quiero el contenido me apoyo en método get
		String x = op.orElse("predeterminado");
		System.out.println(x);
	}

	static Optional<Double> safeDivision(double a, double b) {
		if (b == 0) {
			System.out.println("no me mandes estas cosas, te devuelvo empty");
			return Optional.empty();
		} else {
			return Optional.of(a / b);
		}
	}

	private static Optional<Double> divideThreeTimes(double a, double b) {
		return safeDivision(a, b).flatMap(x -> safeDivision(x, b)).flatMap(x -> safeDivision(x, b));
	}

	public void orElseThrow(String valor) {
		Optional<String> op = Optional.ofNullable(valor);
		op.orElseThrow(NumberFormatException::new); // si mi valor es nulo, lánzame esta excepción

	}

	/*
	 * devuelve false si es null
	 */
	private void isPresent(String valor) {
		Optional<String> op = Optional.ofNullable(valor);
		System.out.println(op.isPresent());

	}

	public static void main(String[] args) {
		OptionalApp app = new OptionalApp();
		System.out.println(divideThreeTimes(3, 0));
		app.isPresent(null);
		app.orElse(null);
		app.checkBasicOptionalFunctionality(null); // da null pointer exception
		safeDivision(3, 0);
	}
	// no es recomendable para aplicaciones críticas en rendimiento. Es un proceso
	// costoso.

}
