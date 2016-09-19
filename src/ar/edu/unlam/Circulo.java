package ar.edu.unlam;

public class Circulo {
	private Double radio ;
	private Double perimetro;
	
	public Circulo (Double radioCirculo){
	
		this.radio = radioCirculo;
		this.setPerimetro(0.0);
		
	}
	 
	
	public Double obtenerRadioDeUnCirculo (){
		
		return this.radio;
		
	}
	
	
	public Double obtenerPerimetroDeUnCirculo (){ 
		
		return this.setPerimetro(2 * 3.14 * this.radio);
	}
	
	

	public Double getPerimetro() {
		
		return perimetro;
	}


	public Double setPerimetro(Double perimetro) {
		
		this.perimetro = perimetro;
		return perimetro;
	}
}