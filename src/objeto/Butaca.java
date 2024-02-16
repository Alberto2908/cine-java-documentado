package objeto;

public class Butaca {
    public boolean ocupada;
    public String email;

    public Butaca() {
        this.ocupada = false;
        this.email = null;
    }

    public boolean estaOcupada() {
        return ocupada;
    }
    public void setOcupada(boolean ocupada) {
        this.ocupada = ocupada;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
}