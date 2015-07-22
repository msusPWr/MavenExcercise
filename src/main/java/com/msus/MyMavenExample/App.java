package com.msus.MyMavenExample;

import java.util.Collection;
import java.util.function.Predicate;

/**
 * Hello world!
 *
 */
public class App {
	public static boolean returnIfAllBelowValue(Collection<Integer> list,Integer value){
		Predicate<Integer> isBiggerThan0 = (i)-> i > 0;
		Predicate<Integer> isBetween0AndValue = isBiggerThan0.and((i) -> i<value);
		return list.stream().allMatch(isBetween0AndValue);
		
	}
}
