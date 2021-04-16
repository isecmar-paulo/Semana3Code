package po.leit;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.println("Digite raio: ");
        double raio = kb.nextDouble();

        double area = Math.PI * Math.pow(raio,2);
        double perimetro = 2 * Math.PI * raio;


    }
}
