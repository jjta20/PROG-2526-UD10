package a12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class A12 {

    public static void main(String[] args) {
        // 1. Creación de la lista
        List<Integer> premios = new ArrayList<>(Arrays.asList(1000, 50, 500, 50, 200));
        System.out.println("Lista inicial: " + premios);

        // 2. Frecuencia
        int cantCincuenta = Collections.frequency(premios, 50);
        System.out.println("Hay " + cantCincuenta + " premios de 50 euros.");

        // 3. Máximos y mínimos
        System.out.println("Premio mayor: " + Collections.max(premios));
        System.out.println("Premio menor: " + Collections.min(premios));

        // 4. Barajar (Shuffle)
        Collections.shuffle(premios);
        System.out.println("Lista barajada aleatoriamente: " + premios);

        // 5. Ordenación natural
        Collections.sort(premios);
        System.out.println("Lista ordenada: " + premios);

        // 6. Búsqueda binaria (solo funciona si la lista ya está ordenada)
        int indiceBuscado = Collections.binarySearch(premios, 500);
        System.out.println("El premio de 500 está en el índice: " + indiceBuscado);
    }
}
