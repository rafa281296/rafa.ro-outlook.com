package src;

import java.util.*;

public class Geometria {
	public static void main(String args[]){  

	ArrayList<Figura> lista = new ArrayList<Figura>();
	
	Quadrado quad = new Quadrado(10,10);
	Retangulo retan = new Retangulo(7,9);
	Triangulo tri = new Triangulo(2,6,9);
	Circulo cir = new Circulo(6);
	Losango lo = new Losango(3,5,7,9);
	
	
	lista.add(quad);
	lista.add(retan);
	lista.add(tri);
	lista.add(cir);
	lista.add(lo);
	}
}
