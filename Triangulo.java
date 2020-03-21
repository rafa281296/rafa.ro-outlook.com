package src;

public class Triangulo extends Poligono {
	
	


	public Triangulo(int lado1, int lado2, int lado3) {
		
		// TODO Auto-generated constructor stub
	}


	@Override
	public double Perimetro() {
		return altura;
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public double Area() {
		double area = (base*altura)/2;
		return area;
	
	}

}
