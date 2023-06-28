/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;

/**
 *
 * @author reroes
 */
public class PasajeNormal extends PasajeUrbano {
    
    public PasajeNormal(double pasaje){
        super(pasaje);
    }
    
    @Override
    public void establecerValorPasaje() {
        valorPasaje = valorFijo;
    }
    /*El pasaje universitario tiene un 30% de descuento del valor fijo del pasaje.
El pasaje de un menor de edad tiene la ventaja de tener un 20% de descuento del valor fijo del pasaje
El pasaje normal tiene un costo igual al costo fijo
El pasaje de tercera edad es el 50% del valor fijo*/
    
    @Override
    public String toString(){
        return String.format("Tipo de pasaje: Normal\n"
                + "%s",
                super.toString());
    }
}
