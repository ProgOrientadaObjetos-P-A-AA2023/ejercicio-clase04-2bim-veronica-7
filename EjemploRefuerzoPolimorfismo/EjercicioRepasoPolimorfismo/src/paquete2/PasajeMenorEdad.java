
package paquete2;

public class PasajeMenorEdad extends PasajeUrbano {
    
    public PasajeMenorEdad(double pasaje){
        super(pasaje);
    }
    
    @Override
    public void establecerValorPasaje() {
        valorPasaje = valorFijo - (valorFijo * 0.2);
    }
    /*El pasaje universitario tiene un 30% de descuento del valor fijo del pasaje.
El pasaje de un menor de edad tiene la ventaja de tener un 20% de descuento del valor fijo del pasaje
El pasaje normal tiene un costo igual al costo fijo
El pasaje de tercera edad es el 50% del valor fijo*/
    
        
    @Override
    public String toString(){
        return String.format("Tipo de pasaje: Menor de edad\n"
                + "%s",
                super.toString());
    }
}
