import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Empleado {
	/**
	 * Cuenta la cantidad de empleado en una lista que sus nombres comiencen con M
	 * @param nombres lista con los nombre de empleados
	 * @return retorna un valor de tipo long
	 */
	public static long cantidadEmpleadoCon_M(List<String> nombres) {
		long cantidad = nombres.stream()
						.filter((n)->n.startsWith("M"))
						.count();
		return cantidad;
	}
	
	/**
	 * Cuenta la cantidad de empleado de una lista
	 * @param empleados lista con los empleados
	 * @return retorna un valor de tipo long
	 */
	public static long cantidadDeEmpleado(List<String> empleados) {
		long cantidad = empleados.stream().count();
		return cantidad;
	}
	
	/**
	 * Ordena una lista de empleado de forma ascendente
	 * @param empleados lista de empleados
	 * @return retorna una lista de empleado ordenado
	 */
	public static List<String> ordenaEmpleado(List<String> empleados){
		List<String> ordenado = empleados.stream().sorted().collect(Collectors.toList());
		return ordenado;
	}
	
	/**
	 * Cuenta la cantidad de empleados de una lista que sus nombre terminan con "a"
	 * @param nombres lista de nombres de los empleados
	 * @return retorna un valor de tipo long 
	 */
	public static long cantidadEmpleadoCon_A(List<String> nombres) {
		long cantidad = nombres.stream()
						.filter((n)->n.endsWith("a"))
						.count();
		return cantidad;
	}
	
	
	/**
	 * Convierte una lista de empleados en mayuscula
	 * @param empleados lista de empleados
	 * @return retorna una lista de empleado en mayuscula
	 */
	public static List<String> convertirMayus(List<String> empleados){
		List<String> resultado = empleados.stream().map(String::toUpperCase).collect(Collectors.toList());
	      return resultado;
	}
	

	
	
}
