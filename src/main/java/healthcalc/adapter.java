package healthcalc;

public class adapter implements HealthHospital {
    private HealthCalc calculadora;

    public adapter(){
        calculadora = HealthCalcImpl.getInstance();
    }

    @Override
    public float bmr(char genero, int edad, float altura, int peso) throws Exception{
        //pasamos a metros y a gramos
        return  calculadora.basalMetabolicRate((float) (peso/1000), (int) (altura*100), genero, edad);
    }

    @Override
    public float pesoIdeal(char genero, float altura) throws Exception{
        //pasamos a metros y a gramos
        return  calculadora.idealWeight((int) (altura*100), genero)*1000;
    }


}
