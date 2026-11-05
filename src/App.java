import java.util.List;
public class App {
    public static void main(String[] args) throws Exception {
        List<Persona> personas = List.of(
            new Persona(name: "Juan", age:25, gender: "M"),
            new Persona(name: "Maria", age:30, gender: "F"),
            new Persona(name: "Pedro", age:20, gender: "M"),
            new Persona(name: "Ana", age:28, gender: "F"));
    
    //1. BUSQUE UNA PERSONA con nombre "Maria"
    //RETORNE LA PERSONA SI LO ENCONTRO
    //2. BUSQUE UNA PERSONA con nombre "Diego"
    //RETORNE LA PERSONA SI LO ENCONTRO
    //3. BUSQUE UNA PERSONA con nombre "Ana"
    //IMPRIMA LA POSICION DE LA PERSONA SI LO ENCONTRO
    }
}
