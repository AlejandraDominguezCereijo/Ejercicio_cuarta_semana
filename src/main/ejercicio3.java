package main;
import java.util.Scanner;
public class ejercicio3 {
    public static void main(String[] args) {
        Scanner cubrir= new Scanner(System.in);
        System.out.println("Elige una de estas frutas manzana,naranja, o fresa");
        String fruta= cubrir.nextLine();
        if (fruta.contains("manzana")){
            System.out.println("El precio de la manzana es 1€");
        }else if (fruta.contains("naranja")){
            System.out.println("El precio de la naranja es 2€");
        }else if (fruta.contains("fresa")){
            System.out.println("El precio de la fresa es 3€");
        }
        else {
            System.out.println("Producto mal escrito");
        }
}
}
