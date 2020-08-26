package exercises;
import java.util.Scanner;
public class Exercise5 {
	private static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Ingrese un primer numero");
		int num1 = input.nextInt();
		System.out.println("Ingrese un segundo numero");
		int num2 = input.nextInt();
		if (num2 == 0) {
			System.out.println(" No se puede dividir por cero");
		} else {
			System.out.println( num1 + " / "  + num2 + " = " + (num1/num2));
		}
     	input.close();	
	}


}
