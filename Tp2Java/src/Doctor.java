

public class Doctor {
	private String nombre;
	private int cantMascotasAtendidas;

	public Doctor(String nombre) {
		this.nombre = nombre;
		this.cantMascotasAtendidas = 0;
	}

	public String getNombre() {
		return nombre;
	}

	public int getCantMascotasAtendidas() {
		return cantMascotasAtendidas;
	}

	public void revisarMascota(Mascota mascota, String causa, String medicamentos){
		if (!mascota.isAtendido()){
		mascota.setRevision(new Revision(causa,medicamentos));
		mascota.setAtendido(true);
		this.cantMascotasAtendidas++;
		System.out.println(mascota.getNombre() + " Diagnosticada con exito"); 
		
	}
		
	}	

	


}