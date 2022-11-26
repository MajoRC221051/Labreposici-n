public class TipoProyecto {

    private String investigativo;
    private String nuevo;
    private String mantenimiento;
    private String interno;



    public TipoProyecto(String investigativo, String nuevo, String mantenimiento, String interno) {
        this.investigativo = investigativo;
        this.nuevo = nuevo;
        this.mantenimiento = mantenimiento;
        this.interno = interno;
    }


    public String getInvestigativo() {
        return this.investigativo;
    }

    public void setInvestigativo(String investigativo) {
        this.investigativo = investigativo;
    }

    public String getNuevo() {
        return this.nuevo;
    }

    public void setNuevo(String nuevo) {
        this.nuevo = nuevo;
    }

    public String getMantenimiento() {
        return this.mantenimiento;
    }

    public void setMantenimiento(String mantenimiento) {
        this.mantenimiento = mantenimiento;
    }

    public String getInterno() {
        return this.interno;
    }

    public void setInterno(String interno) {
        this.interno = interno;
    }

    @Override
    public String toString() {
        return "{" +
            " investigativo='" + getInvestigativo() + "'" +
            ", nuevo='" + getNuevo() + "'" +
            ", mantenimiento='" + getMantenimiento() + "'" +
            ", interno='" + getInterno() + "'" +
            "}";
    }
    



}
