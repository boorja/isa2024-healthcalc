package healthcalc.gui;

import java.awt.EventQueue;

import healthcalc.HealthCalcImpl;
import healthcalc.HealthHospital;
import healthcalc.adapter;

public class Main {

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {

					//================COMPROBAR ADAPTER================

					HealthHospital calculadora = new adapter();
					System.out.println(calculadora.bmr('m', 25, 1.77f, 76));

					//=================================================

					
					// HealthCalcImpl healthCalc = HealthCalcImpl.getInstance();
					// Vista vista = new Vista();
					// Controlador controlador = new Controlador(healthCalc, vista);
					// vista.registrarControlador(controlador);
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}