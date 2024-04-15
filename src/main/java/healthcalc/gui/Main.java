package healthcalc.gui;

import java.awt.EventQueue;

import healthcalc.HealthCalcImpl;

public class Main {

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HealthCalcImpl healthCalc = new HealthCalcImpl();
					Vista vista = new Vista();
					Controlador controlador = new Controlador(healthCalc, vista);
					vista.registrarControlador(controlador);
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}