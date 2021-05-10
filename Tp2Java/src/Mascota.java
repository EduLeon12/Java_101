
public abstract class Mascota  {

	protected String nombre;
	protected Tipo tipo;
	protected String raza;
	protected String causaAtencion;
    protected Revision revision;
    protected boolean isAtendido;


    public Mascota(String nombre, Tipo tipo, String raza, String causaAtencion) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.raza = raza;
        this.causaAtencion = causaAtencion;
        this.revision = null;
        this.isAtendido = false;
    }


    public String getNombre() {
        return nombre;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public Tipo getTipo() {
        return tipo;
    }


    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }


    public Revision getRevision() {
        return revision;
    }


    public void setRevision(Revision revision) {
        this.revision = revision;
    }


    public boolean isAtendido() {
        return isAtendido;
    }


    public void setAtendido(boolean isAtendido) {
        this.isAtendido = isAtendido;
    } 

    
		

   

}