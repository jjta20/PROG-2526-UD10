package a08;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class A08 {

    public static void main(String[] args) {
        // 1. Inicialización
        List<String> listaA = new ArrayList<>(Arrays.asList("Ana", "Luis", "Marta", "Luis"));
        List<String> listaB = new ArrayList<>(Arrays.asList("Ana", "Luis", "Marta", "Luis"));

        // 2. Comparación inicial
        System.out.println("¿Son iguales las listas?: " + listaA.equals(listaB)); // true

        // 3. Búsqueda primera y última aparición
        System.out.println("Primer Luis en índice: " + listaB.indexOf("Luis")); // 1
        System.out.println("Último Luis en índice: " + listaB.lastIndexOf("Luis")); // 3

        // 4. Ordenación natural de listaA
        listaA.sort(null); // Ordena alfabéticamente

        // 5. Comparación tras ordenar una de ellas
        System.out.println("¿Son iguales las listas?: " + listaA.equals(listaB)); // false

        // 6. Ordenación inversa de listaB
        listaB.sort(Comparator.reverseOrder());
        System.out.println("Lista B ordenada a la inversa: " + listaB);
        // Resultado: [Marta, Luis, Luis, Ana]
    }
}
