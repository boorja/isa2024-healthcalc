package healthcalc;

public class decorador implements HealthHospital {
    protected HealthHospital calculadora;

    public decorador(HealthHospital calculadora){
        this.calculadora=calculadora;
    }

    @Override
    public int pesoIdeal(char genero, float altura) throws Exception {
        return calculadora.pesoIdeal(genero, altura);
    }
    
    @Override
    public double bmr(char genero, int edad, float altura, int peso) throws Exception {
        return calculadora.bmr(genero, edad, altura, peso);
    }   
}
