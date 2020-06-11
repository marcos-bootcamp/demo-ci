import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class EmpleadoTest {

	private List<String> _empleado;
	@BeforeEach
	void setUp() throws Exception {
		_empleado = Arrays.asList("Maria", "Monica", "Mario", "Montse", "Jose");
	}

	@Test
	void cantidadEmpleadoCon_MTest() {
		assertEquals(4,Empleado.cantidadEmpleadoCon_M(_empleado));
	}
	@Test
	void cantidadDeEmpleadoTest() {
		assertEquals(5,Empleado.cantidadDeEmpleado(_empleado));
	}
	@Test 
	void ordenaEmpleadoTest() {
		List<String> empleado = Arrays.asList("Jose","Maria", "Mario", "Monica", "Montse");
		assertEquals(empleado, Empleado.ordenaEmpleado(_empleado));
	}
	@Test
	void cantidadEmpleadoCon_ATest() {
		assertEquals(2, Empleado.cantidadEmpleadoCon_A(_empleado));
	}
	
	@Test
	void convertirMayusTest() {
		List<String> empleado = Arrays.asList("MARIA","MONICA", "MARIO", "MONTSE", "JOSE");
		assertEquals(empleado, Empleado.convertirMayus(_empleado));
	}
}
