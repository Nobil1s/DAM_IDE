public class EcuacionDeSegundoGrado {
    public static boolean esResoluble (double a, double b, double c) {
        return b * b - 4 * a * c >= 0;
    }
    public static double calcularx1 (double a, double b, double c) {
        return (-b + Math.sqrt(b * b - 4 * a * c)) / (2 * a);
    }
    public static double calcularx2 (double a, double b, double c) {
        return (-b - Math.sqrt(b * b - 4 * a * c)) / (2 * a);
    }
}
