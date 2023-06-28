/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete2;

/**
 *
 * @author reroes
 */
public class PasajeUniversitario extends PasajeUrbano {
    
    public PasajeUniversitario(double pasaje){
        super(pasaje);
    }
    
    @Override
    public void establecerValorPasaje() {
        valorPasaje = valorFijo - (valorFijo * 0.3);
    }
    /*El pasaje universitario tiene un 30% de descuento del valor fijo del pasaje.
El pasaje de un menor de edad tiene la ventaja de tener un 20% de descuento del valor fijo del pasaje
El pasaje normal tiene un costo igual al costo fijo
El pasaje de tercera edad es el 50% del valor fijo*/
       
    @Override
    public String toString(){
        return String.format("Tipo de pasaje: Universitario\n"
                + "%s",
                super.toString());
    }
}