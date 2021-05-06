package ar.edu.ort.tp1.pacial1.clases;

public class Sillon extends Mueble {
	
	private int cantCuerpos; 
	private TelaSillon telaSillon;
	
	public Sillon(String modelo, float costoBase, float porcentajeGanancia,int cantCuerpos, TelaSillon tela) {
		super(modelo, costoBase, porcentajeGanancia);
		this.cantCuerpos = cantCuerpos;
		this.telaSillon = tela;
	}
	
	@Override
	public float calcularPrecioVenta() {
		return calcularPrecioCosto() * this.porcentajeGanancia;
		}
	
	@Override
	public float calcularPrecioCosto() {
		float f = telaSillon.getPorcentaje();
		return this.costoBase*this.cantCuerpos*f ;
	}
	
	



}
