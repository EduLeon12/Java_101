import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
    
        List<Canino> unidadk9 = new ArrayList<Canino> ();
        unidadk9.add(new PerroProteccion(asignarID(unidadk9),"Kei",Tipo.PROTECCION,"Pastor belga malines","macho"));
        unidadk9.add(new PerroProteccion(asignarID(unidadk9),"Matthis",Tipo.PROTECCION,"Pastor aleman","macho"));
        unidadk9.add(new PerroDeteccion(asignarID(unidadk9),"Minnie",Tipo.DETECCION,"Mestizo","hembra"));
        unidadk9.add(new PerroProteccion(asignarID(unidadk9),"Marek",Tipo.PROTECCION,"Pastor holandes","macho"));
        unidadk9.add(new PerroProteccion(asignarID(unidadk9),"Sally",Tipo.PROTECCION,"Pastor aleman","hembra"));
        unidadk9.add(new PerroDeteccion(asignarID(unidadk9),"Leia",Tipo.DETECCION,"Pastor australiano","hembra"));
        unidadk9.add(new PerroProteccion(asignarID(unidadk9),"Eddie",Tipo.PROTECCION,"Pastor belga malines","macho"));
        unidadk9.add(new PerroDeteccion(asignarID(unidadk9),"Razor",Tipo.DETECCION,"Border Collie","macho"));

        System.out.println("Perros de Deteccion");
        System.out.println("--------------------");
        unidadk9.stream()
        .filter(p -> p instanceof PerroDeteccion).forEach(System.out::println);        

        System.out.println("Perros de Proteccion");
        System.out.println("--------------------");
        unidadk9.stream()
        .filter(p -> p instanceof PerroDeteccion).forEach(System.out::println);       

        System.out.println("-------------------------");

        System.out.print("Cantidad de hembras: ");
        System.out.println(unidadk9.stream().filter(c -> c.getSexo().equals("macho")).count());

        System.out.print("Cantidad de machos: ");
        System.out.println(unidadk9.stream().filter(c -> c.getSexo().equals("hembra")).count());

    }

    public static int  asignarID(List<Canino> list){
       int id;
       return id = (list.size()== 0) ? 1 : list.size()+1;

    }
}

