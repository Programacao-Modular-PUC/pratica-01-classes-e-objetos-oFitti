package exercicio_3;

public class Data {
	private int dia;
	private int mes;
	private int ano;
	
	public int getDia() {
		return dia;
	}
	public void setDia(int dia) {
		this.dia = dia;
	}
	public int getMes() {
		return mes;
	}
	public void setMes(int mes) {
		this.mes = mes;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}

	public Data (String data) {
		String[] partes = data.split("/");
	    this.dia = Integer.parseInt(partes[0]);
	    this.mes = Integer.parseInt(partes[1]);
	    this.ano = Integer.parseInt(partes[2]);
	}

}
