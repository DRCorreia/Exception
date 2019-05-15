  

public class Triangulo implements IShape,IShow {
	 double lado1,lado2,lado3,altura,base;
	 public Triangulo(double lado1 , double lado2 , double lado3){
	    	this.lado1 = lado1;
	    	this.lado2 = lado2;
	    	this.lado3 = lado3;
	    }
	@Override
	public void print() {
		 System.out.println("Triangulo - A �rea �="+ getArea());
		 System.out.println("Triangulo - O per�metro �=" + getPerimetro());
		
	}

	@Override
	public double getArea() {
		double p = (this.lado1 + this.lado2 + this.lado3);
		p=p*(p-lado1)*(p-lado2)*(p-lado3);
		p=Math.sqrt(p);
	    return p;
	}

	@Override
	public double getPerimetro() {
		// TODO Auto-generated method stub
		return (this.lado1+this.lado2+this.lado3);
	}

}
