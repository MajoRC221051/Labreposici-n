public class Persona {
    private String ingeniero;
    private String practicante;
    private String administrador;
    

    public Persona(String ingeniero, String practicante, String administrador) {
        this.ingeniero = ingeniero;
        this.practicante = practicante;
        this.administrador = administrador;
    }


    public String getIngeniero() {
        return this.ingeniero;
    }

    public void setIngeniero(String ingeniero) {
        this.ingeniero = ingeniero;
    }

    public String getPracticante() {
        return this.practicante;
    }

    public void setPracticante(String practicante) {
        this.practicante = practicante;
    }

    public String getAdministrador() {
        return this.administrador;
    }

    public void setAdministrador(String administrador) {
        this.administrador = administrador;
    }


    @Override
    public String toString() {
        return "{" +
            " ingeniero='" + getIngeniero() + "'" +
            ", practicante='" + getPracticante() + "'" +
            ", administrador='" + getAdministrador() + "'" +
            "}";
    }

    
}
