package exercises;
import java.util.Scanner;

public class Exercise9 {
	private static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		
		System.out.println("Ingrese nombre de la primera persona");
  		String name1 = input.nextLine();
		System.out.println("Ingrese el monto aportado de la primera persona");
  		int amount1 = input.nextInt();
  		input.nextLine();
		
  		System.out.println("Ingrese nombre de la segunda persona");
  		String name2 = input.nextLine();
		System.out.println("Ingrese el monto aportado de la segunda persona");
  		int amount2 = input.nextInt();
  		input.nextLine(); // Integer.parseInt(input.nextLine());
  		
		System.out.println("Ingrese nombre de la tercera persona");
  		String name3 = input.nextLine();
        System.out.println("Ingrese el monto aportado de la tercera persona");
  		int amount3 = input.nextInt();
     	double totalamount = (amount1+amount2+amount3);
  	    double perc1 = ((amount1/totalamount)*100);
  		double perc2 = ((amount2/totalamount)*100);
  		double perc3 = ((amount3/totalamount)*100);
  		System.out.println("Nombre: "+name1+", Porcentaje del total aportado: "+perc1+"%"+", Monto total aportado: "+ amount1);
  		System.out.println("Nombre: "+name2+", Porcentaje del total aportado: "+perc2+"%"+", Monto total aportado: "+ amount2);
  		System.out.println("Nombre: "+name3+", Porcentaje del total aportado: "+perc3+"%"+", Monto total aportado: "+ amount3);
  		
       input.close();
	}
}
