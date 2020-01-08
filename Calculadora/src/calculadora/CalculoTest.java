package calculadora;



import org.junit.jupiter.api.Test;

class CalculoTest {

	@Test
	public void testCalculo() {
		
		double resultado = Calculadora.multiplicacion(8,9);
		double resultado2 = Calculadora.division(8,3);
		
		System.out.println("El resultado de la multipliacion es: "+resultado);
		System.out.println("El resultado de la division es: "+resultado2);
		
	}

}
