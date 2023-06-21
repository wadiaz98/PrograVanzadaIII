package com.funcional;

import java.util.function.Function;

public interface Compo <T,U,V> {
	
	 public static <T,U,V> Function<Function<T,U>, Function<Function<U,V>, Function < T,V>>> composicion1(){
		
		 return f -> g -> x -> g.apply(f.apply(x));
	}
	 
	public  static <T> Function<Function<T,T>, Function<Function<T,T>, Function < T,T>>> composicion(){
			
		 return f -> g -> x -> f.apply(g.apply(x));
	}
}
