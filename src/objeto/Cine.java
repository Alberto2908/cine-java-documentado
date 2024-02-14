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
}