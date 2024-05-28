package healthcalc;

public class CardiovascularMetricsImpl implements CardiovascularMetrics{
    
    public double getIdealWeight(int height, Gender gender) throws Exception{

        double res = 0;
        
        if (gender.equals(Gender.MALE)){
            res = (50+(0.91*height-152.4));
        } else if (gender.equals(Gender.FEMALE)){
            res = (45.5+(0.91*height-152.4));
        } else if (height <= 0) {
            throw new Exception("Altura no valida");
        } else if (!gender.equals(Gender.FEMALE) && !gender.equals(Gender.MALE)) {
            throw new Exception("Genero no valido");
        }

        return res;
}


}

