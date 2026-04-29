package a03;

import java.util.ArrayList;
import java.util.Collection;

public class A03 {

    public static void main(String[] args) {
        Collection<Integer> coleccionOriginal = new ArrayList<>();
        Collection<Integer> coleccionSinRepetidos = new ArrayList<>();

        // 1. Insertamos 20 números aleatorios entre 1 y 10
        for (int i = 0; i < 20; i++) {
            coleccionOriginal.add((int) (Math.random() * 10 + 1));
        }

        System.out.println("Colección original: " + coleccionOriginal);

        // 2. Rellenar la segunda colección filtrando los repetidos
        for (Integer numero : coleccionOriginal) {
            // El método contains() nos dice si el elemento ya existe
            if (!coleccionSinRepetidos.contains(numero)) {
                coleccionSinRepetidos.add(numero);
            }
        }

        System.out.println("Colección sin repetidos: " + coleccionSinRepetidos);
    }
}
