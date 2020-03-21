package src;

public class Circulo extends Figura {

	double raio;
	
	public Circulo(double raio) {
		this.raio=(3.14*(raio*raio));		
		// TODO Auto-generated constructor stub
	}


	@Override
	public double Area() {
		this.raio=raio;
		double area = (3.14*(raio));
		return area;
		// TODO Auto-generated method stub
		
	}

	@Override
	public double Perimetro() {
		return 0;
		// TODO Auto-generated method stub
		
	}

}
