public class OperatorTest{
	// Prpgrama que ilustra los operadores básicos
	// La salida es la siguiente
	// 12 8 6
	// 6 8 6
	// 6 8 14
	// 22 8 14
	// 24 10 33

	public static void main(String[] args){
		int a = 12, b = 8, c = 6;

		System.out.println( a + " " + b + " " + c );
		a = c;
		System.out.println( a + " " + b + " " + c );
		c += b;
		System.out.println( a + " " + b + " " + c );
		a = b + c;
		System.out.println( a + " " + b + " " + c );
		a++; //a vale 22
			 //a vale 23
		++b; // b vale 9
		c = a++ + ++b; //a vale 23 y b vale 10
		//a vale 33
		System.out.println( a + " " + b + " " + c );
	}
}