package healthcalc;

public class adapter implements HealthHospital{
    private HealthCalc calculadora;
    Gender g;

    public adapter(){
        calculadora = HealthCalcImpl.getInstance();
    }

    @Override
    public double bmr(char genero, int edad, float altura, int peso) throws Exception{
        //pasamos a cm y a kg
        float p = peso/1000;
        int a = (int) altura*100;
        
        Gender g = null;
        if (genero == 'm'){
            g = Gender.MALE;
        } else if (genero == 'w'){
            g = Gender.FEMALE;
        }
        Person person = new PersonImpl(p, a, g, edad);

        return  calculadora.basalMetabolicRate(person);
    }

    @Override
    public int pesoIdeal(char genero, float altura) throws Exception{
        //pasamos a cm
        float a = (altura*100);

        Gender g = null;
        if (genero == 'm'){
            g = Gender.MALE;
        } else if (genero == 'w'){
            g = Gender.FEMALE;
        }

        Person person = new PersonImpl(a, g);
        return  (int) calculadora.idealWeight(person);
    }


}
