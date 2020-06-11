import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Operaciones {

	/**
	 * Suma desde un valor base hasta un valor limite pasados por parametro
	 * @param desde valor entero base.
	 * @param hasta valor entero limite.
	 * @return retorna el resultado de la suma.
	 */
	public static int sumaRango(int desde, int hasta) {
		return IntStream.range(desde, hasta).sum();
	}
	
	/**
	 *Multiplica desde un valor base hasta un valor limite pasados por parametros
	 * @param min desde valor entero base.
	 * @param max hasta valor entero limite.
	 * @return retorna el resultado la multiplicación.
	 */
	public static int producto(int desde, int hasta) {
			IntStream inter = IntStream.range(desde, hasta);
			return inter.reduce(1, (a, b) -> a * b);

	}
	
	/**
	 * Calcula el número mayor de una lista 
	 * @param numeros lista de numeros enteros
	 * @return retorna el numero mayor de la lista
	 */
	public static int numeroMax(List<Integer> numeros) {
		int max = numeros.stream().mapToInt(precio -> precio.intValue()).max().getAsInt();
		return max;
	}
	
	/**
	 * Calcula el número menor de una lista 
	 * @param numeros lista de numeros enteros
	 * @return retorna el numero menor de la lista
	 */
	public static int numeroMin(List<Integer> numeros) {
		int min = numeros.stream().mapToInt(precio -> precio.intValue()).min().getAsInt();
		return min;
	}
	
	public static int buscarNumero(List<Integer> numeros, int buscar) {
		List<Integer> resultado = numeros.stream().filter(line -> buscar == line).collect(Collectors.toList());
		return resultado.get(0);
	}
	
}
