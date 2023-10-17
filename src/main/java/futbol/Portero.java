package futbol;

public class Portero extends Futbolista {
    public short golesRecibidos;
    public byte dorsal;

    public Portero(String nombre, int edad, short golesRecibidos, byte dorsal) {
        super(nombre, edad, "Portero");
        this.golesRecibidos = golesRecibidos;
        this.dorsal = dorsal;
    }

    public boolean jugarConLasManos() {
        return true;
    }

    @Override
    public String toString() {
        return "El futbolista " + getNombre() + " tiene " + getEdad() + ", y juega de " + getPosicion() + " con el dorsal " + dorsal + ". Le han marcado " + golesRecibidos;
    }

    public int getGolesRecibidos() {
        return golesRecibidos;
    }

    @Override
    public int compareTo(Futbolista otroPortero) {
        if (otroPortero instanceof Portero) {
            Portero otro = (Portero) otroPortero;
            return Integer.compare(this.golesRecibidos, otro.getGolesRecibidos());
        } else {
            throw new IllegalArgumentException("No se puede comparar con un objeto que no es un Portero.");
        }
    }
}
