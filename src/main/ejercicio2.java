package main;
import java.util.Scanner;
public class ejercicio2 {
    public static void main(String[] args) {
        Scanner cubrir= new Scanner(System.in);
        System.out.println("La palabra es: ");
        String palabra= cubrir.nextLine();
        if (palabra.contains("b")) {
            System.out.println("Esta palabra contiene una 'b'");
        } else {
            System.out.println("Esta palabra no contiene una 'b'");
        }

    }
}
