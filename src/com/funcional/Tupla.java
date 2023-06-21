package com.funcional;

public final class Tupla<S, I> {
	
	private final S palabra;
	
	private final I cantidad;

	public Tupla(S palabra, I cantidad) {
		this.palabra = palabra;
		this.cantidad = cantidad;
	}

	public S getPalabra() {
		return palabra;
	}

	public I getCantidad() {
		return cantidad;
	}

	@Override
	public String toString() {
		return String.format("(%s, %s)", palabra, cantidad.toString());
	}
	
	
	static <S,I> Tupla<S,I> getTupla(String palabra, String[] pv){
		Integer contador = 0;
		
		for(int i = 0 ; i < pv.length; i++) {
			if(palabra.equals(pv[i])) {
				contador ++;
			}
		}
		return new Tupla(palabra, contador);
	}
	
}
