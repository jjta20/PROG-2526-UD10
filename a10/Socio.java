package a10;

public class Socio implements Comparable<Socio> {

    String dni;
    String nombre;

    public Socio(String dni, String nombre) {
        this.dni = dni;
        this.nombre = nombre;
    }

    @Override
    public boolean equals(Object ob) {
        return dni.equals(((Socio) ob).dni);
    }
    
    @Override
    public int hashCode() {
        return dni.hashCode();
    }

    @Override
    public int compareTo(Socio otro) {
        return dni.compareTo(otro.dni);
    }

    @Override
    public String toString() {
        return "Socio{" + "DNI='" + dni + '\'' + ", nombre='" + nombre + "'}";
    }
}
