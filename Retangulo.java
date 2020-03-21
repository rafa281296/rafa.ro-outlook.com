package src;

public class Retangulo extends Poligono implements Diagonal {

	
	public Retangulo(int base, int altura) {
		this.altura=altura;
		this.base=base;
		// TODO Auto-generated constructor stub
	}


	public int getBase() {
		return base;
	}

	public void setBase(int base) {
		this.base = base;
	}

	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}
	
	@Override
	public double Perimetro() {
		return altura;
		// TODO Auto-generated method stub
		
	}
	

	@Override
	public double Diagonal() {
		double diagonal = (base^2)+(altura^2);
		diagonal = diagonal*diagonal;
		return diagonal;
	}

}
