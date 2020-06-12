package co.com.bancolombia.modelo;

public class Circulo extends Figuras {
    protected static final double pi = 3.1416;
    private int radio;

    public Circulo(int radio) {
        this.radio = radio;
    }

    public int getRadio() {
        return radio;
    }

    public void setRadio(int radio) {
        this.radio = radio;
    }

    @Override
    public double calculaArea() {
        return pi * Math.pow(getRadio(),2);
    }

    @Override
    public double calculaPerimetro() {
        return 2 * pi * getRadio();
    }
}
