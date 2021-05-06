package ar.edu.ort.tp1.pacial1.clases;

public abstract class Mueble implements Mostrable  {
	
	protected String modelo;
	protected float costoBase;
	protected float porcentajeGanancia;

	public Mueble(String modelo, float costoBase, float porcentajeGanancia) {
		this.modelo = modelo;
		this.costoBase = costoBase;
		this.porcentajeGanancia = porcentajeGanancia;
	}

	public abstract float calcularPrecioCosto();
	
	
	public float calcularPrecioVenta() {
		
	return this.costoBase * this.porcentajeGanancia;
	}

	protected float getCostoBase() {
		return costoBase;
	}
	
	public String getModelo() {
		return this.modelo;
	}
	
	public float getPorcentajeGanancia() {
		return this.porcentajeGanancia;
	}

	public boolean modeloCorrecto(String modelo) {
	
		return modelo == this.modelo;
	}
	
    @Override
	public void mostrar() {
		System.out.println("Mueble tipo: "+this.getClass().getSimpleName()+ " - "+ "Modelo: " + this.modelo + " - Precio de venta: " + this.calcularPrecioVenta() );
		
	}
	
	

}
