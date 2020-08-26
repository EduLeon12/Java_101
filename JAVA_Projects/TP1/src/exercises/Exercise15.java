package exercises;
import java.util.Scanner;

public class Exercise15 {
	private static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
	 System.out.println("Ingrese un numero");
	 int num = Integer.parseInt(input.nextLine());
	 boolean estaEnB, estaEnA, estaEnAmbos, estaEnNinguno;
	 estaEnA = num<10 || num > -10;
	 estaEnB = num%2 == 1;
	 estaEnAmbos = estaEnA && estaEnB;
	 estaEnNinguno = (!estaEnA && !estaEnB);
	 System.out.println("Esta en A: "+estaEnA +"\nEsta en B: "+estaEnB + "\nEsta en Ambos: "+ estaEnAmbos+"\nEsta en Ninguno: "+estaEnNinguno);
	}

}
