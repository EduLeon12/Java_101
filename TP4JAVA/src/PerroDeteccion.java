public class PerroDeteccion extends Canino {

    public PerroDeteccion(int id, String nombre, Tipo tipo, String raza, String sexo) {
        super(id, nombre, tipo, raza, sexo);
    }

    @Override
    public void asignar() {
        System.out.println("Asignado a ubicaciones de concurrencia masiva");
    }

    @Override
    public void entrenar() {
        System.out.println("Entrenado para deteccion de personas y explosivos");
        
    }

    @Override
    public void equipar() {
        System.out.println("Equipado con camaras para seguimiento");
        
    }

    

    
}
