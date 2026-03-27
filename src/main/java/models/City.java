package models;

public class City {
    private String  name;
    private String description;
    private String code;

    public City() {
    }

    public City(String name, String description, String code) {
        this.name = name;
        this.description = description;
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Override
    public String toString() {
        return "Datos de la ciudad \n"
        + "nombre: " + this.getName()
        + "\nDescripcion: " + this.getDescription()
        + "\nCodigo: " + this.getCode()
        + "\n==================================\n";
    }
}
