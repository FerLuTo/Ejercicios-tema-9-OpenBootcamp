public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.edad = 45;
        cliente.nombre = "Patricia";
        cliente.telefono = 4789547;
        cliente.credito = 45000;
        System.out.println("El cliente " + cliente.nombre + " de " + cliente.edad + " años de edad; número de contacto "
        + cliente.telefono + " cuenta con un crédito de " + cliente.credito + " euros.");

        Trabajador trabajador = new Trabajador();
        trabajador.edad = 30;
        trabajador.nombre = "Juan";
        trabajador.telefono = 87415698;
        trabajador.salario = 78000;
        System.out.println("El trabajador " + trabajador.nombre + " de " + trabajador.edad + " años de edad; número de contacto "
                + trabajador.telefono + " cuenta cobra un salario de " + trabajador.salario + " euros.");
    }
}

class Persona{
    int edad;
    String nombre;
    int telefono;
}

class Cliente extends Persona{
    int credito;
}

class Trabajador extends Persona {
    int salario;
}