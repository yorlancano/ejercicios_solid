package problemaSustitucion1_malaPractica;

public class Main {
    public static void main(String[] args) {

        Niño niño = new Niño("yorlan","cano","",0);
        niño.pagar();

        Persona crearPersona = new Niño("marlon","marroquin","",0);

        crearPersona.pagar();


    }
}

// lo que entendi al solucionar el problema de la manera incorrecta es que la clase persona solo es la encargada de almacenar informacion de la persona y esta  no debe
// que contener metodos que le correspondan hacer al usuario que en este caso seria pagar igualmente la clase persona en la clase persona no va
// contener atributos que le pertenezacan al usuario y tambien que la clase hija no puede remplazar a la padre a no ser que
// se ha para un cambio importante.