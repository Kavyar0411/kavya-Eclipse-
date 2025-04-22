package com.mvj.lambdaexp;

import java.util.Arrays;
import java.util.List;

public class WithCollection {
	public static void main(String[] args) {
		List<String>ob=Arrays.asList("ram","kumar","satya");
		ob.forEach(name->System.out.println(name));

}
}