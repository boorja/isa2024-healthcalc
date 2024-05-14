package healthcalc;

public class decoESP extends decorador {
    private String udAltura;
    private String udPeso;

    public decoESP(HealthHospital calculadora) {
        super(calculadora);
        
        // obtenemos el tipo de calculadora
        if (calculadora instanceof healthcalc.decoEuropea){
            udAltura = "metros";
            udPeso = "kilogramos";
        } else if (calculadora instanceof healthcalc.decoAmericana){
            udAltura = "pies";
            udPeso = "libras";
        }
    }

    // imprimimos mensaje

    @Override
    public int pesoIdeal(char genero, float altura) throws Exception {
        int pesoIdeal = super.pesoIdeal(genero, altura);
        System.out.println("La persona con altura de " + altura + " " + udAltura + " tiene un peso ideal de " + pesoIdeal + " " + udPeso);

        return pesoIdeal;
    }

    @Override
    public double bmr(char genero, int edad, float altura, int peso) throws Exception {
        double bmr = super.bmr(genero, edad, altura, peso);
        if (udPeso == "kilogramos") peso/=1000;
        System.out.println("La persona con altura de " + altura + " " + udAltura + " y peso de " + peso + " " + udPeso + " tiene un BMR de  " + bmr);
        
        return bmr;
    }

    
}
