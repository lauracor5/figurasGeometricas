package co.com.bancolombia.modelo;

public class Triangulo extends Rectangulo {

    public Triangulo(int base, int altura) {
        super(base, altura);
    }

    @Override
    public double calculaArea() {
        return (getBase()*getAltura())/2;
    }

    @Override
    public double calculaPerimetro() {
        return (getAltura()+ getAltura() + getBase());
    }
}
