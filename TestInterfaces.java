import java.util.InputMismatchException;
import java.util.Scanner;
public class TestInterfaces {
public static void main(String[] args){
    try{
    	
    Scanner input = new Scanner(System.in);
    System.out.println("Retangulo");
    System.out.println("Altura:");
	float altura = input.nextFloat();
	System.out.println("Largura:");
	float largura = input.nextFloat();
	Retangulo ret = new Retangulo(altura,largura);
	ret.getPerimetro();
	ret.print();
	
	System.out.println("==============================================");
	System.out.println("Triangulo");
	System.out.println("Lado 1:");
	float lado1 = input.nextFloat();
	
	System.out.println("Lado 2:");
	float lado2 = input.nextFloat();
	
	System.out.println("Lado 3:");
	float lado3 = input.nextFloat();
	
	Triangulo tri = new Triangulo(lado1,lado2,lado3);
	tri.getArea();
	tri.getPerimetro();
	tri.print();
	
	System.out.println("==============================================");
	System.out.println("Circulo");
	System.out.println("Raio:");
	float raio = input.nextFloat();
	Circulo cir = new Circulo(raio);
	cir.getArea();
	cir.getPerimetro();
	cir.print();
}
  catch(InputMismatchException e1){
    System.out.println("Somente Números!");	
    }
  catch(Exception e){
    	System.out.println("Ocorreu um erro no Teste!");
    }
  finally{
	  System.out.println("Fim de código");
  }
  input.close();
}
}
