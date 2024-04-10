package Clase1;

public class Auto {
    //Creo atributos de Auto
    private String marca;
    private String modelo;
    private int anio;
    private boolean revisionTecnica;

    //Clase constructora
    public Auto(String marca, String modelo, int anio, boolean revisionTecnica) {
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
        this.revisionTecnica = revisionTecnica;
    }

    @Override
    public String toString() {
        return "Auto{" + "marca=" + marca + ", modelo=" + modelo + ", anio=" + anio + ", revisionTecnica=" + revisionTecnica + '}';
    }
    
    
}
