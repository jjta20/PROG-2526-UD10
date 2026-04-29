package a04;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class A04 {

    public static void main(String[] args) {
        Collection<Integer> numeros = new ArrayList<>();

        // 1. Insertamos 100 números aleatorios entre 1 y 10
        for (int i = 0; i < 100; i++) {
            numeros.add((int) (Math.random() * 10 + 1));
        }

        System.out.println("Original (100 elementos): \n" + numeros);

        // 2. Usar el iterador para eliminar todos los 5s
        Iterator<Integer> it = numeros.iterator();
        while (it.hasNext()) {
            Integer numero = it.next();
            if (numero == 5) {
                it.remove();
            }
        }

        System.out.println("\nTras eliminar los 5s: \n" + numeros);
    }
}
