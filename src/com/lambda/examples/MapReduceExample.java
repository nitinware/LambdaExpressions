package com.lambda.examples;

import java.util.Arrays;
import java.util.List;

public class MapReduceExample {

	public static void main(String[] args) {
		List<Integer> cost = Arrays.asList(100, 200, 300, 400);
		double bill = cost.stream().map((cst) -> cst + .12*cst).reduce((sum, cst) -> sum+cst).get();
		System.out.println("Total: " + bill);
	}

}
