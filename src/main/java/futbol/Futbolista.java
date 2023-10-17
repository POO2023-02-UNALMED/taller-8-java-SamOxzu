package futbol;

public class Futbolista implements Comparable<Object> {
    private String nombre;
    private int edad;
    private String posicion;

    public Futbolista(String nombre, int edad, String posicion) {
        this.nombre = nombre;
        this.edad = edad;
        this.posicion = posicion;
    }

    public Futbolista() {
        this("Maradona", 30, "delantero");
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getPosicion() {
        return posicion;
    }

    @Override
    public int compareTo(Futbolista otroFutbolista) {
        return this.nombre.compareTo(otroFutbolista.nombre);
    }

    @Override
    public boolean equals(Object obj) {
        Futbolista otroFutbolista = (Futbolista) obj;
        return nombre.equals(otroFutbolista.nombre) && edad == otroFutbolista.edad && posicion.equals(otroFutbolista.posicion);
    }

    @Override
    public String toString() {
        return "El futbolista " + nombre + " tiene " + edad + ", y juega de " + posicion;
    }

    public boolean jugarConLasManos() {
        return false;
    }
}