import java.util.Scanner;

public class Cuadrado extends Figura{

    double lado;

    public Cuadrado(double l) {
        this.lado = l;
    }

    public Cuadrado() {
    }

    @Override
    public double calcularPerimetro() {
        double perimetro = lado *4;

        return perimetro;
    }

    public double calcularArea() {
        return Math.pow(lado,2);
    }

    public void LadoCuadrado(){
        Scanner sc = new Scanner(System.in);
        super.Puntos();
        System.out.println("INGRESEEL LADO DEL CUADRADO: ");
        lado = sc.nextDouble();
    }

    public double getL() {
        return lado;
    }

    public void setL(double l) {
        this.lado = l;
    }
}
