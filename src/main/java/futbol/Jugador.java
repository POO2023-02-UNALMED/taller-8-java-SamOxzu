package futbol;

public class Jugador extends Futbolista {
    public short golesMarcados;
    public byte dorsal;

    public Jugador(String nombre, int edad, String posicion, short golesMarcados, byte dorsal) {
        super(nombre, edad, posicion);
        this.golesMarcados = golesMarcados;
        this.dorsal = dorsal;
    }

    public Jugador() {
        super();
        this.golesMarcados = 289;
        this.dorsal = 7;
    }

    @Override
    public int compareTo(Futbolista otroJugador) {
        if (otroJugador instanceof Jugador) {
            Jugador otro = (Jugador) otroJugador;
            return Integer.compare(this.getEdad(), otro.getEdad());
        } else {
            throw new IllegalArgumentException("No se puede comparar con un objeto que no es un Jugador.");
        }
    }

    @Override
    public String toString() {
        return "El futbolista " + getNombre() + " tiene " + getEdad() + ", y juega de " + getPosicion() + " con el dorsal " + dorsal + ". Ha marcado " + golesMarcados;
    }

    @Override
    public boolean jugarConLasManos() {
        return false;
    }
}
