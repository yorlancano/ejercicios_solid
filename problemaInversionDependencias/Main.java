package problemaInversionDependencias;

public class Main {
    public static void main(String[] args) {
        ServicioPersona servicioPersona = new Oracle();
        ServicioPersona servicioPersona1 = new MySql();

        servicioPersona.savePerson("","");
        servicioPersona1.savePerson("","");
    }
}
