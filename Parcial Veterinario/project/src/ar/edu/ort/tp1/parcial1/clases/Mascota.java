package ar.edu.ort.tp1.parcial1.clases;

public abstract class Mascota implements Animal {

	protected String nombre;
	protected double peso;
	protected boolean isVacunado;
	protected Estado estado; 
	
	private static final String MSG_COM_FELIZ = " dice: He comido demasiado";
	private static final String MSG_COM_HAMBRIENTO = " dice: Muchas gracias ten�a hambre";
	private static final String MSG_COM_ENFERMO = " dice: No ten�a mucha hambre, pero gracias";

	private static final int CIEN = 100;
	

	// TODO Completar

	public Mascota(String nombre, double peso, boolean isVacunado, Estado estado) {
		super();
		this.nombre = nombre;
		this.peso = peso;
		this.isVacunado = isVacunado;
		this.estado = estado;
	}



	// TODO Completar
	/**
	 * Alimenta a las mascotas de forma general. Si su estado es hambiento estar�
	 * feliz y dara las gracias ya que ten�a hambre Si su estado es feliz, se
	 * enfermar� e indicar� que comio demasiado. si estaba enfermo, dara las gracias, pero seguir� enfermo.
	 * adem�s actualizar� el peso sumando al actual la multiplicaci�n entre la cantidad de comida recibida y un multiplicador.
	 * Finalmente indicar� su estado
	 * 
	 * @param comida
	 * @param multiplicador
	 */
	
	
	protected void cambioEstadoPorAlimentacion() {
		if (this.estado.equals(Estado.FELIZ)) {
			this.estado = Estado.ENFERMO;
			System.out.println(MSG_COM_ENFERMO );
		}
		else if (this.estado.equals(Estado.ENFERMO)) {
			System.out.println(MSG_COM_ENFERMO );
		} else {
			this.estado = Estado.FELIZ;
			System.out.println(MSG_COM_HAMBRIENTO );
		}
	}

	public String getNombre() {
		return nombre;
	}

	

	public void actualizarPeso(double porcentaje) {
		this.peso += peso * porcentaje / CIEN;
	}


}
