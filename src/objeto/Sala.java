package objeto;

public class Sala {
    public int numId;
    public Pelicula pelicula;
    public Butaca[][] butacas;

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

    public int getNumId() {
        return numId;
    }
    public void setNumId(int numId) {
        this.numId = numId;
    }
    public Pelicula getPelicula() {
        return pelicula;
    }
    public void setPelicula(Pelicula pelicula) {
        this.pelicula = pelicula;
    }
    public Butaca[][] getButacas() {
        return butacas;
    }
    public void setButacas(Butaca[][] butacas) {
        this.butacas = butacas;
    }

    public int getNumButacas() {
        int butacasTotales = 0;
        for (int i = 0; i < butacas.length; i++) {
            for (int j = 0; j < butacas[i].length; j++) {
                butacasTotales++;
            }
        }
        return butacasTotales;
    }

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

    public void reservar(int nFila, int nColumna, String email) {
        butacas[nFila][nColumna].reservar(email);
    }
}