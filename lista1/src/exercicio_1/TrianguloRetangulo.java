package exercicio_1;


class TrianguloRetangulo {
	private double cateto1;
	private double cateto2;
	private double hipotenusa;
	
	public TrianguloRetangulo (double cateto1, double cateto2) {
		this.cateto1 = cateto1;
		this.cateto2 = cateto2;
	}
	
	public double calculaHipotenusa() {
		this.hipotenusa = Math.sqrt( Math.pow(this.cateto1, 2) + Math.pow(this.cateto2, 2 ) );
		
		return this.hipotenusa;
	}
	
	public double CalculaArea() {
		return (this.cateto1 * this.cateto2) / 2;
	}
	
	
}
