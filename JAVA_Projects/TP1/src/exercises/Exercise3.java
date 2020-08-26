package exercises;
import java.util.Scanner;
public class Exercise3 {

	private static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
	System.out.println("Coloque su nombre");
	String username = input.nextLine();
	System.out.println("BIENVENIDO "+username);
    input.close();
	}
}
