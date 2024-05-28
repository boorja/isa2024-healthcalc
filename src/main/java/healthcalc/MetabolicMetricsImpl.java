package healthcalc;

public class MetabolicMetricsImpl implements MetabolicMetrics{
    
    public double basalMetabolicRate(float weight, int height, Gender gender, int age) throws Exception {
        
        double res = 0;

        if (gender.equals(Gender.MALE)){
            res = ((10*weight)+(6.25*height)-(5*age)+5);
        } else if (gender.equals(Gender.FEMALE)){
            res = ((10*weight)+(6.25*height)-(5*age)-161);
        } else if (weight <= 0) {
            throw new Exception("Peso no valido");
        } else if (height <= 0) {
            throw new Exception("Altura no valida");
        } else if (age <= 0) {
            throw new Exception("Edad no valida");
        } else if (!gender.equals(Gender.FEMALE) && !gender.equals(Gender.MALE)) {
            throw new Exception("Genero no valido");
        }

        return res;
    }
    
}
