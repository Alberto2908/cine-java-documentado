package objeto;

public class Pelicula {
    public String titulo;
    public int duracion;

    /**
     * Constructor de Pelicula
     *
     * @param titulo
     * @param duracion
     */
    public Pelicula(String titulo, int duracion) {
        this.titulo = titulo;
        this.duracion = duracion;
    }

    /**
     * Obtener nombre de la Película
     *
     * @return
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * Cambia nombre de la Película
     *
     * @param titulo
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /**
     * Obtener duración de la Película
     *
     * @return
     */
    public int getDuracion() {
        return duracion;
    }

    /**
     * Cambiar duración de la Película
     *
     * @param duracion
     */
    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

}