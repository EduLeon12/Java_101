package exercises;
import java.util.Scanner;

public class Exercise8 {
	private static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		
		System.out.println("Ingrese un numero entre 1 y 7");
  		int num1 = input.nextInt();
  		if ( 7 >= num1 && num1 >= 1) {
  			switch(num1) {
  			case 1: System.out.println("Hoy es Domingo"); break;
  			case 2: System.out.println("Hoy es Lunes"); break;
  			case 3: System.out.println("Hoy es Martes"); break;
  			case 4: System.out.println("Hoy es Miercoles"); break;
  			case 5: System.out.println("Hoy es Jueves"); break;
  			case 6: System.out.println("Hoy es Viernes"); break;
  			case 7: System.out.println("Hoy es Sabado"); break;
  			}
  		} else {
  			System.out.println("El dia ingresado no es valido");
  		}
  		
       input.close();
	}
	
	

}
