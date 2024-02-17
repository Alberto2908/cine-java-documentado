package main;

import java.util.Scanner;

import objeto.Cine;
import objeto.Pelicula;
import objeto.Sala;
import objeto.Butaca;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean seguir = true;
        int opcion;

        Cine cine1 = new Cine("Callao", 6);
        Sala sala1 = new Sala(1, new Pelicula("Cars", 117), 12, 16);
        Sala sala2 = new Sala(2, new Pelicula("Harry Potter", 152), 15, 18);
        Sala sala3 = new Sala(3, new Pelicula("Avengers: Endgame", 182), 20, 30);
        Sala sala4 = new Sala(4, new Pelicula("Batman: El caballero Oscuro", 152), 18, 26);
        Sala sala5 = new Sala(5, new Pelicula("Barbie", 114), 18, 20);
        Sala sala6 = new Sala(6, new Pelicula("Joker", 122), 18, 22);

        cine1.añadirSala(sala1);
        cine1.añadirSala(sala2);
        cine1.añadirSala(sala3);
        cine1.añadirSala(sala4);
        cine1.añadirSala(sala5);
        cine1.añadirSala(sala6);

        while (seguir) {

            System.out.print("¿Qué operación deseas realizar?\n" + "1 - Ver salas y datos de películas\n"
                    + "2 - Elegir sala y butaca para reservar\n"
                    + "3 - Ver matriz con asientos libres/ocupados de una sala\n" + "4 - Salir\n" + ">> ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    cine1.mostrarSalasYPeliculas();
                    break;
                case 4:
                    System.out.println("Saliendo del programa. ¡Hasta luego!");
                    seguir = false;
                    scanner.close();
                    break;
                default:
                    System.out.println("Opción no válida. Inténtalo de nuevo." + "\n");

            }
        }
    }
}
