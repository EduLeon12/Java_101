public abstract class Canino implements Animal {
    protected int id;
    protected String nombre;
    protected Tipo tipo;
    protected String raza;
    protected String sexo;

    public Canino(int id,String nombre, Tipo tipo, String raza, String sexo) {
        this.id = id;
        this.nombre = nombre;
        this.tipo = tipo;
        this.raza = raza;
        this.sexo = sexo;
    }
    public int getId(){
        return this.id;
    }

    public Tipo getTipo(){
        return this.tipo;
    }

    public String getSexo(){
        return this.sexo;
    }
    @Override
    public String toString() {
        return "Canino [id=" + id + ", nombre=" + nombre + ", raza=" + raza + ", sexo=" + sexo + ", tipo=" + tipo + "]";
    }

    
}
