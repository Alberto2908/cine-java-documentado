package main;

import objeto.Cine;
import objeto.Pelicula;
import objeto.Sala;
import objeto.Butaca;
public class Main {
    public static void main(String[] args) {

        Cine cine1 = new Cine("Callao", 6);
        Sala sala1 = new Sala(1, new Pelicula("Cars", 117), 12, 16);
        Sala sala2 = new Sala(2, new Pelicula("Harry Potter", 152), 15, 18);
        Sala sala3 = new Sala(3, new Pelicula("Avengers: Endgame", 182), 20, 30);
        Sala sala4 = new Sala(4, new Pelicula("Batman: El caballero Oscuro", 152), 18, 26);
        Sala sala5 = new Sala(5, new Pelicula("Barbie", 114), 18, 20);
        Sala sala6 = new Sala(6, new Pelicula("Joker", 122), 18, 22);

    }
}
