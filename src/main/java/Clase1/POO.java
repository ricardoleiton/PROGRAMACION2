package Clase1;

public class POO {

    public static void main(String[] args) {
        Camion camion1 = new Camion();
        
        camion1.setMarca("Ford");
        camion1.setModelo("F200");
        camion1.setAnio(2005);
        camion1.setRevisionTecnica(true);
        
        System.out.println("La marca es: " + camion1.getMarca());
        System.out.println("El modelo es: " + camion1.getModelo());
        System.out.println("El año es: " + camion1.getAnio());
        System.out.println("La Revisión Técnica es: " + camion1.isRevisionTecnica());
        
        System.out.println(camion1.toString());
        
        //Creacion de auto1 con metodo constructor
        Auto auto1 = new Auto("Dodge", "M1500", 1987, false);
        
        System.out.println(auto1.toString());        
    }    
    
    
}
