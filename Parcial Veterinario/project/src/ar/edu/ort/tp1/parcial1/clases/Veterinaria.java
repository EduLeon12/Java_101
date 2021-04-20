package ar.edu.ort.tp1.parcial1.clases;

import java.util.ArrayList;

public class Veterinaria implements Mostrable {
	
	private String nombre;
	private Doctor doctor;
	private ArrayList<Mascota> mascotas;

	private static final String TXT_INGRESO = "Ingresando a %s a la veterinaria \n";
	private static final String TXT_CANTIDADES = "Han sido ingresados: %d conejos, %d gatos y %d perros\n";
	


	public Veterinaria(String nombre, Doctor doctor) {
		this.nombre = nombre;
		this.doctor = doctor;
		this.mascotas = new ArrayList<Mascota> ();
	}

	public void admitirMascota(Mascota mascota) {
		mascotas.add(mascota);
		System.out.println("Bienvenido/a!: "+ mascota.getNombre());
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

	public void vacunar() {
		for (Mascota mascota : mascotas) {
			if (mascota.isVacunado == false) {
				mascota.isVacunado = true;
				System.out.println(mascota.getNombre() + " Vacunado con exito!");
			} else {
				System.out.println(mascota.getNombre() + " ya habia sido vacunado");
			}
		}

	}
	
	private void contarMascotas() {
		int cantPerros = 0;
		int cantGatos= 0;
		int cantConejos = 0;
		
		for (Mascota mascota : mascotas) {
			if (mascota.getClass().getSimpleName().equals("Perro")){
				cantPerros++;
			} else if (mascota.getClass().getSimpleName().equals("Gato")) {
				cantGatos++;
			} else {
				cantConejos++;
			}
		}
		System.out.println("Han sido ingresados: "+ cantPerros + " perros, " + cantGatos+ " gatos, " + cantConejos+ " conejos");
	}

	@Override
	public void mostrar() {
		System.out.println(toString());
		contarMascotas();
		
	}

	@Override
	public String toString() {
		return "Veterinaria [nombre=" + nombre + ", doctor=" + doctor.getNombre();
	}
	
	

}
