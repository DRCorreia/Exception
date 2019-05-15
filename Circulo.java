
public class Circulo implements IShow,IShape {
    double raio;
    public Circulo(double raio){
    	this.raio = raio;
    }
	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return 3.14*(raio*raio);
	}

	@Override
	public double getPerimetro() {
		
		return 2*3.14*raio;
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		 System.out.println("Circulo - A área é:"+ getArea());
		 System.out.println("Circulo - O perímetro é:"+getPerimetro());
	}

}
