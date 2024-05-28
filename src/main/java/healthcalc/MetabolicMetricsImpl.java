package healthcalc;

public class MetabolicMetricsImpl implements MetabolicMetrics{
    
    public float basalMetabolicRate(float weight, int height, char gender, int age) throws Exception {
        float res = 0;

        if (gender == 'm'){
            res = (float)((10*weight)+(6.25*height)-(5*age)+5);
        } else if (gender == 'w'){
            res = (float)((10*weight)+(6.25*height)-(5*age)-161);
        } else if (weight <= 0) {
            throw new Exception("Peso no valido");
        } else if (height <= 0) {
            throw new Exception("Altura no valida");
        } else if (age <= 0) {
            throw new Exception("Edad no valida");
        } else if (gender != 'm' && gender != 'w') {
            throw new Exception("Genero no valido");
        }

        return res;
    }
    
}