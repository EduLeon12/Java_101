public class PerroProteccion extends Canino {

    public PerroProteccion(int id, String nombre, Tipo tipo, String raza, String sexo) {
        super(id, nombre, tipo, raza, sexo);
    }

    @Override
    public void asignar() {
        System.out.println("Asignado a patrullar");
    }

    @Override
    public void entrenar() {
        System.out.println("Entrenado para atacar");
    }

    @Override
    public void equipar() {
        System.out.println("Equipado con chalecos tacticos de Kevlar");
    }

    

    
}
