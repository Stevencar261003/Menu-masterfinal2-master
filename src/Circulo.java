import java.util.Scanner;

public class Circulo extends Figura {
    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    public Circulo() {
    }

    public double calcularPerimetro() {
        return 2 * Math.PI * radio;
    }


    public double calcularArea() {
        return Math.PI * Math.pow(radio, 2);
    }

    public void ingresarRadio() {
        Scanner sc = new Scanner(System.in);
        super.listaPuntos();
        System.out.println("INGRESE EL RADIO : ");
        radio = sc.nextDouble();
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

}
