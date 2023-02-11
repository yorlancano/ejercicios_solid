package problemaSustitucion1_malaPractica;

public class Niño extends Persona {
    public Niño(String nombre, String apellido, String dni, int targeta) {
        super(nombre, apellido, dni, targeta);
    }

    @Override
    public void pagar() {
        throw  new RuntimeException("el niño no puede pagar");
    }
}
