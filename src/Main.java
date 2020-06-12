import co.com.bancolombia.modelo.Circulo;
import co.com.bancolombia.modelo.Cuadrado;
import co.com.bancolombia.modelo.Rectangulo;
import co.com.bancolombia.modelo.Triangulo;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String opcion;
        int basere=0;
        int alturare;
        int radioc;
        int baset=0;
        int alturat=0;
        int ladoC=0;

        System.out.println("Figuras geometricas");

        System.out.println("Elija el tipo de figura");

        System.out.println("1. circulo");
        System.out.println("2. triangulo");
        System.out.println("3. rectangulo");
        System.out.println("4. cuadrado");

        Scanner scanner = new Scanner(System.in);

        System.out.println("por favor ingrese la opción");
        opcion = scanner.nextLine();

        switch (opcion){
            case "1":
                System.out.println("circulo");
                System.out.println("Ingrese radio");
                Scanner scn1 = new Scanner(System.in);
                radioc = scn1.nextInt();
                Circulo circulo1 = new Circulo(radioc);
                System.out.println("el área del circulo es " +circulo1.calculaArea());
                System.out.println("elperímetro del circulo es "+ circulo1.calculaPerimetro());

                break;
            case "2":
                System.out.println("triangulo");
                System.out.println("ingrese la base ");
                Scanner scn2 = new Scanner(System.in);
                baset = scn2.nextInt();
                System.out.println("ingrese la altura ");
                Scanner scn3 = new Scanner(System.in);
                alturat = scn3.nextInt();
                Triangulo triangulo1 = new Triangulo(baset, alturat);
                System.out.println("el 'area del traingulo es "+ triangulo1.calculaArea());
                System.out.println("el perimetro del triangulo es " + triangulo1.calculaPerimetro());
                break;
            case "3":
                System.out.println("rectangulo");
                System.out.println("ingrese la base ");
                Scanner baser = new Scanner(System.in);
                basere = baser.nextInt();
                System.out.println("ingrese la altura ");
                Scanner alturar = new Scanner(System.in);
                alturare = alturar.nextInt();
                Rectangulo rectangulo1 = new Rectangulo(basere, alturare);
                System.out.println("el área del rectangulo es " + rectangulo1.calculaArea());
                System.out.println("el perímetro del rectangulo es " + rectangulo1.calculaPerimetro());

                break;
            case "4":
                System.out.println("cuadrado");
                System.out.println("ingrese el lado ");
                Scanner scn4 = new Scanner(System.in);
                ladoC = scn4.nextInt();
                Cuadrado cuadrado1 = new Cuadrado(ladoC);
                System.out.println("el área del cuadrado es " + cuadrado1.calculaArea());
                System.out.println("el perímetro del cuadrado es " + cuadrado1.calculaPerimetro());
                break;
1
        }

    }
}
