/**
 * clase que nos da las soluciones
 * @author Daniel
 * @version 1.0.0
 */
public class EcuacionDeSegundoGrado {

    /**
     *
     * @param a coeficiente que acompaña x²
     * @param b coeficiente que acompaña x
     * @param c coeficiente independiente
     * @return si es resoluble o no
     */
    public static boolean esResoluble (double a, double b, double c) {
        return b * b - 4 * a * c >= 0;
    }
    /**
     *
     * @param a coeficiente que acompaña x²
     * @param b coeficiente que acompaña x
     * @param c coeficiente independiente
     * @return valor 1
     */
    public static double calcularx1 (double a, double b, double c) {
        return (-b + Math.sqrt(b * b - 4 * a * c)) / (2 * a);
    }

    /**
     *
     * @param a coeficiente que acompaña x²
     * @param b coeficiente que acompaña x
     * @param c coeficiente independiente
     * @return valor 2
     */
    public static double calcularx2 (double a, double b, double c) {
        return (-b - Math.sqrt(b * b - 4 * a * c)) / (2 * a);
    }
}
