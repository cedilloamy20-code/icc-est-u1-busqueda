import java.util.List;
public class App {
    public static void main(String[] args) throws Exception {
        List<Persona> personas = List.of(
            new Persona("Maria", 25, "Femenino"),
            new Persona("Diego", 30, "Masculino"),
            new Persona("Ana", 22, "Femenino")
        );
    
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
    int pos = busquedaPos.findPosByName("Ana");
    System.out.print("Posición de Ana: " + pos);
    }
}
