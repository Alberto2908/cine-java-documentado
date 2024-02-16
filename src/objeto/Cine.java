package Objeto;

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
    public void setAforo(int aforo) {
        this.aforo = aforo;
    }
    public Sala[] getSalas() {
        return salas;
    }
    public void setSalas(Sala[] salas) {
        this.salas = salas;
    }
}