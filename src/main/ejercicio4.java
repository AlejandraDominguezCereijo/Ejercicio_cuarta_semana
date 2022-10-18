package main;

import java.util.Scanner;

public class ejercicio4 {
    public static void main(String[] args) {
        Scanner cubrir = new Scanner(System.in);
        System.out.println("Elige una de estas figuras triangulo,rectangulo, pentagono y hexagono");
        String figura = cubrir.nextLine();
        if (figura.contains("triangulo")) {
            Scanner rellenar = new Scanner(System.in);
            System.out.println("La base es: ");
            int base= rellenar.nextInt();
            Scanner cubre = new Scanner(System.in);
            System.out.println("La altura es: ");
            int altura = cubre.nextInt();
            int area = base * altura;
            System.out.println("El area del triangulo es "+area);

        }else if (figura.contains("rectangulo")) {
            Scanner rellenar = new Scanner(System.in);
            System.out.println("La base es: ");
            int base= rellenar.nextInt();
            Scanner cubre = new Scanner(System.in);
            System.out.println("La altura es: ");
            int altura = cubre.nextInt();
            int area = base * altura;
            System.out.println("El area del rectangulo es "+area);
        }else if (figura.contains("pentagono")) {
            Scanner rellenar = new Scanner(System.in);
            System.out.println("El perimetro es: ");
            int perimetro= rellenar.nextInt();
            Scanner cubre = new Scanner(System.in);
            System.out.println("El apotema es: ");
            int apotema = cubre.nextInt();
            int area = (perimetro * apotema)/2;
            System.out.println("El area del pentagono es "+area);
        }else if (figura.contains("hexagono")) {
            Scanner rellenar = new Scanner(System.in);
            System.out.println("El perimetro es: ");
            int perimetro= rellenar.nextInt();
            Scanner cubre = new Scanner(System.in);
            System.out.println("El apotema es: ");
            int apotema = cubre.nextInt();
            int area = (perimetro * apotema)/2;
            System.out.println("El area del exagono es "+area);
        }
        else{
                System.out.println("Figura mal escrita");
            }
        }
    }
