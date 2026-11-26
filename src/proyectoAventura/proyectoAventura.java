package proyectoAventura;

import java.util.Scanner;

import proyectoAventura.guardianes.caballero.ReinaJuramento;

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

//		ReinaJuramento boss3 = new ReinaJuramento();
//		boss3.pruebaCombate();

		DatosCompartidos.dialogoActual = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.";
		
		MotorDialogo msg = new MotorDialogo();
		msg.dialogo();
		
		DatosCompartidos.dialogoActual ="In Java, you cannot call .equals() directly on a primitive char, because primitive types do not have methods. Use the == operator to compare char values directly, or use .equals() only if you have Character wrapper objects or String objects.\r\n"
				+ "• Primitive char (==): Compares character values directly ('a' == 'a' is true).\r\n"
				+ "• Character wrapper class (.equals()): Compares the wrapped character values (Character.valueOf('a').equals('a') is true).\r\n"
				+ "• String objects (.equals()): Compares sequences of characters by content rather than memory reference.\r\n"
				+ "Users on Stack Overflow agree that == is standard for primitive char comparisons while .equals() applies to object types like Character and String.\r\n"
				+ "Are you working with primitive char, Character objects, or String values in your code?\r\n"
				+ "";
		msg.dialogo();
	}
}
