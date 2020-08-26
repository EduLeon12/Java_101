package exercises;
import java.util.Scanner;
public class Exercise4 {

	private static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
    System.out.println("Coloque un primer numero");
	int num1 = input.nextInt();
	System.out.println("Coloque un segundo numero");
	int num2 = input.nextInt();
	System.out.println("La suma entre " + num1 + " y " + num2 + " da como resultado "+ (num1 + num2));	
		
    input.close();
	}
}
