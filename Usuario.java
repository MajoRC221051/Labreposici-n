public class Usuario {
    private String nombre;
    private String dpi;
    private String numero;
    

    public Usuario(String nombre, String dpi, String numero) {
        this.nombre = nombre;
        this.dpi = dpi;
        this.numero = numero;
    }


    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDpi() {
        return this.dpi;
    }

    public void setDpi(String dpi) {
        this.dpi = dpi;
    }

    public String getNumero() {
        return this.numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "{" +
            " nombre='" + getNombre() + "'" +
            ", dpi='" + getDpi() + "'" +
            ", numero='" + getNumero() + "'" +
            "}";
    }
    
}
