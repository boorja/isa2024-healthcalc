package healthcalc;

public class CardiovascularMetricsImpl implements CardiovascularMetrics{
    
    public double getIdealWeight(int height, char gender) throws Exception{

        double res = 0;
        
        if (gender == 'm'){
            res = (50+(0.91*height-152.4));
        } else if (gender == 'w'){
            res = (45.5+(0.91*height-152.4));
        } else if (height <= 0) {
            throw new Exception("Altura no valida");
        } else if (gender != 'm' && gender != 'w') {
            throw new Exception("Genero no valido");
        }

        return res;
}


}

