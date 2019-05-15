
public class Retangulo implements IShape,IShow{
private double altura , largura;
    public Retangulo(double altura , double largura){
    	this.altura = altura;
    	this.largura = largura;
    }
	@Override
	public double getArea() {
		return this.altura*this.largura;
	}
	@Override
	public void print(){
    System.out.println("Retangulo - A área é:"+ getArea());
    System.out.println("Retangulo - O perímetro é:"+getPerimetro());
	}
	@Override
	public double getPerimetro() {
		return 2*(this.altura + this.largura);
	}

}
