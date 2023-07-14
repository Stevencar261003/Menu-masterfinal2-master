import java.util.Scanner;

public class Piramide extends Triangulo {
    private double altura;
    @Override
    public double calcularPerimetro() {
        return super.calcularPerimetro() + calcularPerimetro2();
    }

    private double calcularPerimetro2() {
        double lado1 = 0;
        lado1 = Math.sqrt(Math.pow(lado1, 2) + Math.pow(altura, 2));
        double lado2 = 0;
        lado2 = Math.sqrt(Math.pow(lado2, 2) + Math.pow(altura, 2));
        double lado3 = 0;
        lado3 = Math.sqrt(Math.pow(lado3, 2) + Math.pow(altura, 2));
        return lado1 + lado2 + lado3;
    }
    public double calcularVolumen() {
        double area = super.calcularArea();
        return (area * altura) / 3;
    }

    public void Altura() {
        Scanner sc = new Scanner(System.in);
        double AlturaPiramide;
        do {
            System.out.println("INGRESE LA ALTURA DE LA PIRAMIDE: ");
            AlturaPiramide = sc.nextDouble();
        } while (AlturaPiramide <= 0);

        altura = AlturaPiramide;
    }
}


