package exercises;
import java.util.Scanner;
public class Exercise13 {
	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Ingrese la cantidad de horas trabajadas en la semana");
		int basicHourPrice = 16,extraHourPrice = 20;	
		int hours = Integer.parseInt(input.nextLine());
		if (hours <= 0) {
			System.out.println("Vaya a trabajar");
		} else if( hours<40) {
			System.out.println("Tu salario es de: "+hours*basicHourPrice);
		} else {
			int extraHours = hours - 40;
			hours = 40;
			System.out.println("Tu salario es de: "+(hours*basicHourPrice + extraHours*extraHourPrice ));
		}

	}

}
