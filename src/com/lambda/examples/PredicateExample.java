package com.lambda.examples;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateExample {

	public static void main(String[] args) {
		
		List<String> friends = Arrays.asList("Nitin", "Pratik", "Subin", "Pankaj", "Pradeep");
		
		System.out.println("Friends names which starts with N: ");
		filter(friends, (name) ->((String) name).startsWith("N"));
		
		System.out.println("Friends names which starts with P: ");
		filter(friends, (name) ->((String) name).startsWith("P"));
		
		System.out.println("Friends names which starts with n: ");
		filter(friends, (name) ->((String) name).endsWith("n"));
		
		//combine two or more predicates into one.
		Predicate<String> startsWithP = (n) -> n.startsWith("P");
		Predicate<String> fiveCharLong = (n) -> n.length() == 6;
		
		friends.stream()
				.filter(startsWithP.and(fiveCharLong))
				.forEach((n) -> System.out.println("Name, which starts with 'P' and five char long is : " + n));
		
	}
	
	public static void filter(List<String> names, Predicate<String> condition){
		for(String name: names) {
			if(condition.test(name)) {
				System.out.println(name + " ");
			}
		}
	}

}
