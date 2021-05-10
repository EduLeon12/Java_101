
import java.util.ArrayList;

public class Veterinaria {

    private String nombre;
	private ArrayList<Doctor> doctores;
	private ArrayList<Mascota> mascotas;
    static final int CANT_MAXIMA_MASCOTAS = 20;
    static final int CANT_MAXIMA = 5;
    

	public Veterinaria(String nombre) {
		this.nombre = nombre;
		this.doctores = new ArrayList<Doctor> ();
		this.mascotas = new ArrayList<Mascota> ();
        
	}

	public void admitirMascota(Mascota mascota) {
        if (buscarMascota(mascota.getNombre()) == null && mascotas.size() < CANT_MAXIMA_MASCOTAS) {
        System.out.println(mascotas.size());
		mascotas.add(mascota);
		System.out.println("Bienvenido/a!: "+ mascota.getNombre());
      } else if (mascotas.size() == CANT_MAXIMA_MASCOTAS) {
          System.out.println("No podemos atender mas mascotas hoy, vuelva maniana");
      } else {
        System.out.println("Mascota ya registrada");
      }
	}

    public void agregarDoctor(Doctor dr){
        if (doctores.size() < CANT_MAXIMA){
        this.doctores.add(dr);
        } else {
            System.out.println("no estamos contratando");
        }
    }

    public void revisarMascota(Mascota mascota, String causa, String meds){
        int i = 0;
        boolean mascotaDiagnosticada = false;
        while(i < doctores.size() && !mascotaDiagnosticada ){
            if (doctores.get(i).getCantMascotasAtendidas() < CANT_MAXIMA ){
                doctores.get(i).revisarMascota(mascota, causa, meds);
                mascotaDiagnosticada = true;
            } else {
                i++;
            }
        }     
    }

	public Mascota buscarMascota(String nombreDeMascota) {
		int i = 0;
		boolean encontrado = false;
		Mascota mascotaEncontrada = null;  

		while (i < mascotas.size() && !encontrado ) {
			if (mascotas.get(i).nombre.equals(nombreDeMascota)) {
				mascotaEncontrada = mascotas.get(i);
				encontrado = true;
			}else {
				i++;
			}
		}
		return mascotaEncontrada;
	}

    public void mostrarDetalleDoctores(){
        for (Doctor d: doctores){
            System.out.print("Doctor: "+d.getNombre()+" ha atendido: "+ d.getCantMascotasAtendidas() + " Mascotas\n");
        }
    }

}
