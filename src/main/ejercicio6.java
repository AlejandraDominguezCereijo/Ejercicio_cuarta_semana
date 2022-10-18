package main;
import java.util.Scanner;
public class ejercicio6 {
    public static void main(String[] args) {
        Scanner cubrir= new Scanner(System.in);
        System.out.println("El numero es: ");
        int dato= cubrir.nextInt();
        if (dato % 2 == 0){
            System.out.println("Correcto, el numero es par");
        }else {
            System.out.println("El numero es impar");

        }


    }
}
