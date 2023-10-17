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
    public int compareTo(Object otroFutbolista) {
        return this.nombre.compareTo(((Futbolista)otroFutbolista).getNombre());
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj) {
        	return true;
        }
        else {
        	return false;
        }
    }

    @Override
    public String toString() {
        return "El futbolista " + nombre + " tiene " + edad + ", y juega de " + posicion;
    }

    public boolean jugarConLasManos() {
        return false;
    }
}