package proyectoAventura.guardianes.caballero;

import java.util.Scanner;
import java.util.InputMismatchException;

// Código por Sherwin. Clase de ReinaJuramento con sus respectivos métodos.

public class ReinaJuramento {
	public void pruebaCombate() {
		boolean combate = false;
		Scanner sc = new Scanner(System.in);
		// Código para evento de combate por turnos.

		// Placeholder de las estadísticas del jugador, pendiente de cambio.
		// Puntos de vida base - Se inicializa la variable.
		int hpJug = 200;

		// Defensa (modificador)
		int defJug = 20;

		// Velocidad/Agilidad base
		int velJug = 10;

		// Puntos de magia (base), permiten acceder a determinados tipos de ataques. -
		// Se inicializa la variable.
		int mpJug = 0;

		// Ataque base (estadística predeterminada del daño que inflinge el jugador)
		int atkJug = 3;

		// Tipos de ataque (con modificador)
		int[] ataqueJug = new int[4];

		// Ataque normal
		ataqueJug[1] = atkJug * 1;
		// Ataque especial
		ataqueJug[2] = atkJug * 3;
		// Ataque final
		ataqueJug[3] = atkJug * 10;

		// Establecer estadísticas del guardián. Muchos son modificadores. Una variable
		// es "inicializada" cuando se trata de su valor inicial al comenzar cada
		// combate. Estas estaísticas son genéricas y orientativas, pendientes de
		// cambio.

		// Puntos de vida base - Se inicializa la variable.
		int hp = 200;

		// Defensa (modificador)
		int def = 20;

		// Velocidad/Agilidad base
		int vel = 10;

		// Puntos de magia (base), permiten acceder a determinados tipos de ataques. -
		// Se inicializa la variable.
		int mp = 0;

		// Ataque base (estadística predeterminada del daño que inflinge el guardián)
		int atk = 3;

		// Tipos de ataque (con modificador)
		int[] ataque = new int[4];

		// Ataque normal
		ataque[1] = atk * 1;
		// Ataque especial
		ataque[2] = atk * 3;
		// Ataque final
		ataque[3] = atk * 10;

		// Prueba para verificar las variables
		System.out.println("ReinaJuramento - STATS: \nHP: " + hp + "\nDEF: " + def + "\nVEL: " + vel + "\nMP: " + mp
				+ "\nATK: " + atk);

		// Plantilla genérica de combate a turnos, pendiente de cambio.
		// Inicio del combate:
		combate = true;

		while (combate) {
			// Mostrar la interfaz del jugador
			System.out.println("NOMBRE JUGADOR -- HP: " + hpJug + " MP: " + mpJug);
			System.out.println("Selecciona qué hacer: ");

			// Elección de casos de uso:
			System.out.println("- Atacar (1)");
			System.out.println("- Curarse (2)");
			System.out.println("- Objeto (3)");

			// Se asegura de que la elección del jugador es válida
			try {
				if (sc.nextInt() <= 0 || sc.nextInt() > 3 || !sc.hasNextDouble()) {
					System.err.println("Selecciona una acción válida");
					sc.nextLine();
					continue;
				} else {
					int accionTurno = sc.nextInt();
					switch (accionTurno) {
					case 1:
						// Elegir tipo de ataque:
						System.out.println("- Ataque normal (1)");
						System.out.println("- Ataque especial (2)");
						System.out.println("- Ataque final (3)");

						// En este caso "n" sirve como la elección de las subcategorías de los casos de
						// uso iniciales. Para poder ponerlo después del switch, todos los casos han de
						// requerir la selección de "n"
						int n = sc.nextInt();
					case 2:
						// Curarse una cantidad determinada de HP, pendiente de añadir lista de objetos
						// de curación.
						if (hpJug != 200) {
							hpJug += 20;
						}
					case 3:
						// Pendiente de añadir listas de objetos
						System.err.println("Acción no disponible");
						sc.nextLine();
						continue;
					}
				}
			} catch (InputMismatchException e) {
				System.err.println("Selecciona una acción válida");
				sc.nextLine();
				continue;
			}
		}
	}
}
