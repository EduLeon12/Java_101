package exercises;
import java.util.Scanner;

public class Exercise7 {
	private static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Ingrese un primer numero");
  		int num1 = input.nextInt();
  		System.out.println("Ingrese un segundo numero");
  		int num2 = input.nextInt();
  		System.out.println("Ingrese un tercer numero");
  		int num3 = input.nextInt();
  		if (num1 == num2 && num3 == num2) {
  			System.out.println("Los numeros son iguales");
  		} else if ((num1 >= num2 && num2 > num3) || (num2 == num3 && num1 > num2)) {
  			System.out.println("El mayor numero es "+ num1);
  		} else if ((num2 >= num1 && num1 > num3) || (num1 == num3 && num2 > num1)) {
  			System.out.println("El mayor numero es "+ num2);
  		} else if ((num3 >= num2 && num2 > num1) || (num1 == num2 && num3 > num2)) {
  			System.out.println("El mayor numero es "+ num3);
  		} 
       input.close();
	}
	
	

}
