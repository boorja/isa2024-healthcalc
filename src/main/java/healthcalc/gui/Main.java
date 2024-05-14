package healthcalc.gui;

import java.awt.EventQueue;

import healthcalc.HealthCalcImpl;
import healthcalc.HealthHospital;
import healthcalc.adapter;
import healthcalc.decoAmericana;
import healthcalc.decoESP;
import healthcalc.decoENG;
import healthcalc.decoEuropea;
import healthcalc.proxy;
import healthcalc.decorador;

public class Main {

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					
					//================COMPROBAR SINGULAR================
					System.out.println("PATRON SINGULAR");
					HealthCalcImpl c1 = HealthCalcImpl.getInstance();
					HealthCalcImpl c2 = HealthCalcImpl.getInstance();

					System.out.println("HashCode1: " + System.identityHashCode(c1));
					System.out.println("HashCode2: " + System.identityHashCode(c2));

					//================COMPROBAR ADAPTER================

					HealthHospital adapter = new adapter();
					System.out.println("\n\nPATRON ADAPTER");
					System.out.println("Peso Ideal: " + adapter.pesoIdeal('m', 1.77f));
					System.out.println("BMR: " + adapter.bmr('m', 25, 1.77f, 76000));
					
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

					//================COMPROBAR DECORADOR================
					
					System.out.println("\n\nPATRON DECORADOR");

					// Creamos versiones europea y americana
					HealthHospital calc = new adapter();
					decorador vAmericana = new decoAmericana(calc);
					decorador vEuropea = new decoEuropea(calc);

					// Prueba 1: Modelo base
					System.out.println("Prueba 1 - Modelo base\n");
					System.out.println("AmericanaIW: " + vAmericana.pesoIdeal('m', 5.9f));
					System.out.println("EuropeaIW: " + vEuropea.pesoIdeal('m', 1.65f));
					System.out.println("AmericanaBMR: " + vAmericana.bmr('m', 22, 5.9f, 220));
					System.out.println("EuropeaBMR: " + vEuropea.bmr('m', 22, 1.65f, 70000));

					// Prueba 2: Version americana ambos idiomas
					HealthHospital vAmericanaESP = new decoESP(vAmericana);
					HealthHospital vAmericanaENG = new decoENG(vAmericana);
					System.out.println("\n\nPrueba 2 - Version americana ambos idiomas\n");
					vAmericanaESP.pesoIdeal('m', 5.9f);
					vAmericanaENG.pesoIdeal('m', 5.9f);
					vAmericanaESP.bmr('m', 22, 5.9f, 220);
					vAmericanaENG.bmr('m', 22, 5.9f, 220);

					// Prueba 3: Version Europea ambos idiomas
					HealthHospital vEuropeaESP = new decoESP(vEuropea);
					HealthHospital vEuropeaENG = new decoENG(vEuropea);
					System.out.println("\n\nPrueba 3 - Version Europea ambos idiomas\n");
					vEuropeaESP.pesoIdeal('m', 1.65f);
					vEuropeaENG.pesoIdeal('m', 1.65f);
					vEuropeaESP.bmr('m', 22, 1.65f, 70000);
					vEuropeaENG.bmr('m', 22, 1.65f, 70000);


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