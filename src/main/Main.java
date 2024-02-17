package main;

import java.util.Scanner;

import objeto.Cine;
import objeto.Pelicula;
import objeto.Sala;
import objeto.Butaca;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int nSala;
        int nFila;
        int nColumna;
        String email;
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
                case 2:
                    // Solicitar al usuario el número de sala, fila y columna de la butaca
                    System.out.print("Ingrese el número de sala:");
                    nSala = scanner.nextInt() - 1;
                    System.out.print("Ingrese el número de fila:");
                    nFila = scanner.nextInt() - 1;
                    System.out.print("Ingrese el número de columna:");
                    nColumna = scanner.nextInt() - 1;

                    // Verificar que el número de sala sea válido
                    if (nSala >= 1 && nSala <= cine1.salas.length) {

                        // Verificar que la fila y la columna sean válidas
                        if (nFila >= 1 && nFila <= cine1.salas[nSala - 1].butacas.length && nColumna >= 1
                                && nColumna <= cine1.salas[nSala - 1].butacas[0].length) {

                            // Verificar si la butaca está ocupada
                            if (cine1.salas[nSala - 1].butacas[nFila - 1][nColumna - 1].estaOcupada() == false) {
                                // Solicitar al usuario el email del comprador
                                System.out.print("Ingrese su email:");
                                email = scanner.next();

                                cine1.reservarButaca(nSala, nFila, nColumna, email);
                                System.out.println("¡Reserva realizada con éxito!");
                                System.out.println(
                                        "Has reservado para ver la película " + cine1.salas[nSala].getPelicula().getTitulo()
                                                + " en la fila " + nFila + " y columna " + nColumna + "." + "\n");
                            } else {
                                System.out.println("La butaca seleccionada ya está ocupada. Por favor, elija otra." + "\n");
                            }
                        } else {
                            System.out.println("Fila o columna inválida." + "\n");
                        }
                    } else {
                        System.out.println("Número de sala inválido." + "\n");
                    }
                    break;
                case 3:
                    // Solicitar al usuario el número de sala a mostrar
                    System.out.print("Ingrese el número de sala para ver las butacas:");
                    nSala = scanner.nextInt();

                    // Verificar que el número de sala sea válido
                    if (nSala >= 1 && nSala <= cine1.salas.length) {
                        cine1.salas[nSala - 1].mostrarButacas();
                    } else {
                        System.out.println("Número de sala inválido." + "\n");
                    }
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
