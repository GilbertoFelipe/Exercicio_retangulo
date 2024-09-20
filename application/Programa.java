package exercicios.retangulo.application;
import java.util.Locale;
import java.util.Scanner;

import exercicios.retangulo.entities.Retangulo;

public class Programa {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Retangulo ret = new exercicios.retangulo.entities.Retangulo();

        System.out.println("Entre com a largura e altura do retângulo:"); 
        ret.largura = sc.nextDouble();
        ret.altura = sc.nextDouble();

        System.out.printf("Area = %.2f%n", ret.area());
        System.out.printf("Perimetro = %.2f%n", ret.perimetro());
        System.out.printf("Diagonal = %.2f%3n", ret.diagonal());
        sc.close();

    }

}
