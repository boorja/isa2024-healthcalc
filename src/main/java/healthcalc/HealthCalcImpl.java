package healthcalc;

public class HealthCalcImpl implements HealthCalc {
    
    // SINGULAR
	private static HealthCalcImpl init;
    private CardiovascularMetrics CM = new CardiovascularMetricsImpl();
    private MetabolicMetrics MM = new MetabolicMetricsImpl();

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
        
        return CM.getIdealWeight(height,gender);
    }

    public float basalMetabolicRate(float weight, int height, char gender, int age) throws Exception {
        return MM.basalMetabolicRate(weight, height, gender, age);
    }
    
}
