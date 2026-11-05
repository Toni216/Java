import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese su nombre");
        String nombre = sc.nextLine();
        System.out.println("Ingrese sus apellidos");
        String apellidos = sc.nextLine();
        System.out.println("Tu nombre completo es: " + nombre + " " + apellidos);
    }
}
