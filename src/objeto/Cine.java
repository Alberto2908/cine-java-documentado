package objeto;

public class Cine {
    public String nombre;
    public int aforo;
    public Sala[] salas;

    /**
     * Constructor de Cine con su nombre y el número de salas
     *
     * @param nombre
     * @param numSalas
     */
    public Cine(String nombre, int numSalas) {
        this.nombre = nombre;
        this.salas = new Sala[numSalas];
    }

    /**
     * Obtener el nombre del cine
     *
     * @return nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Cambiar nombre del cine
     *
     * @param nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtener el aforo del cine
     *
     * @return aforo
     */
    public int getAforo() {
        return aforo;
    }

    /**
     * Calcula el aforo en función a la capacidad de todas las salas del cine
     */
    public void setAforo() {
        for (int i = 0; i < salas.length; i++) {
            this.aforo += salas[i].getNumButacas();
        }
    }

    /**
     * Añade una sala al array de salas del cine seleccionado
     * @param sala
     */
    public void añadirSala(Sala sala) {
        for (int i = 0; i < salas.length; i++) {
            if (salas[i] == null) {
                this.salas[i] = sala;
                break;
            }
        }
    }

    /**
     * Muestra la información del cine y de todas las salas del cine
     */
    public void mostrarSalasYPeliculas() {
        System.out.println("Cine " + nombre + " Aforo: " + aforo + " Salas: " + salas.length);
        for (int i = 0; i < salas.length; i++) {
            System.out.println("Sala " + salas[i].getNumId());
            System.out.println("  - Película: " + salas[i].getPelicula().getTitulo());
            System.out.println("  - Duración: " + salas[i].getPelicula().getDuracion() + " minutos");
            System.out.println("  - Butacas libres: " + salas[i].getButacasLibres() + "\n");
        }
    }

    /**
     * Reserva una butaca
     * @param nSala
     * @param nFila
     * @param nColumna
     * @param email
     */
    public void reservarButaca(int nSala, int nFila, int nColumna, String email) {
        salas[nSala].reservar(nFila, nColumna, email);
    }
}