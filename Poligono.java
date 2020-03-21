package src;

public abstract class Poligono extends Figura {
	
	int base;
	int altura;
	
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
	public double Area() {
		double area = base*altura;
		return area;
		// TODO Auto-generated method stub
		
	}

}
