package main;

import java.util.Scanner;

public class ejercicio7 {
    public static void main(String[] args) {
        Scanner cubrir= new Scanner(System.in);
        System.out.println("La frase es: ");
        String frase= cubrir.nextLine();
        int contador= frase.length();
        if (contador % 2 == 0){
            System.out.println("El numero de letras de esta frase es par");
        }else {
            System.out.println("El numero de letras de esta frase es impar");

        }

        }
    }
