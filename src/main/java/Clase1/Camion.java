package Clase1;

public class Camion {
    //Creo atributos de Camion
    private String marca;
    private String modelo;
    private int anio;
    private boolean revisionTecnica;
    
    //Metodo GETTERS Marca:
    public String getMarca() {
        return marca;
    }

    //Metodo SETTERS Marca:
    public void setMarca(String marca) {
        this.marca = marca;
    }

    //Metodo GETTERS Modelo:
    public String getModelo() {
        return modelo;
    }

    //Metodo SETTERS Modelo:
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    //Metodo GETTERS Anio:
    public int getAnio() {
        return anio;
    }

    //Metodo SETTERS Anio:
    public void setAnio(int anio) {
        this.anio = anio;
    }

    //Metodo GETTERS revisionTecnica:
    public boolean isRevisionTecnica() {
        return revisionTecnica;
    }
    
    //Metodo SETTERS revisionTecnica:
    public void setRevisionTecnica(boolean revisionTecnica) {
        this.revisionTecnica = revisionTecnica;
    }

    //Metodo toString:
    public String toString() {
        return "Camion{" + "marca=" + marca + ", modelo=" + modelo + ", anio=" + anio + ", revisionTecnica=" + revisionTecnica + '}';
    }
    
    
        
}
