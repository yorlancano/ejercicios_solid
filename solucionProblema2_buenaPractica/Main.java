package solucionProblema2_buenaPractica;

public class Main {
    public static void main(String[] args) {
        Adulto adulto = new Adulto("yorlan","cano");
        adulto.pagar();
        Niño niño = new Niño("manuel","cardozo", adulto);
        niño.pagar();
    }
}
