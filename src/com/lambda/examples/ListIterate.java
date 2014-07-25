package com.lambda.examples;

import java.util.Arrays;
import java.util.List;

public class ListIterate {

	public static void main(String[] args) {
		List<String> friends = Arrays.asList("Nitin", "Pratik", "Pankaj", "Subin");
		// Java 8 Collections looping.
		friends.forEach(n -> System.out.println(n));
		// Using method reference.
		friends.forEach(System.out::println);
	}

}
