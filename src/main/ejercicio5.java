package main;


import java.util.Scanner;

public class ejercicio5 {
    public static void main(String[] args) {
        Scanner cubrir = new Scanner(System.in);
        System.out.println("La frase es: ");
        String frase = cubrir.nextLine();
        if (frase.contains("b") | frase.contains("v")) {
         if (frase.contains("b")) {
                System.out.println("Esta frase contiene una 'b'");
                String letra_p = frase.contains("p") ? "La frase contiene la letra 'p'" : "La frase no contiene la letra 'p'";
                System.out.println(letra_p);
            }
            }else if (frase.contains("v")) {
                System.out.println("Esta frase contiene una 'v'");
                String letra_u = frase.contains("u") ? "La frase contiene la letra 'u'" : "La frase no contiene la letra 'u'";
                System.out.println(letra_u);
            } else {
                System.out.println("Esta frase no contiene ni 'b' ni 'v'");
            }


        }
    }



