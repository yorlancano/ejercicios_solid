package solucionProblema2_buenaPractica;

public class Niño extends  Adulto {
    Adulto adulto;
    public Niño(String apellido, String nombre, Adulto adulto) {
        super(apellido, nombre);
        this.adulto=adulto;
    }
    @Override
    public void pagar(){
        adulto.pagar();
    }
}
