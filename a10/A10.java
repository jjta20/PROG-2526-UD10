package a10;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class A10 {

    public static void main(String[] args) {
        // 1. Creamos un HashSet (inserción ultrarrápida, sin orden)
        Set<Socio> conjuntoSocios = new HashSet<>();

        conjuntoSocios.add(new Socio("111", "Ana"));
        conjuntoSocios.add(new Socio("333", "Carlos"));
        conjuntoSocios.add(new Socio("222", "Bernardo"));
        // Intentamos colar un duplicado por DNI
        boolean insertado = conjuntoSocios.add(new Socio("111", "Ana Copia"));

        System.out.println("¿Se insertó el duplicado? " + insertado);
        System.out.println("HashSet original (desordenado): \n" + conjuntoSocios);

        // 2. CONVERSIÓN A TREESET (Para ordenarlo automáticamente por DNI)
        Set<Socio> sociosOrdenados = new TreeSet<>(conjuntoSocios);
        sociosOrdenados.add(new Socio("255", "Luis"));
        System.out.println("\nTreeSet (ordenado por DNI): \n" + sociosOrdenados);

        // 3. CONVERSIÓN A LISTA (Para poder usar índices)
        List<Socio> listaSocios = new ArrayList<>(sociosOrdenados);

        // Extraemos el socio en la posición 1 (el segundo)
        Socio ganador = listaSocios.get(1);
        System.out.println("\nEl ganador del premio (índice 1) es: " + ganador);
    }
}
