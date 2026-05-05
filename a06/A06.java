package a06;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class A06 {

    public static void main(String[] args) {
        Collection<Integer> listaOriginal = new ArrayList<>();

        // Insertar números enteros aleatorios
        for (int i = 0; i < 20; i++) {
            listaOriginal.add((int) (Math.random() * 100 + 1));
        }
        System.out.println("Desordenada: " + listaOriginal);

        // Convertir a Array (le pasamos un array de Integer vacío)
        Integer[] tabla = listaOriginal.toArray(new Integer[0]);

        // Ordenar el Array (Orden natural: menor a mayor)
        Arrays.sort(tabla);

        // Volver a meterlo en una Colección dinámica
        Collection<Integer> listaCreciente = new ArrayList<>(Arrays.asList(tabla));
        System.out.println("Ordenada creciente: " + listaCreciente);
        
        // Ordenar de mayor a menor usando Collections.reverseOrder()
        Arrays.sort(tabla, Collections.reverseOrder());
        Collection<Integer> listaDecreciente = new ArrayList<>(Arrays.asList(tabla));
        System.out.println("Ordenada decreciente: " + listaDecreciente);
    }
}
