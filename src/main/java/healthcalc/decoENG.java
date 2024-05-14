package healthcalc;

public class decoENG extends decorador {
    private String udAltura;
    private String udPeso;

    public decoENG(HealthHospital calculadora) {
        super(calculadora);
        
        // obtenemos el tipo de calculadora
        if (calculadora instanceof healthcalc.decoEuropea){
            udAltura = "meters";
            udPeso = "kilograms";
        } else if (calculadora instanceof healthcalc.decoAmericana){
            udAltura = "feet";
            udPeso = "pounds";
        }
    }

    // imprimimos mensaje

    @Override
    public int pesoIdeal(char genero, float altura) throws Exception {
        int pesoIdeal = super.pesoIdeal(genero, altura);
        System.out.println("A person with height " + altura + " " + udAltura + " has an ideal weight of " + pesoIdeal + " " + udPeso);

        return pesoIdeal;
    }

    @Override
    public double bmr(char genero, int edad, float altura, int peso) throws Exception {
        double bmr = super.bmr(genero, edad, altura, peso);
        if (udPeso == "kilograms") peso/=1000;
        System.out.println("A person with height " + altura + " " + udAltura + " and weight " + peso + " " + udPeso + " has a BMR of " + bmr);
        
        return bmr;
    }
}