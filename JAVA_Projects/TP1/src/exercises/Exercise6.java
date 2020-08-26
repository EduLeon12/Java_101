package exercises;
import java.util.Scanner;
public class Exercise6 {

	private static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
      		System.out.println("Ingrese un numero entero mayor a cero");
      		int num1 = input.nextInt();
      		if (num1 < 0) {
      			System.out.println("Numero debe ser mayor a cero")	;
      		} else if ((num1 % 2) == 0) {
      			System.out.println("El numero es Par");
      		} else {
      			System.out.println("El numero es Impar");
      		}    
       input.close();
	}
}
