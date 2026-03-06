package exercicio_2;

public class Pessoa {
	String nome;
	String sobrenome;
	int idade;
	int altura;
	double peso;
	double IMC;
	
	public Pessoa(String nome, String sobrenome, int idade, int altura, double peso) {
		setNome(nome);
		setSobrenome(sobrenome);
		setIdade(idade);
		setAltura(altura);
		setPeso(peso);
		setIMC(CalculaIMC());
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
		IMC = iMC;
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
	

}
