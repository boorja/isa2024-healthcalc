package healthcalc;

public class HealthCalcImpl implements HealthCalc {
    
    // SINGULAR
	private static HealthCalcImpl init;

	private HealthCalcImpl() {
		super();
	}

	public static HealthCalcImpl getInstance() {
		if (init == null) {
			init = new HealthCalcImpl();
	    }
	        return init;
	 }
    
    public float idealWeight(int height, char gender) throws Exception {
        
        float res = 0;
        
        if (gender == 'm'){
            res = (float)(50+(0.91*height-152.4));
        } else if (gender == 'w'){
            res = (float)(45.5+(0.91*height-152.4));
        } else if (height <= 0) {
            throw new Exception("Altura no valida");
        } else if (gender != 'm' && gender != 'w') {
            throw new Exception("Genero no valido");
        }

        return res;
    }

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
