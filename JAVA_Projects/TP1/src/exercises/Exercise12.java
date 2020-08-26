package exercises;
import java.util.Scanner;
public class Exercise12 {	
    private static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Cuantos dados fueron salieron con el numero 6");
		int sixes = Integer.parseInt(input.nextLine()); 
		if (sixes >3 || sixes < 0   ){
			System.out.println("Numero no valido");
		} else {
		switch (sixes) {
 		case 0:  System.out.println("Insuficiente");
 		break;
		case 1:  System.out.println("Regular");
		break;
		case 2:  System.out.println("Muy Bien");
		break;
		case 3:  System.out.println("Excelente");
		break;
		}
	  }
	}

}