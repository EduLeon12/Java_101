package exercises;
import java.util.Scanner;
import java.util.Random;
public class Exercise11 {
	
    private static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		Random rand = new Random();
		int number = 10000000; 
		int ticketnumber = rand.nextInt(number);
		 
		System.out.println("Ingrese fecha de compra (YYYYMMDD)");
		String date = input.nextLine();
		System.out.println("Ingrese Nombre del comprador");
		String name = input.nextLine();
		System.out.println("Ingrese Nombre del producto");
		String product = input.nextLine();
		System.out.println("Ingrese Cantidad de productos comprados");
		int quantity = Integer.parseInt(input.nextLine()); 
		System.out.println("Ingrese Precio del producto");
		int price = Integer.parseInt(input.nextLine());
		String ticket = ("Modelo de ticket: "+ ticketnumber + 
				"\nFecha de Compra: "+ date + 
				"\nNombre del Comprador: "+ name+
				"\nProducto Solicitado: "+ product+	
				"\nPrecio unitario: $"+ price +
				"\nTotal a Pagar: $"+ (price*quantity));
		System.out.println(ticket);
	}
}
