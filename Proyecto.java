public class Proyecto {
    private String social;
    private String liderazgo;
    private String administrativo;


    public Proyecto(String social, String liderazgo, String administrativo) {
        this.social = social;
        this.liderazgo = liderazgo;
        this.administrativo = administrativo;
    }

    public String getSocial() {
        return this.social;
    }

    public void setSocial(String social) {
        this.social = social;
    }

    public String getLiderazgo() {
        return this.liderazgo;
    }

    public void setLiderazgo(String liderazgo) {
        this.liderazgo = liderazgo;
    }

    public String getAdministrativo() {
        return this.administrativo;
    }

    public void setAdministrativo(String administrativo) {
        this.administrativo = administrativo;
    }


    @Override
    public String toString() {
        return "{" +
            " social='" + getSocial() + "'" +
            ", liderazgo='" + getLiderazgo() + "'" +
            ", administrativo='" + getAdministrativo() + "'" +
            "}";
    }


    
}
