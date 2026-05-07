package a09;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class A09 {

    public static void main(String[] args) {
        // 1. Crear Lista original con 30 números aleatorios (1-10)
        List<Integer> listaOriginal = new ArrayList<>();
        for (int i = 0; i < 30; i++) {
            listaOriginal.add((int) (Math.random() * 100 + 1));
        }
        System.out.println("1. Lista original (con repetidos):");
        System.out.println(listaOriginal);
        System.out.println("-------------------------------------------------");

        // 2. HashSet (Sin orden garantizado, quita duplicados)
        Set<Integer> conjuntoHash = new HashSet<>(listaOriginal);
        System.out.println("2. HashSet (sin repetidos, orden impredecible):");
        System.out.println(conjuntoHash);
        System.out.println("-------------------------------------------------");

        // 3. TreeSet (Orden natural, quita duplicados)
        Set<Integer> conjuntoTree = new TreeSet<>(listaOriginal);
        System.out.println("3. TreeSet (sin repetidos, ordenado de menor a mayor):");
        System.out.println(conjuntoTree);
        System.out.println("-------------------------------------------------");

        // 4. LinkedHashSet (Mantiene orden de inserción, quita duplicados)
        Set<Integer> conjuntoLinked = new LinkedHashSet<>(listaOriginal);
        System.out.println("4. LinkedHashSet (sin repetidos, orden original conservado):");
        System.out.println(conjuntoLinked);
    }
}
