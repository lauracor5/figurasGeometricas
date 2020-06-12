package co.com.bancolombia.modelo;

public class Rectangulo extends Figuras {

    private int base;
    private int altura;


    public Rectangulo (int base, int altura){
         this.base = base;
         this.altura = altura;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }


    @Override
    public double calculaArea() {
        return getBase()*getAltura();
    }

    @Override
    public double calculaPerimetro() {
        return (2*(getBase() + getAltura()));
    }
}
