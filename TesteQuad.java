package src;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TesteQuad {

	Quadrado quadrado;
	Retangulo retangulo;
	Circulo circulo;
	
	
	@BeforeEach
	void preparacao() {
		quadrado = new Quadrado(10,10); 
		retangulo = new Retangulo(5,3);
		circulo = new Circulo(4);
	}
	
	@Test
	void testAreaQuad() {
		double resultado = quadrado.Area();
		assertEquals(100, resultado);
	}
	
	@Test
	void testAreaRet() {
		double resultado = retangulo.Area();
		assertEquals(15,resultado);
	}
	
	@Test
	void testAreaCirc() {
		double resultado = circulo.Area();
		assertEquals(50,24,resultado);
	}

}
