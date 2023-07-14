import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main  {
    public static void main(String[] args) {

        Scanner sn = new Scanner(System.in);
        boolean salir= false;
        while (!salir){

            System.out.println("MENU DE OPCIONES DE LAS FIGURAS");
            System.out.println("1. TRIANGULO");
            System.out.println("2. CUADRADO");
            System.out.println("3. CIRCULO");
            System.out.println("4. PIRAMIDE");
            System.out.println("5. CUBO");
            System.out.println("6. ESFERA");
            System.out.println("7. SALIR");
            System.out.println("ESCOJA LA OPCION CON EL NUMERO");
            int opcion = sn.nextInt();

            switch (opcion){
                case 1:
                    Figura Figura = new Triangulo();
                    ((Triangulo) Figura).listaPuntos();
                    System.out.println("ESCOGIO LA OPCION 1");

                    break;
                case 2:
                    System.out.println("ESCOGIO LA OPCION 2");

                    break;
                case 3:
                    System.out.println("ESCOGIO LA OPCION 3");

                    break;
                case 4:
                    System.out.println("ESCOGIO LA OPCION 4");

                    break;
                case 5:
                    System.out.println("ESCOGIO LA OPCION 5");

                    break;
                case 6:
                    System.out.println("ESCOGIO LA OPCION 6");

                    break;
                case 7:
                    salir=true;

                    break;

            }



        }


    }

    public static void metodo(String opcion) {


    }
}
