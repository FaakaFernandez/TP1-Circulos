package ar.edu.unlam;

import static org.junit.Assert.*;
import org.junit.Test;

public class TestCirculo {

	@Test
	public void crearCirculoConRadio2() {
        Circulo miCirculo = new Circulo (2.0); 
		assertEquals(2.0,miCirculo.obtenerRadioDeUnCirculo(),0.1);
	}
	
	@Test
	public void crearCirculoConRadio3Punto7() {
        Circulo miCirculo = new Circulo (3.7);
		assertEquals(3.7,miCirculo.obtenerRadioDeUnCirculo(),0.1);
	}
	
	@Test
	public void crearCirculoConRadio5() {
        Circulo miCirculo = new Circulo (5.0);
		assertEquals(5.0,miCirculo.obtenerRadioDeUnCirculo(),0.1);
	}
	
	@Test
	public void crearCirculoConRadio10Punto9() {
        Circulo miCirculo = new Circulo (10.9);
    	assertEquals(10.9,miCirculo.obtenerRadioDeUnCirculo(),0.1);
	}
	 @Test
	public void crearCirculoDeRadio9Punto8(){
	    Circulo miCirculo = new Circulo (9.8);
	    assertEquals(9.8,miCirculo.obtenerRadioDeUnCirculo(),0.1);
	 }
	    	
	@Test
	public void queElPerimetroDeUnCirculoDeRadio9Punto8De61Punto51() {
        Circulo miCirculo = new Circulo (9.8);
    	assertEquals(61.51,miCirculo.obtenerPerimetroDeUnCirculo(),0.1);

	}
	
	@Test
	public void crearCirculoConRadio16Punto6() {
        Circulo miCirculo = new Circulo (16.6);
    	assertEquals(16.6,miCirculo.obtenerRadioDeUnCirculo(),0.1);
    	
	}
	@Test
    public void queElPerimetroDeUnCirculoDeRadio16Punto6De104Punto30(){
    	Circulo miCirculo = new Circulo (16.6);
        assertEquals(104.30,miCirculo.obtenerPerimetroDeUnCirculo(),0.1);
	}
}