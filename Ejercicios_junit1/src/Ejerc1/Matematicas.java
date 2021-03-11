package Ejerc1;

/*
 * Programa que usa un método que dado un número positivo devuelve su factorial.
 * Si el número es negativo se mostrará un mensaje de error y se devolverá un -1. 
 * 
 * Este método se usa desde el main para escribir los factoriales desde 0 hasta un número 
 * límite que se pida por teclado. 
 * 
 * */




public class Matematicas {
	
	
	
	

	/**
	 * Método que calcula el factorial de un número positivo.
	 * Si el número es negativo muestra un mensaje de error y devuelve un -1
	 * 
	 * @param numero
	 *            numero
	 * @return factorial del numero, o -1 si es negativo
	 */
	public static long calcularFactorial(int numero) {
		long factorial = 1;
		int contador;

		if (numero < 0) {
			factorial = -1;
		} else {
			contador = 1;
			while ( contador <= numero) {
				factorial = factorial * contador;
				contador++;
			}
		}
		
		return factorial;
	}
}
