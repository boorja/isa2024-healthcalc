package healthcalc;

public class MetabolicMetricsImpl implements MetabolicMetrics{
    
    public double basalMetabolicRate(Person person) throws Exception {
        
        double res = 0;

        if (person.gender().equals(Gender.MALE)){
            res = ((10*person.weight())+(6.25*person.weight())-(5*person.age())+5);
        } else if (person.gender().equals(Gender.FEMALE)){
            res = ((10*person.weight())+(6.25*person.weight())-(5*person.age())-161);
        } else if (person.weight() <= 0) {
            throw new Exception("Peso no valido");
        } else if (person.weight() <= 0) {
            throw new Exception("Altura no valida");
        } else if (person.age() <= 0) {
            throw new Exception("Edad no valida");
        } else if (!person.gender().equals(Gender.FEMALE) && !person.gender().equals(Gender.MALE)) {
            throw new Exception("Genero no valido");
        }

        return res;
    }
    
}
