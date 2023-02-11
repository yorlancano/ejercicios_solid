package solucionProblema2_buenaPractica;

public class Adulto extends Persona{
    public Adulto(String apellido, String nombre) {
        super(apellido, nombre);
    }
    public void pagar(){
        System.out.println("pago del adulto");
    }
}
