import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class OperacionesTest {


	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	void sumaRangoTest() {
		assertEquals(4950, Operaciones.sumaRango(0, 100));
	}
	
	void productoTest() {
		assertEquals(362880, Operaciones.producto(1, 10));
	}
	
	@Test
	void numeroMaxTest() {
		List<Integer> numeros = Arrays.asList(1,2,55,90,3,7,9,20);
		assertEquals(90, Operaciones.numeroMax(numeros));
	}
	
	@Test
	void numeroMinTest() {
		List<Integer> numeros = Arrays.asList(1,2,55,90,3,7,9,20);
		assertEquals(1, Operaciones.numeroMin(numeros));
	}
	@Test
	void buscarNumeroTest() {
		List<Integer> numeros = Arrays.asList(1,2,55,90,3,7,9,20);
		assertEquals(5, Operaciones.buscarNumero(numeros, 3));
	}
}
