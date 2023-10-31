import java.util.Random;

public class RandomNumbers{
	//Generar numeros aleatorios (entre 1 - 100)
	//Imprimir el numero de apariciones de cada numero

	public static final int DIFF_NUMBERS = 100;
	public static final int TOTAL_NUMBERS = 1000000;

	public static void main(String[] args){
		//Crear la matriz, inicializar con valores 0
		int[] numbers = new int[DIFF_NUMBERS + 1];

		for( int i = 0; i < numbers.length; i++)
			numbers[i] = 0;

		Random r = new Random();

		//Generar los numeros
		for(int i = 0; i < TOTAL_NUMBERS; i++)
			numbers[ r.nextInt( DIFF_NUMBERS ) +1 ]++;

		//Imprimir el resumen
		for(int i = 1; i <= DIFF_NUMBERS; i++)
			System.out.println( i + ": " + numbers[i]);
	}
}