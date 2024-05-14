package healthcalc.gui;

import java.awt.EventQueue;

import healthcalc.HealthCalcImpl;
import healthcalc.HealthHospital;
import healthcalc.HealthStats;
import healthcalc.adapter;
import healthcalc.proxy;

public class Main {

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {

					//================COMPROBAR ADAPTER================

					HealthHospital adapter = new adapter();
					System.out.println("PATRON ADAPTER");
					System.out.println(adapter.bmr('m', 25, 1.77f, 76000));

					//=================================================

					//================COMPROBAR PROXY================
					// Inicio
					proxy proxy = new proxy();
					proxy.bmr('m', 52, 1.83f, 67675);
					proxy.bmr('w', 29, 1.64f, 88455);
					
					// Comprobacion
					System.out.println("\n\nPATRON PROXY");
					System.out.println("Altura media: " + proxy.alturaMedia());
					System.out.println("Peso medio: " + proxy.pesoMedio());
					System.out.println("Edad media: " + proxy.edadMedia());
					System.out.println("BMR medio: " + proxy.bmrMedio());
					System.out.println("Numero Mujeres: " + proxy.numSexoM());
					System.out.println("Numero Hombres: " + proxy.numSexoH());
					System.out.println("Numero Total: " + proxy.numTotalPacientes());

					
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