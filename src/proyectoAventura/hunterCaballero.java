package proyectoAventura;

public class hunterCaballero {
	  
	
	
	// ESTADISTICAS
    int vida = 10;
    int ataqueFisico = 9;
    int poderMagico = 1;
    int defensa = 10;
    int velocidad = 4;
    int mana = 2;

    // RUTA Y FINAL
    String ruta = "Ruta del Juramento";
    String finalJuego = "El ultimo juramento";

    // GUARDIANES
    String[] guardianes = {
        "El Vigilante de Hierro",
        "El Mariscal Sangriento",
        "El Coloso Penitente",
        "La Reina del Juramento Roto"
    };

    void StatsCaballero() {

        System.out.println("=== CABALLERO ===");
        System.out.println("Vida: " + vida);
        System.out.println("Ataque fisico: " + ataqueFisico);
        System.out.println("Poder magico: " + poderMagico);
        System.out.println("Defensa: " + defensa);
        System.out.println("Velocidad: " + velocidad);
        System.out.println("Mana: " + mana);

    }
}
	
	
	
	
		

