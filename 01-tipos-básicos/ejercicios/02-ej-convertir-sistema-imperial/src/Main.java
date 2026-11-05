public class Main {
    public static void main(String[] args) {
        int metros = 100;

        double pulgadas = (double)metros * 39.37;
        double pies = pulgadas / 12;
        double yardas = pies / 3;
        double millas = pies / 5258;

        System.out.println(metros + " metros son:");
        System.out.println(pulgadas + " pulgadas");
        System.out.println(pies + " pies");
        System.out.println(yardas + " yardas");
        System.out.println(millas + " millas");
    }
}