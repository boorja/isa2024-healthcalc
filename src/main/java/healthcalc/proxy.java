package healthcalc;

import java.util.ArrayList;
import java.util.List;

public class proxy implements HealthStats, HealthHospital {

    private adapter calculadora;
    private List<Double> alturas = new ArrayList<>();
    private List<Double> pesos = new ArrayList<>();
    private List<Double> edades = new ArrayList<>();
    private List<Double> bmrs = new ArrayList<>();
    private int nH = 0;
    private int nM = 0;
    
    public proxy() {
        this.calculadora = new adapter();
    }

    private float media(List<Double> l) {
        if (l == null || l.isEmpty()) {
            throw new IllegalArgumentException("La lista está vacía o es nula");
        }
        
        double suma = 0;
        for (Double valor : l) {
            suma += valor;
        }
        
        return (float) (suma / l.size());
    }

    @Override
    public float alturaMedia() {
        return media(alturas);
    }

    @Override
    public float pesoMedio() {
        return media(pesos);
    }

    @Override
    public float edadMedia() {
        return media(edades);
    }

    @Override
    public float bmrMedio() {
        return media(bmrs);
    }

    @Override
    public int numSexoH() {
        return nH;
    }

    @Override
    public int numSexoM() {
        return nM;
    }

    @Override
    public int numTotalPacientes() {
        return (nH + nM);
    }

    @Override
    public int pesoIdeal(char genero, float altura) throws Exception {
        float pesoIdeal = calculadora.pesoIdeal(genero, altura);
        
        if (genero == 'm') nH++;
        else if (genero == 'w') nM++;

        alturas.add((double) altura);

        return (int) pesoIdeal;
    }


    @Override
    public double bmr(char genero, int edad, float altura, int peso) throws Exception {
        double bmr = calculadora.bmr(genero, edad, altura, peso);
        
        if (genero == 'm') nH++;
        else if (genero == 'w') nM++;
        
        pesos.add((double) peso);
        alturas.add((double) altura);
        edades.add((double) edad);
        bmrs.add((double) bmr);
        
        return bmr;
    }
    
}
