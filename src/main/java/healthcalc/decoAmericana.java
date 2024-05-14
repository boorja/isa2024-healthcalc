package healthcalc;

public class decoAmericana extends decorador {

    public decoAmericana(HealthHospital calculadora) {
        super(calculadora);
    }

    @Override
    public int pesoIdeal(char genero, float altura) throws Exception {
        // tenemos que pasar la entrada en pies a metros
        // la salida al ser en gramos la volvemos a psar a libras
        float a = altura*0.3281f;


        return (int) (super.pesoIdeal(genero, a)*2.20462);
    }
    
    @Override
    public double bmr(char genero, int edad, float altura, int peso) throws Exception {
        // tenemos que pasar la entrada en pies a metros y la entrada en libras a gramos
        return super.bmr(genero, edad, (float) (altura*0.3281), (int) (peso*453.592));
    }

    
    
}
