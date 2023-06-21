package com.funcional;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
import com.funcional.Tupla;
public class Main {
	public static void main(String[] args) { 
		
		Function<String, String[]> f = a -> a.split("\\s+");
		
		Function<String[], List<Tupla<String, Integer>>> g = b ->{
			Set<String> tmp = new HashSet<>(Arrays.asList(b));
			List<Tupla<String, Integer>> list = tmp.stream().map(c -> Tupla.<String, Integer>getTupla(c, b)).collect(Collectors.toList());
			return list;
		};
		
		Function<String, List<Tupla<String, Integer>>> comp = Compo.<String, String [], List<Tupla<String, Integer>>>composicion1().apply(f).apply(g);
		
		System.out.println(comp.apply("ola abc como abc estas ola"));
	}
}
