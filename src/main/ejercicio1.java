package main;
import java.util.Scanner;
public class ejercicio1 {
    public static void main(String[] args) {
        Scanner cubrir= new Scanner(System.in);
        System.out.println("El numero es: ");
        int dato= cubrir.nextInt();
        if (dato >10) {
            System.out.println("Correcto, el numero es mayor de 10");
        } else {
            System.out.println("Error, es menor de 10");
        }
    }
}
