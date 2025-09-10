package personajes;

import personajes.abstractos.*;
import personajes.humanos.FabricaHumanos;
import personajes.elfos.FabricaElfos;
import personajes.orcos.FabricaOrcos;
import personajes.enanos.FabricaEnanos;

import java.util.Scanner;

public class main {

    public static void mostrarPersonaje(FabricaPersonajes fabrica) {
        Cuerpo cuerpo = fabrica.crearCuerpo();
        Armadura armadura = fabrica.crearArmadura();
        Montura montura = fabrica.crearMontura();
        Arma arma = fabrica.crearArma();

        System.out.println("\n=== INFORMACIÓN DEL PERSONAJE ===");
        System.out.println("Cuerpo → " + cuerpo.getNombre() + ": " + cuerpo.getDescripcion());
        System.out.println("Armadura → " + armadura.getNombre() + ": " + armadura.getDescripcion());
        System.out.println("Montura → " + montura.getNombre() + ": " + montura.getDescripcion());
        System.out.println("Arma → " + arma.getNombre() + ": " + arma.getDescripcion());
        System.out.println("----------------------------------\n");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {
            System.out.println("¿Qué personaje deseas ver?");
            System.out.println("1. Humano");
            System.out.println("2. Elfo");
            System.out.println("3. Orco");
            System.out.println("4. Enano");
            System.out.print("Elige una opción: ");
            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1 -> mostrarPersonaje(new FabricaHumanos());
                case 2 -> mostrarPersonaje(new FabricaElfos());
                case 3 -> mostrarPersonaje(new FabricaOrcos());
                case 4 -> mostrarPersonaje(new FabricaEnanos());
                default -> System.out.println("⚠ Opción no válida.");
            }

            System.out.print("¿Deseas ver otro personaje? (s/n): ");
            String respuesta = scanner.next();
            if (!respuesta.equalsIgnoreCase("s")) {
                continuar = false;
            }
        }

        System.out.println("👋 ¡Gracias por usar el catálogo de personajes!");
    }
}
