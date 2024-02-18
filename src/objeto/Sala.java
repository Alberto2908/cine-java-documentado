package objeto;

public class Sala {
    public int numId;
    public Pelicula pelicula;
    public Butaca[][] butacas;

    /**
     * Constructor de Sala
     *
     * @param numId
     * @param pelicula
     * @param filas
     * @param columnas
     */
    public Sala(int numId, Pelicula pelicula, int filas, int columnas) {
        this.numId = numId;
        this.pelicula = pelicula;
        this.butacas = new Butaca[filas][columnas];
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                this.butacas[i][j] = new Butaca();
            }
        }
    }

    /**
     * Obtener número de la Sala
     *
     * @return numId
     */
    public int getNumId() {
        return numId;
    }

    /**
     * Cambiar número de la Sala
     *
     * @param numId
     */
    public void setNumId(int numId) {
        this.numId = numId;
    }

    /**
     * Obtener nombre Película
     *
     * @return
     */
    public Pelicula getPelicula() {
        return pelicula;
    }

    /**
     * Cambiar nombre Película
     *
     * @param pelicula
     */
    public void setPelicula(Pelicula pelicula) {
        this.pelicula = pelicula;
    }

    /**
     * Obtener Butaca seleccionando FILA y COLUMNA.
     *
     * @param fila
     * @param columna
     * @return butacas[fila][columna]
     */
    public Butaca getButaca(int fila, int columna) {
        return butacas[fila - 1][columna - 1];
    }

    /**
     * Obtener el número total de butacas de una sala.
     *
     * @return butacasTotales
     */
    public int getNumButacas() {
        int butacasTotales = 0;
        for (int i = 0; i < butacas.length; i++) {
            for (int j = 0; j < butacas[i].length; j++) {
                butacasTotales++;
            }
        }
        return butacasTotales;
    }

    /**
     * Obtener contador de butacas libres.
     *
     * @return butacasLibres
     */
    public int getButacasLibres() {
        int butacasLibres = 0;
        for (int i = 0; i < butacas.length; i++) {
            for (int j = 0; j < butacas[i].length; j++) {
                if (butacas[i][j].estaOcupada() == false) {
                    butacasLibres++;
                }
            }
        }
        return butacasLibres;
    }

    /**
     * Recorre el Array de butacas comprobando el boolean. Si está ocupada pinta
     * "X". Si está libre pinta "-".
     */
    public void mostrarButacas() {
        System.out.println("Butacas para la Sala " + numId + " - Película: " + pelicula.getTitulo());
        System.out.println("Butaca libre: -    Butaca ocupada: X");
        System.out.println("----------------------------");

        for (int i = 0; i < butacas.length; i++) {
            for (int j = 0; j < butacas[i].length; j++) {
                if (butacas[i][j].estaOcupada()) {
                    System.out.print("X "); // Si está ocupada pinta X
                } else {
                    System.out.print("- "); // Si está vacía pinta -
                }
            }
            System.out.println();
        }

        System.out.println("----------------------------");
        System.out.println("Butacas libres: " + getButacasLibres() + "\n");
    }

    /**
     * Reservar la butaca que queremos, eligiendo sala, fila y columna, guardando el
     * email.
     *
     * @param nFila
     * @param nColumna
     * @param email
     */
    public void reservar(int nFila, int nColumna, String email) {
        butacas[nFila][nColumna].reservar(email);
    }
}