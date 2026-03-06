package exercicio_2;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {

	Scanner leitor = new Scanner(System.in);
	
	System.out.print("Digite o nome: ");
	String nome = leitor.nextLine();
	
	System.out.print("Digite o sobrenome: ");
	String sobrenome = leitor.nextLine();
	
	System.out.print("Digite a idade: ");
	int idade = leitor.nextInt();
	
	System.out.print("Digite a altura em centimetros: ");
	int altura = leitor.nextInt();
	
	System.out.print("Digite o peso: ");
	double peso = leitor.nextDouble();
	
	Pessoa fulano = new Pessoa(nome, sobrenome, idade, altura, peso);
	
	System.out.printf("O seu IMC e: %.2f \n", fulano.getIMC());
	
	fulano.InformaObesidade();
	
	leitor.close();
	
	}
}
