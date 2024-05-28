package healthcalc;

public class CardiovascularMetricsImpl implements CardiovascularMetrics{
    
    public float getIdealWeight(int height, char gender) throws Exception{

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


}

