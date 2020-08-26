package exercises;
import java.util.Scanner;

public class Exercise14 {
    private static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
	System.out.println("Ingrese el tipo de operacion que desea s , r , p , d");
	String opp = input.nextLine();
	System.out.println("Ingrese dos numeros enteros");
	int num1 = Integer.parseInt(input.nextLine());
	int num2 = Integer.parseInt(input.nextLine());
    switch (opp) {
    case "s" : 	System.out.println("Resultado: "+ (num1+num2) );
    break;
    case "r" : 	System.out.println("Resultado: "+ (num1-num2) );
    break;
    case "p" : 	System.out.println("Resultado: "+ (num1*num2) );
    break;
    case "d" : 	System.out.println("Resultado: "+ (num1/num2) );
    break;
     }
	}

}
