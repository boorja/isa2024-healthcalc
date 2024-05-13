package healthcalc.gui;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import healthcalc.HealthCalcImpl;


public class Controlador implements ActionListener{

	private char gender = 'x';
	private int height = 0;
	private int age = 0;
	private float weight = 0;
	private HealthCalcImpl calculadora = HealthCalcImpl.getInstance();
	private Vista vista;
	
	public Controlador(HealthCalcImpl calc, Vista gui) {
		this.calculadora = calc;
		this.vista = gui;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		String comando = e.getActionCommand();
		
		switch (comando) {
			
			case "BMR":
				try {
					height = Integer.parseInt(vista.getAltura().getText());
					weight = Float.parseFloat(vista.getPeso().getText());
					age = Integer.parseInt(vista.getEdad().getText());
					
					if(height < 0) {vista.errorBMR("Height is not valid");}
					if(weight < 0) {vista.errorBMR("Weight is not valid");}
					if(age < 0) {vista.errorBMR("Age is not valid");}
					
					
					if (vista.getFemenino().isSelected()) {
						gender = 'w';
					} else if (vista.getMasculino().isSelected()){
						gender = 'm';
					} else {
						vista.errorBMR("Gender not selected.");
					}
					
					float bmr = this.calculadora.basalMetabolicRate(weight, height, gender, age);
		            if (bmr > 0) {vista.setRes(bmr);}

				} catch (Exception e0) {
					vista.errorVacio();
				} break;
				
			
			case "IdealWeight":	
				try {
					height = Integer.parseInt(vista.getAltura().getText());
					if(height < 0) {vista.errorIW("Height is not valid");}

					
					if (vista.getFemenino().isSelected()) {
						gender = 'w';
					} else if (vista.getMasculino().isSelected()){
						gender = 'm';
					} else {
						vista.errorIW("Gender not selected.");
					}
					
					float idealWeight = this.calculadora.idealWeight(height, gender);
		            if(idealWeight > 0) {vista.setRes(idealWeight);}
					
					
				} catch (Exception e0) {
					vista.errorVacio();
				}
				break;
			
			case "clear":
				vista.clearV();
				
		}
	}

}