package quadraticEquation;



public class QuadraticEquation {
    public static int findRoots(double a, double b, double c) {
        double det = b * b - 4 * a * c;


        if (det > 0) {
            Roots.x1 = (-b + Math.sqrt(det)) / (2 * a);
            Roots.x2 = (-b - Math.sqrt(det)) / (2 * a);
        } else if (det == 0) {
            Roots.x1=Roots.x2=-b / (2 * a);
        }else {
            double real = -b / (2 * a);

            double imaginary = Math.sqrt(-det) / (2 * a);
            System.out.printf("First Root = %.2f+%.2fi",
                    real, imaginary);
            System.out.printf("\nSecond Root = %.2f-%.2fi",
                    real, imaginary);
        }return 0;
    }
    public static void main(String[] args) {
        int roots = QuadraticEquation.findRoots(2, 10, 8);
        System.out.println("Roots: " + Roots.x1 + ", " + Roots.x2);
    }
}
class Roots {
    public static  double x1, x2;

    public Roots(double x1, double x2) {
        Roots.x1 = x1;
        Roots.x2 = x2;
    }
}