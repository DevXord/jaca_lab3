import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /* ćw 3 klasy */

        /*  zad.1 - Najpierw należy uzupełnić kod w klasie Punkt.java,
            a) stworzyć objekt punktA typu Punkt,
            w konstruktorze zainicjować zmienną pX --> np. new Punkt(7), wykonać metodę punktA.toString();
            b) następnie ponownie wywopać konstruktor inicjalizujący wszystkie pola z klasy
            --> np. punkt = new Punkt(1, 2, 3);, wykonać metodę punktA.toString();
            c) nadpisać wartości pól z objektu punktA za pomocą setterów i
            ponownie wywołać metodę toString();
            d) wypisać wartości pól (za pomocą getterów),
            e) wywołać metody suma i róznica (obie wersje) z klasy punkt
        */
        Punkt punktA = new Punkt(7);
        System.out.println(punktA.toString());
        punktA = new Punkt(1, 2, 3);
        System.out.println(punktA.toString());
        punktA.setpZ(5);
        punktA.setpX(3);
        punktA.setpY(9);
        System.out.println(punktA.toString());
        System.out.println("\nGetter pX = "+punktA.getpX()+ "\nGetter pY = "+punktA.getpY() +"\nGetter pZ = "+punktA.getpZ());


        System.out.println("\nSuma punktów XYZ wynosi: "+punktA.suma());
        System.out.println("Różnica punktów XYZ wynosi: "+punktA.roznica());
        System.out.println("Różnica danych punktów X = 5, Y = 3, Z = 6 gdzie obecnie X = "+punktA.getpX() +", Y = "+punktA.getpY() +", Z = "+punktA.getpZ() +" wynosi: "+punktA.roznica(5,3,6));


    }
}
