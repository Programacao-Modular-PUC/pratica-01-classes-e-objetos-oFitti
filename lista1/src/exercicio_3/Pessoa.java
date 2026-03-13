package exercicio_3;

import java.util.Calendar;

public class Pessoa {
	public Data getData_nascimento() {
		return data_nascimento;
	}

	public void setData_nascimento(Data data_nascimento) {
		this.data_nascimento = data_nascimento;
	}
	private String nome;
	private String sobrenome;
	private int idade;
	private int altura;
	private double peso;
	private double IMC;
	private Data data_nascimento;

	public Pessoa(String nome, String sobrenome, int idade, int altura, double peso) {
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.idade = idade;
		this.altura = altura;
		this.peso = peso;
		this.IMC = CalculaIMC();
	}

	public double CalculaIMC() {
		return getPeso() / Math.pow((getAltura()/100), 2);
	}

	public void InformaObesidade() {
		IMC = getIMC();

		if(IMC < 18.5) {
			System.out.println("Abaixo do peso");
		}else if(IMC <= 24.9){
			System.out.println("Peso normal");	
		}else if(IMC <= 29.9){
			System.out.println("Sobrepeso");
		}else if(IMC <=34.9){
			System.out.println("Obesidade grau 1");
		}else if(IMC <= 39.9){
			System.out.println("Obesidade grau 2");
		}else {
			System.out.println("Obesidade grau 3");
		}
	}

	static public int calculaIdade(Data nascimento) {
		Calendar hoje = Calendar.getInstance();
		int diaHoje = hoje.get(Calendar.DAY_OF_MONTH);
		int mesHoje = hoje.get(Calendar.MONTH) + 1;
		int anoHoje = hoje.get(Calendar.YEAR);
		
		int diferenca = anoHoje - nascimento.getAno();

		if(nascimento.getMes() > mesHoje) {
			return diferenca -1;
		}

		if(nascimento.getMes() < mesHoje) {
			return diferenca;
		}

		if(nascimento.getDia() > diaHoje) {
			return diferenca-1;
		}
		
		return diferenca;
	}



	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSobrenome() {
		return sobrenome;
	}
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public int getAltura() {
		return altura;
	}
	public void setAltura(int altura) {
		this.altura = altura;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public double getIMC() {
		return IMC;
	}
	public void setIMC(double iMC) {
		this.IMC = iMC;
	}

}
