package exercicio_3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner leitor = new Scanner(System.in);

		Pessoa pessoasCadastradas[] = new Pessoa[10];
		int contador = 0;

		while(contador<10) {

			System.out.print("Digite o nome: ");
			String nome = leitor.nextLine();

			System.out.print("Digite o sobrenome: ");
			String sobrenome = leitor.nextLine();
			
			if(contador > 0) {
				if(pessoasCadastradas[contador -1].getNome().equals(nome)) {
					if(pessoasCadastradas[contador -1].getSobrenome().equals(sobrenome)){
						break;
					}
				}
			}

			System.out.print("Digite a sua data de nascimento (dd/mm/aaaa): ");
			String data_nasc = leitor.nextLine();
			Data nascimento = new Data(data_nasc);
			int idade = Pessoa.calculaIdade(nascimento);
			System.out.printf("%d/n", idade);


			System.out.print("Digite a altura em centimetros: ");
			int altura = leitor.nextInt();

			System.out.print("Digite o peso: ");
			double peso = leitor.nextDouble();
			
			Pessoa ultimaPessoa = new Pessoa(nome, sobrenome, idade, altura, peso);

			System.out.printf("O seu IMC e: %.2f \n", ultimaPessoa.getIMC());
			
			ultimaPessoa.InformaObesidade();
			
			pessoasCadastradas[contador] = ultimaPessoa;
			
			contador++;
		}
		
		leitor.close();

	}
}
