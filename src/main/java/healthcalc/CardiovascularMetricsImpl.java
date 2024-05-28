package healthcalc;

public class CardiovascularMetricsImpl implements CardiovascularMetrics{
    
    public double getIdealWeight(Person person) throws Exception{

        double res = 0;
        
        if (person.gender().equals(Gender.MALE)){
            res = (50+(0.91*person.height()-152.4));
        } else if (person.gender().equals(Gender.FEMALE)){
            res = (45.5+(0.91*person.height()-152.4));
        } else if (person.height() <= 0) {
            throw new Exception("Altura no valida");
        } else if (!person.gender().equals(Gender.FEMALE) && !person.gender().equals(Gender.MALE)) {
            throw new Exception("Genero no valido");
        }

        return res;
}


}

