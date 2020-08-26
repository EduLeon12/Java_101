package exercises;
import java.util.Scanner;

public class Exercise10 {
	
	private static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		int HORA_APERTURA = 10, HORA_CIERRE = 18, hora;
		boolean estaAbierto;		
		System.out.println("Ingrese la hora (entre : 0 y 24)");
		hora = Integer.parseInt(input.nextLine());
		if(hora > 24 || hora < 0) {
			System.out.println("Horario no valido");
		} else {
		estaAbierto = hora >= HORA_APERTURA && hora <= HORA_CIERRE;
		System.out.println("Esta abierto el estacionamiento? "+ estaAbierto);
		}
		
	} 
}
