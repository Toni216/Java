public class Main {
    public static void main(String[] args) {
        int a = 7 / 2;
        double b = 7 / 2;
        double c = 7 / 2.0;
        System.out.println(a + " | " + b + " | " + c); // 3.5 | 3.5 | 3.5 X 3 | 3.0 | 3.5 - No me pensé en int y double

        System.out.println((int) 9.99); // 10 X 9 - Redondea hacia abajo

        char letra = 'A';
        System.out.println(letra + 1); // A1 X 66
        System.out.println((char) (letra + 1)); // A1 X B

        System.out.println(10 + 5 + "Java"); // 15Java V
        System.out.println("Java" + 10 + 5); // Java105 V

        String s = "hola";
        s.toUpperCase();
        System.out.println(s); // hola V

        int[] x = {1, 2, 3};
        int[] y = x;
        y[0] = 99;
        System.out.println(x[0]); // 99 V
    }
}