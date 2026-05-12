package a11;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class A11 {

    public static void main(String[] args) {
        
        // TreeMap garantiza orden alfabético de las claves (String)
        Map<String, Integer> existencias = new TreeMap<>();
        
        try (Scanner sc = new Scanner(System.in)) {
            int opcion;
            
            do {
                System.out.println("\n--- TIENDA DE REPUESTOS ---");
                System.out.println("1. Alta producto");
                System.out.println("2. Baja producto");
                System.out.println("3. Actualizar stock");
                System.out.println("4. Listar existencias");
                System.out.println("5. Salir");
                System.out.print("Elige opción: ");
                opcion = sc.nextInt();
                sc.nextLine(); // Limpiar buffer
                
                switch (opcion) {
                    case 1 -> {
                        System.out.print("Código producto: ");
                        String codAlta = sc.nextLine();
                        if (existencias.containsKey(codAlta)) {
                            System.out.println("¡El producto ya existe!");
                        } else {
                            System.out.print("Stock inicial: ");
                            int stock = sc.nextInt();
                            existencias.put(codAlta, stock);
                            System.out.println("Producto registrado.");
                        }
                    }
                    case 2 -> {
                        System.out.print("Código producto a dar de baja: ");
                        String codBaja = sc.nextLine();
                        // remove() devuelve null si la clave no existe
                        if (existencias.remove(codBaja) != null) {
                            System.out.println("Producto eliminado.");
                        } else {
                            System.out.println("El producto no existe.");
                        }
                    }
                    case 3 -> {
                        System.out.print("Código producto a actualizar: ");
                        String codAct = sc.nextLine();
                        if (existencias.containsKey(codAct)) {
                            System.out.print("Nuevo stock: ");
                            int nuevoStock = sc.nextInt();
                            // put machaca el valor si la clave ya existe
                            existencias.put(codAct, nuevoStock);
                            System.out.println("Stock actualizado.");
                        } else {
                            System.out.println("El producto no existe.");
                        }
                    }
                    case 4 -> {
                        System.out.println("\n--- LISTADO DE EXISTENCIAS ---");
                        if (existencias.isEmpty()) {
                            System.out.println("No hay productos en el sistema.");
                        } else {
                            // Recorremos obteniendo el conjunto de claves
                            for (String codigo : existencias.keySet()) {
                                System.out.println("Código: " + codigo + " | Stock: "
                                        + existencias.get(codigo));
                            }
                        }
                    }
                    case 5 -> System.out.println("Saliendo del sistema...");
                    default -> System.out.println("Opción incorrecta.");
                }
            } while (opcion != 5);
        }
    }
}
