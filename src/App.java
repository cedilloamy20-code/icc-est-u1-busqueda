import java.util.List;
public class App {
    public static void main(String[] args) throws Exception {
        List<Persona> personas = new java.util.ArrayList<>(List.of(
            new Persona("Juan", 25, "Masculino"),
            new Persona("Maria", 30, "Femenino"),
            new Persona("Pedro", 22, "Masculino"),
            new Persona("Ana", 28, "Femenino")
        ));
        BusquedaBinaria bB = new BusquedaBinaria(personas);
        int resultado = bB.findByName("Maria");
        if (resultado >= 0) {
            System.out.println("Persona encontrada en la posición: " + resultado);
        } else {
            System.out.println("Persona no encontrada");
        }

        int res = bB.findByName("Pedro");
        //OPERADOR TERNARIO
        // COND ? accion TRUE : accion FALSE
        System.out.println(res >= 0 ? "se encontró en la posición: " + res : "Persona no encontrada");

        int res2 = bB.findByAge(25);
        System.out.println(res2 >= 0 ? "se encontró alguien de edad 25 en la pos: " + res2 : "Persona no encontrada");

        Persona pBuscar = new Persona("Maria", 30, "Femenino");
        int res3 = bB.findByPersona(pBuscar);
        System.out.println(res3 >= 0 ? "se encontró a Maria en la pos: " + res3 : "Persona no encontrada");

    //1. BUSQUE UNA PERSONA con nombre "Maria"
    //RETORNE LA PERSONA SI LO ENCONTRO
    Persona personaEncontrada = new BusquedaLinea(personas).findByName("Maria");
    System.out.print("Resultado de la busqueda de María: " + personaEncontrada);
    //2. BUSQUE UNA PERSONA con nombre "Diego"
    //RETORNE LA PERSONA SI LO ENCONTRO
    Persona personaBuscada = new BusquedaLinea(personas).findByName("Diego");
    System.out.print("Resultado de la busqueda de Diego: " + personaBuscada);
    //3. BUSQUE UNA PERSONA con nombre "Ana"
    //IMPRIMA LA POSICION DE LA PERSONA SI LO ENCONTRO
    BusquedaLinea busquedaPos = new BusquedaLinea(personas);
    int posicionAna = busquedaPos.findPosByName("Ana");
    System.out.print("Posición de Ana: " + posicionAna);
    }
}
