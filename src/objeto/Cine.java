package objeto;

public class Cine {
    public String nombre;
    public int aforo;
    public Sala[] salas;

    public Cine(String nombre, int numSalas) {
        this.nombre = nombre;
        this.aforo = aforo;
        this.salas = new Sala[numSalas];
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getAforo() {
        return aforo;
    }
    public void setAforo() {
        for (int i = 0; i < salas.length; i++) {
            this.aforo += salas[i].getNumButacas();
        }
    }
    public Sala[] getSalas() {
        return salas;
    }
    public void setSalas(Sala[] salas) {
        this.salas = salas;
    }

    public void añadirSala(Sala sala) {
        for (int i = 0; i < salas.length; i++) {
            if (salas[i] == null) {
                this.salas[i] = sala;
                break;
            }
        }
    }

    public void mostrarSalasYPeliculas() {
        System.out.println("Cine " + nombre + " Aforo: " + aforo + " Salas: " + salas.length);
        for (int i = 0; i < salas.length; i++) {
            System.out.println("Sala " + salas[i].getNumId());
            System.out.println("  - Película: " + salas[i].getPelicula().getTitulo());
            System.out.println("  - Duración: " + salas[i].getPelicula().getDuracion() + " minutos");
            System.out.println("  - Butacas libres: " + salas[i].getButacasLibres() + "\n");
        }
    }

    public void reservarButaca(int nSala, int nFila, int nColumna, String email) {
        salas[nSala].reservar(nFila, nColumna, email);
    }
}