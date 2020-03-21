package src;

public class Quadrado extends Poligono implements Diagonal{
	
	public Quadrado(int base, int altura) {
		this.base = base;
		this.altura = altura;
		// TODO Auto-generated constructor stub
	}

	
	

	@Override
	public double Perimetro() {
		return altura;
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public double Diagonal() {
		double diagonal = base*(1.41);
		return diagonal;
	}
	
}
