package healthcalc;

public class adapter implements HealthHospital {
    private HealthCalc calculadora;

    public adapter(){
        calculadora = HealthCalcImpl.getInstance();
    }

    @Override
    public double bmr(char genero, int edad, float altura, int peso) throws Exception{
        //pasamos a cm y a kg
        float p = peso/1000;
        int a = (int) altura*100;

        return  calculadora.basalMetabolicRate(p, a, genero, edad);
    }

    @Override
    public int pesoIdeal(char genero, float altura) throws Exception{
        //pasamos a cm
        float a = (altura*100);

        return  (int) calculadora.idealWeight((int)a, genero);
    }


}
