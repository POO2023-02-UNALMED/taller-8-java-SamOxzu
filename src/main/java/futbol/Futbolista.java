package futbol;

public abstract class Futbolista implements Comparable<Futbolista> {
    private String nombre;
    private int edad;
    private final String posicion;

    public Futbolista() {
        this("Maradona", 30, "delantero");
    }

    public Futbolista(String nombre, int edad, String posicion) {
        this.setNombre(nombre);
        this.setEdad(edad);
        this.posicion = posicion;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Futbolista otro = (Futbolista) obj;
        return this.nombre.equals(otro.nombre) && this.edad == otro.edad && this.posicion.equals(otro.posicion);
    }

    public abstract boolean jugarConLasManos();

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getPosicion() {
        return posicion;
    }
}
