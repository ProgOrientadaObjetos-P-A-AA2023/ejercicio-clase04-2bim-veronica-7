
package paquete2;

public abstract class PasajeUrbano{
    
    protected double valorPasaje;
    protected double valorFijo;
    protected Persona usuario;
    
    public PasajeUrbano(double pasajeFijo){
        valorFijo = pasajeFijo;
    }
    
    public void establecerPersona(Persona u, double fijo){
        usuario = u;
        valorFijo = fijo;
    }
    
       
    public void establecerPersona(Persona p){
        usuario = p;
    }
    
    public Persona obtenerPersona(){
        return usuario;
    }
    
    public void establecerValorFijo(double p){
        valorFijo = p;
    }
    
    public double obtenerValorFijo(){
        return valorFijo;
    }
    
    public abstract void establecerValorPasaje();
    
    public double obtenerValorPasaje(){
        return valorPasaje;
    }
    /*El pasaje universitario tiene un 30% de descuento del valor fijo del pasaje.
El pasaje de un menor de edad tiene la ventaja de tener un 20% de descuento del valor fijo del pasaje
El pasaje normal tiene un costo igual al costo fijo
El pasaje de tercera edad es el 50% del valor fijo*/
    
    @Override
    public String toString(){
        return String.format("Pasajero: %s\n"
                    + "Cédula: %s\n"
                    + "Edad: %d\n"
                    + "Valor pasaje: %.2f\n"
                    + "---------------------\n",
                    obtenerPersona().obtenerNombre(),
                    obtenerPersona().obtenerCedula(),
                    obtenerPersona().obtenerEdad(),
                    obtenerValorPasaje());
    }
    
    
}
