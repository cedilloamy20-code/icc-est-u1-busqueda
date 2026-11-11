
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class BusquedaBinaria{
    private List<Persona> personas;

    public BusquedaBinaria(List<Persona> personas) {
        this.personas = new ArrayList<>(personas);
    }

    public Integer findByName(String name){
        //ORDENADO -> POR NOMBRE
        //Comparator
        // );
        // Ordenamos la lista por nombre usando un Comparator lambda
        personas.sort((p1, p2) -> p1.getName().compareTo(p2.getName()));
        //1. Def los limites de la busqueda
        int lo = 0;
        int hi = personas.size() - 1;
        //Busqueda binaria
        //2. Def el bucle con su condición
        while (lo <= hi) {
            //3. calculamos mid
            int mid = lo + (hi - lo) / 2;
            Persona persona = personas.get(mid);
            //4. Preguntar si el [mid] es lo buscado
            if (personas.get(mid).getName().equals(name)) {
                return mid;
            }

            //5. Actualizar limites
            //5.1 verificar si es mayor o menor y escoger un lado
            if (personas.get(mid).getName().compareTo(name) < 0) {
                // 5.2 actualizo el limit XXXX(limite menor)
                lo = mid + 1;
            } else {
                // 5.2 actualizo el limit YYYY(limite mayor)
                hi = mid - 1;
            }
        }
        return -1;
    }

    public int findByAge(int age) {
        //Previamente ordenado -> por edad
        personas.sort(Comparator.comparing(Persona::getEdad));
        int lo = 0;
        int hi = personas.size() - 1;
        while (lo <= hi) {
            int mid = (lo + hi)/2;
            if (personas.get(mid).getEdad() == age)
                return mid;
            if (personas.get(mid).getEdad() < age)
                lo = mid + 1;
            else
                hi = mid - 1;
        }
        return -1; 
    }

    public int findByPersona(Persona persona) {
        //Previamente ordenado -> por nombre
        personas.sort(Comparator.comparing(Persona::getName));
        int lo = 0;
        int hi = personas.size() - 1;
        while (lo <= hi) {
            int mid = (lo + hi)/2;
            if (personas.get(mid).compareTo(persona) == 0)
                return mid;
            if (personas.get(mid).compareTo(persona) < 0)
                lo = mid + 1;
            else
                hi = mid - 1;
        }
        return -1; 
    }
}
