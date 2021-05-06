package ar.edu.ort.tp1.pacial1.clases;

import java.util.ArrayList;

public class FabricaDeMuebles implements Mostrable {
	private String nombre;
	private ArrayList<Mueble> mueblesFabricados;
	


	public FabricaDeMuebles(String nombre) {
		this.nombre = nombre;
		this.mueblesFabricados = new ArrayList<Mueble> ();
	}

	public boolean fabricar(Mueble m) {
		boolean retorno = false;
		
		if (m.getPorcentajeGanancia() < 0.5) {
			System.out.println("porcentaje de ganancia muy bajo, no se puede fabricar mueble");
		} else {
			System.out.println("Fabricando el mueble:");
			mueblesFabricados.add(m);
			m.mostrar();
			retorno = true;
		}
		return retorno;
		}

	public boolean superoCosto(double monto){ 
		boolean seHaFabricado = false;
		int i =0;
		while (i < mueblesFabricados.size() && !seHaFabricado) {
			if (mueblesFabricados.get(i).calcularPrecioCosto() > monto) {
				seHaFabricado = true;
			}
			i++;
		}
		return seHaFabricado;
	}

	@Override
	public void mostrar() {
		double contadorSillas = 0;
		double contadorMesa = 0;
		double contadorSillon = 0;
		float totalVentas = 0;
		double cantMuebles = mueblesFabricados.size();
		for (Mueble m : mueblesFabricados) 
		{ 
			totalVentas = totalVentas + m.calcularPrecioVenta(); 
		    if(m instanceof Silla) {
		    	contadorSillas++;
		    } else if (m instanceof Mesa) {
		    	contadorMesa++;
		    } else {
		    	contadorSillon++;
		    }
		}

		double porcSillas = (contadorSillas/cantMuebles)*100;
		double porcMesa = (contadorMesa/cantMuebles)*100;
		double porcSillon = (contadorSillon/cantMuebles)*100;
		
		System.out.println("Fábrica de muebles: "+this.nombre);
		System.out.println("La cantidad de sillas corresponde a "+ porcSillas + "% del total de muebles fabricados");
		System.out.println("La cantidad de Mesas corresponde a "+ porcMesa + "% del total de muebles fabricados");
		System.out.println("La cantidad de sillones corresponde a "+ porcSillon + "% del total de muebles fabricados");
		System.out.println("La venta total fue de: $"+ totalVentas );
		
	}

	
		
		

}
