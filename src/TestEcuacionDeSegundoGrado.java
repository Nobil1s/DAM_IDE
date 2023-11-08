import java.util.Scanner;

/**
 * clase que nos da las soluciones
 * @author Daniel
 * @version 1.0.0
 */
public class TestEcuacionDeSegundoGrado {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el coeficiente a");
        double a = sc.nextDouble();
        System.out.println("Introduce el coeficiente b");
        double b = sc.nextDouble();
        System.out.println("Introduce el coeficiente c");
        double c = sc.nextDouble();
        sc.close();

        if (EcuacionDeSegundoGrado.esResoluble(a,b,c)) {
            double x1 = EcuacionDeSegundoGrado.calcularx1(a,b,c);
            double x2 = EcuacionDeSegundoGrado.calcularx2(a,b,c);
            System.out.printf("X1 = %f%nX2 = %f%n", x1, x2);
        } else {
            System.out.println("No soluble");
        }
    }
}
