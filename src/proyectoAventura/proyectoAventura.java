package proyectoAventura;

import java.util.Scanner;
import java.util.Random;

public class proyectoAventura {
	public static void main(String[] args) {
		// Objetos a utilizar
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();

		// Menú inicial
		System.out.println(
				"▄▀▀▀▀▄      ▄▀▀█▄   ▄▀▀▀▀▄      ▄▀▀█▄   ▄▀▀▀▀▄      ▄▀▀▄ ▄▀▄  ▄▀▀█▄   ▄▀▀▀▀▄      ▄▀▀█▄▄   ▄▀▀█▄▄▄▄  ▄▀▀▀▀▄          ▄▀▀▄ ▄▀▀▄  ▄▀▀▄ ▄▀▄  ▄▀▀█▄▄   ▄▀▀▄▀▀▀▄  ▄▀▀█▄   ▄▀▀▀▀▄     \r\n"
						+ "█    █      ▐ ▄▀ ▀▄ █ █   ▐     ▐ ▄▀ ▀▄ █    █      █  █ ▀  █ ▐ ▄▀ ▀▄ █ █   ▐     █ ▄▀   █ ▐  ▄▀   ▐ █    █          █   █    █ █  █ ▀  █ ▐ ▄▀   █ █   █   █ ▐ ▄▀ ▀▄ █    █      \r\n"
						+ "▐    █        █▄▄▄█    ▀▄         █▄▄▄█ ▐    █      ▐  █    █   █▄▄▄█    ▀▄       ▐ █    █   █▄▄▄▄▄  ▐    █          ▐  █    █  ▐  █    █   █▄▄▄▀  ▐  █▀▀█▀    █▄▄▄█ ▐    █      \r\n"
						+ "    █        ▄▀   █ ▀▄   █       ▄▀   █     █         █    █   ▄▀   █ ▀▄   █        █    █   █    ▌      █             █    █     █    █    █   █   ▄▀    █   ▄▀   █     █       \r\n"
						+ "  ▄▀▄▄▄▄▄▄▀ █   ▄▀   █▀▀▀       █   ▄▀    ▄▀▄▄▄▄▄▄▀ ▄▀   ▄▀   █   ▄▀   █▀▀▀        ▄▀▄▄▄▄▀  ▄▀▄▄▄▄     ▄▀▄▄▄▄▄▄▀        ▀▄▄▄▄▀  ▄▀   ▄▀    ▄▀▄▄▄▀  █     █   █   ▄▀    ▄▀▄▄▄▄▄▄▀ \r\n"
						+ "  █         ▐   ▐    ▐          ▐   ▐     █         █    █    ▐   ▐    ▐          █     ▐   █    ▐     █                        █    █    █    ▐   ▐     ▐   ▐   ▐     █         \r\n"
						+ "  ▐                                       ▐         ▐    ▐                        ▐         ▐          ▐                        ▐    ▐    ▐                            ▐         ");


		// Pide la clave para iniciar el juego
		boolean partida = false;
		while (!partida) {
			System.out.println("\nIntroduce la clave para iniciar la partida:");
			if (sc.hasNextInt() || sc.hasNextDouble()) {
				sc.nextLine();
				System.err.println("Por favor, introduce una clave válida.");
				continue;
			} else {
				String clave = sc.next();
				if (clave.equals("jugones")) {
					partida = true;
				} else {
					sc.nextLine();
					System.err.println("Clave incorrecta, inténtalo de nuevo.");
					continue;
				}
			}
		}
		// Inicializa la partida tras insertar la clave
		System.out.println("Empieza la partida");
		// Creo un nuevo objeto de nombre "newObj" referenciando a Prueba.java
		
		// CREAR LOS TRES PERSONAJES

		hunterMago mago = new hunterMago();
		hunterNigromante nigromante = new hunterNigromante();
		hunterCaballero caballero = new hunterCaballero();

		// PREVISUALIZACION HORIZONTAL DE LAS TRES CLASES

		System.out.println("\n==================== SELECCION DE CAZADOR ====================");

		// NOMBRES DE LOS PERSONAJES
		System.out.printf("%-25s %-25s %-25s%n", "MAGO", "NIGROMANTE", "CABALLERO");

		System.out.println("--------------------------------------------------------------------------");

		// MOSTRAR ESTADISTICAS EN PARALELO

		System.out.printf("%-25s %-25s %-25s%n",
		        "Vida: " + mago.vida,
		        "Vida: " + nigromante.vida,
		        "Vida: " + caballero.vida);

		System.out.printf("%-25s %-25s %-25s%n",
		        "Ataque: " + mago.ataqueFisico,
		        "Ataque: " + nigromante.ataqueFisico,
		        "Ataque: " + caballero.ataqueFisico);

		System.out.printf("%-25s %-25s %-25s%n",
		        "Magia: " + mago.poderMagico,
		        "Magia: " + nigromante.poderMagico,
		        "Magia: " + caballero.poderMagico);

		System.out.printf("%-25s %-25s %-25s%n",
		        "Defensa: " + mago.defensa,
		        "Defensa: " + nigromante.defensa,
		        "Defensa: " + caballero.defensa);

		System.out.printf("%-25s %-25s %-25s%n",
		        "Velocidad: " + mago.velocidad,
		        "Velocidad: " + nigromante.velocidad,
		        "Velocidad: " + caballero.velocidad);

		System.out.printf("%-25s %-25s %-25s%n",
		        "Mana: " + mago.mana,
		        "Mana: " + nigromante.mana,
		        "Mana: " + caballero.mana);

		System.out.println("--------------------------------------------------------------------------");
		
//====================================================================================================================
//=======================================================================================================================
		//Seleccion de hunter : MAGO / CABALLERO / NIGROMANTE
		
		

        int opcion;

        // SELECCION DE PERSONAJE
        do {
            System.out.println("\n=== LAS ALMAS DEL UMBRAL ===");
            System.out.println("1. Mago");
            System.out.println("2. Caballero");
            System.out.println("3. Nigromante");
            System.out.print("Elige tu personaje: ");

            opcion = sc.nextInt();

        } while (opcion < 1 || opcion > 3); //Mientras sea un numero que NO ESTE DENTRO del rango se vuelve a ejecutar. 

        sc.nextLine();						//Para volever a hacer otra linea y escribir de nuevo el valor de "opcion".

        String ruta = "";					//Se crean las variables para luego poder ser reemplazadas 
    										//con los valores correspondientes segun el cazador que se elija.
        String finalJuego = "";
        String[] guardianes = null;

        int vida = 0;
        int ataqueFisico = 0;
        int poderMagico = 0;
        int defensa = 0;
        int velocidad = 0;
        int mana = 0;

        // SELECCIONAR DATOS DEL PERSONAJE
        if (opcion == 1) {

            mago.StatsMago();

            vida = mago.vida;
            ataqueFisico = mago.ataqueFisico;
            poderMagico = mago.poderMagico;
            defensa = mago.defensa;
            velocidad = mago.velocidad;
            mana = mago.mana;

            ruta = mago.ruta;
            finalJuego = mago.finalJuego;
            guardianes = mago.guardianes;

        } else if (opcion == 2) {        

            caballero.StatsCaballero();

            vida = caballero.vida;
            ataqueFisico = caballero.ataqueFisico;
            poderMagico = caballero.poderMagico;
            defensa = caballero.defensa;
            velocidad = caballero.velocidad;
            mana = caballero.mana;

            ruta = caballero.ruta;
            finalJuego = caballero.finalJuego;
            guardianes = caballero.guardianes;

        } else {

            nigromante.StatsNigromante();

            vida = nigromante.vida;
            ataqueFisico = nigromante.ataqueFisico;
            poderMagico = nigromante.poderMagico;
            defensa = nigromante.defensa;
            velocidad = nigromante.velocidad;
            mana = nigromante.mana;

            ruta = nigromante.ruta;
            finalJuego = nigromante.finalJuego;
            guardianes = nigromante.guardianes;
        }

        // MOSTRAR RUTA
        System.out.println("\nRuta seleccionada: " + ruta);

        
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}
}
