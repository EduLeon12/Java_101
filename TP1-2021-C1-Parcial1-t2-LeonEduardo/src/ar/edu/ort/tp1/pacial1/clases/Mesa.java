package ar.edu.ort.tp1.pacial1.clases;

public class Mesa extends Mueble {
	
	private static final float COEFICIENTE_SUPERFICIE = 0.2f;
	private long largo;
	private long ancho;
	private TipoMesa tipoMesa;
	
	public Mesa(String modelo, float costoBase, float porcentajeGanancia,long largo, long ancho, TipoMesa tipo) {
		super(modelo, costoBase, porcentajeGanancia);
		this.largo = largo;
		this.ancho = ancho;
		this.tipoMesa = tipo;
	}

    
	@Override
	public float calcularPrecioCosto() {
		float f = tipoMesa.getMultiplicadorValor();
		float f1 = this.costoBase * f;
		float f2 = COEFICIENTE_SUPERFICIE*this.largo*this.ancho;
		return f1+f2;
	}


	@Override
	public float calcularPrecioVenta() {
		return calcularPrecioCosto() * this.porcentajeGanancia;
		}
	
	


	

}
