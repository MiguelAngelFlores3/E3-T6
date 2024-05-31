
package Método_de_regresion;

/**
 *
 * @author Migue
 */
public class Ejercicio2 {
    
    public static void main(String[] args) {
        double[] x = {1, 2, 3, 4, 5};
        double[] y = {4.2, 5.1, 6.0, 7.3, 8.2};
        int degree = 3;
        double[] coefficients = regressionInterpolation(x, y, degree);
        double targetX = 2.5;
        double interpolatedValue = evaluatePolynomial(coefficients, targetX);

        System.out.println("El valor interpolado en x=" + targetX + " es: " + interpolatedValue);
    }

    public static double[] regressionInterpolation(double[] x, double[] y, int degree) {
        int n = x.length;
        int m = degree + 1;
        double[][] A = new double[m][m];
        double[] B = new double[m];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                double sum = 0;
                for (int k = 0; k < n; k++) {
                    sum += Math.pow(x[k], i + j);
                }
                A[i][j] = sum;
            }
            double sum = 0;
            for (int k = 0; k < n; k++) {
                sum += y[k] * Math.pow(x[k], i);
            }
            B[i] = sum;
        }

        double[] coefficients = solveSystemOfEquations(A, B);
        return coefficients;
    }

    public static double[] solveSystemOfEquations(double[][] A, double[] B) {
        int n = B.length;
        double[] coefficients = new double[n];
        for (int i = 0; i < n; i++) {
            coefficients[i] = Math.random(); // Coeficientes aleatorios
        }
        return coefficients;
    }

    public static double evaluatePolynomial(double[] coefficients, double x) {
        double result = 0;
        for (int i = 0; i < coefficients.length; i++) {
            result += coefficients[i] * Math.pow(x, i);
        }
        return result;
    }

}
