package ar.edu.ort.tp1.pacial1.clases;

public class Silla extends Mueble {

	
	private static final int COEFICIENTE_SILLA = 3;
	private long alto;
	private MaterialSilla materialSilla; 
	
	
	public Silla(String modelo, float costoBase, float porcentajeGanancia,long alto, MaterialSilla material) {
		super(modelo, costoBase, porcentajeGanancia);
		this.alto = alto;
		this.materialSilla = material;
	}
	
	@Override
	public float calcularPrecioVenta() {
		return calcularPrecioCosto() * this.porcentajeGanancia;
		}
	
	@Override
	public float calcularPrecioCosto() {
		float f = materialSilla.getMultiplicadorValor();
		
		return (this.costoBase+ (f*this.alto));
	}
	
	

}
