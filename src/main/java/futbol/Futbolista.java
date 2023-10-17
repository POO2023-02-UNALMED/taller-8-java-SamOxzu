package futbol;

public class Futbolista implements Comparable<Futbolista> {
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

    public boolean equals(Futbolista f) {
        return this == f || (f != null && getClass() == f.getClass() && edad == f.edad && Objects.equals(nombre, f.nombre) && Objects.equals(posicion, f.posicion));
    }

    public abstract boolean jugarConLasManos();

    @Override
    public int compareTo(Futbolista otroFutbolista) {
        return Math.abs(this.edad - otroFutbolista.edad);
    }

    @Override
    public String toString() {
        return "El futbolista " + nombre + " tiene " + edad + " años, y juega de " + posicion + ".";
    }
}