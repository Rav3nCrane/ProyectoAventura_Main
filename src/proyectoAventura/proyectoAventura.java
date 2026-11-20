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
		Prueba newObj = new Prueba();
		newObj.Texto1();
		newObj.Texto2();
		
	}
}
