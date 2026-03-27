package Models;

public class City {
    private String name;
    private String descripcion;
    private String codigo;

    public City() {
    }

    public City(String name, String descripcion, String codigo) {
        this.name = name;
        this.descripcion = descripcion;
        this.codigo = codigo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    @Override
    public String toString() {
        return "Datos de la ciudad \n"
        + "Nombre: " + this.getName()
        + "\nDescripción: " + this.getDescripcion()
        + "\nCódigo: " + this.getCodigo() 
        + "\n ===================";
                
    }
}
