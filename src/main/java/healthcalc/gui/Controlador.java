package healthcalc.gui;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import healthcalc.Gender;
import healthcalc.HealthCalcImpl;
import healthcalc.PersonImpl;
import healthcalc.Person;


public class Controlador implements ActionListener{

	private Gender gender;
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
						gender = Gender.FEMALE;
					} else if (vista.getMasculino().isSelected()){
						gender = Gender.MALE;
					} else {
						vista.errorBMR("Gender not selected.");
					}
					
					Person person = new PersonImpl(weight, height, gender, age);
					double bmr = this.calculadora.basalMetabolicRate(person);
		            if (bmr > 0) {vista.setRes(bmr);}

				} catch (Exception e0) {
					vista.errorVacio();
				} break;
				
			
			case "IdealWeight":	
				try {
					height = Integer.parseInt(vista.getAltura().getText());
					if(height < 0) {vista.errorIW("Height is not valid");}

					
					if (vista.getFemenino().isSelected()) {
						gender = Gender.FEMALE;
					} else if (vista.getMasculino().isSelected()){
						gender = Gender.MALE;
					} else {
						vista.errorIW("Gender not selected.");
					}
					
					Person person = new PersonImpl(height, gender);
					double idealWeight = this.calculadora.idealWeight(person);
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