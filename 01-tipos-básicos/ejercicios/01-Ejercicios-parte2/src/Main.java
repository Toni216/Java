import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
// EJERCICIO 1
//        String nombre = "Ramón";
//        byte nivel = 2;
//        short vida = 50;
//        int recorrido = 2000;
//        char inicial = 'R';
//        float daño = 2.5f;
//        boolean estaVivo = true;
//
//        System.out.println("Datos de tu personaje: ");
//        System.out.println("nombre:\t" + nombre);
//        System.out.println("nivel:\t" + nivel);
//        System.out.println("recorrido:\t" + recorrido);
//        System.out.println("inicial:\t" + inicial);
//        System.out.println("daño:\t" + daño);
//        System.out.println("¿Está vivo?:\t" + estaVivo);

// EJERCICIO 2
//        System.out.println("Selecciona una temperatura en Celsius");
//        double temperatura = sc.nextDouble();
//
//        double F = temperatura * 9/5 + 32;
//        double K = temperatura + 273.15;
//
//        System.out.println(temperatura); // 25
//        System.out.println(F); // 77.0
//        System.out.println(K); // 273.15

// EJERCICIO 3
//        System.out.println("Introduce el numero de ticks");
//        int ticks = sc.nextInt();
//        int horas;
//        int segundos = ticks / 20; // como 1 segundo son 20 ticks, dividimos el tick entre 20 para saber cuantos segundos son.
//
//        System.out.println(ticks + " ticks son " + segundos + " segundos");
//
//        horas = segundos / 3600; // dividimos los segundos entre 3600 y asi sabemos las horas
//        System.out.println(segundos + " son " + horas + " horas");
//
//        int segundosSobrantes = segundos % 3600; // con esto sabemos los segundos que sobran de la operacion de arriba
//        System.out.println("sobran " + segundosSobrantes + " segundos");
//
//        int minutos = segundosSobrantes / 60; // los segundos sobrantes los dividimos entre 60 para saber los minutos
//        System.out.println("Los segundos sobrantes " + segundosSobrantes + " son " + minutos);
//
//        int segundosFinales = segundosSobrantes % 60; // y una vez terminado vemos el resto de los segundos finales
//        System.out.println("El resto son " + segundosFinales);
//
//        System.out.println(horas + "h " + minutos + "min " + segundosFinales + "s");

// EJERCICIO 4
        System.out.println("Dime el radio de un círculo");
        double radio = sc.nextDouble();
        System.out.println("Dime el cateto 1 del triángulo rectangulo");
        double cateto1 = sc.nextDouble();
        System.out.println("Dime el cateto 2 del triángulo rectangulo");
        double cateto2 = sc.nextDouble();

        double area = Math.PI * Math.pow(radio, 2);
        double perimetro = 2 * Math.PI * radio;
        double hipotenusa = Math.sqrt((Math.pow(cateto1,2) + Math.pow(cateto2, 2)));

        System.out.println("Area: " + area);
        System.out.println("Area redondeada 1: " + Math.round(area));
        System.out.println("Area redondeada 2: " + Math.ceil(area));
        System.out.println("Perimetro: " + perimetro);
        System.out.println("Hipotenusa: " + hipotenusa);
// y aqui un tanto de lo mismo, las formulas me las sé (las miré en google), pero no veas con el ejercicio xd

// EJERCICIO 5
//        System.out.println("Introduce tu nombre completo");
//        String nombre = sc.nextLine();
//
//        System.out.println("La longitud es " + nombre.length());
//        System.out.println("Todo en mayúsculas: " + nombre.toUpperCase() +"\nTodo en minúsculas: " + nombre.toLowerCase());
//        System.out.println("La primera letra: " + nombre.charAt(0) + "\nLa última letra: " + nombre.charAt(nombre.length()-1));
//        System.out.println("La posición del primer espacio es " + nombre.indexOf(" "));
//        System.out.println(nombre.replace('a','@'));
//        System.out.println(nombre.contains("Antonio"));

// EJERCICIO 6
//        int[] notas = { 5, 9, 7, 3, 6 };
//        System.out.println(Arrays.toString(notas));
//        Arrays.sort(notas);
//        System.out.println(Arrays.toString(notas));
//        int sumaTotal = notas[0] + notas[1] + notas[2] + notas[3] + notas[4];
//
//        int media = sumaTotal / notas.length;
//        System.out.println(media);
//
//        char[][] tresRaya = { {'X','X','0'}, {'X','0','X'}, {'X', 'X', 'X'} };
//        for (char[] fila : tresRaya) {
//            System.out.println(Arrays.toString(fila));
//        }

// EJERCICIO EXTRA TICKET COMPRA

//        System.out.println("¿Que has comprado? ");
//        String producto = sc.nextLine();
//        System.out.println("Cuántos");
//        int cantidad = sc.nextInt();
//        System.out.println("Precio individual: ");
//        double precio = sc.nextDouble();
//
//        System.out.println("========= TICKET =========");
//        System.out.println("Producto:\t" + producto);
//        System.out.println("Cantidad:\t" + cantidad);
//        System.out.println("Subtotal:\t" + precio);
//        System.out.println("IVA (21%):\t" + (precio * 1.21 - precio));
//        System.out.println("TOTAL:\t\t" + precio * 1.21);
//
//        System.out.println("===========================");
    }
}