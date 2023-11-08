/**
 * clase que nos da las soluciones
 * @author Daniel
 * @version 1.0.0
 */
public class EcuacionDeSegundoGrado {

    /**
     *
     * @param a
     * @param b
     * @param c
     * @return si es resoluble o no
     */
    public static boolean esResoluble (double a, double b, double c) {
        return b * b - 4 * a * c >= 0;
    }
    /**
     *
     * @param a
     * @param b
     * @param c
     * @return so es valor 1
     */
    public static double calcularx1 (double a, double b, double c) {
        return (-b + Math.sqrt(b * b - 4 * a * c)) / (2 * a);
    }

    /**
     *
     * @param a
     * @param b
     * @param c
     * @return valor 21
     */
    public static double calcularx2 (double a, double b, double c) {
        return (-b - Math.sqrt(b * b - 4 * a * c)) / (2 * a);
    }
}
