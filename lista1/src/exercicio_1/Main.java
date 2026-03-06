package exercicio_1;

import java.util.Scanner;

public class Main  {
	
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		System.out.print("Digite o cateto 1: ");
		double c1 = leitor.nextDouble();
		
		System.out.print("Digite o cateto 2: ");
		double c2 = leitor.nextDouble();
		
		TrianguloRetangulo tri = new TrianguloRetangulo(c1,c2);
		
		System.out.printf("A hipotenusa e %.2f%", tri.calculaHipotenusa() );
		System.out.printf("A area do triangulo e %.2f%n", tri.CalculaArea() );

		
		leitor.close();
		
	}
}