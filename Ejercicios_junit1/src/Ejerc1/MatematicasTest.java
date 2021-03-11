package Ejerc1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class MatematicaTest {

	
	@Test
	@DisplayName("Conjunto de pruebas al factorial")
	void testMayor() {
		assertAll("Prueba de factorial",
			()-> assertEquals(2, Matematicas.calcularFactorial(2)),
			()-> assertEquals(6, Matematicas.calcularFactorial(3)),
			()-> assertEquals(1, Matematicas.calcularFactorial(0)),
			()-> assertEquals(-1, Matematicas.calcularFactorial(-5)),
			()-> assertEquals(24, Matematicas.calcularFactorial(4)),
			()-> assertEquals(120, Matematicas.calcularFactorial(5)),
			()-> assertEquals(720, Matematicas.calcularFactorial(6))
		);
		
	}

}
