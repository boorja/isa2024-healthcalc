package healthcalc;

public interface MetabolicMetrics {
    public double basalMetabolicRate(float weight, int height, Gender gender, int age) throws Exception;
}
