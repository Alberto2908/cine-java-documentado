package objeto;

public class Butaca {
    public boolean ocupada;
    public String email;

    /**
     * Constructor de Butaca
     */
    public Butaca() {
        this.ocupada = false;
        this.email = null;
    }

    /**
     * Obtener si está ocupada la butaca
     *
     * @return ocupada
     */
    public boolean estaOcupada() {
        return ocupada;
    }

    /**
     * Obtener email del comprador
     *
     * @return email
     */
    public String getEmail() {
        return email;
    }

    /**
     * Cambiar email del comprador
     *
     * @param email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Reservar butaca. Cambia boolean y guarda email de comprador.
     *
     * @param email
     */
    public void reservar(String email) {
        this.ocupada = true;
        this.email = email;
    }
}