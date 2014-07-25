package com.lambda.examples;

import java.util.Arrays;
import java.util.List;

public class StreamMapExample {

	public static void main(String[] args) {
		List<Integer> cost = Arrays.asList(100, 200, 300, 400);
		cost.stream().map((cst) -> cst + .12*cst).forEach(System.out::println);
	}

}
