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
    
    public double idealWeight(int height, Gender gender) throws Exception {
        
        return CM.getIdealWeight(height,gender);
    }

    public double basalMetabolicRate(float weight, int height, Gender gender, int age) throws Exception {
        return MM.basalMetabolicRate(weight, height, gender, age);
    }
    
}
