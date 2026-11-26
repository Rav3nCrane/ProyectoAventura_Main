package proyectoAventura;

import java.util.Random;

public class MotorDialogo {
	public void dialogo() {
		Random rd = new Random();
		String txt = DatosCompartidos.dialogoActual;
		int saltoLinea = 0;
		System.out.println("\n\n");
		for (int i = 0; i < txt.length(); i++) {
			try {
				saltoLinea++;
				if (saltoLinea >= 174) {
					if (txt.charAt(i) == ' ') {
						i++;
						System.out.println("");
						saltoLinea = 0;
					}
				}
				System.out.print(txt.charAt(i));
				Thread.sleep(rd.nextInt(30));
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}
}
